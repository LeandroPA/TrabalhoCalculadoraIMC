package control;

public class Faixa {
	private int idade;
	private double imcMax;
	private String imcResultado;

	public Faixa(double imcMax, String imcResultado) {
		this(0, imcMax, imcResultado);
	}
	public Faixa(int idade, double imcMax, String imcResultado) {
		this.idade = idade;
		this.imcMax = imcMax;
		this.imcResultado = imcResultado;
	}

	public boolean match(double imc, int idade) {
		return imc < imcMax && (this.idade == 0 || this.idade == idade);
	}

	public String getImcResultado() {
		return imcResultado;
	}
}
