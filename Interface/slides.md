<!SLIDE section center>
# Interface

<!SLIDE>
# Hierarquia de Funcionários

Considere a seguinte hierarquia de classes

![.fancyborder](/_images/hierarquia_funcionarios.png)



<!SLIDE>
# Hierarquia de Funcionários

O método _autentica_ está definido na classe Funcionario e é utilizado para validar
se uma senha passada no parâmetro de entrada do método é a mesma do funcionário. 

# Hierarquia de Funcionários
    @@@ Java 
    public boolean autentica (String senha) {
      // ...
    }
    
O método retorna *true* se a senha é a mesma e *false*, caso contrário.


<!SLIDE>
# Implementações diferentes

As classes concretas filhas da classe Funcionario também podem implementar
sua propria validação de senha.

    @@@ Java
    class Diretor extends Funcionario {
	    public boolean autentica (String senha) {
		    return senha.equals(“diretor”);
	    }
    }



<!SLIDE>
# Sistema para autenticação de Funcionários

A classe _Sistema_ possui um método _executa ()_ para executar uma determinada
operação no caso em que a senha seja a mesma do funcionário.

    @@@ Java
    public class Sistema {
        public void executa (Funcionario funcionario, String senha) {
          if ( funcionario.autentica ( senha ) ) {
            System.out.println ("Executando Operação");
          } else {
            System.out.println ("Operação não executada");
          }          
        }        
    }

A classe foi criada de forma que atendesse ao requisito de permitir que 
todos os funcionários pudessem executar a operação no sistema.


<!SLIDE>
# Controle de Acesso ao Sistema

Agora, há a necessidade de implementar um novo requisito:

.callout Apenas o Diretor pode executar a operação no Sistema.

Vamos analisar algumas maneiras de resolver este problema.


<!SLIDE>
# Alteração da Assinatura do Método

Uma primeira abordagem seria alterar a assinatura do método 
para aceitar somente instâncias da Classe Diretor.

    @@@ Java
    public class Sistema {
      public void executa (Diretor diretor, String senha) {
        // corpo do código
	  }  
    }

Uma tentativa de utilizar uma instância de outra classe gerará erro de compilação.



<!SLIDE>
# Possível Solução
## Criação de dois métodos login no Sistema.

    @@@ Java
    public class Sistema {
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
# Abordagem: Identificação da Classe

Uma outra abordagem possível é a identificação da classe da instância 
utilizando o operador **instanceof**.

    @@@ Java
    public class Sistema {
      public void executa (Funcionario f, String senha) {
        if (f instanceof Diretor ) {
           // corpo do código
        }
	  }  
    }



<!SLIDE>
# Outra Solução - Criar uma Classe FuncionarioAutenticavel

Nesta solução, 

![.fancyborder](/_images/hierarquia_funcionario_autenticavel.png)


<!SLIDE>
# Classe FuncionarioAutenticavel

    @@@ Java
    class Sistema {
	    public boolean executaOperacao (FuncionarioAutenticavel fa, String senha) {
		    return fa.autentica ( senha );
	    }
    }


A classe FuncionarioAutenticavel é candidata a classe abstrata.
E o método autentica poderia ser abstrato.

Portanto, herança resolve o problema.
Mas a herança pode não fazer muito sentido.




<!SLIDE>
# Acesso por Clientes

Um problema que pode ocorrer nesta abordagem é a necessidade de adicionar
classes que não pertencem a hierarquia de classes.

**Situação**: Acesso ao Sistema por Clientes.

**Possível Solução**: fazer Cliente extender FuncionarioAutenticavel

**Problema**: Herança não faz sentido.

.callout.warn Cliente **NÃO É** um FuncionarioAutenticavel.

![.fancyborder](/_images/cliente_funcionario_autenticavel.png)




<!SLIDE>
# Problema para resolver

Encontrar uma forma de referenciar Diretor, Gerente e Cliente de uma mesma maneira.

Uma forma na qual as classes garantissem a existência de um determinado método, através de um Contrato.

Poderíamos criar o Contrato que define tudo o que a classe deve fazer.




<!SLIDE>
# Contrato Autenticável

No nosso exemplo, podemos pensar em um _Contrato Autenticável_.

Ou seja, toda classe que precisar autenticar no Sistema poderia "assinar" um contrato.

Este contrato pode ser descrito pelo método autentica, por exemplo

    @@@ Java
    public boolean autentica (String senha) 
    
Desta forma, o problema do exemplo é resolvido fazendo com que a classe
possua este método, ou seja, podemos fazer com que a classe assine o contrato.



<!SLIDE>
# Como fazer em Orientação a Objetos?

Podemos utilizar Interface.

Em Java, temos:

    @@@ Java
    interface Autenticavel {
	    boolean autentica (String senha);
    }

.callout.info Interface = Contrato



<!SLIDE>
# Interface

**Interface** é a maneira pela qual conversamos com um objeto.

Uma Interface pode definir uma série de métodos, mas não contém implementação de nenhum método.

A Interface expõe o que o objeto deve fazer, e não como ele faz, nem o que ele tem. 

O Como a classe faz será definido em uma implementação desta interface.


<!SLIDE>
# Interface em Java
## Sintaxe

    @@@ Java
    interface <nome> {
	    tipo <nome_constante> = valor_constante;
	    // …

    	tipo <nome_metodo> (lista_parâmetros);
    }


<!SLIDE>
# Implementação de Interface na Classe


    @@@ Java
    class <nome_classe> [extends <super_classe>] [implements interface1, interface2, …] {
	    // corpo da classe
    }


<!SLIDE>
# Implementação de Funcionario Autenticavel

Para aplicar o _Contrato_ (_Interface_) Autenticavel

    @@@ Java
    interface Autenticavel {
	    boolean autentica (String senha);
    }

podemos implementar o contrato (interface) na classe Gerente.

    @@@ Java
    class Gerente extends Funcionario implements Autenticavel {
	    public boolean autentica (String senha) {
            return senha.equals(“gerente”);
	    }
    }


<!SLIDE>
# Uso da Interface

Considerando que o sistema agora recebe uma interface...

    @@@ Java
    class Sistema {
	    public boolean login (Autenticavel a, String senha) {
		    return a.autentica ( senha );
	    }
    }

é possível utilizarmos 

    @@@ Java
    Autenticavel a = new Gerente ();

    

<!SLIDE>
# Representação de Interface em UML
colocar imagem


    

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
# Classe vs Interface

* Classe é um conjunto de dados e métodos;
* Interface é um conjunto de métodos sem dados;
* Quando uma classe implementa uma interface, ela deve implementar todos os métodos declarados na interface;
* Uma classe pode implementar qualquer número de interfaces mas só pode herdar de uma superclasse;
* Interfaces, assim como classes abstratas, fornecem o nome do método, mas não a implementação;


<!SLIDE>
# Herança vs Interface

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

    @@@ Java
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


    @@@ Java
    public interface Progressao {
        public int valorAtual ( );
        public void proximoValor ( );
    }

    @@@ Java
    public class ProgressaoAritmetica implements Progressao { ... }

    @@@ Java
    public class ProgressaoGeometrica implements Progressao { ... }


    @@@ Java
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

