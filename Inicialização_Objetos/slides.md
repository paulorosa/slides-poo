<!SLIDE section center>
# Inicialização de Objetos
## Todos Slides copiados

<!SLIDE>
# Importância
É importante pois objetos não inicializados são uma fonte grande de bugs.

<!SLIDE>
# Mecanismos da Linguagem
Os mecanismos da linguagem Java ajudam a assegurar uma correta inicialização dos objetos.

Com o uso correto destes mecanismos é possível criar objetos com valores de seu estado inicial válido.


<!SLIDE>
# Mecanismo de Inicialização

Java tem 3 mecanismos:
* Construtores
* Inicializadores de variável de Instância
* Blocos de Inicializadores de Instância

Todos estes mecanismos são executados automaticamente quando um objeto é criado.


<!SLIDE>
# Inicialização com Construtores

    @@@ Java
    class Cafeteira {
        private int quantidadeCafe;

        public Cafeteira () {
            this.quantidadeCafe = 355;
        }

        // ...
    }


<!SLIDE>
# Inicializadores de Variável de Instância

    @@@ Java
    class Cafeteira {
        private int quantidadeCafe = 355;
        // ...
    }


<!SLIDE>
# Bloco de Inicializadores de Instância

    @@@ Java
    class Cafeteira {
        private int quantidadeCafe ;

        {
            quantidadeCafe = 355;
        }

        // ...
    }
    

<!SLIDE>
# Valores Iniciais Padrões (default)
Se nenhuma inicialização explícita de variáveis de instância for realizada, serão atribuídos valores iniciais padrões previsíveis, baseados no tipo da variável.

 Tipo
Valor Padrão
boolean
false
byte
(byte) 0
short
(short) 0
int
0
long
0L


 Tipo
Valor Padrão
char
\u0000
float
0.0f
double
0.0d
Object Reference
null




<!SLIDE>
# Abordagens para Inicialização de Variáveis

* Sempre atribuir um mesmo estado inicial adequado através de um inicializador ou construtor.
* Calcular um estado inicial adequado a partir de dados passados para um construtor.
* Executar uma das abordagens anteriores, dependendo de qual construtor é usado para criar o objeto.
* Não atribuir a ele um estado inicial adequado e declarar o objeto como inválido.


<!SLIDE>
# Um objeto é inicializado com um valor

    @@@ Java
    class Cafeteira {
        private int quantidadeCafe = 355;
        //...
    }



<!SLIDE>
# Programas clientes podem iniciar a instância com um valor específico

    @@@ Java
    class Cafeteira {
        private int quantidadeCafe;

        public Cafeteira (int quantidadeInicial) {
            this.quantidadeCafe = quantidadeInicial;
        }
        //…
    }


<!SLIDE>
# Verificando Dados Inválidos no Construtor

* Ao permitir programadores passarem dados para o construtor, há a possibilidade do envio de dados inválidos.
* Se um valor inválido é passado no construtor: 
 * ele deve lançar a exceção java.lang.IllegalArgumentException
  ou
 * ele deve atribuir um valor válido para o estado inicial do objeto.





<!SLIDE>
# Tratamento de Dados Inválidos com Exceção

    @@@ Java
    public Cafeteira (int quantidadeInicial) {
        if (quantidadeInicial < 0) {
            String s = "Não pode ter quantidade negativa.";
            throw new IllegalArgumentException (s);
        }
        this.quantidadeCafe = quantidadeInicial;
    }


<!SLIDE>
# Tratamento com Valor Inicial Válido
##

    @@@ Java
    public Cafeteira (int quantidadeInicial) {
        if (quantidadeInicial < 0) {
            this.quantidadeCafe = 0;
        }
        else {
            this.quantidadeCafe= quantidadeInicial;
        }
    }




<!SLIDE>
# Possibilidade de Escolher um Valor Inicial
##

    @@@ Java
    public Cafeteira (int quantidadeInicial) {
        if (quantidadeInicial < 0) {
            String s = "Não pode ter quantidade negativa.";
            throw new IllegalArgumentException(s);
        }
        else {
            this.quantidadeCafe = quantidadeInicial;
        }
    }



<!SLIDE>
# Construtor sem valor Específico.
## (Nesta abordagem, o objeto é criado em um estado inválido. Mais tarde, atribui-se algum valor.)

    @@@ Java
    public class Cafeteira {
        private int quantidadeCafe;

        public Cafeteira () {
        }


        public void setQuantidadeCafe ( int quantidadeCafe ) {
            this.quantidadeCafe = quantidadeCafe;
        }
    }



<!SLIDE>
# Orientações para a Modelagem Objetos

* Um objeto deveria ter estado, representado por suas variáveis de instância, que são privadas.
* A única maneira de afetar o estado de um objeto por outras classes deveria ser através de métodos.
* Objetos deveriam ter um estado válido.
* Objetos deveriam ter apenas transições de estado válidas no seu ciclo de vida.


<!SLIDE>
# Orientações para a  Inicialização de Objetos

* Projete os inicializadores e construtores de um objeto para que não sejam criados em um estado inválido.
* Se uma variável de instância não tem um valor default natural, force os programadores a passar um valor inicial em todos os construtores.
* Ao detectar um valor inválido passado no construtor, lançar uma exceção.
* Construtores e inicialilzadores deveriam se preocupar apenas com inicializações.


