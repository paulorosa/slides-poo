
public final class Comissionado extends Assalariado {

	private double taxaComissao;
	
	public Comissionado(String nome, double salarioMensal, double taxaComissao) {
		super(nome, salarioMensal);
		this.taxaComissao= taxaComissao;
	}

	
	public double getTaxaComissaol() {
		return taxaComissao;
	}


	@Override
	public double calcularSalarioMensal() {
		return super.calcularSalarioMensal();
	}

	public double calcularSalarioMensal(double valorVendas) {
		return super.calcularSalarioMensal() + (valorVendas*taxaComissao);
	}

}
