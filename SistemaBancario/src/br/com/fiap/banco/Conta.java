package br.com.fiap.banco;

import java.io.Serializable;

/**
 * Classe que abstrai uma Conta Bancária
 * @author Nicole Bidigaray
 * @version 1.0
 */

public class Conta implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int agencia;
	private int numero;
	private double saldo;
	
	/**
	 * Padrão Conta (vazio)
	 */
	
	public Conta() {
		
	}
	
	/**
	 * 
	 * @param agencia do banco
	 * @param numero da conta
	 * @param saldo da conta
	 */
	public Conta(int agencia, int numero, double saldo) {
		this.agencia = agencia;
		this.numero = numero;
		this.saldo = saldo;
	}
	
	
	
	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * Depositar da classe Conta
	 * Acrescenta valor ao Saldo da Conta
	 * @param valor a ser depositado
	 */
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	/**
	 * Retira um valor ao Saldo da Conta
	 * @param valor do Saldo da Conta
	 * @see depositar
	 */
	
	public void retirar(double valor){
		this.saldo -= valor;
	}
	
	/**
	 * Verifica o Saldo da Conta
	 * @return Valor do Saldo da Conta
	 */
	
	public double getSaldo(){
		return saldo;
	}
	
	
}
