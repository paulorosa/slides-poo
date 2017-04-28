<!SLIDE section center>
# Coleções

<!SLIDE>
# Coleções

Coleções representam grupos de objetos.

As coleções são objetos que  podem agrupar vários elementos (objetos).

<!SLIDE>
# Tipos de coleções
As coleções podem ser divididas em relação ao método de armazenamento e recuperação de seus elementos.

* Conjuntos
* Listas
* Mapas


<!SLIDE>
# Conjuntos

* Não contém valores duplicados.
* A ordem dos elementos não é a mesma da inserção dos elementos.


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
# Coleções em Java

As coleções em Java são representadas em classes para cada tipo.



<!SLIDE>
# Classe Concreta - ArrayList

Pacote: java.util

Classe: ArrayList

Os métodos mais comuns são:

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

    @@@ Java
    HashSet <String> nomes = new HashSet<String>();
    nomes.add(“nome 1”);
    nomes.add(“nome 2”);
    nomes.add(“nome 3”);



<!SLIDE>
# Classe Concreta - HashMap

Pacote: java.util

Classe: ArrayList

Os métodos mais comuns são:

* Object put (Object key, Object value)
* Object get (Object key)
* Object remove (Object key)
* int size()
* boolean isEmpty()
* void clear()
* Set keySet()


<!SLIDE>
#  Classe Concreta - HashMap

Não permite elementos nulos

    @@@ Java
    Funcionario f1 = new Funcionario(1, “nome1”);
    Funcionario f2 = new Funcionario(2, “nome2”);

    HashMap<Funcionario> funcionarios = new HashMap<Funcionario>();
    funcionarios.put (1, f1);
    funcionarios.put (2, f2);


