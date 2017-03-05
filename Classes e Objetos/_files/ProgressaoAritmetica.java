public class ProgressaoAritmetica {

    private int valorAtual;
    
    public ProgressaoAritmetica (int valorInicial) {
        this.valorAtual = valorInicial;
    }

    public int valorAtual () {
        return this.valorAtual;
    }

    public void proximoValor () {
        this.valorAtual = this.valorAtual + 1;
    }

}

