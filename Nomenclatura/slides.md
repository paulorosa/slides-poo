<!SLIDE section center>
# Regras e Convenções de Nomenclatura em Java


<!SLIDE>
# Convenções de Nomenclatura

Quando desenvolvemos em alguma linguagem, devemos levar em consideração 
as convenções de nomenclatura para deixar nosso código o mais legível e documentável possível.

Cada linguagem de programação possui suas convenções de nomenclatura.




<!SLIDE>
# Motivos para seguir uma Nomenclatura

É muito importante seguir as convenções de nomenclatura da linguagem que está programando.

Motivos:

* Nomes bem escolhidos tornam o código mais legível.

* Código mais legível diminui a necessidade de comentários que expliquem o que o código faz.

* O código pode ser a própria documentação.



<!SLIDE>
# Nomes utilizados

Outra questão a ser levada em considerada é a criação dos nomes.

Os nomes utilizados devem ser:

* claro (sem ambiquidade)

* simples (composto com mínimo de palavras)

* único (referir-se a um único conceito)


Teoricamente, é possível nomear uma classe com qualquer nome suportado pela linguagem. 

.callout.warning É importante seguir algumas regras adotadas, caso contrário, 
outros profissionais ao ver o seu código podem considerá-lo amador sem nem querer saber o quão bem ele foi programado.

<!SLIDE>
# Padrões Documentados


Até 1999, o padrão era documentado pela Sun (antes do Oracle comprá-la):

**'Code Conventions'**
http://www.oracle.com/technetwork/java/javase/documentation/codeconvtoc-136057.html

Depois foi desconsiderada, mas é possível encontrar alguns padrões:

Google Java Style Guide
https://google.github.io/styleguide/javaguide.html

Outra forma, é identificar como a comunidade trabalha.




<!SLIDE>
# Nome de Classe

Por convenção, toda classe deve começar cum uma letra maiúscula e não deve conter letras não ASCII.

Caso o nome de uma classe seja composto por mais de uma palavra, a primeira letra de cada palavra deve ser maiúscula.

O nome da classe deve ser exatamente o mesmo nome de seu arquivo fonte (.java)






<!SLIDE>
# Exemplos de Nome de Classe

Arquivo: Pessoa.java

    @@@Java
    class Pessoa {
        // ...
    }

Arquivo: ImpostoDeRenda.java

    @@@Java
    class ImpostoDeRenda {
        // ...
    }

Arquivo: URL.java

    @@@Java
    class URL {
        // ...
    }




<!SLIDE>
# Nome dos Pacotes

* Os pacotes devem começar com uma letra minúscula e podem usar letras não ASCII. 

* Não pode iniciar o nome do pacote com caracteres especiais ou números.

* Caso o nome de um pacote seja composto por mais de uma palavra, a primeira letra de cada palavra deve ser em maiúscula.




<!SLIDE>
# Exemplos de Nome dos Pacotes

    @@@Java
    package br.com.senac.sp.poo;

    package tads.pi3;

    package br.com.comercioEletronico;





<!SLIDE>
# Nome dos Atributos e Variáveis

* Podem começar com qualquer letra e os caracteres $ e \_

* Não podem começar com números.

* Caso o nome seja composto por mais de uma palavra, a primeira letra de cada palavra deve ser em maiúscula.




<!SLIDE>
# Nome dos Atributos e Variáveis
## Exemplos

    @@@Java
    String nome;
    
    String _email;

    String salarioMensal;
    


<!SLIDE>
# Atributos Constantes

Os atributos finais (constantes) deve ser escritos em letras maiúsculas.

Usamos underline ( _ ) para separar nomes compostos.


<!SLIDE>
# Atributos Constantes
## Exemplos

    @@@Java
    final int TAMANHO = 10;
    
    final boolean PARAR_DE_EXECUTAR = true;
    
    final String VERMELHO = "Vermelho";
    
