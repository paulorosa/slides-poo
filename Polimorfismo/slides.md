<!SLIDE section center>
# Polimorfimo


~~~SECTION:notes~~~
# Objetivos do Módulo

Os objetivos para este módulo sobre Poliformismo são

* compreender os conceitos herança e polimorfismo

* saber quando utilizar

* reutilizar código

* criar classes filhas e reescrever métodos

.callout.error Terminar este slide após finalizar tudo sobre poliformfismo.

Pendências:

* criar ADO sobre polimorfismo
* criar lista de exercícios sobre polimorfismo
* criar avaliação nos slides

~~~ENDSECTION~~~


<!SLIDE>
# Pilares do Paradigma Orientação a Objetos

Este módulo refere-se a um dos quatro pilares do paradigma orientado a objetos.

* Herança
* **Polimorfismo**
* Abstração
* Encapsulamento







<!SLIDE>
# Relação É-UM na Herança

Conforme já abordado, o mecanismo de **Herança** permite a criação de classes a partir de outras já existentes.

O relacionamento entre estas classes é do tipo **É-UM**.

A partir de uma mesma classe genérica, classes mais especializadas podem ser criadas.




<!SLIDE>
# Especialização de Classes



Exemplos:
Funcionario é-uma Pessoa
AutomovelDeLuxo é-um Automovel

.callout A relação **É-UM** entre classes permite a existência de outra característica 
fundamental no paradigma programação orientada a objetos: o **Polimorfismo**








<!SLIDE>
# O que é Polimorfismo?

.callout Polimorfismo é o princípio pelo qual duas ou mais classes derivadas de uma mesma superclasse 
podem invocar métodos que têm a _mesma identificação_ (assinatura) mas _comportamentos distintos_, 
especializados para cada classe derivada.






<!SLIDE>
# Significado 

Na Língua Portuguesa

.callout Palavra de origem grega que significa "várias formas"
(poli = muitas; morphos = formas)

No Paradigma Orientado a Objetos

.callout Várias formas de se fazer “alguma coisa”.








<!SLIDE>
# Herança e Polimorfismo

.callout **Polimorfismo** esta diretamente ligado a **Herança** de classes.

A ligação está é porque os comportamentos diferentes são implementados nas classes filhas.





<!SLIDE>
# Mais explicações sobre Polimorfismo

Permite que métodos produzam resultados diferentes, dependendo do objeto ao qual é aplicado.

A mesma chamada de método (ou envio de mensagem para um objeto) pode produzir “muitas formas” de resultados.

Capacidade de uma referência de variável mudar seu comportamento de acordo com o objeto a que ela está conectada.








<!SLIDE>
# Exemplo Polimorfismo

Para compreender como os conceitos estão relacionados, considere o seguinte diagrama de classes.

![.fancyborder](_images/ClasseMae_ClasseFilha_MetodoA.png)

* as classes ClasseFilha1 e ClasseFilha2 herdam da classe ClasseMae.
* as classes ClasseFilha1 e ClasseFilha2 possuem o mesmo método metodoA()

<!SLIDE>
# Implementação do Diagrama de Classes

    @@@ Java
    public class ClasseMae {
    }
    public class ClasseFilha1 extends ClasseMae {
        public void metodoA() {
            System.out.println("metodoA executado na ClasseFilha1");
        }
    }
    public class ClasseFilha2 extends ClasseMae {
        public void metodoA() {
            System.out.println("metodoA executado na ClasseFilha2");
        }
    }


<!SLIDE>
# Exemplo Polimorfismo

O polimorfismo ocorre em conjunto com a herança quando dois métodos
possuem a mesma assinatura.

    @@@ Java
    public static void main (String[] args) {
        ClasseFilha1 cf1 = new ClasseFilha1();
        ClasseFilha1 cf2 = new ClasseFilha2();
        
        cf1.metodoA();
        cf2.metodoA();
    }

Tratam-se de chamadas de métodos normais em duas classes.

    @@@ Console
    metodoA executado na ClasseFilha1
    metodoA executado na ClasseFilha2
    

O detalhe ocorre por causa do método ser o mesmo e as classes serem filhas
da mesma classe.



    
<!SLIDE>
# Exemplo Polimorfismo









<!SLIDE>
# Resumo das Características do Polimorfismo

* As classes fazem a mesma operação (método), mas de forma diferente.
* Ocorre quando um método definido no ancestral é redefinido no descendente com um comportamento diferente.
* Todo método definido em um ancestral pode ser acessado através dos descendentes.
* As classes fazem a mesma operação (método), mas de forma diferente.




Polimorfismo permite a manipulação de instâncias de classes que herdam de uma mesma classe ancestral de forma unificada: 





Polimorfismo é a capacidade de um objeto poder ser referenciado de várias formas.

O polimorfismo permite programar no geral em vez de programaar no específico.

É a capacidade de tipos mais abstratos repesentarem comportamentos de tipos mais específicos.

Com o polimorfismo, podemos projetar e implementar sistemas que são facilmente extensíveis - novas classes podem ser adicionadas a partes gerais do programa com pouca ou nenhma modificação, contanto que as novas classes façam parte da hierarquia de herança ue o programa processa genericamente.


Colocar slide de quando usar herança - relação é um










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
# Aplicando Polimorfismo

**Problema**: Gerar um Rrelatório com as bonificações dos Funcionários de uma Faculdade. 

Algumas informações adicionais:

* Os Funcionários da Faculdade podem ser Professores, Coordenadores ou Diretores. 

* Os Coordenadores da Faculdade são sempre Professores. 

* A bonificação de todos os funcionários é 10% do salário.


A saída do relatório deve ser parecida com esta:

    @@@ Console
    Relatório de Bonificações
    Nome             Salário           Bonificação
    P1               1000              100
    D1               2000              200
    C1               3000              300 




<!SLIDE>
# Modelagem das Classes

colocar imagem

* Professor É UM Funcionário
* Coordenador É UM Professor
* Coordenador É UM Funcionário
* Diretor É UM Funcionário


<!SLIDE>
# Implementando em Java...



<!SLIDE>
# Classe Funcionario

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
		return this.salario * 0.1;
	}
}

<!SLIDE>
# Classes Professor e Diretor

    @@@Java
    public class Diretor extends Funcionario {
	    public Diretor (String nome,long salario) {
		    super (nome, salario);
		}
    }

    @@@Java
    public class Professor extends Funcionario {
	    public Professor (String nome,long salario) {
	 	    super (nome, salario);
        }
    }

<!SLIDE>
# Classe Coordenador

    @@@Java
    public class Coordenador extends Professor {
        public Coordenador  (String nome,long salario) {
		    super (nome, salario);
        }
    }
    

    

<!SLIDE>
# Execução do Programa

    @@@Java
    public static void main (String[] args) {
    
        Professor p = new Professor (“P1”, 1000);
        Diretor d = new Diretor (“D1”, 3000);
        Coordenador c = new Coordenador (“C1”, 1000);

        System.out.println(“Relatório de Bonificações"
        System.out.println(“Nome \t Salário \t Bonificação");
        
        System.out.println(p.getNome()+" \t "+p.getSalario()+" \t "+p.getBonus()+" \t ");
        System.out.println(p.getNome()+" \t "+p.getSalario()+" \t "+p.getBonus()+" \t ");
        System.out.println(p.getNome()+" \t "+p.getSalario()+" \t "+p.getBonus()+" \t ");
    }


    @@@ Console
    Relatório de Bonificações
    Nome             Salário           Bonificação
    P1               1000              100
    D1               2000              200
    C1               3000              300 






<!SLIDE>
# Requisito Adicional

Bonificações de Funcionários variam em função do Bônus
Professor e Segurança: 10% do salário
Coordenador: 20% do salário
Diretor: 30% do salário


<!SLIDE>
# Problema na Modelagem Atual

método getBonus() está na Classe Mãe e Clases Filhas não têm comportamento diferentes


Da forma como foi modelado, os tipos de funcionários sempre retornarão os mesmos valores.






<!SLIDE>
# Implementação de Comportamentos Diferentes

Sobreposição d

Funcionários possuem bonifcacões diferentes
Professor Segurança:  10% do salário
Coordenador:  20% do salário
Diretor:  30% do salário




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
# Sobreposição (overriding)

    @@@Java
    public class Coordenador extends Professor {
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
# Mais um Requisito para Adicionar


Gerar um relatório de bonificações dos Funcionários de uma Faculdade. 
Podem ser Professores, Coordenadores ou Diretores. O Relatório deve mostrar o nome, o cpf e a bonificação de cada Funcionário.


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
# Benefícios do Polimorfismo

* clareza
* manutenção de códigos
* aplicações flexíveis




<!SLIDE>
# Vantagens do Polimorfismo

**Simplicidade**

Quando necessário escrever um código que manipula uma família de tipos, o código pode ignorar detalhes específicos de cada tipo.

mesmo que o código aparente estar manipulando um objeto do tipo da classe-mãe, o objeto na verdade pode ser do tipo da classe-mãe, mas também do tipo das classes-filhas
isso torna o código mais fácil de se escrever e de se entender.

**Escalabilidade**

Em um momento posterior, outras classes poderão ser adicionadas na hierarquia de classes, sendo que os seus objetos executarão seu código específico.

