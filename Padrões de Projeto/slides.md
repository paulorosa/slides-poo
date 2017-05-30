<!SLIDE section center>
# Padrões de Projeto


<!SLIDE>
# Problemas no Desenvolvimento de Aplicações

* Problemas semelhantes - soluções diferentes 

* Os problemas são recorrentes

* Uma boa solução não é comunicada


<!SLIDE>
# Padrão de Projeto de Software

Referem-se à comunicação de **PROBLEMAS** e **SOLUÇÕES**.

Padrões permitem:

* Documentar um problema conhecido recorrente

* Documentar a solução em um contexto específico

* Comunicar o conhecimento para outros

.callout Solução geral reutilizável para um problema recorrente no desenvolvimento de sistemas.


<!SLIDE>
# Definições
"Cada padrão é uma regra de três partes, que expressa uma relação entre um certo contexto, um problema e uma solução."
Christopher Alexander

"Um padrão é uma ideia que foi util em um contexto prático e provavelmente será util em outros."
Martin Fowler


<!SLIDE>
# Origem

Christopher Alexander
* Notes on the Synthesis of Form (1964)
* The Timeless Way of Building (1979)
* **A Pattern Language** (1977)

Padrões na Engenharia Civil e Arquitetura


Descrição de um Padrão
* Nome
* Exemplo
* Contexto
* Problema
* Solução


<!SLIDE>
# Popularização

**1987**: Primeiros Padrões de Projeto na Área de Ciência da Computação

* Kent Beck
* Ward Cunningham


**Popularidade (1995)**: Design Patterns: Elements of Reusable Object-Oriented Software 


GOF (Gang of Four)
* Erich Gamma
* Richard Helm
* Ralph Johnson
* Hohn vlissides

* Não foram inventados pelos autores
* Padrões recorrentes em numerosos projetos
* Identificaram e documentaram a coleção



<!SLIDE>
# Características Comuns

* Observados através da experiência
* Normalmente escritos em formato estruturado
* Evitam a reinvenção da roda
* Suportam melhorias contínuas
* São artefatos reutilizáveis
* Comunicam design e melhores práticas
* Podem ser utilizados em conjunto para resolver problemas maiores




<!SLIDE>
# Porque utilizar Padrões?
* O código fica mais organizado
* Aumento da qualidade do software
* Diminuição da complexidade da solução
* Facilidade de comunicação na equipe




<!SLIDE>
# Padrão de Projeto - Fábrica
## Factory 

No mundo real, uma Fábrica é o lugar onde produtos são produzidos.

Na programação, o Factory Method é um padrão de projeto criacional do GoF utilizado para a Criação de Objetos.



<!SLIDE>
# A classe Factory

Uma classe separada é utilizada neste padrão para criar os objetos.

O nome da classe geralmente termina com “Factory”.



<!SLIDE>
# Vantagens


* a criação de objetos ocorre em uma classe “Factory”.

* Isto desacopla o código da criação do objeto do seu uso.

* Mudanças na lógica de criação podem ser realizadas na classe “Factory” sem modificar o código de quem usa.

* Diminui acomplamento e aumenta a coesão.

* Facilidade de encontrar este tipo de classe caso seja utilizado o padrão de nome “Factory”.




<!SLIDE>
# Exemplo de Classe Factory

    @@@ Java
    public class ProgressaoFactory {
    public Progressao create (String nome) {
        if (nome.equals(“PA”)) {
            return new ProgressaoAritmetica( );
        }
        if (nome.equals(“PG”)) {
            return new ProgressaoGeometrica( );
        }
        return null;
    }

programa principal

    @@@ Java
    ProgressaoFactory factory = new ProgressaoFactory ( );
    Progressao p = factory.create (“PA”);


<!SLIDE>
# Exemplo de Classe Factory


Melhorando a implementação da classe ...



~~~SECTION:notes~~~

Referências:
 * http://www.slideshare.net/soms_1/Design-Patterns-1033051
 * http://www.slideshare.net/MadhuraOak/factory-method-design-pattern-19128314
 
~~~ENDSECTION~~~



