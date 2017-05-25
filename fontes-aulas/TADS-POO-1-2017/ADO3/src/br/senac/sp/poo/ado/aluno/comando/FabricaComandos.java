package br.senac.sp.poo.ado.aluno.comando;

import java.util.HashMap;

import br.senac.sp.poo.ado.aluno.Faculdade;

public class FabricaComandos {
	private HashMap <Integer, Comando> comandos;

	public FabricaComandos (Faculdade faculdade) {
		HashMap <Integer, Comando> comandos = new HashMap <Integer, Comando> ();
		comandos.put(0, new HelpComando());
		comandos.put(1, new ConsultarComando(faculdade));
		comandos.put(2, new ConsultarComando(faculdade));
	}
	
	public Comando criar (Integer codigo) {
		return comandos.get(codigo);
	}
}
