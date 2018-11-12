package control;

public class Faixa {
	public int idade;
	public double imcMax;
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
		System.out.println("max: " + imcMax + ", imc: " + imc + ", idade: " + this.idade+ ", imc: " + idade + " doubleCompare: " + Double.compare(imc, imcMax) + " result: " + imcResultado);
		//Double.compare:
		// -1 = imc < imcMax
		//  0 = imc == imcMax
		//  1 = imc > imcMax
		return Double.compare(imc, imcMax) == -1 && (this.idade == 0 || this.idade == idade);
	}

	public String getImcResultado() {
		return imcResultado;
	}
}
