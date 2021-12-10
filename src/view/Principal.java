package view;

import javax.swing.JOptionPane;

import controller.Controller;

public class Principal {

	public static void main(String[] args) {

		Controller Cont = new Controller();

		String plano[][] = new String[5][5];
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				plano[i][j] = "Espaco";
			}
		}
		int martex = Integer.parseInt(JOptionPane.showInputDialog("Digite o eixo X de Marte"));
		int martey = Integer.parseInt(JOptionPane.showInputDialog("Digite o eixo Y de Marte"));

		plano[martey][martex] = "Marte";
		int posicaoy = 0;
		int posicaox = 4;
		plano[posicaoy][posicaox] = "Nave ";

		Cont.mostar(plano);

		
		String sentido = "W";

		while (true) {
			String movimentacao = JOptionPane.showInputDialog(" L virar a esquerda \nR virar a direita\nM mover ");
			if (movimentacao.contains("L")) {
				sentido = Cont.moverEsquerda(sentido);
				System.out.println(sentido);
			} else if (movimentacao.contains("R")) {
				sentido = Cont.moverDireita(sentido);
				System.out.println(sentido);
			} else if (movimentacao.contains("M")) {
				plano = Cont.mover(sentido, plano);
			}
			Cont.mostar(plano);
		}

	}

}