<!SLIDE section center>
# Relatório de Notas
## Atividade Sala de Aula


<!SLIDE>
# Objetivo

Criar um programa em Java que leia um arquivo com notas de provas de alunos e imprima relatórios.

![.fancyborder](_images/relatorio_notas.png)


<!SLIDE>
# Atividade

A atividade consiste em criar a classe _RelatorioNotas_, contendo o método
main para que seja executado pela máquina virtual do java. O programa deve receber
como argumento o nome do arquivo contendo a relação de notas.

    @@@ Console
    java RelatorioNotas notas.txt
    
Como resultado, deve ser impresso um relatório com os valores.

    @@@ Console
    Média: 6.0
    
Obs.: O programa pode ser executado tanto da linha de comando quanto da IDE.



<!SLIDE>
# Classe Principal

O código abaixo é uma pequena sugestão de trecho para o programa principal.

    @@@ Java
    public class RelatorioNotas {
    
	  public static void main(String[] args) {
	  
		String filename = args[0];
		
		// Instanciar Classe 
		// Chamar métodos

      }
    }
    

<!SLIDE>
# Arquivo com Notas

O formato e o conteúdo do arquivo pode variar a cada nova funcionalidade
implementada na aplicação.

Cada parte da atividade mostrará os detalhes.

Cada parte também disponibilizará os arquivos necessários para teste.




    
<!SLIDE>
# Leitura do Arquivo em Java

Para a leitura de arquivo, o artigo abaixo explica como fazer:

http://blog.caelum.com.br/lendo-arquivos-texto-em-java/



<!SLIDE>
# Formato da Saída

O formato da saída não é importante, cada um pode mostrar da forma que achar melhor.
O importante é o conteúdo, isto é, apresentar as informações solicitadas.




<!SLIDE>
# Método Desenvolvimento

O desenvolvimento deste programa será realizado em várias etapas.

A cada etapa uma funcionalidade nova será implementada.

O programa será finalizado depois de todas as funcionalidades implementadas.


<!SLIDE>
# Considerações Gerais

A cada parte desenvolvida do código considerar a alteração do código
já existente para melhorar o trabalho das próximas partes.

* Eliminar Possíveis Códigos Repetidos
* Identificar Polimorfismos
* Utilizar Classes Abstratas



<!SLIDE>
# Funcionalidades

As seguintes funcionalidades serão implementadas incrementalmente.

* Média Aritmética das Notas
* Média Aritmética por Tipo de Aluno
* Adição de novos Tipos de Alunos
* Adição de mais notas por alunos
* Adição de novas médias
* Professor com várias Cursos







<!SLIDE center>
# Parte 1
~~~SECTION:notes~~~
###############################         PARTE 1         ###############################
~~~ENDSECTION~~~

<!SLIDE>
# Média Aritmética das Notas
## Objetivo 

Adicionar ao relatório o valor da _Media Aritmética das Notas dos Alunos_.




<!SLIDE>
# Formato do Arquivo

Cada linha do arquivo contém o nome do aluno e a sua nota.

O nome é formado por um único nome e a nota por um número inteiro.

O nome e a nota estão separados por tabulação.

Exemplo:

joão  4

maria 7

paulo 6








<!SLIDE center>
# Parte 2
~~~SECTION:notes~~~
###############################         PARTE 2         ###############################
~~~ENDSECTION~~~

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

<!SLIDE>
# Arquivo com Notas

Download do Arquivo: <a href="/file/_files/share/notas-parte-2.txt">Arquivo com Notas</a>
    
    


<!SLIDE center>
# Parte 3
~~~SECTION:notes~~~
###############################         PARTE 3         ###############################
~~~ENDSECTION~~~

<!SLIDE>
# Tipos de Alunos
## Objetivo 

Diferenciar entre Alunos de _Graduação_ e Alunos de _Mestrado_.

Cada tipo de aluno será identificado no arquivo por uma letra:

* Mestrado: M
* Graduação: G

<!SLIDE>
# Tipos de Alunos
## Exemplo


Dado um arquivo com o conteúdo abaixo:

    @@@ Console
    M joão  4
    M maria 5
    M paulo 9
    G eduardo 4
    G ricardo 6
    G alessandra 8

A saída no console poderia ser:    

    @@@ Console
    Graduação:
		Média: 6.0 Mediana: 5.0
	Mestrado:
	    Média: 6.0 Mediana: 6.0
    

<!SLIDE>
# Arquivo com Notas

Download do Arquivo: <a href="/file/_files/share/notas-parte-3.txt">Arquivo com Notas</a>




