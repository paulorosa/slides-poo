<!SLIDE section center>
# Classes e Objetos em Java

<!SLIDE>
# Exemplo: Universidade
.callout.question O que é importante em uma Entidade **Funcionário**?

<!SLIDE>
# Exemplo: Universidade
.callout.question O que é importante em uma Entidade **Funcionário**?

* nome
* cpf
* salário


<!SLIDE>
# Exemplo: Universidade
.callout.question O que é importante em uma Entidade **Funcionário**?

* nome
* cpf
* salário

.callout.question Já podemos utilizar um software?


<!SLIDE>
# Exemplo: Universidade
.callout.question O que é importante em uma Entidade **Funcionário**?

* nome
* cpf
* salário

.callout.question Já podemos utilizar um software?

.callout.warning <font color=red>Ainda Não!!!</font>

.callout.info É necessário criar os funcionários

<table border=1>
  <tr><th>Funcionário 1</th><th>Funcionário 2</th></tr>
  <tr>
    <td>nome: Fulano<p>cpf: 123.456.789-01<p>salario: 1.000,00</td>
    <td>nome: Beltrano<p>cpf: 456.789.012-34<p>salario: 2.000,00</td>
  </tr>
</table>

<!SLIDE>
# Especificação de Funcionário

Classe
* Especificação de Funcionário

Objeto
 * nome: Fulano, cpf: 123.456.789-01, salario: 1.000,00
 * nome: Beltrano, cpf: 456.789.012-34, salario: 2.000,00

<!SLIDE>
# Classe

Representa um _conjunto de objetos_ com características e comportamentos semelhantes.

É um “molde” para a criação de objetos.

Define o _comportamento_ de seus objetos através de métodos e os _estados_ possíveis destes objetos através de atributos.

A _instância_ de uma classe é chamada de objeto.


<!SLIDE>
# Estrutura de uma Classe em Java

slide 11


<!SLIDE>
# Estrutura de uma Classe em Java

    @@@Java
    [ modificador ] class <nome_da_classe>
				[extends <nome_da_super_classe>]
				[implements <interface_1>, <interface_2>, …] {

        // Atributos ou variáveis
        [ modificador ] <tipo_da_variável> <nome_da_variável>;

        // Método
        [ modificador ] <tipo_de_retorno> <nome_do_método> ([parâmetros]) {
            // variáveis internas ao método.
            // Corpo do método.
        }
    }



<!SLIDE>
# Classes em Java

    @@@Java
    public class Funcionario {
        String nome;
        String cpf;
        String email;
        
        public String getNome () {
            return nome;
        }
        
        public void setNome (String novo_nome) {
			nome = novo_nome
        }
    }
    
    
* declaração da classe
* atributos
* métodos

<!SLIDE>
# Atributo
* É uma característica pertencente a uma classe.

* Cada atributo corresponde a uma característica (propriedade da classe).

* Um atributo possui um nome e um tipo definidos.

* Atributos definem o estado do objeto em um determinado instante.


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
# Declaração de Atributo em Java

    @@@Java
    public String nome;
    
* tipo do atributo
* modificador de acesso
* nome do atributo


<!SLIDE>
# Exemplos Atributos em Java


    @@Java
    public Integer idade;

    @@Java
    public Date dataNascimento;

    @@Java
    public Double salario;



<!SLIDE>
# Métodos
* Conjunto de instruções executadas por um objeto ao receber uma mensagem.
* Determina o comportamento dos objetos de uma classe.
* O envio de mensagens (também chamado de métodos) pode alterar o estado de um objeto.
* Podem ser executados por outros objetos ou pelo próprio objeto.


<!SLIDE>
# Métodos
* Métodos representam tarefas de uma classe.
* Oculta do usuário as tarefas complexas que o método realiza.
* Uma chamada de método instrui o mesmo a realizar a sua tarefa
* Métodos definem o comportamento do objeto em um determinado instante.


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
## 

    @@Java
    public Integer getIdade () { … };

    @@Java
    private Date getDataNascimento () { … };

    @@Java
    public Double getSalario () { … };


<!SLIDE>
# 
## 
* Atributos: Determinam o estado do objeto
* Métodos: Determinam o comportamento do objeto



<!SLIDE>
# Objetos
## 
* A partir da classe compilada é possível ter várias instâncias de objetos criados com base nessa classe
* Criação de Objeto = Instanciação de Classe


<!SLIDE>
# Criação de Objeto em Java
## 



    @@Java
    Funcionario funcionario = new Funcionario();


Variável - referência para o Objeto

Criação de um Objeto da Classe Funcionario



<!SLIDE>
# Construtores

* Método especial chamado quando o objeto é criado
* Não possuem valores de retorno

    @@Java
    public class Funcionario {
        public String nome;
        public Funcionario () {
            nome = “Fulano”;
        }
    }


<!SLIDE>
# Construtores
## 
* O construtor de uma classe é chamado de padrão quando não possui nenhum parâmetro.
* Se nenhum construtor for definido explicitamente, o construtor padrão existe implicitamente.
* Se um construtor diferente do padrão for declarado, o construtor padrão implícito deixa de existir.
* Uma classe pode possuir vários construtores.

<!SLIDE>
# Destrutores


<!SLIDE>
# Referências para o próprio objeto
 
* Para se referir ao próprio objeto, utiliza-se a palavra reservada this
* É opcional quando não há ambiguidade

    @@Java
    public class Funcionario {
        public String nome;

        public Funcionario (String nome) {
            this.nome = nome;
        }
    }


<!SLIDE>
# Métodos Acessores e Seletores

    @J@ava
    public class Funcionario {
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

    @@Java
	Funcionario funcionario = new Funcionario();
    Double novoSalario = funcionario.aumentaSalario();


<!SLIDE>
# Chamadas de métodos em Java

Com a classe instanciada, é possível fazer chamada para seus métodos.

Utiliza-se o ponto ‘.’ para acessar um método.

    @@Java
	Funcionario funcionario = new Funcionario();
    Double novoSalario = funcionario.aumentaSalario();

.callout.warning Observe a ligação entre os dados e o Funcionário


<!SLIDE>
# Método Sem Retorno
## 
Utiliza-se a palavra reservada void para indicar que o método não tem retorno.

    @@Java
    void zeraSalario () {
        salario = 0.0;
    }



<!SLIDE>
# Métodos com Parâmetros
## Exemplo

    @@Java
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
# Implementar a classe Funcionario

Cujas características são:
* nome
* salario

e que possui os comportamentos
* aumentar

Com um construtor padrão e outro com as características
* Definir métodos 
* Acessores de nome e salario
* Seletor do método nome




<!SLIDE>
# Implementação
Implementar a classe Carro

Cujas características são:
* modelo
* velocidadeAtual

e que possui os comportamentos
* acelerar (aumenta a velocidade em 1)
* Frear (diminui a velocidade em 1)

Com um construtor padrão e outro com as características, definir métodos 
* Acessores de modelo e velocidadeAtual
* Seletor do modelo


## 


<!SLIDE>
# Exemplo 
Escreva uma classe em Java que represente um livro. 
* Um livro tem como atributos o título, o nome do autor, nome da editora e a quantidade de páginas. 
* Deve haver um único construtor que inicialize o título, nome do autor, nome da editora e a quantidade de páginas do livro. 
* A classe deve possuir os métodos seletores e acessores de todos os atributos.

