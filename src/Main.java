public class Main {
    public static void main(String[] args) {
       IOperacao operacao = new Multiplicacao();

       Calculadora calculadora = new Calculadora(operacao);

       calculadora.setA(10);
       calculadora.setB(5);


        System.out.println(
                "Resultado da " + operacao.Descricao()
                        + " entre " + calculadora.getA() + " e "
                        + calculadora.getB() + " = "
                        + calculadora.Calculo()
        );


    }
}