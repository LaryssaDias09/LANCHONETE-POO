package Lanchonete.newpackage;
import java.util.Scanner;

import javax.swing.JOptionPane;
public class Lanchonete {
    private int escolha;
	private Object opcao;
	private Scanner input = new Scanner(System.in);

	private final String[] ingredientes = new String[500];// armazena o nome dos ingredientes
	private final double[] precos = new double[500];// armazena o preço dos ingredientes
	private int index = 0; // controla a inserção de ingredientes

	public static void main(String[] args) {

		new Lanchonete().startLanchonete();
	}

	private void startLanchonete() {

		do {
//			System.out.println("ESCOLHA O INGREDIENTE MEU FI:");
//			System.out.println("1 - Pães");
//			System.out.println("2 - Queijos");
//			System.out.println("3 - Carnes de Porco");
//			System.out.println("4 - Verduras");
//			System.out.println("5 - Molhos");
//			System.out.println("6 - Outros");

//			escolher();

			opcao = JOptionPane.showInputDialog(null,
					"ESCOLHA O INGREDIENTE:\n" + "1 - Pães\n" + "2 - Queijos\n" + "3 - Carnes de Porco\n"
							+ "4 - Verduras\n" + "5 - Molhos\n" + "6 - Outros",
					"MONTE SEU SANDUÍCHE", JOptionPane.QUESTION_MESSAGE, null, null, null);

			if (opcao == null)
				break;
			else
				escolha = Integer.parseInt((String) opcao);

			if (escolha == 1) {
				escolherPao();

			} else if (escolha == 2) {
				escolherQueijos();

			} else if (escolha == 3) {
				escolherCarnes();

			} else if (escolha == 4) {

			} else if (escolha == 5) {

			} else if (escolha == 6) {

			} else {
//				System.err.println("INVÁLIDO");
				JOptionPane.showMessageDialog(null, "Opção INVÁLIDA!", "ERRO", JOptionPane.ERROR_MESSAGE);
			}

		} while (isContinuar("INGREDIENTES"));

		double total = 0;

		for (int i = 0; i < index; i++) {

			System.out.println(ingredientes[i] + "......................." + " R$" + precos[i]);
			total += precos[i];
		}
		System.out.println("TOTAL = R$ " + total);

	}

	private void escolher() {
		escolha = input.nextInt();
	}

	private boolean isContinuar(String menu) {

		int r = JOptionPane.showConfirmDialog(null, "Continuar no menu " + menu + "?", "CONTINUAR",
				JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
		return r == 0 ? true : false;
//		System.out.println(
//				"Deseja continuar no menu de " + menu + "? Digite SIM para continuar\ne qualquer coisa para SAIR");
//		String r = input.next().toUpperCase();

		/**
		 * toUpperCase() converte tudo para maiúsculo para o sistema aceitar a variação
		 * entre maiúculas e minúsculas.
		 */
//		return (r.toUpperCase().equals("SIM")) ? true : false;

	}

	private void escolherPao() {

		do {

//			System.out.println("Escolha o Pão:");
//			System.out.println("1 - Pão Francês – R$ 0,25");
//			System.out.println("2 - Pão Carteira – R$ 0,30");
//			System.out.println("3 - Pão de Hambúrguer – R$ 0,70");
//			System.out.println("4 - Pão Árabe – R$ 1,30");

//			escolher();

			opcao = JOptionPane.showInputDialog(null,
					"ESCOLHA O PÃO:\n" + "1 - Pão Francês – R$ 0,25\n" + "2 - Pão Carteira – R$ 0,30\n"
							+ "3 - Pão de Hambúrguer – R$ 0,70\n" + "4 - Pão Árabe – R$ 1,30",
					"MONTE SEU SANDUÍCHE", JOptionPane.QUESTION_MESSAGE, null, null, null);

			if (opcao == null)
				break;
			else
				escolha = Integer.parseInt((String) opcao);

			if (escolha == 1) {
				ingredientes[index] = "Pão Francês";
				precos[index] = 0.25;
			} else if (escolha == 2) {
				ingredientes[index] = "Pão Carteira";
				precos[index] = 0.30;
			} else if (escolha == 3) {
				ingredientes[index] = "Pão de Hambúrguer";
				precos[index] = 0.70;
			} else if (escolha == 4) {
				ingredientes[index] = "Pão Árabe";
				precos[index] = 1.30;
			} else {
				System.err.println("INVÁLIDO");
				index--; // decrementa para incrementar na depois
			}
			index++;

		} while (isContinuar("PÃES"));

	}

	private void escolherQueijos() {

		do {

//			System.out.println("Escolha o Queijo:");
//			System.out.println("1 - Coalho – R$ 1,50");
//			System.out.println("2 - Minas – R$ 1,80");
//			System.out.println("3 - Mussarela – R$ 2,00");
//			System.out.println("4 - Cream Cheese – R$ 3,00");
//			System.out.println("5 - Gorgonzola – R$ 3,50");

//			escolher();

			opcao = JOptionPane.showInputDialog(null,
					"ESCOLHA O QUEIJO:\n" + "1 - Coalho – R$ 1,50\n" + "2 - Minas – R$ 1,80\n"
							+ "3 - Mussarela – R$ 2,00\n" + "4 - Cream Cheese – R$ 3,00\n" + "5 - Gorgonzola – R$ 3,50",
					"MONTE SEU SANDUÍCHE", JOptionPane.QUESTION_MESSAGE, null, null, null);
			if (opcao == null)
				break;
			else
				escolha = Integer.parseInt((String) opcao);

			if (escolha == 1) {
				ingredientes[index] = "Coalho";
				precos[index] = 1.50;
			} else if (escolha == 2) {
				ingredientes[index] = "Minas";
				precos[index] = 1.80;
			} else if (escolha == 3) {
				ingredientes[index] = "Mussarela";
				precos[index] = 2.00;
			} else if (escolha == 4) {
				ingredientes[index] = "Cream Cheese";
				precos[index] = 3.00;
			} else if (escolha == 5) {
				ingredientes[index] = "Gorgonzola";
				precos[index] = 3.50;
			} else {
				System.err.println("INVÁLIDO");
				index--; // decrementa para incrementar na depois
			}
			index++;

		} while (isContinuar("QUEIJOS"));

	}

	private void escolherCarnes() {

		do {

//			System.out.println("Escolha o Queijo:");
//			System.out.println("1 - Mortadela – R$ 0,50");
//			System.out.println("2 - Apresuntado – R$ 1,00");
//			System.out.println("3 - Bacon – R$ 1,30");
//			System.out.println("4 - Presunto – R$ 1,60");
//			System.out.println("5 - Pepperoni – R$ 1,80");
//			System.out.println("6 - Salame – R$ 2,00");

//			escolher();

			opcao = JOptionPane.showInputDialog(null,
					"ESCOLHA A CARNE:\n" + "1 - Mortadela – R$ 0,50\n" + "2 - Apresuntado – R$ 1,00\n"
							+ "3 - Bacon – R$ 1,30\n" + "4 - Presunto – R$ 1,60\n" + "5 - Pepperoni – R$ 1,80\n"
							+ "6 - Salame – R$ 2,00",
					"MONTE SEU SANDUÍCHE", JOptionPane.QUESTION_MESSAGE, null, null, null);

			if (opcao == null)
				break;
			else
				escolha = Integer.parseInt((String) opcao);

			if (escolha == 1) {
				ingredientes[index] = "Mortadela";
				precos[index] = 0.50;
			} else if (escolha == 2) {
				ingredientes[index] = "Apresuntado";
				precos[index] = 1.00;
			} else if (escolha == 3) {
				ingredientes[index] = "Bacon";
				precos[index] = 1.30;
			} else if (escolha == 4) {
				ingredientes[index] = "Presunto";
				precos[index] = 1.60;
			} else if (escolha == 5) {
				ingredientes[index] = "Pepperoni";
				precos[index] = 1.80;
			} else if (escolha == 6) {
				ingredientes[index] = "Salame";
				precos[index] = 2.00;
			} else {
				System.err.println("INVÁLIDO");
				index--; // decrementa para incrementar na depois
			}
			index++;

		} while (isContinuar("CARNES"));

	}
        
        private void escolherVerduras(){
            do {

//                       Cebola – R$ 0,30
//                       Pimentão -  R$ 0,45
//                       Tomate – R$ 0,50

//			escolher();

			opcao = JOptionPane.showInputDialog(null,
					"ESCOLHA A VERDURA:\n" + "1 - Cebola – R$ 0,30\n" + "2 - Pimentão – R$ 0,45\n"
							+ "3 - Tomate – R$ 0,50",
					"MONTE SEU SANDUÍCHE", JOptionPane.QUESTION_MESSAGE, null, null, null);

			if (opcao == null)
				break;
			else
				escolha = Integer.parseInt((String) opcao);

			if (escolha == 1) {
				ingredientes[index] = "Cebola";
				precos[index] = 0.30;
			} else if (escolha == 2) {
				ingredientes[index] = "Pimentão";
				precos[index] = 0.45;
			} else if (escolha == 3) {
				ingredientes[index] = "Tomaate";
				precos[index] =  0.3;
			} else {
				System.err.println("INVÁLIDO");
				index--; // decrementa para incrementar na depois
			}
			index++;

		} while (isContinuar("VERDURAS"));
            
        }


    
}
