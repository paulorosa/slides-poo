<!SLIDE section center>
# Classes e Objetos

<!SLIDE>
# Exemplo - Contexto

Para criarmos nosso primeiro programa orientado a objetos, vamos considerar o contexto de uma Universidade.

Inicialmente, nosso problema será:

.callout Gerar um relatório com as informações dos professores.

Com este exemplo, abordaremos os conceitos básicos de orientação a objetos utilizando o exemplo com a linguagem Java.


<!SLIDE incremental>
# Exemplo - Abstraindo...

Considerando o contexto do problema (professores de uma universidade), 
a primeira atividade a ser realizada é abstrair informações sobre 
a entidade professor.

.callout.question O que é importante considerar na Entidade **Professor** neste problema?

* nome
* salário


<!SLIDE>
# Especificação de Professor

Dado que determinamos que as informações da entidade Professor para este problema, 
podemos considerar que temos que já temos uma especificação.

Portanto, já podemos criar a classe Professor com suas características e comportamentos.



<!SLIDE>
# Representação dos Professores

Exemplos de alguns professores com as características abordadas neste problema.

<table border=1>
  <tr><th>Funcionário 1</th><th>Funcionário 2</th></tr>
  <tr>
    <td>nome: Fulano<p>salario: 1.000,00</td>
    <td>nome: Beltrano<p>salario: 2.000,00</td>
  </tr>
</table>




<!SLIDE>
# Classe

Representa um _conjunto de objetos_ com características e comportamentos semelhantes.

É um “molde” para a criação de objetos.

Define o _comportamento_ de seus objetos através de métodos e os _estados_ possíveis destes objetos através de atributos.

A _instância_ de uma classe é chamada de objeto.







<!SLIDE incremental>
# Atributos

* Representam as característica de uma classe.
* Cada atributo corresponde a uma característica.
* Cada atributo possui um nome.
* Em linguagens fortemente tipadas (como, por exemplo, em Java), um atributo possui um um tipo definido.

* Importante: Atributos definem o estado do objeto em um determinado instante.


<!SLIDE>
# Exemplos de Atributos

* Classe Pessoa
 * Peso
 * Altura
 * Idade
 * Cor da Pele

* Classe Carro
 * Marca
 * Modelo
 * Ano Fabricação
 * Combustível



<!SLIDE>
# Declaração de Atributo

Na linguagem Java, um atributo é declarado (inicialmente) com 3 partes:

* modificador de acesso
* tipo do atributo
* nome do atributo

A sintaxe, em Java, é a seguinte:

    @@@Java
    <modificador de acesso> <tipo do atributo> <nome do atributo>;


Um exemplo de um atributo com:

* nome do atributo **nome**
* tipo do atributo **String**
* modificador de acesso **public**

O exemplo seria:

    @@@Java
    public String nome;
    


<!SLIDE>
# Exemplos Atributos em Java


    @@@Java
    public Integer idade;

    public Date dataNascimento;

    public Double salario;



<!SLIDE incremental>
# Métodos

* Determinan o comportamento dos objetos de uma classe.

* Conjunto de instruções executadas por um objeto ao receber uma mensagem.

* Permite ocultar as tarefas complexas realizadas.

* O envio de mensagens (também chamado de métodos) pode alterar o estado de um objeto.

* Podem ser executados por outros objetos ou pelo próprio objeto.

* Uma chamada de método instrui o mesmo a realizar a sua tarefa


 
<!SLIDE>
# Exemplo Métodos

* Classe Pessoa
 * andar
 * falar

* Classe Cliente
 * comprar
 * pagar

* Classe Carro
 * frear
 * acelerar




<!SLIDE>
# Declaração de Método em Java

    @@@Java
    public String getNome () {
        return nome;
    }
    
* tipo do retorno
* nome do método
* modificador de acesso
* corpo do método
* lista de parâmetros


<!SLIDE>
# Exemplos em Java

    @@@Java
    public Integer getIdade () { … };

    private Date getDataNascimento () { … };

    public Double getSalario () { … };


<!SLIDE>
# Atributos e Métodos

* Atributos: Determinam o estado do objeto

* Métodos: Determinam o comportamento do objeto












<!SLIDE>
# Estrutura de uma Classe em Java

    @@@Java
    [ modificador ] class <nome_da_classe>
				[extends <nome_da_super_classe>]
				[implements <interface_1>, <interface_2>, …] {

	    // Atributos (características)
	    [ modificador ] <tipo_da_variável> <nome_da_variável>;

    	// Métodos (Comportamentos)
	    [ modificador ] <tipo_de_retorno> <nome_do_método> ([parâmetros]) {
		   // variáveis internas ao método.
		   // Corpo do método.
	    }
    }


<!SLIDE>
# Estrutura de uma Classe em Java

    @@@Java
    class <nome_da_classe> {

	    // Atributos (características)
	    <tipo_da_variável> <nome_da_variável>;

    	// Métodos (Comportamentos)
	    <tipo_de_retorno> <nome_do_método> ([parâmetros]) {
		   // variáveis internas ao método.
		   // Corpo do método.
	    }
    }



<!SLIDE>
# Classe Professor em Java

Criar uma classe em Java chamada Professor com  as **Caracteristicas**:

* nome do tipo String

* salario do tipo double


.callout.info Criar a classe utilizando uma IDE.


<!SLIDE>
# Classe Professor em Java

    @@@Java
    public class Professor {
    
        public String nome;
        
        public double salario        
        
    }
    


<!SLIDE>
# Classe Professor em Java

Adicionar os **Comportamentos**: (obter nome do Professor) e (alterar nome do Professor)

    @@@Java
    public class Professor {
        public String nome;
        public double salario
        
        public String obterNomeDoProfessor () {
            return nome;
        }
        
        public void alterarNomeDoProfessor (String novoNome) {
			nome = novoNome;
        }        
    }



<!SLIDE>
# Classe Professor em Java

Adicionar os **Comportamentos**: (obter salário do Professor) e (alterar salário do Professor)

    @@@Java
    public class Professor {
        public String nome;        
        public double salario
        
        public String obterNomeDoProfessor () {
            return nome;
        }
        
        public void alterarNomeDoProfessor (String novoNome) {
			nome = novoNome;
        }        
        
        public String obterSalarioDoProfessor () {
            return salario;
        }
        
        public void alterarSalarioDoProfessor (String novoSalario) {
			salario = novoSalario;
        }        
    }


<!SLIDE>
# Padrões de nomes de métodos

    @@@Java
    public class Professor {
        public String nome;        
        public double salario
        
        public String getNome () {
            return nome;
        }
        
        public void setNome (String novoNome) {
			nome = novoNome;
        }        
        
        public String getNome () {
            return salario;
        }
        
        public void setNome (String novoSalario) {
			salario = novoSalario;
        }        
    }






<!SLIDE>
# Objetos
## 
* A partir da classe compilada é possível ter várias instâncias de objetos criados com base nessa classe
* Criação de Objeto = Instanciação de Classe


<!SLIDE>
# Criação de Objeto em Java

    @@@Java
    Professor professor = new Professor();


Variável - referência para o Objeto

Criação de um Objeto da Classe Funcionario



<!SLIDE>
# Utilização do Objeto

    @@@Java
    public class ProgramaPrincipal {
    
        public static void main (String[]  args) {
        
            Professor professor = new Professor ();
            
            double salario = professor.obterSalarioProfessor();
            
			System.out.println("Salário: "+salario);
			
			professor.alterarSalarioDoProfessor(1000);
			
			System.out.println("Salário: " + 
			          professor.obterSalarioProfessor());
        }
        
    }



<!SLIDE>
# Construtores

* Método especial chamado quando o objeto é criado

* Não possuem valores de retorno


<!SLIDE>
# Exemplo Construtor

    @@@Java
    public class Professor {
        public String nome;
        public Professor () {
            nome = “Fulano”;
        }
    }

<!SLIDE>
# Construtores

* O construtor de uma classe é chamado de padrão quando não possui nenhum parâmetro.

* Se nenhum construtor for definido explicitamente, o construtor padrão existe implicitamente.

* Se um construtor diferente do padrão for declarado, o construtor padrão implícito deixa de existir.

* Uma classe pode possuir vários construtores.



<!SLIDE>
# Referências para o próprio objeto
 
* Para se referir ao próprio objeto, utiliza-se a palavra reservada **this**

* É opcional quando não há ambiguidade

<!SLIDE>
# Exemplo Referência para o próprio objeto

    @@@Java
    public class Professor {
        public String nome;

        public Professor (String nome) {
            this.nome = nome;
        }
    }


<!SLIDE>
# Métodos Acessores e Seletores

    @@@Java
    public class Professor {
        public String nome;

        public String getNome () {
            return this.nome;
        }

        public void setNome (String nome) {
            this.nome = nome;
        }
    }


<!SLIDE>
# Chamadas de Métodos em Java

Com a classe instanciada, é possível fazer chamada para seus métodos.

Utiliza-se o ponto ‘.’ para acessar um método.

    @@@Java
	Professor professor = new Professor();
    Double novoSalario = professor.aumentaSalario();


<!SLIDE>
# Chamadas de métodos em Java

Com a classe instanciada, é possível fazer chamada para seus métodos.

Utiliza-se o ponto ‘.’ para acessar um método.

    @@@Java
	Professor professor = new Professor();
    Double novoSalario = professor.aumentaSalario();

.callout.warning Observe a ligação entre os dados e o Professor


<!SLIDE>
# Método Sem Retorno

Utiliza-se a palavra reservada void para indicar que o método não tem retorno.

    @@@Java
    void zeraSalario () {
        salario = 0.0;
    }



<!SLIDE>
# Métodos com Parâmetros
## Exemplo

    @@@Java
    double aumentaSalario (double valor) {
	    double novoSalario = salario + valor;
        this.salario = novoSalario;
        return salario;
    }


<!SLIDE>
# Variáveis nos métodos
## 

    @@@Java
    public double aumentaSalario (double valor) {
	    double novoSalario = salario + valor;
        this.salario = novoSalario;
        return salario;
    }

Variável Temporária

Referência para o próprio objeto (opcional)





<!SLIDE>
# Atividade Classe 1

Escreva uma classe em Java que represente um livro. 

* Um livro tem como atributos o título, o nome do autor, nome da editora e a quantidade de páginas. 

* Deve haver um único construtor que inicialize o título, nome do autor, nome da editora e a quantidade de páginas do livro. 

* A classe deve possuir os métodos seletores e acessores de todos os atributos.




<!SLIDE>
# Atividade Classe 2

Implementar a classe Carro

Cujas características são:

* modelo

* velocidadeAtual

e que possui os comportamentos

* acelerar (aumenta a velocidade em 1)

* frear (diminui a velocidade em 1)

Com um construtor padrão e outro com as características, definir métodos 

* Acessores de modelo e velocidadeAtual

* Seletor do modelo


<!SLIDE>
# Atividade Classe 3

Criar uma classe em Java representar uma progressão aritmética

Para 


Atributos
* valor ataul


Métodos
* próximo valor
* obtem valor ataul




public class ProgressaoAritmetica {

    private int valorAtual;
    
    public ProgressaoAritmetica (int valorInicial) {
        this.valorAtual = valorInicial;
    }

    public int valorAtual () {
        return this.valorAtual;
    }
    public void proximoValor () {
        this.valorAtual = this.valorAtual + 1;
    }
}









