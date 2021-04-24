package com.cremazer.practice.multiplication.domain;

/**
 * 애플리케이션에서 곱셈을 나타내는 클래스
 * @author cremazer
 * @since 2021.04.15
 */
public class Multiplication {

	private int factorA;
	private int factorB;
	
	private int result;
	
	public Multiplication(int factorA, int factorB) {
		this.factorA = factorA;
		this.factorB = factorB;
		this.result = factorA * factorB;
	}

	public int getFactorA() {
		return factorA;
	}

	public int getFactorB() {
		return factorB;
	}

	public int getResult() {
		return result;
	}
	
	@Override
	public String toString() {
		return "Multiplication{" +
				"factorA=" + factorA + 
				", factorB=" + factorB + 
				", result(A*B)=" + result +
				"}";
	}
	
}
