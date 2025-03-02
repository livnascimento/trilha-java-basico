package trilha.java.basico.exercicios.banco.terminal;

import java.util.*;

class BancoTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("==========================================");
        System.out.println( "Cadastrar novo cliente");
        System.out.println("==========================================");

        System.out.println("Digite o número da nova conta.");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Digite a agência.");
        String agencia = scanner.nextLine();
        System.out.println("Digite o nome do cliente.");
        String nomeCliente = scanner.nextLine();
        System.out.println("Digite o saldo do cliente em reais.");
        int saldoEmCentavos = Integer.parseInt(scanner.nextLine()) * 100;

        ContaBancaria novaConta = new ContaBancaria(numero, agencia, nomeCliente, saldoEmCentavos);

        scanner.close();

        System.out.printf("\nOlá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", novaConta.nomeCliente, novaConta.agencia, novaConta.numero, (double) novaConta.saldoEmCentavos / 100);


    }

}

class ContaBancaria {
    Integer numero;
    String agencia;
    String nomeCliente;
    Integer saldoEmCentavos;

    ContaBancaria (Integer numero, String agencia, String nomeCliente, Integer saldoEmCentavos) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldoEmCentavos = saldoEmCentavos;
    }
}