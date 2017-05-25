
public class Carro extends Automovel{

	public Carro(String marca) {
		super (marca);
	}
	
	@Override
	public int quantidadeRodas() {
		return 5;
	}
}
