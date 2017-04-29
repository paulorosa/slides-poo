<!SLIDE section center>
# Relatório de Notas
## Atividade Sala de Aula

<!SLIDE>
# Objetivo

Criar um programa em Java que leia um arquivo com notas de provas de alunos e imprima relatórios.

![.fancyborder](_images/relatorio_notas.png)

<!SLIDE>
# Exemplo

como funciona

    @@@ Console
    java RelatorioNotas notas.txt
    
Resultado

    @@@ Console
    Média: 6.0
    



<!SLIDE>
# Método Desenvolvimento

O desenvolvimento deste programa será realizado em várias etapas.

A cada etapa um funcionalidade nova será implementada.

O programa será finalizado depois de todas as funcionalidades implementadas.


<!SLIDE>
# Considerações

Para adicionar o novo valor no Relatório de Notas, considerar os seguintes pontos:

1. Eliminar possíveis códigos repetidos que apareçam. 

.callout Dica: se um comportamento aparece repetido em mais de um lugar,
trata-se de um comportamento reaproveitável, portanto, podemos transformá-la
em um método ou criarmos uma classe para tratar apenas este comportamento.


2. Identificar polimorfimos
. callout 




<!SLIDE>
# Funcionalidades x Etapas

1. Média Aritmética das Notas
2. Média Aritmética por Tipo de Aluno
3. Adição de novos Tipos de Alunos
4. Adição de mais notas por alunos
5. Adição de novas médias
6. Professor com várias Cursos
7. Faculdade com Cursos


<!SLIDE>
# Formato do Arquivo
Cada linha do arquivo contém o nome do aluno e a sua nota.

O nome é formado por um único nome e a nota por um número inteiro.

O nome e a nota estão separados por tabulação.

Exemplo:

joão  4

maria 7

paulo 6


<!SLIDE>
# Formato da Saída no Console

.callout.warn O formato da saída não é importante, cada um pode mostrar da forma que achar melhor.
O importante é o conteúdo, isto é, apresentar as informações solicitadas.



<!SLIDE>
# Classe Principal

    @@@ Java
    public class RelatorioNotas {
    
	  public static void main(String[] args) {
	  
		String filename = args[0];
		
		// Instanciar Classe
		// Chamar método para calcular média

      }
    }
    


<!SLIDE>
# Leitura do Arquivo em Java

http://blog.caelum.com.br/lendo-arquivos-texto-em-java/





<!SLIDE printonly>
# Parte 1 - Possível Solução





**Objetivo**: calcular a média das notas de alunos a partir da leitura de arquivo.


**calcular a média das notas de alunos**

* A partir de informações de Alunos (nome e nota)

* Aluno (nome e nota)


* calcular média
 * a partir de uma lista de alunos eu posso obter a média aritmética

* leitura de arquivo
 * a partir de um nome de arquivo, eu posso ler as informações e armazenar em uma coleção de alunos.


Classe: GeradorRelatorioNotas
   GeradorRelatorioNotas(String filename);
método: double calcularMedia()


Identificação de classes: 

* 
    

<!SLIDE printonly>
# Média Aritmética das Notas

Nesta primeira etapa o programa deve apenas mostrar a média aritmética de todas as notas do arquivo.






<!SLIDE printonly>
# Solução
Identificação do objetivo: mostrar a média das notas
Identificação de Tarefas: Leitura do Arquivo e Cálculo da Média
Identifiacação de entidades: Aluno


Calculo da Média - classe com método que recebe a lista de notas de alunos e calcula a média
Leitura de Arquivo - classe para ler informações de notas de alunos em aqruivo e 
	

<!SLIDE>
# Solução Professor



<!SLIDE>
# Considerações Soluções Alunos



~~~SECTION:notes~~~
###############################         PARTE 2         ###############################
~~~ENDSECTION~~~


<!SLIDE center>

# Parte 2

<!SLIDE>
# Mediana das Notas
## Objetivo 

Adicionar ao relatório o valor da _Mediana das Notas dos Alunos_.


<!SLIDE>
# Cáculo da Mediana

.callout **Mediana** é o valor que separa a metade maior e a metade menor de uma amostra. 


Em termos mais simples, **Mediana** pode ser o _valor do meio de um conjunto_ de dados. 

Se houver um _número par_ de observações, a **Mediana** é definida como a _média dos dois valores do meio_. 

Exemplos:

 * No conjunto de dados {1, 3, 3, 6, 7, 8, 9}, por exemplo, a mediana é 6. 
 * No conjunto de dados {3, 5, 7, 9}, a mediana é (5+7)/2 = 6.


<table style="border:0;">
<tr><th style="text-align:right;background-color:white;color:gray">Fonte: https://pt.wikipedia.org/wiki/Mediana_(estatística)</th></tr>
</table>



<!SLIDE>
# Mediana das Notas
## Exemplo

Dado um arquivo com o conteúdo abaixo ...

    @@@ Console
    joão  4
    maria 7
    paulo 6

A saída no console deveria ser:    

    @@@ Console
    Média: 6.0
    Mediana: 4.0
    
    




~~~SECTION:notes~~~
###############################         PARTE 3         ###############################
~~~ENDSECTION~~~

<!SLIDE center>
# Parte 3

<!SLIDE>
# Tipos de Alunos
## Objetivo 

Diferenciar entre Alunos de _Graduação_ e Alunos de _Pós-Graduação_.






<!SLIDE printonly>
# média por tipo de aluno

Nesta etapa vamos imprimir as médias por tipos de alunos

Agora o arquivo tem uma coluna adicional contendo o tipo do aluno







~~~SECTION:notes~~~
###############################         PARTE 4         ###############################
~~~ENDSECTION~~~

<!SLIDE center>
# Parte 4

<!SLIDE>
# Tipos de Alunos
## Objetivo 

Diferenciar entre Alunos de _Graduação_ e Alunos de _Mestrado_.

<!SLIDE>
# Formato do Arquivo

O arquivo de notas possui agora outro formato. 

No início de cada linha foi adicionado uma letra para indicar o tipo de Aluno.

* letra **G** - indica que o Aluno é de Gradução.
* letra **M** - indica que o Aluno é de Mestrado.

Dowload do Arquivo: <a href="/file/_files/share/notas-parte-4.txt">Notas com Tipos de Alunos</a>


<!SLIDE>
# Tipos de Alunos
## Exemplo

Dado um arquivo com o conteúdo abaixo ...

    @@@ Console
    G joão  4
    G maria 7
    M paulo 6
    M marcos 6

A saída no console deveria apresentar as seguintes informações:    

    @@@ Console
    Média Alunos Gradução: 6.0
    Mediana Alunos Gradução: 6.0
    Média Alunos Mestrado: 6.0
    Mediana Alunos Mestrado: 6.0



<!SLIDE>
# Solução Professor


    @@@ Java
    
    
<!SLIDE>
# Considerações Soluções Alunos

<!SLIDE>
# Impactos na Alteração


~~~SECTION:notes~~~
###############################         PARTE 5         ###############################
~~~ENDSECTION~~~

<!SLIDE center>
# Parte 5

<!SLIDE>
# Tipos de Alunos
## Objetivo 

Diferenciar entre Alunos de _Graduação_ e Alunos de _Pós-Graduação_.

<!SLIDE printonly>
# adicionar novas médias



<!SLIDE>
# Solução Professor

<!SLIDE>
# Considerações Soluções Alunos




~~~SECTION:notes~~~
###############################         PARTE 6         ###############################
~~~ENDSECTION~~~

<!SLIDE center>
# Parte 6


<!SLIDE printonly>
# adicionar novas notas


<!SLIDE>
# Solução Professor

<!SLIDE>
# Considerações Soluções Alunos



~~~SECTION:notes~~~
###############################         PARTE 7         ###############################
~~~ENDSECTION~~~

<!SLIDE center>
# Parte 7

<!SLIDE printonly>
# Professor com várias turmas

<!SLIDE>
# Solução Professor

<!SLIDE>
# Considerações Soluções Alunos


~~~SECTION:notes~~~
###############################         PARTE 8         ###############################
~~~ENDSECTION~~~

<!SLIDE center>
# Parte 8

<!SLIDE printonly>
# Faculdade com vários professores



<!SLIDE>
# Solução Professor

<!SLIDE>
# Considerações Soluções Alunos


