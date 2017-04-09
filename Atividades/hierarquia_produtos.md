<!SLIDE supplemental hierarquia_produtos>
# Hierarquia de Classes de Produtos

### Problema

Criar um programa orientado a objetos para a representação de produtos.

### Produtos

Cada um dos produtos possuem características:

* **Fogão**: marca, modelo, selo Procel, quantidade de bocas
* **Tv**: marca, modelo, selo Procel, polegadas
* **Notebook**: marca, modelo, memória
* **Tablet**: marca, modelo, tamanho da tela

### Tipos de Produtos

Os produtos podem ser de dois tipos:

* **Eletrodomésticos**: Fogão e Tv
* **Informática**: Notebook e Tablet

### Exemplo

Alguns exemplos para serem utilizados:

* Fogao: (“Brastemp”, “XYZ”, ‘A’, 4)

Deve imprimir: “Fogao Marca: Brastemp, Modelo: XYZ, seloProcel: XYZ, quantidade bocas: 4”.


### Atividade

Utilize os conceitos do paradigma orientado a objetos para:

* Criar o Diagrama de Classes UML
* Criação das Classes em Java
* As classes devem ter apenas os métodos acessores de suas características.
* Cada classe deve possuir um único construtor no qual as características dos produtos sejam atribuídas.
* Os métodos acessores devem ser impedidos de serem sobreescritos.
* As classes Fogao e Tablet não podem ser herdadas.
* As classes devem ter um método acessor que retorne uma String com uma concatenação dos valores das características dos produtos.
 * Por exemplo: Fogão Brastemp XYZ SeloProcel A 4 bocas


### Programa Principal

Criar um programa principal que realize as seguintes tarefas:

1. Criar algumas instâncias de cada uma das classes.
2. Criar listas para adicionar:
 * todos os produtos
 * todos os eletrodoméstios
 * todos os produtos de informática
3. Iterar nos elementos da lista e imprimir a descrição de cada objeto.

