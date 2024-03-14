 class Exercicio0202{
    public static void main(String[] args) {
        int qtd1,qtd2,qtd3;
        float valor1,valor2,valor3,total;
        qtd1 = Integer.parseInt(args[0]);
        valor1 = Float.parseFloat(args[1]);
        qtd2 = Integer.parseInt(args[2]);
        valor2 = Float.parseFloat(args[3]);
        qtd3 = Integer.parseInt(args[4]);
        valor3 = Float.parseFloat(args[5]);
        
        total = qtd1 * valor1 + qtd2 * valor2 + qtd3 * valor3;
        System.out.print("Valor total:"+total);
        
    }
}