<!SLIDE section center>
# Herança



<!SLIDE>
# Pilares do Paradigma Orientação a Objetos

Este módulo refere-se a um dos quatro pilares do paradigma orientado a objetos.

* **Herança**

* Polimorfismo

* Abstração

* Encapsulamento




<!SLIDE>
# Reutilização de Código

Uma das principais características do paradigma de programação orientado a objetos
é a capacidade de **Reutilização de Código**.

Alguns dos benefícios que a Reutilização de Código provê são:

* Reduz a quantidade de código para escrever

* Economiza o trabalho do programador

* Diminui a possibilidade de erros




<!SLIDE>
# Mecanismos de Reutilização

O paradigma de programação orientado a objetos possui alguns mecanismos para reutilizar código:

* **Herança**

* Associação




<!SLIDE>
# O que é Herança?

.callout É um princípio de Programação Orientada a Objetos que permite a _criação de novas classes_ a partir de outras _já existentes_. 

<!SLIDE>
# Sinônimos

As classes pertencentes a um relacionamento de Herança podem ser chamadas de formas diferentes.

* Classe nova

 * superclasse
 
 * classe base
 
 * classe genérica
 
 * classe mãe
 

* Classe já existente

 * subclasse

 * classe derivada
 
 * classe especializada
 
 * classe filha



<!SLIDE>
# Nomenclatura de Herança

Alguns exemplos de expressões utilizadas para referenciar Herança:

* A classe A é superclasse da classe B
* A classe B é subclasse da classe A
* Classe A é classe Mãe de Classe B
* Classe B é classe Filha de Classe A

Uma das mais importantes é a expressão 

* Toda classe B **É UMA** classe A

 
 
 
<!SLIDE>
# Hierarquia de Classes

No Paradigma Orientado a Objetos, a **Herança** possibilita a criação de uma _Hierarquia de Classes_.

Com esta Hierarquia, subclasses são capazes de _herdar_ **características** (atributos) e **comportamentos** (métodos) de uma superclasse.




<!SLIDE>
# Alguns dos Benefícios da Herança?

.callout Poderoso mecanismo para o reaproveitamento de código.

.callout Facilita a manutenção do código.





<!SLIDE>
# Instâncias de classes distintas

Considere as duas classes abaixo.

ClasseA com o método metodoA()

    @@@Java
    public class ClasseA {
        public metodoA () {
            // corpo do método
        }
    }

ClasseB com o método metodoB()

    @@@Java
    public class ClasseB {
        public metodoB () {
            // corpo do método
        }
    }




<!SLIDE>
# Métodos disponíveis pelas instâncias

Cada instância tem acesso apenas aos métodos definidos na sua própria classe.

    @@@Java
    public static void main (String[] args) {
    
        ClasseA classeA = new ClasseA();
        classeA.metodoA();
        
        ClasseB classeB = new ClasseB();
        classeB.metodoB();   
    }

Não é possível uma instância acessar o método de outra instância.

    @@@Java
    public static void main (String[] args) {
    
        ClasseA classeA = new ClasseA();
        classeA.metodoB(); // ERRO!!!!
    }




<!SLIDE>
# Possibilidade para acesso por Cópia

.callout.question Como fazer para que uma instância da ClasseA tivesse acesso para o metodoB() da ClasseB?

Uma possibilidade seria copiar o metodoB() na ClasseA.

A ClasseA alterada ficaria da seguinte forma:

    @@@Java
    public class ClasseA {
    
        public metodoA () {
            // corpo do método
        }

        public metodoB () {
            // corpo do método
        }
        
    }




<!SLIDE>
# Acessando por Cópia

Agora sim, uma instância da ClasseA pode chamar o metodoB(), pois ela está definida na ClasseA.

    @@@Java
    public static void main (String[] args) {
    
        ClasseA classeA = new ClasseA();
        classeA.metodoB(); // Correto!!!!
        
    }



<!SLIDE>
# Problemas na abordagem de cópia

Resolver o problema com o recurso de **Cópia de Código** não é uma abordagem boa 
se considerarmos algumas das vantagens que o paradigma orientado a objetos 

 * possibilita de reaproveitamento de código
 
.callout.warn O código está sendo copiado.

 * facilidade de manutenção do código
 
.callout.warn Caso ocorra uma alteração no metodoB(), será necessário corrigir em dois lugares.

.callout.question Qual a alternativa?




<!SLIDE>
# Possibilidade para acesso por Herança

Uma possibilidade aderente ao paradigma orientado a objetos é a utilização de Herança.

Para aplicar Herança em Java, utiliza-se a palavra reservada **extends**.



<!SLIDE>
# Sintaxe Herança em Java

Considere a classe chamada SuperClasse

    @@@ Java
    public class SuperClasse {
    }

E uma outra classe chamada SubClasse

    @@@ Java
    public class SubClasse {
    }
    
Ao aplicar Herança na classe SubClasse com a classe SuperClasse, ela ficaria desta forma

    @@@ Java
    public class SubClasse extends SuperClasse {
    }




<!SLIDE>
# Possibilidade para acesso por Herança

Voltando ao exemplo, podemos aplicar Herança na classe ClasseB para que ela 
tenha acesso ao método metodoA() da classe ClasseA.

A classe ClasseB alterda fica da seguinte forma:

    @@@ Java
    public class ClasseB extends ClasseA {
        public metodoB () {
            // corpo do método
        }
    }



<!SLIDE>
# Acessando por Herança

Desta forma, uma instância da ClasseA pode chamar o metodoB(), pois ela herda métodos e atributos da classe ClasseA.

    @@@Java
    public static void main (String[] args) {
    
        ClasseA classeA = new ClasseA();
        classeA.metodoB(); // Correto!!!!
        
    }

.callout O método foi reaproveitado sem a necessidade de cópia.




<!SLIDE>
# Representação Visual

Para melhor comunicar sobre as possibilidades de relacionamento das classes,
utilizamos diagramas para visualização.

Esta comunicação é realizada pela linguagem de modelagem chamada **UML**.

O módulo **UML** explica com mais detalhes.




<!SLIDE>
# Possibilidades de Herança

Há duas formas de Herança

* Herança Simples

* Herança Múltipla





<!SLIDE>
# Herança Simples
Várias subclasses podem herdar da mesma superclasse.


<!SLIDE>
# Exemplo Herança Simples

    @@@ Java
    public class SuperClasse {
    }
    public class SubClasse1 extends SuperClasse {
    }
    public class SubClasse2 extends SuperClasse {
    }


<!SLIDE>
# Herança Múltipla
Uma subclasse pode herdar de várias superclasses.

.callout.warning A linguagem Java não suporta Herança Múltipla.




<!SLIDE>
# Exemplo Herança Múltipla

    @@@ Java
    public class Carro {
        public void puxarFreioDeMao() {
        }
    }
    public class Barco {
        public void jogarAncora() {
        }
    }
    public class CarroAnfibio extends Carro, Barco {
    }


.callout ATENÇÂO: Em Java não funciona! Veremos mais adiante como resolver o problema.

~~~SECTION:notes~~~
public interface Carro {
    public void puxarFreioDeMao();
}
public interface Barco {
    public void jogarAncora();
}
public class CarroAnfibio implements Carro, Barco {
    private Carro carro;
    private Barco barco;
    public void CarroAnfibio( Carro carro, Barco barco ) {
        this.carro = carro;
        this.barco = barco;
    }
    public void puxarFreioDeMao() {
        carro.puxarFreioDeMao();
    }
    public void jogarAncora() {
        barco.jogarAncora();
    }
}
~~~ENDSECTION~~~




<!SLIDE>
# Hierarquia de Classes

A hierarquia de herança pode ter várias níveis.








<!SLIDE>
# Herança

Representa o relacionamento É UM

imagem

Exemplos:
carro é um veículo
livro é uma publicação


<!SLIDE>
#Generalização / Especialização

É a primeira abordagem a ser feita sobre herança e possibilita a vantagem mais direta e evidente que é a reutilização de código. 

A **generalização** é o agrupamento de características (atributos) e regras (métodos) comuns em um modelo de sistema. 

A **especialização** é o processo inverso, é a definição das particularidades de cada elemento de um modelo de sistemas, 
detalhando características e regras específicas de um o objeto.

















<!SLIDE>



























<!SLIDE center>
Vamos criar um programa de computador utilizando o Paradigma Orientado a Objetos ...

<!SLIDE>
# Especificação do Problema

.callout Dado um arquivo com informações de folha de pagamento Criar um programa orientado a objetos que 
imprime o relatório e na última linha aq=

Dado uma empresa 
Analista, coordenador, Gerente
arquivo com
criar um programa que imprime a idade, nome 


<!SLIDE>
# Modelagem do Problema

Uma das primeiras atividades a ser realizada para criar um programa de computador 
A primeira tarefa a ser realizada para criar um programa orientado a objetos
Para criarmos um programa orientado a objetos, 

inicialmente podemos utilizar a especificação do problema como forma de identificar as possíveis classes, seus atributos (características) e seus métodos (comportamento).






<!SLIDE>
# Identificação das Classes
Dado a especificação 
Funcionários podem ser:
Professores
Coordenadores


<!SLIDE>

Possíveis Características da Classe Professor
* nome
* cpf
* salário

Possíveis Características da Classe Coordenador
* nome
* cpf
* salário


<!SLIDE>
# Exemplo: Classe Funcionario

colocar imagem


<!SLIDE>
Ferramenta de Modelagem
http://astah.net/editions/community/

colocar imagem



<!SLIDE>
# Diagrama de Classes

imagem de professor coordenador diretor


<!SLIDE center>

Vamos criar as Classes Java a partir do Diagrama UML ...


<!SLIDE>
# Classe Diretor

    @@@Java
    public class Diretor {
        private String nome;
        private String cpf;
        public Diretor (String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return this.nome;
        }
        public void setCpf(String cpf) {
             this.cpf = cpf;
        }
    }



<!SLIDE>
# Classe Coordenador

    @@@Java
    public class Coordenador {
        private String nome;
        private String cpf;
        public Coordenador (String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return this.nome;
        }
        public void setCpf(String cpf) {
             this.cpf = cpf;
        }
    }


<!SLIDE>
# Classe Professor

    @@@Java
    public class Professor {
        private String nome;
        private String cpf;
        public Professor (String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }
        public void setNome(String nome) {
            this.nome = nome;
        }
        public String getNome() {
            return this.nome;
        }
        public void setCpf(String cpf) {
             this.cpf = cpf;
        }
    }


<!SLIDE>
# Relatório

Criar a classe Relatorio.
No método main:
Instanciar as seguintes classes:
Professor: “Fulano”, “123.456.789-01”, 1000
Coordenador: “Beltrano”, “345.678.901-23”, 2000
Diretor: “Ciclano”, “567.890.123-44”, 3000
2. Imprimir um relatório da seguinte forma:
Fulano (123.456.789-01):  1000
Beltrano (345.678.901-23): 2000
Ciclano (567.890.123-44): 3000


<!SLIDE>
# Relatório

    @@@Java
    public class Relatorio {
        public static void main (String[] args) {
            Professor p
            
            System.out.println();
        }
    }
    

Fulano (123.456.789-01):  1000
Beltrano (345.678.901-23): 2000
Ciclano (567.890.123-44): 3000


<!SLIDE>
# Alguns problemsa
* repetição
* manutenção




<!SLIDE>
# Melhorando a Modelagem do Exemplo

Usando o Princípio da Herança,
Como poderíamos melhorar esta solução (modelagem)?



<!SLIDE>
# Remodelagem do Exemplo

colocar imagem

Professor É UM Funcionário
Coordenador É UM Funcionário
Diretor É UM Funcionário



<!SLIDE>
# Em Java
# Palavra reservada extends para representar herança

imagem e código


repetição eliminada
manutenção facilitada

<!SLIDE>
# Relatório

código novamente.


<!SLIDE>
# Funcionários na Universidade

Funcionário
* nome
* cpf
* salário

Tipos de Funcionários

* Professor
 * tipo contratação
* Coordenador
 * departamento
* Segurança
 * período


<!SLIDE>
# Funcionários na Universidade

Funcionário 1: Professor
nome: Fulano
cpf: 111.111.111-11
salário: 1.000
tipo contratação: CLT


Funcionário 2: Coordenador
nome: Beltrano
cpf: 222.222.222-22
salário: 2.000
departamento: Computação


Funcionário 3: Segurança
nome: Ciclano
cpf: 333.333.333-33
salário: 3.000
período: Noturno



<!SLIDE>
# Um slide para falar que vamos ver as possibilidades para resolver o problemas


<!SLIDE>
# Modelagem - 1a. opção

Adicionar os atributos em uma classe e deixar os atributos vazios quando necessário.


colocar imagem

Fica estranho...

Porque fica estranho?

atributos podem não ser utilizados
difícil determinar qual o tipo de funcionário


<!SLIDE>
# Modelagem - 2a. opção
Criar classes iguais com os parâmetros iguais e adicionais.

incluir imagem

Fica estranho também ...

Porque fica estranho?

* classes iguais
* atributos repetidos
* atributos não utilizados



<!SLIDE>
# Modelagem - 3a. opção

Utilizar Herança, ou seja, criar uma classe pai e herdar os atributos e métodos

colocar imagem

Esta modelagem parece melhor...

Porque?

* classes diferentes
* atributos não se repetem



<!SLIDE>
# Herança Simples x Múltipla

Herança Múltipla: uma classe herda métodos e campos de duas classes simultaneamente.
Herança Simples: uma classe herda métodos e atributos de uma única classe pai.
Não existe mecanismo de Herança Múltipla em Java.
Exemplo:


colocar imagem


<!SLIDE incremental>
# Benefícios da Herança
## É usada na intenção de:
* reaproveitar código
* reaproveitar comportamento generalizado
* especializar operações
* reaproveitar atributos



<!SLIDE>
#
Classe Funcionario com atributo salário e método aplicarBonus.

    @@@Java
    public class Funcionario {
	public double salario;

	public Funcionario (double salario) {
		this.salario = salario;
	}

	public void aplicarBonus() {
		// Aumento de 30%
		this.salario = 1.3 * this.salario;

	public double getSalario () {
		return this.salario;
	}
}


<!SLIDE>
#

Alterando salário do Funcionário...

    @@@Java
    public class Funcionario {
  public double salario;
  
  public Funcionario (double salario) {
    this.salario = salario;
  }

  public void aplicarBonus() {
    // Aumento de 30%
    this.salario = 1.3 * this.salario;
  }

  public double getSalario () {
    return this.salario;
  }
}

Salário: 2.000

    @@@Java
    public static void main (String[] args) {
  Funcionario f = new Funcionario(1.000);
  f.salario = 2.0 * f.salario;
  System.out.println (“Salário: “ + f.getSalario());
}




<!SLIDE>
#

Como impedir que o salário do Funcionário seja aumentado mais que o bônus?


    @@@Java
    public class Funcionario {
  public double salario;
  
  public Funcionario (double salario) {
    this.salario = salario;
  }

  public void aplicarBonus() {
    // Aumento de 30%
    this.salario = 1.3 * this.salario;
  }

  public double getSalario () {
    return this.salario;
  }
}


Salário: 2.000


    @@@Java
    public static void main (String[] args) {
  Funcionario f = new Funcionario(1.000);
  f.salario = 2.0 * f.salario;
  System.out.println (“Salário: “ + f.getSalario());
}

    
    
    
    
<!SLIDE>
#
Utilização do Modificador Correto.

    @@@Java
    public class Funcionario {
  private double salario;
  
  public Funcionario (double salario) {
    this.salario = salario;
  }

  public void aplicarBonus() {
    // Aumento de 30%
    this.salario = 1.3 * this.salario;
  }

  public double getSalario () {
    return this.salario;
  }
}


Salário: 2.000

    @@@Java
    public static void main (String[] args) {
  Funcionario f = new Funcionario (1.000);
  //f.salario = 2.0 * f.salario; //ERRO
  f.aplicaBonus();
  System.out.println (“Salário: “ + f.getSalario());
}





<!SLIDE>
#
Como impedir que o salário do Funcionário seja aumentado mais que o bônus?

    @@@Java
    public class Funcionario {
	public double salario;

	public Funcionario (double salario) {
		this.salario = salario;
	}

	public void aplicaBonus() {
		// Aumento de 30%
		this.salario = 1.3 * this.salario;

	public double getSalario () {
		return this.salario;
		
	}
}


Salário: 2.000


    @@@Java
    public static void main (String[] args) {
Funcionario f = 
  			new Funcionario(1.000);
f.salario = 2.0 * f.salario;
System.out.println (“Salário: “ +
				f.getSalario());
}


    
    

<!SLIDE>
#
Restringindo o acesso ao atributo salario da classe Funcionario.

    @@@Java
    public class Funcionario {
	private  double salario;

	public Funcionario (double salario) {
		this.salario = salario;
	}

	public void aplicaBonus() {
		// Aumento de 30%
		this.salario = 1.3 * this.salario;

	public double getSalario () {
		return this.salario;
	}
}


Salário: 1.300


    @@@Java
    public static void main (String[] args) {
Funcionario f = 
 			new Funcionario (1.000);
//f.salario = 2.0 * f.salario; //ERRO
f.aplicaBonus();
System.out.println (“Salário: “ +
				f.getSalario());
}






<!SLIDE>
#

<!SLIDE>
#






<!SLIDE>
# Herança e Construtores

Como o relacionamento de Herança ocorre entre duas classes e ambas possuem construtores, 
precisamos saber como ocorre a chamada dos construtores das classes.

.callout O primeiro construtor a ser chamado é o construtor da classe sendo instanciada.

.callout Contudo, a primeira tarefa a ser realizada DEVE ser chamar o construtor da classe mãe.


<!SLIDE>
# Herança e Construtores

Considere as seguintes classes a seguir relacionadas por Herança.

ClasseMae representando a super classe

    @@@Java
    public class ClasseMae {
        public ClasseMae () {
            System.out.println("Executando o construtor da ClasseMae");
        }
    }

ClasseFilha representando a classe filha, herdada da ClasseMae

    @@@Java
    public class ClasseFilha extends ClasseMae {
        public ClasseFilha () {
            System.out.println("Executando o construtor da ClasseFilha");
        }
    }
    

<!SLIDE>
# Herança e Construtores

Ao instanciar a classe ClasseFilha

    @@@Java
    public static void main (String[] args) {
        ClasseFilha classeFilha = new ClasseFilha();
    }

Temos o seguinte resultado

    @@@ Console
    Executando o construtor da ClasseMae
    Executando o construtor da ClasseFilha


Apesar do construtor da classe ClasseFilha ter sido chamado primeiro,
o código da classe ClasseMae é executado primeiro.

.callout A primeira tarefa a ser realizada DEVE ser chamar o construtor da classe mãe.



<!SLIDE>
# Chamada implícita do Construtor Padrão

No exemplo anterior, a chamada para o construtor da classe mãe foi realizada
implicitamente da palavra reservada **super**.

    @@@Java
    public class ClasseFilha extends ClasseMae {
        public ClasseFilha () {
        
            super ();
        
            System.out.println("Executando o construtor da ClasseFilha");
        }
    }

A palavra reservada **super** foi utilizada como referência para o método construtor
da classe mãe. Neste caso, o construtor padrão, pois o método não possui nenhum
parâmetro de entrada.

<!SLIDE>
# Chamada implícita do Construtor Padrão

A chamada para o construtor padrão da classe mãe é opcional caso a classe mãe
tenha definido o construtor padrão.

Por este motivo, o código sem a chamada explícita funciona no exemplo anterior.


<!SLIDE>
# Classes Sem Construtores definidos

.callout Uma classe sem construtor, define implicitamente um construtor padrão com o corpo do método vazio.

Exemplo de uma superclasse sem construtor.

    @@@Java
    public class SuperClasse {
    
    }

Exemplo de uma subclasse sem construtor.

    @@@Java
    public class SubClasse extends SuperClasse {
    
    }

Estes códigos estão corretos pois implicitamente o construtor da classe filha está chamando o construtor da classe mãe.

<!SLIDE>
# Classes Sem Construtores definidos

Implicitamente, o código que está sendo executado é o seguinte.

Exemplo de uma superclasse sem construtor.

    @@@Java
    public class SuperClasse {
		public SuperClasse ( ) {
		}
    }

Exemplo de uma subclasse sem construtor.

    @@@Java
    public class SubClasse extends SuperClasse {
		public SubClasse ( ) {
		    super ( );
		}
    }

Estes códigos estão corretos pois implicitamente o construtor da classe filha está chamando o construtor da classe mãe.


<!SLIDE>
# Superclasse sem Construtor Padrão

Caso o construtor padrão não esteja definido na classe mãe, uma chamada explícita DEVE ser realizada.

.callout Um construtor padrão não está definido se algum outro construtor foi definido e ele não foi definido explicitamente.

<!SLIDE>
# Superclasse sem Construtor Padrão

Neste exemplo, a classe SuperClasse não possui o construtor padrão definido.

    @@@Java
    public class SuperClasse {
        private String parametro;
        
		public SuperClasse (String parametro) {
		    this.parametro = parametro;
		}
    }

<!SLIDE>
# Superclasse sem Construtor Padrão

Logo, uma classe a herde, deverá necessariamente chamá-la. A classe filha
pode realizar este tratamento de duas formas:

O construtor da subclasse passa algum valor explicitamente na chamada do construtor da classe mãe.

    @@@Java
    public class SubClasse extends SuperClasse {
		public SubClasse () {
		    super ("valor qualquer");
		}
    }

O construtor da subclasse recebe como parâmetro de entrada e repassa para a classe mãe.

    @@@Java
    public class SubClasse extends SuperClasse {
		public SubClasse (String parametro) {
		    super (parametro);
		}
    }



<!SLIDE>
# SuperClasse com Construtores Adicionais

No caso em que a super classe defina mais de um construtor, a classe filha pode escolher qual utilizar.



<!SLIDE>
# Construtores Adicionais com Construtor Padrão

Neste caso, a super classe possui construtores adicionais e o construtor padrão deve ser explicitamente definido.

    @@@Java
    public class SuperClasse {
        private String parametroA;

		public SuperClasse () {
		    this.parametroA = "qualquer valor";
		}
		
		public SuperClasse (String parametroA) {
		    this.parametroA = parametroA;
		}
		
    }

<!SLIDE>
# Construtores Adicionais com Construtor Padrão

Temos duas opções para realizar as chamadas.

Pode ser utilizado o  construtor padrão

    @@@Java
    public class SubClasse extends SuperClasse {
		public SubClasse () {
		    super ();
		}
    }

Ou, o segundo construtor    

    @@@Java
    public class SubClasse extends SuperClasse {
		public SubClasse (String parametroA) {
		    super (parametroA);
		}
    }




<!SLIDE>
# Construtores Adicionais sem Construtor Padrão

Neste caso, a super classe possui construtores adicionais, contudo o construtor padrão não está definido.

    @@@Java
    public class SuperClasse {
        private String parametroA;
        private Integer parametroB;

		public SuperClasse (String parametroA) {
		    this.parametroA = parametroA;
		}
		
		public SuperClasse (Integer parametroB) {
		    this.parametroB = parametroB;
		}
    }


<!SLIDE>
# Construtores Adicionais sem Construtor Padrão

Temos duas opções para realizar as chamadas.

Pode ser utilizado o primeiro construtor

    @@@Java
    public class SubClasse extends SuperClasse {
		public SubClasse (String parametroA) {
		    super (parametroA);
		}
    }

Ou o segundo construtor    

    @@@Java
    public class SubClasse extends SuperClasse {
		public SubClasse (Integer parametroB) {
		    super (parametroB);
		}
    }









<!SLIDE>
# Atividade: Herança e Construtores


Exemplo/Exercíco: Funcionario/Gerente, ClasseMae/ClasseFilha









<!SLIDE>
# Refatoração
Herança também pode surgir a partir da refatoração de classes existentes de modo a eliminar a duplicação de código.

(Exemplo em UML - Gerente e Programador, depois superclasse Funcionario)

_Motivação para Refatoração_: Grande Quantidade de atributos e métodos duplicados.






<!SLIDE>
# Recomendações

* Não usar Herança quando a relação não é claramente ‘é um’.

* Não use Herança apenas por reaproveitamento de código da classe mãe.

* Ao utilizar Herança com muitos filhos, pode gerar mais problemas.

* Quebra do encapsulamento. Quando um método na classe mãe muda pode quebrar o comportamento da classe filha.





<!SLIDE>
# Atividade 1
Crie uma classe Pessoa contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), 
e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção. 

Atributos: nome, endereço, telefone.


<!SLIDE>
# Atividade 2
Crie a subclasse Fornecedor a partir da classe Pessoa (exercício anterior). 

A classe fornecedor tem além dos atributos que caracterizam a classe Pessoa, também os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecerodr), valorDivida (montante da dívida para com o fornecedor).

Implemente a classe Fornecedor, para além dos usuais métodos seletores e modificares, um método obterSaldo que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.

