package instrumentos;

import perifericos.Teclado;

public class Bateria {

	public static void main(String[] args) {
		
		Teclado teclado = new Teclado();
		teclado.iPackage = "teste";
		teclado.iPublic = "teste2";
		teclado.iProtected = "teste3";
	}
 	
}
