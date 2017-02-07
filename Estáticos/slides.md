
<!SLIDE section center>
# Métodos Estáticos

<!SLIDE>
# Métodos Estáticos

Métodos estáticos são métodos que não operam em classes.

    @@@Java
    double x = Math.pow (3, 2);

    int [ ] array = new int[10];
    Arrays.sort (array);

    String x = String.valueOf (123);




<!SLIDE section center>
# Classes Estáticas

<!SLIDE>
# Classes Estáticas

São definidos pela palavra reservada static.

    @@@Java
    public static int max (int a, int b) {
        return a> b ? a: b;
    }

Métodos estáticos não podem acessar atributos de objeto, pois estes são relativos a uma instância da classe, que não existe neste contexto.

<!SLIDE>
# Métodos Estáticos

São definidos pela palavra reservada static.

    @@@Java
    public static int max (int a, int b) {
        return a> b ? a: b;
    }

Métodos estáticos não podem acessar atributos de objeto, pois estes são relativos a uma instância da classe, que não existe neste contexto.


<!SLIDE>
# Método Main

O método main é um método estático especial, usado como ponto de partida de um programa Java.

    @@@Java
    public static void main (String [] args) {
        // implementação
    }
    
O array de strings é a lista de argumentos da linha de comando;

Pode-se declarar métodos main em qualquer classe.



<!SLIDE section center>
# Variáveis Estáticas

<!SLIDE>
# Variáveis Estáticas
    @@@Java


