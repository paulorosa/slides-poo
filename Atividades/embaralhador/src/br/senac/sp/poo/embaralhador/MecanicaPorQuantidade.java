package br.senac.sp.poo.embaralhador;

public class MecanicaPorQuantidade implements MecanicaDoJogo {

	private FabricaEmbaralhador fabricaEmbaralhador;
	private BancoDePalavras bancoDePalavras;
	
	private int quantidade;
	private int jogada;
	
	private Embaralhador embaralhador;
	private String palavraOriginal;
	
	public MecanicaPorQuantidade (int quantidade) {
		this.quantidade = quantidade;
		this.jogada = 0;
		
		this.fabricaEmbaralhador = new FabricaEmbaralhador();
		this.bancoDePalavras = new BancoDePalavrasFixas();
	}
	
	@Override
	public boolean terminou() {
		return jogada > quantidade;
	}

	@Override
	public boolean acertou(String palavra) {
		return false;
	}

	@Override
	public String proximaPalavra() {
		this.palavraOriginal = bancoDePalavras.proxima();
		this.embaralhador = fabricaEmbaralhador.criar();
		
		return embaralhador.embaralhar(palavraOriginal);
	}

	@Override
	public int pontuacao() {
		return embaralhador.dificuldade();
	}

}
