<!SLIDE section center>
# Polimorfimo


<!SLIDE>
# Objetivos

* compreender os conceitos herança e polimorfismo
* saber quando utilizar
* reutilizar código
* criar classes filhas e reescrever métodos


<!SLIDE>
# Pilares do Paradigma Orientação a Objetos

* Herança
* **Polimorfismo**
* Abstração
* Encapsulamento




<!SLIDE>
# Herança

O mecanismo de herança permite a criação de classes a partir de outras já existentes com relações é-um-tipo-de, de forma que a partir de uma mesma classe genérica, classes mais especializadas possam ser criadas.

<!SLIDE>
# 
Exemplos:
Funcionario é-uma Pessoa
AutomovelDeLuxo é-um Automovel

A relação é-um entre classes permite a existência de outra característica fundamenal de linguagens de programação orientada a objetos: o polimorfismo.

Polimorfismo permite a manipulação de instâncias de classes que herdam de uma mesma classe ancestral de forma unificada: 







<!SLIDE>
# Definição Polimorfismo

Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse 
podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos, 
especializados para cada classe derivada.







<!SLIDE>
# Resumo das Características do Polimorfismo

* As classes fazem a mesma operação (método), mas de forma diferente.
* Ocorre quando um método definido no ancestral é redefinido no descendente com um comportamento diferente.
* Todo método definido em um ancestral pode ser acessado através dos descendentes.
* As classes fazem a mesma operação (método), mas de forma diferente.




Polimorfismo = “várias coisas”
Linguagem de Programação: pode haver várias formas de se fazer “alguma coisa”.
Habilidade de um mesmo tipo de objeto poder realizar ações diferentes ao receber uma mesma mensagem
Criação de múltiplas classes com os mesmos métodos e propriedades, mas com funcionalidades e implementações diferentes.


Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas.

O polimorfismo permite programar no geral em vez de programaar no específico.

É a capacidade de tipos mais abstratos repesentarem comportamentos de tipos mais específicos.

Com o polimorfismo, podemos projetar e implementar sistemas que são facilmente extensíveis - novas classes podem ser adicionadas a partes gerais do programa com pouca ou nenhma modificação, contanto que as novas classes façam parte da hierarquia de herança ue o programa processa genericamente.

Polimorfismo esta intimamente ligado a herança de classes.
Exemplo para compreender os dois conceitos.
Classe 1 possui 2 métodos: metodoA() e metodoB()
Classe 2 herda a classe 1
Classe2 rescreve todo o métodoA()

Colocar slide de quando usar herança - relação é um







<!SLIDE>
# Exemplos de polimorfismo



<!SLIDE>
# Vantagens do polimorfismo


<!SLIDE>
# Tipos de polimorfismo

* Sobrecarga (overloading)
ocorre na mesma classe ou entre classe-mãe e classe-filha
os métodos diferem pela assinatura (ordem e número de parâmetros)
a escolha do método ocorre em tempo de compilação

* Sobreposição (overriding)
métodos na clase-filha que redefinem ou sobrepõem o comportamento do mesmo método da classe-mãe.
Apresenta a  mesma lista de parâmetros.
Existe também a sobreposição (ou implementação) de métodos concretos (classe-filha) em métodos abstratos (classe-mãe ou interface)
A escolha do método é feita em tempo de execução.




<!SLIDE>
# Vantagens do Polimorfismo

Simplicidade
quando necessário escrever um código que manipula uma família de tipos, o código pode ignorar detalhes específicos de cada tipo.
mesmo que o código aparente estar manipulando um objeto do tipo da classe-mãe, o objeto na verdade pode ser do tipo da classe-mãe, mas também do tipo das classes-filhas
isso torna o código mais fácil de se escrever e de se entender.

Escalabilidade
num momento futuro, outras classes poderão ser adicionadas à família de tipos, sendo que os seus objetos executarão seu código específico.

<!SLIDE>
# Benefícios do Polimorfismo

* clareza
* manutenção de códigos
* aplicações flexíveis











<!SLIDE>
# Modelando ...

Gerar um relatório de bonificações dos Funcionários de uma Faculdade. Podem ser Seguranças, Professores, Coordenadores ou Diretores. 
Os coordenadores na Faculdade são sempre Professores. 
O Relatório deve mostrar o nome, o cpf e a bonificação de cada Funcionário.


Relatório de Bonificações
Fulano (123.456.789-01):  1000 - (Bônus: 100)
Beltrano (345.678.901-23): 2000 - (Bônus: 100)
Ciclano (567.890.123-44): 3000 - (Bônus: 100) 



<!SLIDE>
# Modelagem das Classes

colocar imagem

* Professor É UM Funcionário
* Coordenador É UM Professor
* Coordenador É UM Funcionário
* Diretor É UM Funcionário
* Segurança É UM Funcionário


<!SLIDE>
# Implementando em Java...



<!SLIDE>
# Funcionario

    @@@Java
    public class Funcionario {
	private String nome;
	private long salario;
	public Funcionario (String nome, long salario) {
		this.nome = nome;
		this.salario = salario;
	}
	public String getNome() {
		return this.nome;
	}
	public long getSalario() {
		return this.salario;
	}
	public long getBonus() {
		return 100;
	}
}


    @@@Java
    public class Seguranca extends Funcionario {
	public Seguranca (String nome,long salario) {
		super (nome, salario);
}


    @@@Java
    public class Diretor extends Funcionario {
	public Diretor (String nome,long salario) {
		super (nome, salario);
}


    @@@Java
    public class Professor extends Funcionario {
	public Professor (String nome,long salario) {
		super (nome, salario);
}


    @@@Java
    public class Coordenador extends Professor {
	public Coordenador  (String nome,long salario) {
		super (nome, salario);
}

    

<!SLIDE>
# Em Java...

    @@@Java
    Professor p = new Professor (“P1”, 1000);
Diretor d = new Diretor (“D1”, 3000);

System.out.println(“Bônus: “+p.getBonus());
System.out.println(“Bônus: “+d.getBonus());

Bônus: 100
Bônus: 100







<!SLIDE>
# Problema na Modelagem atual

Bonificações de Funcionários variam em função do Bônus
Professor e Segurança: 10% do salário
Coordenador: 20% do salário
Diretor: 30% do salário

colocar imagem

Problema
método getBonus() está na Classe Mãe e Clases Filhas não têm comportamento diferentes


Da forma como foi modelado, os tipos de funcionários sempre retornarão os mesmos valores.




<!SLIDE>
# Polimorfismo
Palavra de origem grega que significa "várias formas"
(poli = muitas; morphos = formas)


Princípio pelo qual classes derivadas de uma mesma superclasse podem invocar métodos que têm a mesma identificação (assinatura) mas comportamentos distintos.


* colocar imagem

Um outro princípio muito importante em orientação a objetos é Polimorfismo
Link entre o conceito e o problema para resolver.


<!SLIDE>
# Polimorfismo

Permite que métodos produzam resultados diferentes, dependendo do objeto ao qual é aplicado.

A mesma chamada de método (ou envio de mensagem para um objeto) pode produzir “muitas formas” de resultados.



<!SLIDE>
# Polimorfismo

Um nome para várias formas
ou
Um nome e várias implementações 
(vários métodos com o mesmo nome)

<!SLIDE>
# Polimorfismo

Capacidade de uma referência de variável mudar seu comportamento de acordo com o objeto a que ela está conectada.


<!SLIDE>
# Tipos de Polimorfismo

Sobreposição ou Sobrescrita (overriding)

Sobrecarga (overloading)



<!SLIDE>
# Sobreposição ou Sobrescrita (overriding)

* Os métodos na classe filha redefinem o comportamento do mesmo método na classe mãe

* O método apresenta a mesma lista de parâmetros

* A escolha do método é feita em tempo de execução




<!SLIDE>
# Sobrescrita de Método

Uma subclasse redefine um comportamento de sua superclasse
pessoa.getNome()
	return “Sr. “ + this.nome;
empregado.getNome()
	return “Funcionário “ + this.nome;
gerente.getNome()
	return “Gerente “ + this.nome;



<!SLIDE>
# Sobrecarga (overloading)

Os métodos diferem pela assinatura 
(ordem e número de parâmetros)

Ocorre na mesma classe ou entre classe mãe e filha

A escolha do método ocorre em tempo de compilação



<!SLIDE>
# Sobrecarga de Método

Mesmo nome, parâmetros diferentes.
setData (int dia, int mes, int ano);
setData (int dia, int mes, int ano, int hora, int minuto);


<!SLIDE>
# Vantagens do Polimorfismo


**Simplicidade**

Quando necessário escrever um código que manipula uma família de tipos, o código pode ignorar detalhes específicos de cada tipo.

**Escalabilidade**

Em um momento posterior, outras classes poderão ser adicionadas na hierarquia de classes, sendo que os seus objetos executarão seu código específico.


<!SLIDE>
# Solução
## Sobreposição

Funcionários possuem bonifcacões diferentes
Professor Segurança:  10% do salário
Coordenador:  20% do salário
Diretor:  30% do salário


colocar imagem



<!SLIDE>
# Sobreposição (overriding)

    @@@Java
    public class Professor extends Funcionario {
	public Professor (String nome, double bonus) {
		super (nome, bonus);
	}
	public double getBonus() {
		return getSalario() * 0.1;
	}
}



<!SLIDE>
# Sobreposição (overriding)

    @@@Java
    public class Diretor extends Funcionario {
	public Diretor (String nome, double bonus) {
		super (nome, bonus);
	}
	public double getBonus() {
		return getSalario() * 0.3;
	}
}




<!SLIDE>
# Relatório

    @@@Java
    Professor p = new Professor (“P1”, 1000);
Diretor d = new Diretor (“D1”, 3000);

System.out.println(“Bonificação: “+p.getBonificacao());
System.out.println(“Bonificação: “+d.getBonificacao());

Bonificação: 100
Bonificação: 900





<!SLIDE>
# Modificando o problema...


Gerar um relatório de bonificações dos Funcionários de uma Faculdade. Podem ser Professores, Coordenadores ou Diretores. O Relatório deve mostrar o nome, o cpf e a bonificação de cada Funcionário.


Funcionários possuem bonifcações diferentes
Professor e Segurança:  10% do salário
Coordenador:  20% do salário
Diretor:  30% do salário + Adicional



<!SLIDE>
# Sobrecarga (overloading)

colocar imagem


<!SLIDE>
# Sobrecarga (overloading)

    @@@Java
    public class Diretor extends Funcionario {

	public Diretor (String nome, long salario) {
		super (nome, salario);
	}

	public double getBonus() {
		return getSalario() * 0.3;
	}

	public double getBonus(double adicional) {
		return getBonus() + adicional;
	}

}

    


<!SLIDE>
# Relatório

Professor p = new Professor (“P1”, 1000);
Diretor d = new Diretor (“D1”, 3000);

System.out.println(“Bonificação: “+p.getBonus());
System.out.println(“Bonificação: “+d.getBonus());
System.out.println(“Bonificação: “+d.getBonus(200));

Bonificação: 100
Bonificação: 900
Bonificação: 1100



<!SLIDE>
# Herança e Polimorfismo

Polimorfismo está intimamente ligado a Herança de Classes

Cenário
ClasseA possui 2 métodos: metodo1() e metodo2()
ClasseB herda a ClasseA
ClasseB reescreve o método metodo1()
