<!SLIDE supplemental ado1>
# ADO 1
## Hierarquia de Sequências

O objetivo desta ADO é a criação de classes que representem sequências numéricas.

A classe ProgressaoAritmetica foi criada durante as aulas para determinar
os elementos de uma sequência numérica do tipo progressão aritmética.

A classe foi utilizada para imprimir uma quantidade definida de elementos da progressão aritmética.

A ADO compreende executar as 3 atividades:

1. Implementar duas sequências numéricasem Java.

2. Aplicar Herança.

3. Desenhar Diagrama UML.

A seguir, será descrito cada uma das atividades.


---

# Atividade 1 

Escolher duas das sequências numéricas listadas abaixo e implementá-las em Java.



## Lista das Sequências
 
### Progressão Geométrica

Uma progressão geométrica é uma sequência numérica na qual o elemento seguinte é calculado
pela multiplicação do elemento anterior pelo valor de uma razao.

    @@@ Java
    public class ProgressaoGeometrica {
    
        // Colocar a lista de atributos que achar necessário.
        
        public ProgressaoGeometrica (int valorInicial, int razao) {
            // implementar o código do construtor.
        }

        public void proximoValor () {
            // implementar o código 
        }
        public int valorAtual () {
            // implementar o código
        }
        
        public static void main (String[] args) {
	    	int quantidade = Integer.parseInt(args[0]);        
	    	int valorInicial = Integer.parseInt(args[1]);
		    int razao = Integer.parseInt(args[2]);
		
            ProgressaoGeometrica pg = 
                new ProgressaoGeometrica(valorInicial, razao);
         
            for (int i=0; i<quantidadeElementos; i++) {
                System.out.print (pg.valorAtual() + " ");
                pg.proximoValor();
            }
        }                
    }
     
Como exemplo, para a chamada abaixo:

    @@@ Console
    java ProgressaoGeometrica 5 1 3

A saída deve ser:

    @@@ Console
    1 3 9 27 81



### Fatorial

Uma Progressão Fatorial determina o próximo número através de multiplicações de todos os seus elementos anteriores. 


    @@@ Java
    public class Fatorial {
    
        // Colocar a lista de atributos que achar necessário.
        
        public Fatorial () {
            // implementar o código do construtor.
        }

        public void proximoValor () {
            // implementar o código
        }
        public int valorAtual () {
            // implementar o código
        }
        
        public static void main (String[] args) {
	    	int quantidade = Integer.parseInt(args[0]);
		
            Fatorial pg =  new Fatorial();
         
            for (int i=0; i<quantidadeElementos; i++) {
                System.out.print (pg.valorAtual() + " ");
                pg.proximoValor();
            }
        }        
    }

Como exemplo, para a chamada abaixo:

    @@@ Console
    java Fatorial 5

A saída deve ser:

    @@@ Console
    1 1 2 6 24 


### Sequência Polinomial de Segundo Grau

A sequência definida pela lei de formação *an = 3n² + 4n - 3*, onde: n = 1, 2, 3, 4, 5, ...  
e an é o termo que ocupa a n-ésima posição na sequência. 


    @@@ Java
    public class PolinomioSegundoGrau {
    
        // Colocar a lista de atributos que achar necessário.
        
        public PolinomioSegundoGrau (int coeficienteGrauDois, int coeficienteGrauUm, int coeficienteGrauZero) {
            // implementar o código
        }

        public void proximoValor () {
            // implementar o código
        }
        public int valorAtual () {
            // implementar o código
        }
    }



    

### Sequência Polinomial Geral (3n² + 4n - 3)

 A sequência definida pela lei de formação an = 2n² - 1, n  N*, onde n = 1, 2, 3, 4, 5, ... e an é o termo que ocupa a n-ésima posição na sequência. Por esse motivo, an é chamado de termo geral da sequência.

    @@@ Java
    public class PolinomioGeral {
    
        // Colocar a lista de atributos que achar necessário.
        
        public PolinomioSegundoGrau (int[] coeficientes) {
            // implementar o código
        }

        public void proximoValor () {
            // implementar o código
        }
        public int valorAtual () {
            // implementar o código
        }
    }
    



### Fibonnacci

    @@@ Java
    public class Fibonnacci {
    
        // Colocar a lista de atributos que achar necessário.
        
        public Fibonnacci () {
            // implementar o código do construtor
        }

        public void proximoValor () {
            // implementar o código
        }
        public int valorAtual () {
            // implementar o código
        }
    }

Como Exemplo, para a chamada abaixo:

    @@@ Console
    java Fibonnacci 8

A saída deve ser:

    @@@ Console
    1 1 2 3 5 8 13 21




---
# Atividade 2

Após criar as classes, você deve ter percebido que o método valorAtual se repete
ou que pelo menos deveria ter o mesmo código, pois trata-se de retornar o 
valor da característica que representa o valor atual da sequência.

Dado a classe a SequenciaNumerica:

    @@@ Java
    public class SequenciaNumerica {
        protected int valorAtual;
        public SequenciaNumerica (int valorAtual) {
            this.valorAtual = valorAtual;
        }
        public int valorAtual() {
            return valorAtual;
        }
    }

Alterar os códigos das classes implementadas na Atividade 1 para aplicar
Herança com a classe SequenciaNumerica e para eliminar código repetido.



---
# Atividade 3

Criar o Diagrama de Classes UML com as classes escolhidas e a classe SequenciaNumerica 
e também com o relacionamento de Herança entre elas.


----

# O que entregar?

A entrega da ADO consiste do envio dos seguintes artefatos.

* Os dois arquivos com as classes Java implementadas representando as sequências numéricas escolhidas da Atividade 1.

* Os dois arquivos com as classes Java alteradas da Atividade 2.

* Uma imagem no formato png ou jpg com do diagrama de classes da Atividade 3.

----

# Observações Importantes

* A atividade é individual.
* A nota levará em conta os conceitos do paradigma orientado a objetos aplicado corretamente.
* Utilizar as orientações sobre nomenclatura Java.
