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
# Construtor

Um construtor é um método, como qualquer outro, com algumas características especiais:

* o nome do método é igual ao nome da classe

* o método não tem parâmetro de retorno

* o método é chamado automaticamente quando no momento da criação do objeto.






<!SLIDE>
# Exemplo Construtor

    @@@Java
    public class Professor {
 
        public Professor () {
        
            System.out.println("Execução do Construtor");
            
        }
        
    }



<!SLIDE>
# Execução do Exemplo de Construtor

    @@@ Java
    public static void main (String[] args) {
    
        Professor professor = new Professor();
        
    }

Ao executar o programa acima, a saída será:

    @@@ Console
    Execução do Construtor
    
    

<!SLIDE>
# Construtor Padrão

O construtor de uma classe é chamado de padrão quando não possui nenhum parâmetro.

.callout Se nenhum construtor for definido explicitamente, o construtor padrão existe implicitamente.

Por exemplo, a classe abaixo, sem do construtor especificado

    @@@Java
    public class Professor {
        
    }

é exatamente igual a classe com o construtor declarado, mas com nenhum código.

    @@@Java
    public class Professor {
 
        public Professor () {
        
        }
        
    }




<!SLIDE>
# Construtor Diferente do Padrão

Se um construtor diferente do padrão for declarado, o construtor padrão implícito deixa de existir.

    @@@Java
    public class Professor {
        private String nome;
         
        public Professor (String nomeNovo) {
            nome = nomeNovo;
        }
    }

Neste caso, uma chamada para o construtor padrão não é possível.

    @@@ Java
    public static void main (String[] args) {
        Professor professor = new Professor(); // ERRO!!!
    }



<!SLIDE>
# Vários Construtores

Uma classe pode possuir vários construtores.

Por exemplo, a classe abaixo possuem dois construtores

    @@@Java
    public class Professor {
        private String nome;

        public Professor () {
            nome = "";
        }
         
        public Professor (String nomeNovo) {
            nome = nomeNovo;
        }
    }


<!SLIDE>
# Ambiguidade de Identificadores

Em determinadas situações, para evitar a proliferação de identificadores na classe, 
como, por exemplo, na classe abaixo em que foi necessário ter dois identificadores
(nome e novoNome) no construtor para realizar uma atribuição.

    @@@ Java
    public class Professor {
        private String nome;

        public Professor (String nomeNovo) {
            nome = nomeNovo;
        }
    }

O código poderia ficar mais simples e legível se utilizássemos identificadores iguais.
é necessário utilizarmos identificadores iguais.

    @@@ Java
    public class Professor {
        private String nome;

        public Professor (String nome) {
            nome = nome;
        }
    }





<!SLIDE>
# Ambiguidade de Identificadores

Contudo, este código gera uma ambuiguidade para o compilador que não sabe
exatamente se é o atributo que está recebendo o valor do parâmetro de entrada
do construtor, ou o contário.

    @@@ Java
    public class Professor {
        private String nome;

        public Professor (String nome) {
            nome = nome; /// AMBIGUIDADE
        }
    }





<!SLIDE>
# Referências para o próprio objeto
 
Para resolver este problema, utiliza-se a palavra reservada **this**, que permite realizar referências ao próprio objeto.

É utilizado quando há a necessidade de eliminar a ambiguidade de identificadores utilizados na classe.




<!SLIDE>
# Exemplo Referência para o próprio objeto

No exemplo, ao utililizar **this** no identificador **nome** faz com que o
compilador compreenda que está sendo feita referência para o atributo e não para 
o parâmetro de entrada do método.

    @@@Java
    public class Professor {
        public String nome;

        public Professor (String nome) {
            this.nome = nome;
        }
        
        public void setNome (String nome) {
            this.nome = nome;
        }
    }




<!SLIDE>
# Métodos Acessores

Métodos acessores são aqueles métodos que retornam alguma informação 
que represente o estado atual do objeto.

O método getNome da classe Professor retorna o valor da característica nome.

    @@@Java
    public class Professor {
        public String nome;

        public String getNome () {
            return this.nome;
        }

		// ...
		
    }



<!SLIDE>
# Métodos Seletores

Métodos seletores são aqueles que de alguma forma alteram o estado atual do objeto.

O método setNome da classe Professor altera o valor da característica nome, que representa 
o estado do objeto.

    @@@Java
    public class Professor {
        public String nome;

        public void setNome (String nome) {
            this.nome = nome;
        }
        
		// ...
		
    }


<!SLIDE>
# Chamadas de Métodos em Java

Com a classe instanciada, é possível fazer chamada para seus métodos.

.callout Utiliza-se o ponto ‘.’ para acessar um método.

No código abaixo, é realizada uma chamada para o método getNome da instância professor.

    @@@ Java
    public static void main (String[] args) {
        Professor professor = new Professor("Fulano");
	    System.out.println("Nome Professor: " + professor.getNome());
    }

Será impresso o valor da característica nome do ojeto professor.

    @@@ Console
    Nome Professor: Fulano




<!SLIDE>
# Ligação entre os dados e o objeto

Note que a ligação entre o dado e a instância da classe. 

Neste caso, a característica nome está relacionada diretamente com a instância.

    @@@ Java
    Professor p1 = new Professor("Fulano");
	System.out.println("Nome Professor p1: " + p1.getNome());
	
    Professor p2 = new Professor("Beltrano");
	System.out.println("Nome Professor p2: " + p2.getNome());

Cada instância tem o valor específico da sua característica.





<!SLIDE>
# Método Sem Retorno

Métodos também podem não retornar nenhum valor.

.callout Utiliza-se a palavra reservada *void* para indicar que o método não retorna nenhum valor.

No código abaixo, o método zeraSalario não retorna nenhum valor.

    @@@ Java
    public class Professor {
    
        // ...
        
        public void zeraSalario () {
            salario = 0.0;
        }
    }

.callout Nestes casos, é opcional o uso da palavra reservada return. Caso queira utilizá-la, deverá apenas escrever "return;"





<!SLIDE>
# Métodos com Parâmetros

Métodos podem possuir quantos parâmetros forem necessários. Quando houver
mais de um parâmetro, eles devem ser separados por ','.

No exemplo abaixo, o método possui apenas um único parâmetro.

    @@@ Java
    public void metodo (String param1) {
        // ...
    }
    
O método abaixo possui dois parâmetros separados por vírgula.

    @@@ Java
    public void metodo (String param1, String param2) {
        // ...
    }


<!SLIDE>
# Variável Temporária nos métodos

Variáveis criadas dentro do método são chamadas de temporárias,
pois o seu tempo de vida (escopo) é apenas durante a execução do método.

    @@@ Java
    public double aumentaSalario (double valor) {
    
	    double novoSalario = salario + valor;
	    
        this.salario = novoSalario;
        
        return salario;
    }







<!SLIDE>
# Atividade Classe 1

Escreva uma classe em Java que represente um livro, de acordo com as informações:

* Um livro tem como atributos o título, o nome do autor e a quantidade de páginas. 

* Deve haver um único construtor que inicialize o título, nome do autor e a quantidade de páginas do livro. 

* A classe deve possuir os métodos seletores e acessores de todos os atributos.





<!SLIDE>
# Atividade Classe 2

Implementar a classe Carro de acordo com as seguintes informações:

* Com as características:
 * modelo
 * velocidadeAtual

* Com um construtor padrão 

* Com outro construtor que recebe informações para preencher todas as características

* Com os comportamentos:
 * acelerar (aumenta a velocidade em 1)
 * frear (diminui a velocidade em 1)
 * Acessores de modelo e velocidadeAtual
 



<!SLIDE>
# Atividade Classe 3

Criar uma classe em Java representar uma progressão aritmética conforme as seguintes informações:

A classe deve possuir dois atributos para representar
* valor inicial da progressão
* razão da progressão

A Classe deve possuir um único construtor que recebe o valor inicial e a razão.

Implementar o método seletor para mudar para o próximo valor da sequencia.

    @@@ Java
    public void proximoValor () {
        // implementar o código
    }

Implementar o método acessor para retornar o valor atual da progressão.

    @@@ Java
    public int valorAtual () {
        // implementar o código
    }


<!SLIDE>
# Atividade Classe 3


    @@@ Java
    public class ProgramaPrincipal {

        public static void main (String[] args) {
	    	int valorInicial = 5;
		    int razao = 3;
		
            ProgressaoAritmetica pa = 
                new ProgressaoAritmetica(valorInicial, razao);
         
            for (int i=0; i<10; i++) {
                System.out.print (pa.valorAtual() + " ");
                pa.proximoValor();
            }
        }        
    }





