<!SLIDE supplemental ado3>
# ADO 3
## -
[ADO2] Interface DAO
Uma grande parte das aplicações utilizam alguma forma de persistência para manipular dados. Entre as formas mais conhecidas, podemos citar texto, xml, json, banco de dados relacional, banco de dados não-relacional, entre outros.

A manipulação dos dados, em geral, é realizada com algumas operações básicas:
Criação
Leitura
Atualização
Remoção

Nesta atividade utilizaremos a memória como forma de persistência de dados. As instruções para realizar esta atividade descritas a seguir devem ser respeitadas.

Todas as classes devem ser criadas no pacote: br.senac.sp.poo.ado.aluno

Utilizaremos informações sobre alunos para trabalhar com a persistência. Um aluno possui um nome é identificado pelo seu número de matricula. Uma classe Aluno deve ser criada e deve ter os métodos:
String getNumeroMatricula ( ) - devolve o número de matrícula do aluno
String getNome ( ) - devolve o nome do aluno

A interface Aluno Dao deve ser criada conforme apresentada no quadro abaixo.

public interface AlunoDao {
    void create (Aluno aluno);
    Aluno read (Integer matricula);
    Aluno update (Aluno aluno);
    Aluno delete (Integer matricula);
    Collection<Aluno> find ( );
}

O método create deve adicionar um novo aluno no sistema.
O método read deve retornar a instância do aluno com a matricula informada. Deve retornar null se o aluno não exisitr.
O método update deve receber uma aluno com nome alterado e então atualizar o registro dele no sistema.
O método delete deve remover o aluno do sistema.
O método find deve retornar todos os alunos cadastrados no sistema.

Criar duas classes concretas que implementem a interface AlunoDao de forma diferente.
A primeira deve utilizar a classe ArrayList como forma de armazenar os alunos.
A outra deve utilizar a classe HashSet para armazenar os alunos.

Observação: notem que há um processo de pesquisa (estudo) para saber como trabalhar com as classes de coleções em Java para atender aos requisitos da atividade.





Criar a classe AlunoDaoFactory conforme o quadro abaixo.

public class AlunoDaoFactory {

    // outros códigos se existirem

    public AlunoDao create (TipoDao tipo) {
        // implementação do código
    }
}

Criar classes de testes para as duas implementações da interface AlunoDao e também para a classe AlunoDaoFactory.
Critério de Avaliação
A avaliação do ADO será baseada nos seguintes critérios.
Exercícios copiados serão descontados.
A especificação do exercício deve ser seguida, incluindo os nomes utilizados.
Os testes devem cobrir os casos principais.
Os princípios de orientação a objetos devem ser utilizados de forma correta.
A avaliação será realizada de forma automática pelo professor. Um programa irá realizar chamadas para as diversas operações das classes de Dao. Por este motivo, é muito importante que a especificação seja seguida rigorosamente.
Caso ocorra algum problema na execução, a atividade terá nota zero.
Entrega fora da data não será considerada e terá nota zero, pois o exercício será corrigido durante a aula logo após a finalização do prazo de entrega.

ATENÇÃO - Qualquer dúvida entrem em contato com o professor por email ou na sala de aula.





============================

criar uma classe gerenciador de alunos

Operações
1. escolher qual o tipo de persistência: arquivo ou memória

while () {


public class Adicionar implements Command {
  private Aluno aluno;
  public Adicionar (Aluno aluno) {
    this.aluno = aluno;
  }
  public void execute () {
    alunoDao.adicionar(aluno);
  }
}

AlunoDao 
