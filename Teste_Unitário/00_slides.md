<!SLIDE section center>
# Testes de Software

<!SLIDE>
# Falhas no Software

Não se pode garantir que um software funcione sem a presença de erros.

![blue_screen_windows](blue_screen_windows.png)

<!SLIDE>
# Teste de Software

Processo executado por um testador com o objetivo de fornecer informações sobre a qualidade do software.

.callout.info Um Testador pode ser um ser humano ou uma máquina.

<!SLIDE>
# Motivos de Falha
##Alguns motivos de Falhas no Software:
* Especificação
* Implementação


<!SLIDE>
# Por que Testar o Software?

* Como saber se funciona sem testar?
* Como saber se funciona após alguma alteração?
* Testes geram sentimento de segurança.
	

<!SLIDE>
# Por que Testar o Software?

Garantir que problemas serão descobertos cedo.
Facilitar a manutenção de código.
Servir como documentação
Ajudam a melhorar o design do código


<!SLIDE>
# Benefícios
## A criação de testes de software possui vários benefícios 

* Código testado é mais confiável.
* Pode ser alterado sem medo.
* O que adianta OO prover encapsulamento se há medo em mudar alguma implementação.


<!SLIDE>
# Tipos de Testes de Software
## Existem muitos tipos de testes, alguns dos principais são
* Teste de Unidade (ou Teste Unitário)
 ** Testes das menores unidades de software desenvolvidas.
* Teste de Integração
 ** Encontrar falhas provenientes da integração interna dos componentes.
* Testes de Aceitação
 ** Verificação se comportamento do sistema está de acordo com o solicitado.
* Teste Alfa e Beta
 ** Testes entre o período de término do desenvolvimento e da entrega.


.callout.info referência no wikipedia.


<!SLIDE>
# Como escrever um teste para esta classe?
public class ContaBancaria {
    private Double saldo;

    public ContaBancaria (Double saldo) {
        this.saldo = saldo;
    }

    public boolean temSaldo ( ) {
        return saldo.doubleValue ( ) > 0;
    }
}

<!SLIDE>
# Como escrever um teste para esta classe?

public class ContaBancariaTeste {
    public void contaComSaldo ( ) {
        Double saldo = new Double (100.0);
        ContaBancaria cb = new ContaBancaria (saldo);
        If (cb.temSaldo ( )) {
            System.out.println (“true”);
        } else {
            System.out.println (“false”);
        }
    }
    public static void main (String[ ] args) {
        ContaBancariaTeste teste = new ContaBancariaTeste ( );
        teste.contaComSaldo ( );
    }
}



<!SLIDE>
# Já está testado?

* E o teste de não ter saldo?
* E o teste com saldo zero?


<!SLIDE>
# Já está testado?

E se alguém passar null no saldo?

public class ContaBancaria {
    private Double saldo;

    public boolean temSaldo ( ) {
        return saldo.doubleValue ( ) > 0;
    }
}

<!SLIDE>
# Já está testado?

E se alguém passar null no saldo?

public class ContaBancaria {
    private Double saldo;

    public boolean temSaldo ( ) {
        return saldo != null && saldo.doubleValue ( ) > 0;
    }
}


<!SLIDE>
# Testes Automáticos 
Programas que avaliam se outro programa funciona como esperado e retornam resposta do tipo “sim” ou “não”.


<!SLIDE>
# Observações sobre Teste de Software
## Algumas observações sobre Teste de Software

Para ter certeza de que seu código não tem erro, todas as possíveis entradas do método precisam ser testadas.

Geralmente se testa alguns valores chaves que representam todas as possíveis entradas.

<!SLIDE>
# Algumas observações sobre Teste de Software

Não teste métodos triviais get e set, a não ser que tenham validações.
Se achar um bug, não conserte antes que criar um teste que o encontre.
Preocupe-se com a qualidade do código dos testes.


<!SLIDE>
# Ciclo de Vida
* Planejamento
 ** Elaboração da estratégia e plano de testes.
* Preparação
 ** Ambiente para testes serem executados.
* Especificação
 ** Elaboração casos de testes e roteiros de testes.
* Execução
 ** Execução de testes e obtenção de dados.
* Entrega
 ** Projeto finalizado.


<!SLIDE>
# Referências
## Para maiores informações sobre testes 

* Wikipedia - Teste de Software
  https://pt.wikipedia.org/wiki/Teste_de_software

