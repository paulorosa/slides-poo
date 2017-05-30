<!SLIDE section center>
# Inicialização de Objetos

<!SLIDE>
# Importância
É importante pois _objetos não inicializados_ são uma _fonte grande de bugs_.

<!SLIDE>
# Mecanismos da Linguagem
Os mecanismos de uma linguagem orientada a objetos ajudam a assegurar uma _correta inicialização dos objetos_.

Com o uso correto destes mecanismos é possível criar objetos com um _estado inicial válido_.


<!SLIDE>
# Mecanismo de Inicialização

A linguagem Java possui alguns mecanismos para a inicialização de objetos:

* Construtores
* Inicializadores de variável de Instância
* Blocos de Inicializadores de Instância

Todos estes mecanismos são executados automaticamente quando um objeto é criado.


<!SLIDE>
# Inicialização no Construtor

    @@@ Java
    class Cafeteira {
        private int quantidadeCafe;

        public Cafeteira () {
            this.quantidadeCafe = 355;
        }

        // ...
    }


<!SLIDE>
# Inicialização com Variável de Instância

    @@@ Java
    class Cafeteira {
        private int quantidadeCafe = 355;
        // ...
    }


<!SLIDE>
# Inicialização com Bloco

    @@@ Java
    class Cafeteira {
        private int quantidadeCafe ;

        {
            quantidadeCafe = 355;
        }

        // ...
    }
    

<!SLIDE>
# Valores Iniciais Padrões
Se nenhuma inicialização explícita de variáveis de instância for realizada, 
serão atribuídos valores iniciais padrões previsíveis, baseados no tipo da variável.

<table>
  <tr><th> Tipo </th><th> Valor Padrão </th></tr>
  <tr><td> boolean </td><td> false </td></tr>
  <tr><td> byte </td><td> 0 </td></tr>
  <tr><td> short </td><td> 0 </td></tr>
  <tr><td> int </td><td> 0 </td></tr>
  <tr><td> long </td><td> 0 </td></tr>
  <tr><td> float </td><td> 0.0 </td></tr>
  <tr><td> double</td><td> 0.0 </td></tr>
  <tr><td> char </td><td> \u0000 </td></tr>
  <tr><td> Instância de Classe</td><td> null </td></tr>
</table>
  




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


