<!SLIDE section center>
# Acoplamento e Coesão


<!SLIDE>
# Acoplamento e Coesão

* Princípios de Engenharia de Software

* Contribuem para a criação de um design maduro e sustentável.

* visa melhorar o design do software


<!SLIDE>
# Coesão

_Dicionario Houaiss_
Coerência de pensamento.

_Paradigma Orientado a Objetos_
Um objeto é coeso quando há coerência entre o propósito para o qual ele foi criado e as funções que ele desempenha.

O conceito de _Coesão_ está relacionado com o _Princípio da Responsabilidade Única_. 
(Robert C. Martin, 2000).

* Uma classe deve ter apenas  uma única responsabilidade e realizá-la de maneira satisfatória

* Uma classe não deve assumir responsabilidades que não são suas.

* Se ignorado, geram muitos problemas.



<!SLIDE>
# Exemplo problema coesão

    @@@Java
    public class Programa {
	    publilc void exibirFormulário () {
		    // implementação 
	    }
	    public void obterProduto () {
		    // implementação
	    }
	    public void gravaProdutoDB () {
		    // implementação
	    }
    }
    
    
.callout A classe possui responsabilidades demais

.callout A classe não está coesa





<!SLIDE>
# Acoplamento

_Dicionário Houaiss_
União ou ligação entre dois ou mais corpos, formando um único conjunto.

_Paradigma Orientado a Objetos_
Quando há uma ligação entre dois ou mais objetos.

Apesar de necessárias, geram um aumento de complexidade no sistema, aumentando a sua dificuldade de manutenção.



<!SLIDE>
# Alto Acoplamento

* Forte dependência entre componentes

* É difícil trocar dependências de um objeto sem quebrar seu funcionamento interno.

* É difícil adicionar mais funcionalidades ao componente sem ter que alterar seu código.


<!SLIDE>
# Baixo Acoplamento

* Depender de Abstrações
 * classe abstrata
 * interface


<!SLIDE>
# Baixa Coesão

* Várias funcionalidades em um mesmo objeto

* Difícil reaproveitamento

* Difícil manutenção

* Alta complexidade


<!SLIDE>
# Alta Coesão

* Objetos devem fazer apenas uma tarefa.

* Maior capacidade de reaproveitamento.

* Facilidade de manutenção


<!SLIDE>
# Alta Coesão e Baixo Acoplamento

Um sistema bem projetado é aquele em que seus objetos possuem alta coesão e baixo acoplamento entre si. 

* Componentes devem depender de abstrações ou interfaces.

* Objetos devem ser especialistas.

* Funcionalidades devem resultar da composição de componentes especialistas.


<!SLIDE>
# Relação com Herança

O uso de herança aumenta o acoplamento entre as classes (o quanto uma classe depende da outra)

Isto acaba fazendo com que o programador das classes filhas tenham que conhecer a implementação da classe pai e vice-versa.

