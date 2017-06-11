package br.senac.sp.poo.embaralhador;

public class MecanicaPorQuantidade implements MecanicaDoJogo {

	private int quantidade;
	private int rodada;
	private int pontuacao;
	
	private FabricaEmbaralhador fabricaEmbaralhador;
	private BancoDePalavras bancoDePalavras;

	private Embaralhador embaralhador;
	private String palavraNova;
	
	public MecanicaPorQuantidade(int quantidade) {
		this.quantidade = quantidade;
		this.rodada = 1;
		this.fabricaEmbaralhador = new FabricaEmbaralhador();
		this.bancoDePalavras = new BancoDePalavrasFixas();
		this.pontuacao = 0;
	}

	@Override
	public boolean terminou() {
		return rodada > quantidade;
	}

	@Override
	public boolean acertou(String palavra) {
		if (palavraNova.equals(palavra)) {
			pontuacao += embaralhador.dificuldade();
		 return true;	
		} else {
			return false;
		}
		
	}

	@Override
	public String tentarNovamente() {
		palavraNova = bancoDePalavras.proximaPalavra();
		embaralhador = fabricaEmbaralhador.criar();
		String palavraEmbaralhada = embaralhador.embaralhar(palavraNova);
		
		rodada++;
		return palavraEmbaralhada;
	}

	@Override
	public int pontuacao() {
		return pontuacao;
	}

}
