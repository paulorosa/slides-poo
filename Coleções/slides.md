<!SLIDE section center>
# Coleções

<!SLIDE>
# Coleções

Coleções representam grupos de objetos.

As coleções são objetos que  podem agrupar vários elementos.

<!SLIDE>
# Tipos de coleções
As coleções podem ser divididas em relação ao método de armazenamento e recuperação de seus elementos.

* Conjuntos
* Listas
* Mapas


<!SLIDE>
# Conjuntos

* Não contém valores duplicados.
* A ordem dos elementosnão é a mesma da inserção dos elementos.


<!SLIDE>
# Listas
* Pode conter valores duplicados.
* Mantém sequência de inserção.


<!SLIDE>
# Mapas
* Contém dados do tipo (chave, valor).
* Não armazena chaves duplicadas.
* Cada chave só está associada a um valor.


<!SLIDE>
#
Coleções representam grupos de objetos.
São objetos nos quais podem ser agrupados vários elementos.

São divididas em relação ao método de armazenamento e recuperação de seus elementos.
Conjuntos - não contém valores duplicados.
Mapas - contém dados do tipo (chave, valor).
Listas - pode conter valores duplicados sequencialmente.

<!SLIDE>
# Classe Concreta - ArrayList

* Object get (int index)
* Object set (int index, Object element)
* void add (int index, Object element)
* Object remove (int index)
* int indexOf (Object o)
* int lastIndexOf (Object o)

<!SLIDE>
# Classe Concreta - ArrayList

ArrayList - array redimensionável de elementos


    @@@Java
    ArrayList <String> nomes = new ArrayList <String> ( );
    nomes.add(“nome 1”);
    nomes.add(“nome 2”);
    nomes.add(“nome 1”);
    
    

<!SLIDE>
# Classe Concreta - HashSet
HashSet - Não garante a ordem dos elementos. 

Set <String> nomes = new HashSet<String>();
nomes.add(“nome 1”);
nomes.add(“nome 2”);
nomes.add(“nome 3”);



<!SLIDE>
# Principais métodos: HashMap

Object put (Object key, Object value)
Object get (Object key)
Object remove (Object key)
int size()
boolean isEmpty()
void clear()
Set keySet()


<!SLIDE>
# HashMap - Não permite elementos nulos

   @@@Java
Funcionario f1 = new Funcionario(1, “nome1”);
Funcionario f2 = new Funcionario(2, “nome2”);
Map<Funcionario> funcionarios = 
	new HashMap<Funcionario>();
funcionarios.put (1, f1);
funcionarios.put (2, f2);


<!SLIDE>
#
Estas coleções pertencem ao pacote java.util e as interfaces que as representam são:
Conjuntos - java.util.Set
http://docs.oracle.com/javase/7/docs/api/java/util/Set.html
Mapas - java.util.Map
http://docs.oracle.com/javase/7/docs/api/java/util/Map.html
Listas - java.util.List
http://docs.oracle.com/javase/6/docs/api/java/util/List.html


<!SLIDE>
#

Imagens hierarquia de coleções em java


<!SLIDE>
#

Collection - Base da hierarquia. Representa um grupo de objetos.
http://docs.oracle.com/javase/7/docs/api/java/util/Collection.html

--
Collection — the root of the collection hierarchy. A collection represents a group of objects known as its elements. Some types of collections allow duplicate elements, and others do not. Some are ordered and others are unordered. The Java platform doesn’t provide any direct implementations of this interface but provides implementations of more specific sub interfaces, such as Set and List.
--

<!SLIDE>
# Principais métodos: Collection


int size()
boolean isEmpty()
boolean contains (Object element)
boolean add (Object element)
boolean remove (Object element)
void clear()
Iterator iterator()


<!SLIDE>
#
List - Mantém a sequência de inserção. Pode armazenar elementos duplicados. Coleção ordenada.

--
List — an ordered collection (sometimes called a sequence). Lists can contain duplicate elements. The user of a List generally has precise control over where in the list each element is inserted and can access elements by their integer index (position).
--


<!SLIDE>
# Principais métodos: List

Object get (int index)
Object set (int index, Object element)
void add (int index, Object element)
Object remove (int index)
int indexOf (Object o)
int lastIndexOf (Object o)


<!SLIDE>
# Classes Concretas - List
ArrayList - array redimensionável
LinkedList - Lista Ligada (FIFO)
Stack - Pilha (LIFO)

ArrayList <String> nomes = new ArrayList <String> ( );
nomes.add(“nome 1”);
nomes.add(“nome 2”);
nomes.add(“nome 1”);

ArrayList:
Resizable-array implementation of the List interface. Implements all optional list operations, and permits all elements, including null. In addition to implementing the List interface, this class provides methods to manipulate the size of the array that is used internally to store the list.



<!SLIDE>
# Set - coleção que não contém elementos duplicados.

Não existem métodos que trabalham com índices “get (int)”
A ordem dos elementos na maioria das vezes não é a mesma da inserção dos elementos.
Desempenho nas pesquisas superior as implementações de List

--
Set — a collection that cannot contain duplicate elements
--


<!SLIDE>
# Classes Concretas - Set

HashSet - Não garante a ordem dos elementos.
EnumSet - Conjunto de Enumeration.
TreeSet - Conjunto Navegável.

HashSet <String> nomes = new HashSet<String>();
nomes.add(“nome 1”);
nomes.add(“nome 2”);
nomes.add(“nome 3”);

--
HashSet :
This class implements the Set interface, backed by a hash table (actually a HashMap instance). It makes no guarantees as to the iteration order of the set; in particular, it does not guarantee that the order will remain constant over time. This class permits the nullelement.
--



<!SLIDE>
# java.util.Map
Relaciona chaves com valores.
Não armazena chaves duplicadas.
Cada chave só está associada a um valor.
Um mapa é muito usado para indexar objetos de acordo com determinado critério, para podermos buscá-los rapidamente.


<!SLIDE>
# Principais métodos: Map
Object put (Object key, Object value)
Object get (Object key)
Object remove (Object key)
int size()
boolean isEmpty()
void clear()
Set keySet()


<!SLIDE>
# HashMap - Não permite elementos nulos
Funcionario f1 = new Funcionario(1, “nome1”);
Funcionario f2 = new Funcionario(2, “nome2”);
Map<Funcionario> funcionarios = 
	new HashMap<Funcionario>();
funcionarios.put (1, f1);
funcionarios.put (2, f2);

--
HashMap:
The HashMap class is roughly equivalent toHashtable, except that it is unsynchronized and permits nulls.
--


<!SLIDE>
# Interface Iterator
Permite percorrer os elementos da Coleção.
Principais Métodos:
boolean hasNext()
Object next()
void remove()


Collection c = …
Iterator i = c.iterator();
while (i.hasNext()) {
	<tipo> elem = (<tipo>) i.next();
}




<!SLIDE>
# Ordenação de Coleções
Ordenação de coleções pode ser feita com o método Collections.sort()
Comparação entre itens
Interfaces Comparable e Comparator
para implementá-las deve-se definir o método compareTo()

--
http://stackoverflow.com/questions/14154127/collections-sortlistt-comparator-super-t-method-example
--


<!SLIDE>
# método compareTo()

public int compareTo (ContaPoupanca o) {
	if (this.getNumero() < o.getNumero()) {
		return -1;
	}
	if (this.getNumero() > o.getNumero()) {
		return 1;
	}
	return 0;
}

<!SLIDE>
# método equals

public boolean equals (Object o) {
	if (oject == null) {
		return false;
	}
	if (!(o instanceof Pessoa)) {
		return false;
	}
	Pessoa pessoa = (Pessoa) object;
	return pessoal.getCpf().equals(this.cpf);
}


<!SLIDE>
# Ordenação de Coleções


Ordenação de coleções pode ser feita com o método Collections.sort()
Comparação entre itens
Interfaces Comparable e Comparator
para implementá-las deve-se definir o método compareTo()

--
http://stackoverflow.com/questions/14154127/collections-sortlistt-comparator-super-t-method-example
--



<!SLIDE>
#método compareTo()

public int compareTo (ContaPoupanca o) {
	if (this.getNumero() < o.getNumero()) {
		return -1;
	}
	if (this.getNumero() > o.getNumero()) {
		return 1;
	}
	return 0;
}

<!SLIDE>
#método equals

public boolean equals (Object o) {
	if (oject == null) {
		return false;
	}
	if (!(o instanceof Pessoa)) {
		return false;
	}
	Pessoa pessoa = (Pessoa) object;
	return pessoal.getCpf().equals(this.cpf);
}


<!SLIDE>
# Exercício
Alterar o exemplo para que:
listar as assinaturas em ordem alfabética.
não permitir duas assinturas iguais


<!SLIDE>
#
