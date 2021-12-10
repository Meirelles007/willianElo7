package controller;

import javax.swing.JOptionPane;

public class Controller {
	int posicaoy = 0;
	int posicaox = 4;

	public void mostar(String[][] plano) {
		String matriz = "";
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				matriz += (plano[i][j]) + " ";

			}
			matriz += "\n";
		}
		JOptionPane.showMessageDialog(null, matriz);
	}

	public String moverDireita(String sentido) {
		if (sentido == "W") {
			sentido = "N";
		} else if (sentido == "N") {
			sentido = "E";
		} else if (sentido == "E") {
			sentido = "S";
		} else if (sentido == "S") {
			sentido = "W";
		}
		return sentido;
	}

	public String moverEsquerda(String sentido) {
		if (sentido == "W") {
			sentido = "S";
		} else if (sentido == "S") {
			sentido = "E";
		} else if (sentido == "E") {
			sentido = "N";
		} else if (sentido == "N") {
			sentido = "W";
		}
		return sentido;
	}

	public String[][] mover(String sentido, String[][] plano) {
		if (sentido == "W") {
			plano[posicaoy][posicaox] = "Espaço";
			posicaox--;

			if (plano[posicaoy][posicaox].contains("Marte")) {
				JOptionPane.showMessageDialog(null, "Você Chegou em marte");
				System.exit(0);
			} else {
				plano[posicaoy][posicaox] = "Nave";
				return plano;
			}

		} else if (sentido == "S") {
			plano[posicaoy][posicaox] = "Espaço";
			posicaoy++;
			if (plano[posicaoy][posicaox].contains("Marte")) {
				JOptionPane.showMessageDialog(null, "Você Chegou em marte");
				System.exit(0);
			} else {
				plano[posicaoy][posicaox] = "Nave";
				return plano;
			}
		} else if (sentido == "E") {
			plano[posicaoy][posicaox] = "Espaço";
			posicaox++;

			if (plano[posicaoy][posicaox].contains("Marte")) {
				JOptionPane.showMessageDialog(null, "Você Chegou em marte");
				System.exit(0);
			} else {
				plano[posicaoy][posicaox] = "Nave";
				return plano;
			}
		} else if (sentido == "N") {
			plano[posicaoy][posicaox] = "Espaço";
			posicaoy--;

			if (plano[posicaoy][posicaox].contains("Marte")) {
				JOptionPane.showMessageDialog(null, "Você Chegou em marte");
				System.exit(0);
			} else {
				plano[posicaoy][posicaox] = "Nave";
				return plano;
			}
		}
		return plano;
	}

}
