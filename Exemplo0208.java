import javax.swing.JOptionPane;
class Exemplo0208
{
    public static void main (String args[]){
        String aux = "";
        float nota1 = 0, nota2 = 0,trabalho = 0, media = 0;
        try
        {
            aux = javax.swing.JOptionPane.showInputDialog(null,"Entre com a nota 1");
            nota1=Float.parseFloat(aux);
            aux = javax.swing.JOptionPane.showInputDialog(null,"Entre com a nota 2");
            nota2 = Float.parseFloat(aux);
            aux = javax.swing.JOptionPane.showInputDialog(null,"Entre com a nota do trabalho");
            trabalho = Float.parseFloat(aux);

            media = (nota1 + nota2 + trabalho)/3;
            javax.swing.JOptionPane.showMessageDialog(null,"Media: "+ media);
        }
        catch (NumberFormatException e)
        {
            JOptionPane.showMessageDialog(null, "Houve erro na conversão, digite apenas caracteres numéricos");
        }
        System.exit(0);

    }
}


