package control;

import java.util.ArrayList;
import java.util.List;

public class ConfiguracaoFaixa {
	private List<Faixa> faixas = new ArrayList<>();
	private char sexo;
	private int idadeMin;
	private int idadeMax;

	public ConfiguracaoFaixa(char sexo, int idadeMin, int idadeMax) {
		this.sexo = sexo;
		this.idadeMin = idadeMin;
		this.idadeMax = idadeMax;
	}

	public ConfiguracaoFaixa addFaixa(double imcMax, String imcResultado) {
		return addFaixa(new Faixa(imcMax, imcResultado));
	}

	public ConfiguracaoFaixa addFaixa(int idade, double imcMax, String imcResultado) {
		return addFaixa(new Faixa(idade, imcMax, imcResultado));
	}

	public ConfiguracaoFaixa addFaixa(Faixa faixa) {
		faixas.add(faixa);
		return this;
	}

	public boolean match(int idade, char sexo) {
		return (this.sexo == 'A' || sexo == this.sexo) && idade >= idadeMin && idade <= idadeMax;
	}

	public String getImc(double imc, int idade) {
		return faixas.stream()
				.filter(f -> f.match(imc, idade))
				.map(Faixa::getImcResultado)
				.findFirst().orElse(IMC.DESCONHECIDO);
	}
}
