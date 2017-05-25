package sequencias;

public class Fibonnacci extends SequenciaNumerica{
	private int valorAnterior;
	
	public Fibonnacci () {
		super (1);
		this.valorAnterior = 0;
    }

    public void proximoValor () {
    	int temporario = this.valorAtual;
    	this.valorAtual = this.valorAtual + this.valorAnterior;
    	this.valorAnterior = temporario;
    }
    
    

    
    
    public static void main (String[] args) {
        int quantidade = Integer.parseInt(args[0]);

        Fibonnacci fibonnacci = new Fibonnacci();

        for (int i=0; i<quantidade; i++) {
            System.out.print (fibonnacci.valorAtual() + " ");
            fibonnacci.proximoValor();
        }
    } 
}
