public class Calculadora {
    IOperacao operacao ;
    int a;
    int b;

    public IOperacao getOperacao() {
        return operacao;
    }

    public void setOperacao(IOperacao operacao) {
        this.operacao = operacao;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    int Calculo()
    {
        return  operacao.Operacao(this.a, this.b);
    }
    public Calculadora() {
    }

    public Calculadora(IOperacao operacao) {
        this.operacao = operacao;
    }


}
