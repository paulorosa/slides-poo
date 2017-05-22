
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
        return pi * raio * raio;
      }
    }
    
Neste caso, não é necessário instância da classe para acessar um método, pois 
estamos tratando com classes e não com instâncias. Portanto, o acesso é realizado
diretamente pela classe.
     
    @@@ Java
    double areaCirculo = Circulo.area(4);

    








<!SLIDE>
# Atributo Estático

<!SLIDE>
# Método Estático

<!SLIDE>
# Método de Classe



    @@@Java
    double x = Math.pow (3, 2);

    int [ ] array = new int[10];
    Arrays.sort (array);

    String x = String.valueOf (123);



<!SLIDE>
# Escopos de Acesso

Métodos estáticos não podem acessar atributos de objeto, pois estes são relativos a uma instância da classe, que não existe neste contexto.



<!SLIDE>
# Método Main do Java

O método **main** é um _método estático especial_, usado como ponto de partida de um programa Java.

    @@@ Java
    public class X {
      private String x;
      
      public static void main (String [] args) {
          X x = new X ();
          x.x();
      }
    }
    
O array de strings é a lista de argumentos da linha de comando;

Pode-se declarar métodos main em qualquer classe.
