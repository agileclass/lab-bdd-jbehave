package br.pucpr.ma.lab;

public class Calculadora {
	
	private double memoria = 0.0;
	
	/**
	 * Limpa o valor da calculadora
	 */
	public void limpar(){
		memoria = 0.0;
	}
	
	/**
	 * Retorna o valor atual da calculadora
	 * @return
	 */
	public double resultado(){
		return memoria;
	}
	
	/**
	 * Adiciona a calculadora o número informado
	 * @param valor
	 */
	public void soma(double valor){
		memoria += valor;
	}

	/**
	 * Subtrai da calculadora o número informado
	 * @param valor
	 */
	public void subtracao(double valor){
		memoria -= valor;
	}

	/**
	 * Multiplica o valor da calculadora ao número informado
	 * @param valor
	 */
	public void multiplicao(double valor){
		memoria *= valor;
	}
	
	/**
	 * Divide o valor da calculadora ao número informado
	 * @param valor
	 */
	public void divisao(double valor){
		memoria /= valor;
	}
	
}
