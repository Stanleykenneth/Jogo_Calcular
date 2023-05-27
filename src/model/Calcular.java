package model;

import java.util.Random;

public class Calcular {
	

	private int dificuldade;
	private int valor1;
	private int valor2;
	private int operacao = 1;
	private int resultado;

	public Calcular(int dificuldade) {

		Random aleatorio = new Random();
		this.operacao = aleatorio.nextInt(4);
		this.dificuldade = dificuldade;

		if (dificuldade == 1) {
			// fácil
			this.valor1 = aleatorio.nextInt(10);
			this.valor2 = aleatorio.nextInt(10);

		} else if (dificuldade == 2) {
			// médio
			this.valor1 = aleatorio.nextInt(100);
			this.valor2 = aleatorio.nextInt(100);

		} else if (dificuldade == 3) {
			// difícil
			this.valor1 = aleatorio.nextInt(1000);
			this.valor2 = aleatorio.nextInt(1000);
		} else if (dificuldade == 4) {
			// dificilimo
			this.valor1 = aleatorio.nextInt(10000);
			this.valor2 = aleatorio.nextInt(10000);
		} else {
			// mega difícil
			this.valor1 = aleatorio.nextInt(100000);
			this.valor2 = aleatorio.nextInt(100000);
		}

	}

	public int getDificuldade() {
		return dificuldade;
	}

	public int getValor1() {
		return valor1;
	}

	public int getValor2() {
		return valor2;
	}

	public int getOperacao() {
		return operacao;
	}

	public int getResultado() {
		return resultado;
	}

	public String toString() {
		String op;
		if (this.getOperacao() == 1) {
			op = "Somar";

		} else if (this.getOperacao() == 2) {
			op = "Subtrair";

		} else if (this.getOperacao() == 3) {
			op = "Multiplicar";

		} else if (this.getOperacao() == 4) {
			op = "Dividir";

		} else {
			op = " Não exite esse tipo de opração no programa.";
		}

		return " Valor 1: " + this.getValor1() + "\nValor 2: " + this.getValor2() + "\nDificuldade: "
				+ this.getDificuldade() + "\nOperação: " + op;
	}

	public boolean somar(int resposta) {
		this.resultado = this.getValor1() + this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta Correta!");
			certo = true;
		} else {
			System.out.println("Resposta Errada!");
		}
		System.out.println(this.getValor1() + " + " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}

	public boolean subtrair(int resposta) {
		this.resultado = this.getValor1() - this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta Correta!");
			certo = true;
		} else {
			System.out.println("Resposta Errada!");
		}
		System.out.println(this.getValor1() + " - " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}

	public boolean multiplicar(int resposta) {
		this.resultado = this.getValor1() * this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta Correta!");
			certo = true;
		} else {
			System.out.println("Resposta Errada!");
		}
		System.out.println(this.getValor1() + " * " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}

	public boolean dividir(int resposta) {
		this.resultado = this.getValor1() + this.getValor2();
		boolean certo = false;

		if (resposta == this.getResultado()) {
			System.out.println("Resposta Correta!");
			certo = true;
		} else {
			System.out.println("Resposta Errada!");
		}
		System.out.println(this.getValor1() + " / " + this.getValor2() + " = " + this.getResultado());
		return certo;
	}
}
