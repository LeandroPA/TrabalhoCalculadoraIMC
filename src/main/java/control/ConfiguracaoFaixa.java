package control;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe responsável para agrupar uma configuração de faixas IMC por sexo e idade minima e máxima
 * @author Leandro Pereira - 5404889
 */
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

	public List<Faixa> getFaixas() {
		return faixas;
	}

	public char getSexo() {
		return sexo;
	}

	public int getIdadeMin() {
		return idadeMin;
	}

	public int getIdadeMax() {
		return idadeMax;
	}

	public ConfiguracaoFaixa addFaixa(double imcMax, String imcResultado) {
		faixas.add(new Faixa(imcMax, imcResultado));
		return this;
	}

	public boolean match(int idade, char sexo) {
		return (this.sexo == 'A' || sexo == this.sexo) && idade >= idadeMin && idade <= idadeMax;
	}

	public String getImc(double imc) {
		//Filtra todos as Faixas de acordo com o range do IMC
		//Mapeia apenas para pegar a string do metodo getImcResultado
		//Retorna o primeiro resultado, caso nenhuma, uma mensagem de "Desconhecido"
		return faixas.stream()
				.filter(f -> f.match(imc))
				.map(Faixa::getImcResultado)
				.findFirst().orElse(IMC.DESCONHECIDO);
	}
}
