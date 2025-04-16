package application;

import java.util.Scanner;

import javax.swing.JOptionPane;

import model.PessoaFisica;
import model.PessoaJuridica;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Boolean flag = true;
		PessoaFisica pf = new PessoaFisica();
		PessoaJuridica pj = new PessoaJuridica();

		while (flag) {

			System.out.println("=====MENU=====");
			System.out.println("1 - Cadastrar PF");
			System.out.println("2 - Cadastrar PJ");
			System.out.println("3 - Mostrar PF");
			System.out.println("4 - Mostrar PJ");
			System.out.println("5 - Mostrar maior rendimento");
			System.out.println("6 - Sair");

			int opc = sc.nextInt();
			sc.nextLine();

			switch (opc) {

			case 1:
				pf.setPessoaFisica();
				break;

			case 2:
				pj.setPessoaJuridica();
				break;

			case 3:
				pf.mostrarDados();
				break;

			case 4:
				pj.mostrarDados();
				break;
				
			case 5:
				mostrarMaiorRendimento(pf, pj);
				break;

			case 6:
				System.out.println("Saindo....");
				flag = false;
				break;

			default:
				System.out.println("Opção invalida, tente nvamente!");

			}

		}

		sc.close();
	}
	
	public static Double mostrarMaiorRendimento(PessoaFisica pf, PessoaJuridica pj) {
	    Double maiorSalario;

	    if (pf.getSalario() > pj.getSalario()) {
	        maiorSalario = pf.getSalario();
	        JOptionPane.showMessageDialog(null, "Pessoa Física tem o maior salário: " + String.format("%.2f", maiorSalario));
	    } else {
	        maiorSalario = pj.getSalario();
	        JOptionPane.showMessageDialog(null, "Pessoa Jurídica tem o maior salário: " + String.format("%.2f", maiorSalario));
	    }

	    return maiorSalario;
	}

}
