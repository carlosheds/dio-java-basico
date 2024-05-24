package conta;

import java.text.MessageFormat;
import java.util.Scanner;

public class ContaTerminal {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		String nome = entrada.nextLine();

		System.out.println("Por favor, digite o número da sua conta:  ");
		int conta = entrada.nextInt();
		entrada.nextLine();

		System.out.println("Por favor, digite o número da agência: ");
		String agencia = entrada.nextLine();

		System.out.println("Por favor, digite o seu saldo: ");
		String saldoStr = entrada.nextLine();
		double saldo = Double.parseDouble(saldoStr.replace(",", "."));

		String saldoFormatado = String.format("%.2f", saldo);
		String mensagem = MessageFormat.format(
				"Olá {0}, obrigado por criar uma conta em nosso banco. \nSua agência é {1}, conta {2} \ne seu saldo R$ {3} já está disponível para saque",
				nome, agencia, conta, saldoFormatado);
		System.out.println(mensagem);
		entrada.close();

	}

}
