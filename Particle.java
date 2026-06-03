import java.awt.Graphics;
import java.awt.Color;

public class Particle {
    private Point position;
    private double vx, vy; // Vetores de velocidade
    private int radius;
    private Color color;

    public Particle(int x, int y, double vx, double vy, int radius, Color color) {
        this.position = new Point(x, y);
        this.vx = vx;
        this.vy = vy;
        this.radius = radius;
        this.color = color;
    }

    public void update(int width, int height) {
        // Atualiza posição baseada na velocidade
        position.setX((int) (position.getX() + vx));
        position.setY((int) (position.getY() + vy));

        // Colisão com bordas (Reflexão simples)
        if (position.getX() - radius < 0 || position.getX() + radius > width) vx *= -1;
        if (position.getY() - radius < 0 || position.getY() + radius > height) vy *= -1;
    }

    public boolean checkCollision(Particle other) {
        // Uso direto do seu método distance()
        return this.position.distance(other.position) < (this.radius + other.radius);
    }

    public void bounce() {
        this.vx *= -1;
        this.vy *= -1;
    }

    public void draw(Graphics g) {
        g.setColor(color);
        g.fillOval(position.getX() - radius, position.getY() - radius, radius * 2, radius * 2);
    }
}
