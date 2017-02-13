<!SLIDE section center>
# Regras e Convenções de Nomenclatura em Java


<!SLIDE>
# Convenções de Nomenclatura
Quando desenvolvemos em alguma linguagem e, mais especificamente em Java, 
devemos levar em consideração as convenções de nomenclatura para deixar nosso código o mais legível e documentável possível.

Cada linguagem de programação possui suas convenções de nomenclatura.


<!SLIDE>
# Motivos para seguir uma Nomenclatura

* Nomes bem escolhidos tornam o código mais legível.
* Código mais legível diminui a necessidade de comentários que expliquem o que o código faz.
* O código pode ser a própria documentação



<!SLIDE>
O nome deve ser:
claro (sem ambiquidade)
simples (composto com mínimo de palavras)
único (referir-se a um único conceito).



Google Java Style Guide

https://google.github.io/styleguide/javaguide.html



<!SLIDE>
Teoricamente, é possível nomear uma classe com qualquer nome suportado pela linguagem. 
É importante seguir algumas regras adotadas, caso contrário, outros profissionais ao ver o seu código podem considerá-lo amador sem nem querer saber o quão bem ele foi programado.



<!SLIDE>
# Nome de Classe

Por convenção, toda classe deve começar cum uma letra maiúscula e não deve conter letras não ASCII.
Caso o nome de uma classe seja composto por mais de uma palavra, a primeira letra de cada palavra deve ser maiúscula.
O nome da classe deve ser exatamente o mesmo nome de seu arquivo fonte (.java)






<!SLIDE>
# Nome de Classe
## Exemplos


Pessoa
ImpostoDeRenda
Conta
AgenciaDeEmprego




<!SLIDE>
# Nome dos Pacotes
* Os pacotes devem começar com uma letra minúscula e podem usar letras não ASCII. Não pode iniciar o nome do pacote com caracteres especiais ou números.
* Caso o nome de um pacote seja composto por mais de uma palavra, a primeira letra de cada palavara deve ser em maiúscula.




<!SLIDE>
# Nome dos Pacotes
## Exemplos



<!SLIDE>
# Nome dos Atributos e Variáveis
* Os atributos ou variáveis podem começar com qualquer letra e os caracteres $ e _, porém não podem começar com números.
* Caso o nome seja composto por mais de uma palavra, a primeira letra de cada palavra deve ser em maiúscula.




<!SLIDE>
# Nome dos Atributos e Variáveis
## Exemplos


x 
y 
resultado
valorDeX 
valorDeY


<!SLIDE>
# Atributos Constantes
## Exemplos

# Nome dos Atributos finais (Constantes)

Os atributos finais (constantes) deve ser escritos em letras maiúsculas.
Usamos underline ( _ ) para separar nomes compostos.


<!SLIDE>
# Atributos Constantes
## Exemplos

    @@@Java
    public final int TAMANHO = 10;
    
    public final boolean PARAR_DE_EXECUTAR = true;
    
    public final String VERMELHO = "Vermelho";
    

