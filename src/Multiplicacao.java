public class Multiplicacao implements IOperacao {
    @Override
    public int Operacao(int a, int b) {
        return a*b;
    }

    @Override
    public String Descricao() {
        return "Multiplicacao";
    }
}
