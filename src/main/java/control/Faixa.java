package control;

/**
 * Classe Faixa que contém o IMC máximo que o resultado do IMC em questão se enquadra.
 * @author Leandro Pereira - 5404889
 */
public class Faixa {
	private double imcMax;
	private String imcResultado;

	public Faixa(double imcMax, String imcResultado) {
		this.imcMax = imcMax;
		this.imcResultado = imcResultado;
	}

	public boolean match(double imc) {
		return imc < imcMax;
	}

	public double getImcMax() {
		return imcMax;
	}

	public String getImcResultado() {
		return imcResultado;
	}
}
