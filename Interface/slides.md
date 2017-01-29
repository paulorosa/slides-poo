<!SLIDE section center>
# Interface
## Todos slides copiadoss

<!SLIDE>
# Slide Inicial (de apresentação)


<!SLIDE>
# Exemplo

colocar imagem
    
.callout Método ->   boolean autentica (String senha)




<!SLIDE>
# Sistema para autenticação de Funcionários


    @@Java
    class Sistema {
        public boolean login (Funcionario funcionario, String senha) {
            return funcionario.autentica ( senha );
        }
    }



<!SLIDE>
# Controle de Acesso: Somente Diretor e Gerente


    @@Java
    class Diretor extends Funcionario {
	    public boolean autentica (String senha) {
		    return senha.equals(“diretor”);
	    }
    }

    @@Java
    class Gerente extends Funcionario {
	    public boolean autentica (String senha) {
		    return senha.equals(“gerente”);
	    }
    }



<!SLIDE>
# Sistema para autenticação de Funcionários

.callout PROBLEMA!!!

    @@Java
    class Sistema {
        public boolean login (Funcionario funcionario, String senha) {
            return funcionario.autentica ( senha );
        }
    }

Erro de Compilação!!!
Nem todo funcionário possui o método autenticação.


<!SLIDE>
# Possível Solução
## Criação de dois métodos login no Sistema.

    @@Java
class Sistema {
	public boolean login (Diretor diretor, String senha) {
		return diretor.autentica ( senha );
	}
	public boolean login (Gerente gerente, String senha) {
		return gerente.autentica ( senha );
}
}

.callout Não é uma boa solução!!!

Não é uma boa solução!!!

Para cada novo funcionário criado, é necessário incluir um método novo.


<!SLIDE>
# Outra Solução - Criar uma Classe FuncionarioAutenticavel


colocar imagem


<!SLIDE>
# Outra Solução - Criar uma Classe FuncionarioAutenticavel

    @@Java
    class Sistema {
	    public boolean login (FuncionarioAutenticavel fa, String senha) {
		    return fa.autentica ( senha );
	    }
    }


A classe FuncionarioAutenticavel é candidata a classe abstrata.
E o método autentica poderia ser abstrato.

Portanto, herança resolve o problema.
Mas a herança pode não fazer muito sentido.



<!SLIDE>
# x

Outra Situação: Acesso ao Sistema por Clientes.

Possível solução: 

fazer Cliente extender FuncionarioAutenticavel

Problema: Herança sem sentido 

	Cliente “não é” um FuncionarioAutenticavel.

colocar imagem



<!SLIDE>
# x
Problema para resolver!!

Encontrar uma forma de referenciar Diretor, Gerente e Cliente de uma mesma maneira.

Uma forma na qual as classes garantissem a existência de um determinado método, através de um Contrato.

Poderíamos criar o Contrato que define tudo o que a classe deve fazer.


<!SLIDE>
# Exemplo: Contrato Autenticável

Todo mundo que quiser ser Autenticável, precisa saber:
autenticar dada uma senha, devolvendo um booleano.

Quem quiser, pode “assinar” esse contrato, sendo obrigado a explicar como é feito a autenticação.

Podemos fazer com que Gerente assine o contrato.


<!SLIDE>
# Como fazer em Orientação a Objetos?

Podemos utilizar Interface.

Em Java, temos:

    @@Java
    interface Autenticavel {
	    boolean autentica (String senha);
    }

Contrato!!



<!SLIDE>
# Interface

É a maneira pela qual conversamos com um objeto.

Uma interface pode definir uma série de métodos, mas não contém implementação de nenhum método.

A Interface expõe o que o objeto deve fazer, e não como ele faz, nem o que ele tem. 

O Como ele faz será definido em uma implementação desta interface.


<!SLIDE>
# Interface em Java
## Sintaxe

    @@Java
    interface <nome> {
	    tipo <nome_constante> = valor_constante;
	    // …

    	tipo <nome_metodo> (lista_parâmetros);
    }


<!SLIDE>
# Implementação de Interface na Classe


    @@Java
    class <nome_classe> [extends <super_classe>] [implements interface1, interface2, …] {
	    // corpo da classe
    }


<!SLIDE>
# x

    @@Java
    interface Autenticavel {
	    boolean autentica (String senha);
    }

    @@Java
    class Gerente extends Funcionario implements Autenticavel {
	    public boolean autentica (String senha) {
            return senha.equals(“gerente”);
	    }
    }


<!SLIDE>
# Representação de Interface em UML
colocar imagem


<!SLIDE>
# x

    @@Java
    Autenticavel a = new Gerente ();

    @@Java
    class Sistema {
	    public boolean login (Autenticavel a, String senha) {
		    return a.autentica ( senha );
	    }
    }
    
    

<!SLIDE>
# Interface

Podemos definir como interface o contrato entre a classe e o mundo exterior.

Quando uma classe implementa uma interface, se compromete a fornecer o comportamento publicado por esta interface.



<!SLIDE>
# Interface
O objetivo do uso de uma interface é deixar seu código mais flexível e possibilitar a mudança de implementação sem maiores dificuldades.




<!SLIDE>
# Interface - Métodos e Constantes

Uma interface é, essencialmente, uma coleção de constantes e métodos abstratos

Métodos em uma interface são sempre públicos e abstratos.

Constantes em uma interface são sempre públicas estáticas e final.


<!SLIDE>
# Interface
As interfaces são formadas pela declaração de zero ou mais métodos, os quais obrigatoriamente não possuem corpo.

As operações específicas para cada um desses métodos são realizados pela classe que implementa.

Uma interface não pode ser instanciada.




<!SLIDE>
# Interface
Em uma classe podem ser implementadas uma ou mais interfaces, sendo que devem estar separadas por virgulas.

Se uma classe implementa uma determinada interface, todos os métodos declarados nessa interface implementada devem ser definidos na respectiva classe.

Caso contrário, ocorre um erro de compilação.




<!SLIDE>
# Classe e Interface
* Classe é um conjunto de dados e métodos;
* Interface é um conjunto de métodos sem dados;
* Quando uma classe implementa uma interface, ela deve implementar todos os métodos declarados na interface;
* Uma classe pode implementar qualquer número de interfaces mas só pode herdar de uma superclasse;
* Interfaces, assim como classes abstratas, fornecem o nome do método, mas não a implementação;


<!SLIDE>
# Herança e Interface
* Diferentemente das classes, uma interface pode herdar mais de uma interface.
* Você não herda métodos e atributos, e sim responsabilidades.


<!SLIDE>
# Porque usar Interfaces

* Para deixar o código mais flexível, e possibilitar a mudança de implementação sem maiores traumas.

* Elas também trazem vantagens em não acoplar as classes.



<!SLIDE>
# Interface

* Define a parte pública de uma classe de objetos

* Representa uma especificação

* Especifica um conjunto de funcionalidades esperadas

* Representa o comportamento padrão que deve ser apresentado por todas as classes que a implementam



<!SLIDE>
# A interface de um objeto é o conjunto das operações públicas que ele pode realizar

    @@Java
    public class ContaBancaria {
        private double saldo = 0.0;
        public ContaBancaria ( ) {
            this.saldo = 0.0;
        }
        public void sacar (double valor) {
            this.saldo -= valor;
        }
        public void depositar (double valor) {
            this.saldo += valor;
        }
    }


<!SLIDE>
# As interfaces estabelecem as mensagens que podem ser trocadas entre os componentes e ocultam os detalhes de implementação


    @@Java
    public interface Progressao {
        public int valorAtual ( );
        public void proximoValor ( );
    }

    @@Java
    public class ProgressaoAritmetica implements Progressao { ... }

    @@Java
    public class ProgressaoGeometrica implements Progressao { ... }


    @@Java
    public class ProgressaoFibonacci implements Progressao { ... }


Notes: As interfaces estabelecem as mensagens que podem ser trocadas entre os componentes de software e ocultam os detalhes de implementação.


<!SLIDE>
# Interfaces Múltiplas
	
Uma classe pode implementar mais de uma interface.

Exemplo: Anfíbio - Terrestre e Marítimo



<!SLIDE>
# Hierarquia

Da mesma forma que uma classe pode estender outra, uma interface também pode estender outra. Assim, quando uma classe implementar uma interface filha, além de implementar os métodos desta interface, também deverá implementar os métodos da interface mãe.

Exemplo: Interface Collection e List e classe ArrayList




<!SLIDE>
# Interface

Uma interface estabelece um contrato que é obedecido pelas classes que a implementam.

Quando uma classe implementa uma interface, todas as funcionalidades especificadas pela interface serão oferecidas pela classe.


<!SLIDE>
# Possibilidades de Hierarquia

