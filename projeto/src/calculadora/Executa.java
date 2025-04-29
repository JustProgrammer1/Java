package calculadora;

import javax.swing.JOptionPane;

public class Executa {

	public static void main(String[] args) {
		// Instanciar Calculadora
		Calculadora calculador = new Calculadora();
		int s = 0;
		double n1 = 0;
		double n2 = 0;
		double resultado = 0;
		do {

			// criar menu para as opções 0-4
			s = Integer.parseInt(JOptionPane
					.showInputDialog("0-sair\n" + "1-Somar\n" + "2-Subtrair\n" + "3-Multiplicar\n" + "4-Dividir"));

			// Solicitar as duas entradas
			if (s != 0) {
				n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite um número: "));
				n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite um outro número: "));
			}

			// de acordo com a opçao, efetuar o calculo(loop)

			switch (s) {
			case 0:
				JOptionPane.showMessageDialog(null, "Obrigado por utilizar nossa calculadora!");
				break;
			case 1:
				resultado = calculador.somar(n1, n2);
				JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
				break;
			case 2:
				resultado = calculador.subtrair(n1, n2);
				JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
				break;
			case 3:
				resultado = calculador.multiplicar(n1, n2);
				JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
				break;
			case 4:
				resultado = calculador.dividir(n1, n2);
				JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
				;
				break;
			}
		} while (s != 0);
	}
}
