package view;

import java.util.Scanner;

import model.Calcular;


public class Jogo {
	
	static Scanner ler = new Scanner(System.in);
	static int pontos = 0;
	static Calcular calc;

	public static void main(String[] args) {
		Jogo.jogar();

	}

	public static void jogar() {
		System.out.println("Informe em qual Nivel deseja jogar [1,2,3,4]:\n");
		int dificuldade = Jogo.ler.nextInt();

		Jogo.calc = new Calcular(dificuldade);
		System.out.println("Digite o resultado desta operação.");

		if (calc.getOperacao() == 1) {
			System.out.println(calc.getValor1() + " + " + calc.getValor2());
			int resposta = Jogo.ler.nextInt();

			if (calc.somar(resposta)) {
				Jogo.pontos += 1;

				System.out.println("Você tem " + Jogo.pontos + " ponto(s).");
			}
		}

		else if (calc.getOperacao() == 2) {
			System.out.println(calc.getValor1() + " - " + calc.getValor2());
			int resposta = Jogo.ler.nextInt();

			if (calc.subtrair(resposta)) {
				Jogo.pontos += 1;

				System.out.println("Você tem " + Jogo.pontos + " ponto(s).");
			}
		}

		else if (calc.getOperacao() == 3) {
			System.out.println(calc.getValor1() + " X " + calc.getValor2());
			int resposta = Jogo.ler.nextInt();

			if (calc.multiplicar(resposta)) {
				Jogo.pontos += 1;

				System.out.println("Você tem " + Jogo.pontos + " ponto(s).");
			}
		}

		else if (calc.getOperacao() == 4) {
			System.out.println(calc.getValor1() + " / " + calc.getValor2());
			int resposta = Jogo.ler.nextInt();

			if (calc.dividir(resposta)) {
				Jogo.pontos += 1;

				System.out.println("Você tem " + Jogo.pontos + " ponto(s).");
			}
		} else {
			System.out.println("Operação " + calc.getOperacao() + " Não existe!");
		}

		System.out.println("Deseja continuar Jogando? [1 - Sim, 0 - Não]");
		int continuar = Jogo.ler.nextInt();

		if (continuar == 1) {
			Jogo.jogar();
		} else {
			System.out.println("Você possui " + Jogo.pontos + " ponto(s) acumulados.");
			System.out.println("Obrigado por se divertir conosco!");
			System.exit(0);
		}
	}

}
