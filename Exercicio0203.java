import javax.swing.JOptionPane;

public class Exercicio0203 {
    public static void main(String[] args) {
        double base, largura, resultado;
        String aux;

        try {
            aux = JOptionPane.showInputDialog(null, "Entre com a base");
            base = Double.parseDouble(aux);
            aux = JOptionPane.showInputDialog(null, "Entre com a largura");
            largura = Double.parseDouble(aux);

            resultado = base * largura;

            JOptionPane.showMessageDialog(null, "resultado " + resultado);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor, insira um número válido.");
        }
    }
}


    

