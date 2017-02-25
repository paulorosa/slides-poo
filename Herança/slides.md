<!SLIDE section center>
# Herança

* incluir exercício/exemplo com a classe de sequencia númérica.



<!SLIDE>
# Pilares do Paradigma Orientação a Objetos
* **Herança**
* Polimorfismo
* Abstração
* Encapsulamento


<!SLIDE>
# Reutilização de Código

Capacidade de facilitar a Reutilização de Código

* Reduz a quantidade de código para escrever
* Economiza o trabalho do programador
* Diminui a possibilidade de erros


<!SLIDE>
# Mecanismos de Reutilização
* Herança
* Associação



<!SLIDE>
# O que é Herança?

.callout É um princípio de Programação Orientada a Objetos que permite a _criação de novas classes_ a partir de outras _já existentes_. 

<!SLIDE>
# Sinônimos

As classes pertencentes a um relacionamento de Herança podem ser chamadas de formas diferentes.

* Classes novas
 * superclasses
 * classes base

* Classes já existentes
 * subclasses
 * classes derivadas
 
Classe genérica, classe base, superclasse ou pai.
 - define variáveis de instância “genéricas” e métodos
Classe especializada, derivada, subclase ou filha
 - especializa, estend ou herda os métodos “genéricos” de uma superclasse
 
 
 
 
 
 
 
<!SLIDE>
# Hierarquia de Classes

Com a herança, é possível criar uma hierarquia de classes.
Uma classe herda métodos e atributos de sua superclasse. Apesar disso, é possível reescrevê-los novamente para uma forma mais específica de representar o comportamento herdado.




<!SLIDE>
# Para que serve a Herança?

Considere a criação de uma classe ClasseB (com métodos m1() e m2() na representação UML).
Que métodos estão disponíveis através de uma referência para a classe B (isto é, um objeto)?

Suponha, agora, que a classe ClasseB herda de ClasseA (métodos m3() e m4() na representação UML).
Que métodos estão agora disponíveis para uma referência da ClasseB (um objeto)?

Poderoso mecanismo para o reaproveitamento de código.
O objeto da classe ClasseB tem agora disponíveis os métodos da classe ClasseA sem ser necessário reescrevê-los na classe ClasseB.
Um objeto da classe ClasseB também é um objeto da classe ClasseA.

Facilita a manuteção do código: Os métodos não são replicados. Se for necessário alterar o código do método m3(), basta alterá-lo na classe ClasseA.
A classe ClasseB pode “recusar” parte da herança, reimplementando os métodos herdados, sobrescrevendo-os. (Exemplo na representação UML).




<!SLIDE>
# Possibilidades de Herança
Herança Simples
Herança Múltipla



Herança Simples
Várias subclasses podem herdar da mesma superclasse.
(Exemplo na representação UML)
Herança Múltipla
Uma subclasse pode herdar de várias superclasses.
Em Java, não é possível.
(Exemplo na representação UML)

A hierarquia de herança pode ter várias níveis.
(Exemplo em UML - que métodos estão agora disponíveis para uma instância da classe ClasseC?)











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
# Herança

Princípio de Orientação a Objetos que permite a criação de novas classes a partir de outras previamente criadas.
Atributos e métodos podem ser reaproveitados.


imagem

A classe A é 
classe genérica
classe base
superclasse
classe mãe


A classe B é
classe especializada
classe derivada
subclasse
classe filha


<!SLIDE>
# Nomenclatura de Herança

A classe A é superclasse da classe B
A classe B é subclasse da classe A
Todo B é um  A
Classe A é classe Pai de Classe B
Classe B é classe Filha de Classe A


imagem

<!SLIDE>
# Herança

Representa o relacionamento É UM

imagem

Exemplos:
carro é um veículo
livro é uma publicação



<!SLIDE>
# Herança

Generalização 


Especialização



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





Quando trabalhamos com herança e um construtor foi definido para a superclasse, devemos,
 obrigatoriamente criar um construtor na subclasse que chame o construtor da superclasse.
 
Caso isso não seja feito, o código apresentará erro.
A chamada do método construtor da superclasse é feita através da palavra super e seguida dos argumentos específicos.
A chamada do método construtor da superclasse deve ser sempre o primeiro comando a aparecer no construtor da subclasse.
Mas o construtor da subclasse não precisa ter necessariamente os mesmos parâmetros do construtor da superclasse.
Exemplo/Exercíco: Funcionario/Gerente, ClasseMae/ClasseFilha

Exemplo 1: ClasseMae / ClasseFilha

public class ClasseMae {

}

public class ClasseFilha extends ClasseMae {

}

O que deve ser mostrado no exemplo:
Aaaaa

Criar um programa principal para mostrar todos os casos.



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

<!SLIDE>
# Subclasse sem Construtor Padrão




<!SLIDE>
#Refatoração
Herança também pode surgir a partir da refatoração de classes existentes de modo a eliminar a duplicação de código.
(Exemplo em UML - Gerente e Programador, depois superclasse Funcionario)
Motivação para Refatoração: Grande Quantidade de atributos e métodos duplicados.

<!SLIDE>
#Generalização / Especialização
É a primeira abordagem a ser feita sobre herança e possibilita a vantagem mais direta e evidente que é a reutilização de código. A generalização é o agrupamento de características (atributos) e regras (métodos) comuns em um modelo de sistema. Já a especialização é o processo inverso, é a definição das particularidades de cada elemento de um modelo de sistemas, detalhando características e regras específicas de um o objeto.




<!SLIDE>
# UML

<!SLIDE>
# Vantagens

Reaproveitamento de código
Possibilita o Polimorfismo


<!SLIDE>
# Desvantagens / Recomendações
Não usar Herança quando a relação não é claramente ‘é um’.
Não use Herança apenas por reaproveitamento de código da classe mãe.
Exemplo:
Não use Herança apenas pelo Polimorfismo.
Ao utilizar Herança com muitos filhos, podem gerar mais problemas:
Você ganha mais coisa do que gostaria
Sua relação com mãe é contubarda
Quebra do encapsulamento
	Exemplo: Pessoa, Pessoa Jurídica, Fornecedor Jurídico, Pessoa Física, Pessoa Jurídica.
Quando um método na classe mãe muda pode quebrar o comportamento da classe filha.





<!SLIDE>
# Atividade 1
Crie uma classe Pessoa contendo os atributos encapsulados, com seus respectivos seletores (getters) e modificadores (setters), e ainda o construtor padrão e pelo menos mais duas opções de construtores conforme sua percepção. Atributos: nome, endereço, telefone.

<!SLIDE>
# Atividade 2
Crie a subclasse Fornecedor a partir da classe Pessoa (exercício anterior). A classe fornecedor tem além dos atributos que caracterizam a classe Pessoa, também os atributos valorCredito (correspondente ao crédito máximo atribuído ao fornecerodr), valorDivida (montante da dívida para com o fornecedor).
Implemente a classe Fornecedor, para além dos usuais métodos seletores e modificares, um método obterSaldo que devolve a diferença entre os valores dos atributos valorCredito e valorDivida. Depois de implementada a classe Fornecedor, crie um programa de teste adequado que lhe permita verificar o funcionamento dos métodos implementados na classe Fornecedor e os herdados da classe Pessoa.








<!SLIDE form=heranca>
# Making Acquaintances
## Let's get to know each other

Tell me a little bit about yourself to help me better tailor the classroom
experience towards your needs.

ha -> ha? = () Sim (=) Não

hb -> hb? = (=) Sim () Não


~~~SECTION:notes~~~

~~~FORM:heranca~~~

~~~ENDSECTION~~~
