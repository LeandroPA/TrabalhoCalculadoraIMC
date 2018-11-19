package control;

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
