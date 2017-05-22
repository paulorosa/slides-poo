
<!SLIDE section center>
# Estáticos


<!SLIDE>
# Classes e Objetos

No **Paradigma Orientado a Objetos**:

* Há _Classes_ e _Objetos_.

* Um programa é a _comunicação entre objetos_ (ou instâncias de classes).

e _Classes_ são formadas por:

* atributos

* métodos

<!SLIDE>
# Métodos e Atributos em Classes e Objetos

Os **Atributos** e **Métodos** podem ser aplicados tanto para _Objetos_ quanto para _Classes_.

Quando aplicados para **Objetos**, temos:

* _atributos_, simplesmente, ou _atributos de instância_
* _métodos_, simplesmente, ou _métodos de instância_

e quando aplicados para **Classes**, temos:

* _atributos de classe_ ou _atributos estáticos_
* _métodos de classe_ ou _métodos estáticos_



<!SLIDE>
# Métodos e Atributos em Classes e Objetos

Em resumo:

* Métodos e Atributos Estáticos operam em classes.
* Métodos e Atributos de Instância operam em classes.


<!SLIDE>
# Atributos e Métodos de Instância

A classe abaixo possui atributo de instância (_anoNascimento_) e método de instância (_idade()_).

    @@@ Java
    public class Pessoa {
      private int anoNascimento;
      public Pessoa (int anoNascimento) {
        this.anoNascimento = anoNascimento;
      }
      public int idade() {
        return 2017 - anoNascimento;
      }
    }
    
Logo, somente instâncias podem acessá-los:
      
    @@@ Java
    Pessoa pessoa = new Pessoa(2000)
    int idade = pessoa.idade();
    
O método _idade()_ é acessado através de sua instância e o atributo
_anoNascimento_ durante a execução do método.
       


<!SLIDE>
# Atributos e Métodos de Classe

Atributos e Métodos de classe também podem ser chamados de 
_Atributos e Métodos Estáticos_.

Em Java, atributos e métodos estáticos são identificados 
pela palavra reservada _static_, que funciona como um modificador deles.


<!SLIDE>
# Atributos e Métodos de Classe

A classe abaixo possui atributo de classe (_pi_) e método de classe (_area()_).

    @@@ Java
    public class Circulo {
      private static double pi = 3.14;

      public static double area (double raio) {
        return Circulo.pi * raio * raio;
      }
    }
    
Neste caso, não é necessário instância da classe para acessar um método, pois 
estamos tratando com classes e não com instâncias. Portanto, o _acesso é realizado
diretamente pela classe_.
     
    @@@ Java
    double areaCirculo = Circulo.area(4);


<!SLIDE>
# Exemplos da Biblioteca Java

Na biblioteca de classes do Java, disponibilizadas no JDK, há uma série de
exemplos de métodos e classes estáticas.

A classe java.lang.Integer possui, entre outros:

O _método estático_ **parseInt()**, que transforma uma String em um 
número inteiro.

    @@@ Java
    public static int parseInt(String s)


O _atributo estático_ **MAX_VALUE**, que representa o máximo valor que um 
número inteiro pode ter.

    @@@ Java
    static int	MAX_VALUE



<!SLIDE>
# Método Main do Java

O método **main** é um _método estático_ como outro qualquer, contudo ele é
utilizado como ponto de partida de um programa Java. A assinatura do método deve ser 
_public static void main (String [] args)_
    
A classe A possui o método estático main, que pode ter qualquer código,
inclusive instanciar uma outra classe B. 

    @@@ Java
    public class A {
      // Lista de atributos e métodos de instância
      
      public static void main (String [] args) {
          B b = new B ();
          b.c();
      }
    }

Para executar o programa em Java, deve-se chamar a máquina virtual passando o
nome da classe, que deve conter o método estático main.

    @@@ Console
    java A


<!SLIDE>
# Escopos de Acesso

Métodos estáticos não podem acessar atributos de objeto, pois estes são relativos a uma instância da classe, que não existe neste contexto.


<!SLIDE>
# Quando usar?

Um atributo ou método estático é aquele que não requer uma instância para ser utilizado.

Isso quer dizer que um método estático pode ser executado livremente sem a necessidade de instanciação de um objeto. 

Entretanto, devido à sua forte ligação com a classe (uma vez que é declarado no escopo dela) 
isso quer dizer que seu uso requer a menção à essa sua origem, 
e por isso a classe serve como forma de organização de funções de uso mais geral.


<!SLIDE>
# Quando usar?

A criação de atributos ou métodosestáticos é interessante quando se deseja que sejam de livre utilização, 
mas bem identificados por um contexto representado pela classe.

Exemplos clássicos são as funções matemáticas como seno, cosseno, raíz quadrada, etc. 

Muitas linguagens implementam essas funções de forma estática em uma classe específica 
para elementos matemáticos, permitindo fazer, por exemplo:

    @@@ Java
   float valor = Math.sin(Math.PI);
   
O método para o cálculo do seno (Math.sin) é geral porque calcula 
o valor do seno dado apenas o ângulo em radianos recebido como parâmetro. 
Por isso, não requer uma instância de objeto e faz sentido ser criado de forma estática. 

Sua inclusão na classe de matemática (Math) juntamente com outros métodos e atributos contantes
 (como o Math.PI) permite organizar essas implementações em um mesmo contexto significativo (isto é, de matemática) 
 para o desenvolvedor que for utilizá-las.


<!SLIDE>
# Quando usar?

Por outro lado, se essa implementação pode vir a fazer uso de estados ou informações previamente processados 
ou pode ela mesmo produzir algo que persista para execuções futuras, 
parece natural que uma instância seja necessária para no mínimo armazenar essas informações e estados.

