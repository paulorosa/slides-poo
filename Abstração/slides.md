<!SLIDE section center>
# Classes e Métodos Abstratos

<!SLIDE>
# Pilares do Paradigma Orientação a Objetos

Este módulo refere-se a um dos quatro pilares do paradigma orientado a objetos.

* Herança
* Polimorfismo
* **Abstração**
* Encapsulamento

<!SLIDE>
# Hierarquia de Automóveis

Vamos voltar ao exemplo da hierarquia de automóveis apresentado no módulo de Herança.

![.fancyborder](_images/abstracao-automovel-carro-moto.png)

Nesta hierarquia, a classe Automovel foi criada como forma de abstrair um
conceito geral representado em ambas as classes.





<!SLIDE>
# Classes Abstratas

A forma de representar estes conceitos abstratos é realizado no Paradigma
Orientado a Objetos com *Classes Abstratas*.

.callout *Classes Abstratas* organizam elementos comuns a várias classes. - **James Rumbaugh**

No exemplo, a classe Automovel está fazendo o papel de uma classe abstrata, pois está representando
um conceito abstrato.



<!SLIDE>
# Características e Comportamentos em Comum
Usamos classes abstratas para representar grupos que têm características em comum, mas que diferem em detalhes específicos.





<!SLIDE>
# 
Classes Abstratas são classes que servem de modelo para classes concretas, portanto não podem ser instanciadas.


<!SLIDE>
# Representação em Java

Em Java, utilizamos a palavra-chave *abstract* para declarar uma classe abstrata.

No exemplo, a classe Automovel transformada em classe abstrata fica da seguinte forma:



    @@@ Java
    public abstract class Automovel {
    
      private String marca;
      
      public Automovel (String marca) {
	    this.marca = marca;
	  }  
    }


<!SLIDE>
# Representação em UML




<!SLIDE>
# Comportamentos abstratos.
A classe abstrata implementa as características gerais 
e seus métodos abstratos são implementados nas subclasses com seus detalhes.



<!SLIDE>
# Classes Abstratas vs Classes Concretas

classe abstrata
    @@@ Java
    public abstract class Automovel {
    
      private String marca;
      
      public Automovel (String marca) {
	    this.marca = marca;
	  }  
    }


classe concreta


    @@@Java
    	public class Gato extends Animal {
		public void emitirSom () {
			System.out.print (“Miau!”);
	}
}


    @@@Java
    	public class Cachorro extends Animal {
		public void emitirSom () {
			System.out.print (“Au!”);
	}
}





<!SLIDE>
# Classes Abstratas

Classes Abstratas não podem ser instanciadas.
Animal animal = new Animal ();  -- ERRADO

    @@@Java
    Gato gato = new Gato ();
gato.andar (); // “Estou andando!”
gato.emitirSom (); // “Miau!”

Cachorro cachorro = new Cachorro ();
cachorro.andar (); // “Estou andando!”
cachorro.emitirSom (); // “Au!”





<!SLIDE>
# Métodos Abstratos
Se uma classe abstrata definir um método abstrato, as classes concretas devem implementar o método.

    @@@Java
    	public abstract class Animal {
		public abstract void emitirSom ();
		public void andar () {
			System.out.print (“Estou andando!”);
	}
}




<!SLIDE>
# Por que utilizar Classe Abstrata?

Como não podemos instanciar uma classe abstrata, tratar conceitos abstratos desta forma, gera uma maior consistência ao sistema.

A decisão de transformar ou não uma classe em abstrata depende do seu domínio.



<!SLIDE>
# Classes Abstratas

Uma classe abstrata é um recurso que podemos utilizar quando queremos compartilhar funcionalidades em comum entre clases, mas não queremos permitir que sejam instanciadas.




<!SLIDE>
# Classes Abstratas
Classes com um ou mais métodos abstratos.

    @@@Java
    	public abstract class Veiculo {
		private String marca;
		public Veiculo (String marca) {
			this.marca = marca;
	}
	public abstract int quantidadeRodas ();
}




<!SLIDE>
# Métodos Abstratos
Métodos declarados sem implementação.

    @@@Java
   	public abstract String quantidadeRodas ();



<!SLIDE>
# Classes Abstratas

* Uma classe abstrata declara atributos e comportamentos comuns das várias classes em uma hierarquia.

* As subclasses devem sobrescrever os métodos abstratos para se tornarem concretas.

* As classes abstratas não podem ser instanciadas.



<!SLIDE>
# Classe Concreta herdada de Classe Abstrata

    @@@Java
    public class Moto extends Veiculo {
	public Moto (String marca) {
		super (marca);
	}
	public int quantidadeRodas () {
		return 2;
	}



<!SLIDE>
# Classe Concreta herdada de Classe Abstrata

    @@@Java
    public class Carro extends Veiculo {
	public Carro (String marca) {
		super (marca);
	}
	public int quantidadeRodas () {
		return 4;
	}




<!SLIDE>
# 

    @@@Java
    public class VeiculoTeste {
	public static void main (String[] args) {
		Veiculo veiculo;
		Carro carro = new Carro (“Ford”);
		Moto moto = new Moto (“Honda”);

		veiculo = carro;
		System.out.println (“Rodas: “ + veiculo.quantidadeRodas());
		veiculo = moto;
		System.out.println (“Rodas: “ + veiculo.quantidadeRodas());
}



<!SLIDE>
# Representação UML

Nome da classe e nome do método escrito em itálico indica que a classe é abstrata ou o método é abstrato.

incluir imagem



<!SLIDE>
# Representação UML

Nome da classe e nome do método escrito em itálico indica que a classe é abstrata ou o método é abstrato.

incluir imagem


<!SLIDE>
# Métodos final

* Não podem ser sobrescritos em uma subclasse

* Métodos final são resolvidos em tempo de compilação, isto é conhecido como vinculação estática.

    @@@Java
    public class Veiculo {
….
public final String getMarca() {
	return this.marca;
}
}


Errado

    @@@Java
    public class Moto extends Veiculo {
….
public String getMarca() {
	return this.marca;
}
}



<!SLIDE>
# Classes final

* Não podem ser estendidas por uma subclasse

* Todos os métodos em um classe final são implicitamente final.

    @@@Java
    public final class Moto extends Veiculo {
….
}


Errado

    @@@Java
    public final class Triciclo extends Moto {
….
}




<!SLIDE>
# Referência ao método Herdado

Para se fazer referência ao método que foi herdado, será necessário utilizar a palavra-chave super.

Duas formas para acessar métodos e atributos de classes ancestrais que não foram declarados como private:

* se não está declarado na classe filha, o acesso é direto

* caso contrário, utilizar a palavra-chave super



<!SLIDE>
# Classe Base em Java

Em Java, todas as classes herdam da classe Object

colocar imagem.
