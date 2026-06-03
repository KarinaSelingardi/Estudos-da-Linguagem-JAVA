import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Simulation extends JFrame {
    private List<Particle> particles;

    public Simulation() {
        setTitle("Simulação Física - Adapta ONE");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        particles = new ArrayList<>();
        // Adicionando partículas para teste
        particles.add(new Particle(100, 100, 4, 3, 20, Color.BLUE));
        particles.add(new Particle(700, 500, -3, -4, 25, Color.RED));

        SimulationPanel panel = new SimulationPanel();
        add(panel);

        // Loop de simulação: 60 FPS (aprox. 16ms)
        Timer timer = new Timer(16, e -> {
            updatePhysics();
            panel.repaint();
        });
        timer.start();
    }

    private void updatePhysics() {
        for (int i = 0; i < particles.size(); i++) {
            Particle p1 = particles.get(i);
            p1.update(getWidth(), getHeight());

            // Verificação de colisão entre pares
            for (int j = i + 1; j < particles.size(); j++) {
                Particle p2 = particles.get(j);
                if (p1.checkCollision(p2)) {
                    p1.bounce();
                    p2.bounce();
                }
            }
        }
    }

    private class SimulationPanel extends JPanel {
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            setBackground(Color.YELLOW);
            for (Particle p : particles) {
                p.draw(g);
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new Simulation().setVisible(true);
        });
    }
}