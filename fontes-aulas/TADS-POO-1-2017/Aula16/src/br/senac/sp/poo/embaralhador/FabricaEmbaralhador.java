package br.senac.sp.poo.embaralhador;

import java.util.ArrayList;
import java.util.Random;

public class FabricaEmbaralhador {

	private Random random;
	private ArrayList<Embaralhador> embaralhadores;
	
	public FabricaEmbaralhador(){
		this.random = new Random();
		
		this.embaralhadores = new ArrayList<Embaralhador>();
		this.embaralhadores.add(new InverteStringEmbaralhador());
		this.embaralhadores.add(new PermutaStringEmbaralhador());
	}
	
	public Embaralhador criar () {
		return  embaralhadores.get(random.nextInt(embaralhadores.size()));
	}
}
