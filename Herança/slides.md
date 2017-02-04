<!SLIDE section center>
# Herança

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

<!SLIDE center>
Vamos criar um programa de computador utilizando o Paradigma Orientado a Objetos ...

<!SLIDE center>
# Especificação do Problema

.callout Dado um arquivo com informações de folha de pagamento Criar um programa orientado a objetos que 
imprime o relatório e na última linha aq=

Dado uma empresa 
Analista, coordenador, Gerente
arquivo com
criar um programa que imprime a idade, nome 

<!SLIDE center>
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

<!SLIDE>

<!SLIDE>

<!SLIDE>

<!SLIDE>

<!SLIDE>

<!SLIDE>


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





.download herança/herança.txt
