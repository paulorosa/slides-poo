<!SLIDE section center>
# Pacotes


<!SLIDE>
# Organização de Classes

Uma organização de classes é necessária, pois à medida
que o sistema cresce, a quantidade de classes também aumenta e 
alguns problemas podem aparecer.

Alguns possíveis problemas são:

* dificuldade para encontrar uma classe desejada

* determinar quais são as classes relacionadas

* trabalhar com classes com nomes iguais


<!SLIDE>
# Solução

Uma possível solução seria agrupar as classes em unidades de nível mais alto.

Em programação este recurso é chamado de **Pacote** ou **Namespace**.

Define uma organização:

* **lógica**: complemento do nome da classe

* **física**: localização em diretórios


<!SLIDE>
# Pacotes em Java

A palavra reservada **package** é utilizada para definir o pacote de uma classe.


<!SLIDE>
# Localização das Classes

Em conjunto com a definição de pacote em uma classe, é necessário organizar
o código no diretório correspondente ao pacote.

A estrutura do pacote deve ser reproduzida na estrutura de diretórios.



<!SLIDE>
# Localização das Classes

A classe *Teclado*, que representa o instrumento musical, pode ser incluída
no pacote _instrumentos_.

    @@@ Java
    package instrumentos;

    public class Teclado {
    
	    public void tocar () {
	      // corpo do código
	    }
    } 

E também deve estar dentro de um diretório _instrumentos_.

    @@@ Console
    instrumentos/Teclado.java


<!SLIDE>
# Localização das Classes

Arquivos com declaração de package devem ter estrutura de diretório especial.

Pode ser um diretório simples

_Package_: exemplo

_Diretório_: exemplo/

Ou em uma estrutura de diretórios. Cada diretório é separado por **.** (ponto). 

_Package_: br.senac.sp

_Diretório_: br/senac/sp



<!SLIDE>
# Pacotes como parte do nome

A definição de uma classe em uma estrutura de pacotes faz com que o nome da classe
possua a estrutura do pacote na sua identificação.

Por exemplo, a classe **Teclado** do pacote **instrumentos** deve ser identificada 
da seguinte forma:

    @@@ Java
    instrumentos.Teclado
    
Para instanciá-la também é necessário colocar o nome inteiro.

    @@@ Java
    instrumentos.Teclado teclado = new instrumentos.Teclado();
    

<!SLIDE>
# Simplificação para usar nome completo

Referenciar uma classe utilizando o seu nome completo torna o código muito verboso.

Para deixar o código menos verboso, utiliza-se a palavra reservada **import** para 
informar ao compilador o nome completo da classe, colocando fora da declaração da 
classe.

    @@@ Java
    import instrumentos.Teclado;
    
    public class Teste {
    
      public static void main (String[] args) {
        Teclado teclado = new Teclado();
      }
    }


<!SLIDE>
# Carga de classes

Além de diminuir a verbosidade do código, o comando **import** informa o compilador 
onde a classe está localizada na estrutura de diretórios e a carrega na 
memória para ser utilizada assim que necessário.

    @@@ Java
    import instrumentos.Teclado;
    
    public class Teste {
    
      public static void main (String[] args) {
        Teclado teclado = new Teclado();
      }
    }




<!SLIDE>
# Classes com Nomes Iguais

Uma situação que pode ocorrer em um sistema é a existência de classes 
que representam objetos que possuem o mesmo nome mas têm significados diferentes.

Por exemplo, as seguintes classes possuem o mesmo nome mas significados diferentes.

* *Teclado*: **instrumento musical**

* *Teclado*: **periférico de computador**


<!SLIDE>
# Classes com Nomes Iguais

Como o pacote faz parte do nome da classe, podemos colocá-las em 
uma estrutura que remova a ambiguidade de nomes.

A classe *Teclado*, que representa o instrumento musical, pode ser incluída
no pacote _instrumentos_.

    @@@ Java
    package instrumentos;

    public class Teclado {
	    void tocar ();
    } 

E a classe *Teclado*, que representa o periférico de computador, pode 
ser incluída no pacote _perifericos_.

    @@@Java
    package perifericos;

    public class Teclado {
	    char ultimaTecla ();
    }

<!SLIDE>
# Uso das classes com pacotes

Para utilizá-las, podemos usá-las importando as classes 

    @@@ Java
    import instrumentos.Teclado;
    
    public class Programa {
      public static void main (String[] args) {
        Teclado teclado = new Teclado ();
        teclado.tocar ();
      }
    }

ou utilizando o nome completo.

    @@@ Java
    public class Programa {
      public static void main (String[] args) {
        instrumentos.Teclado teclado = new instrumentos.Teclado ();
        teclado.tocar ();
      }
    }


<!SLIDE>
# Uso das classes com pacotes

Se as duas classes com nomes iguais de pacotes diferentes forem utilizadas
em uma mesma classe é necessário remover a ambiguidade colocando o nome
completo da classe, que faz parte do nome.

    @@@ Java
    public class Programa {
      public static void main (String[] args) {

        instrumentos.Teclado ti = new instrumentos.Teclado ();
        perifericos.Teclado tp = new perifericos.Teclado ();

        ti.tocar ();
        char c = tp.ultimaTecla();
      }
    }





<!SLIDE>
# Importando várias classes

É possível importar todas as classes de uma package.

Se, por exemplo, o pacote **instrumentos** contiver várias classes que 
representem diversos instrumentos musicais e alguma classe precisar utilizá-las, 
será necessário importá-las uma a uma.

    @@@Java
    import instrumentos.Teclado;
    import instrumentos.Piano;
    import instrumentos.Bateria;

Para facilitar pode-se utilizar o caractere '*' para carregar todas as classes. 

    @@@Java
    import instrumentos.*;



<!SLIDE>
# Restrição de Acesso de Pacotes

Na linguagem Java existe uma restrição de acesso relacionada com pacotes. 
Trata-se do restrição de acesso padrão, ou seja, se nenhum dos outros tipos 
(public, private ou protected) for aplicado, a restrição será a de package.

É possível restringir o acesso a métodos e atributos de classes que pertencem ao mesmo pacote.





<!SLIDE>
# Restrição de Acesso de Pacotes

Por exemplo, se adicionarmos a classe Bateria no pacote instrumentos e utilizarmos a 
restrição de acesso package,

    @@@ Java
    package instrumentos;
    public class Bateria {
      String marca;
      public Bateria (String marca) {
        this.marca = marca;
      }
      void tocar() {
        // corpo do método
      }
    }
    
a classe Teclado terá acesso a seus métodos e atributos.

    @@@@ Java
    package outropacote;
    
    public class Teste {
  	  public static void main(String[] args) {
        instrumentos.Teclado ti = new instrumentos.Teclado();
        ti.tocar();   // NÃO TEM ACESSO - ERRO DE COMPILAÇÃO
	  }
    
   

<!SLIDE>
# Diagrama de Pacotes

O Diagrama de Pacotes definido pela UML descreve os pacotes em pedaços do sistema 
divididos em agrupamentos lógicos.

![.fancyborder](_images/pacotes-instrumentos-perifericos.png)



<!SLIDE>
# Diagrama de Pacotes

O Diagrama de Pacotes permite mostrar também as dependências entre os pacotes, ou seja, pacotes podem depender de outros pacotes.

No exemplo abaixo, o pacote A depende dos pacotes B e C.

![.fancyborder](_images/notacao_pacotes.png)




<!SLIDE>
# Ocorrências em Diagramas UML

Na verdade, não existe propriamente diagramas de pacotes em UML. Pacotes e relações entre pacotes aparecem em outros diagramas.

* Pacotes de Casos de Uso

* Pacotes de Classes

* Pacotes de Componentes

* Pacotes de Nós (Diagrama de Implantação)


~~~SECTION:notes~~~


~~~ENDSECTION~~~



