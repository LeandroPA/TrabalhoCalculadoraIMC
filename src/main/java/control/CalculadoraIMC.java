package control;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Classe principal, que carrega a configuração de Faixa
 * @author Leandro Pereira - 5404889
 */
public class CalculadoraIMC {
	private List<ConfiguracaoFaixa> configuracoesFaixa = new ArrayList<>();

	public CalculadoraIMC() {
		//CONFIGURACAO PARA ADULTOS
		// A = Ambos os sexos
		// Idade: de 19 aos 65 anos
		configuracoesFaixa.add(new ConfiguracaoFaixa('A', 19, 65)
				.addFaixa(16.0, IMC.BAIXO_PESO_MUITO_GRAVE)
				.addFaixa(17.0, IMC.BAIXO_PESO_GRAVE)
				.addFaixa(18.5, IMC.BAIXO_PESO)
				.addFaixa(25.0, IMC.PESO_NORMAL)
				.addFaixa(30.0, IMC.SOBREPESO)
				.addFaixa(35.0, IMC.OBESIDADE_GRAU_I)
				.addFaixa(40.0, IMC.OBESIDADE_GRAU_II)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE_GRAU_III)); // Byte.MAX_VALUE apenas para considerar um valor "infinito", ou longe de ser alcançado.
		//CONFIGURACAO PARA MULHERES IDOSAS
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 66, 200)
				.addFaixa(22.0, IMC.BAIXO_PESO)
				.addFaixa(27.1, IMC.PESO_NORMAL)
				.addFaixa(32.1, IMC.SOBREPESO)
				.addFaixa(37.1, IMC.OBESIDADE_GRAU_I)
				.addFaixa(42.0, IMC.OBESIDADE_GRAU_II)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE_GRAU_III));
		//CONFIGURACAO PARA HOMENS IDOSAS
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 66, 200)
				.addFaixa(22.0, IMC.BAIXO_PESO)
				.addFaixa(27.1, IMC.PESO_NORMAL)
				.addFaixa(30.1, IMC.SOBREPESO)
				.addFaixa(35.1, IMC.OBESIDADE_GRAU_I)
				.addFaixa(40.0, IMC.OBESIDADE_GRAU_II)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE_GRAU_III));
		//CONFIGURACAO PARA CRIANÇAS/ADOLESCENTES MENINAS, PARA CADA IDADES PARES
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 2, 2)
				.addFaixa(14.8, IMC.BAIXO_PESO)
				.addFaixa(18.0, IMC.PESO_NORMAL)
				.addFaixa(19.1, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 4, 4)
				.addFaixa(14.1, IMC.BAIXO_PESO)
				.addFaixa(16.8, IMC.PESO_NORMAL)
				.addFaixa(18.05, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 6, 6)
				.addFaixa(13.7, IMC.BAIXO_PESO)
				.addFaixa(17.1, IMC.PESO_NORMAL)
				.addFaixa(18.7, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 8, 8)
				.addFaixa(14.0, IMC.BAIXO_PESO)
				.addFaixa(18.2, IMC.PESO_NORMAL)
				.addFaixa(20.6, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 10, 10)
				.addFaixa(14.6, IMC.BAIXO_PESO)
				.addFaixa(20.0, IMC.PESO_NORMAL)
				.addFaixa(23.0, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 12, 12)
				.addFaixa(15.4, IMC.BAIXO_PESO)
				.addFaixa(21.7, IMC.PESO_NORMAL)
				.addFaixa(25.1, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 14, 14)
				.addFaixa(16.4, IMC.BAIXO_PESO)
				.addFaixa(23.3, IMC.PESO_NORMAL)
				.addFaixa(27.2, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 16, 16)
				.addFaixa(15.4, IMC.BAIXO_PESO)
				.addFaixa(24.6, IMC.PESO_NORMAL)
				.addFaixa(28.8, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 18, 18)
				.addFaixa(18.2, IMC.BAIXO_PESO)
				.addFaixa(25.6, IMC.PESO_NORMAL)
				.addFaixa(30.2, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));

		//CONFIGURACAO PARA CRIANÇAS/ADOLESCENTES MENINOS, PARA CADA IDADE PARES
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 2, 2)
				.addFaixa(15.1, IMC.BAIXO_PESO)
				.addFaixa(18.2, IMC.PESO_NORMAL)
				.addFaixa(19.2, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 4, 4)
				.addFaixa(14.4, IMC.BAIXO_PESO)
				.addFaixa(16.9, IMC.PESO_NORMAL)
				.addFaixa(17.8, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 6, 6)
				.addFaixa(14.0, IMC.BAIXO_PESO)
				.addFaixa(17.0, IMC.PESO_NORMAL)
				.addFaixa(18.3, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 8, 8)
				.addFaixa(14.2, IMC.BAIXO_PESO)
				.addFaixa(17.8, IMC.PESO_NORMAL)
				.addFaixa(20.0, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 10, 10)
				.addFaixa(14.6, IMC.BAIXO_PESO)
				.addFaixa(19.3, IMC.PESO_NORMAL)
				.addFaixa(22.0, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 12, 12)
				.addFaixa(15.5, IMC.BAIXO_PESO)
				.addFaixa(21.0, IMC.PESO_NORMAL)
				.addFaixa(24.0, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 14, 14)
				.addFaixa(16.5, IMC.BAIXO_PESO)
				.addFaixa(22.6, IMC.PESO_NORMAL)
				.addFaixa(26.0, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 16, 16)
				.addFaixa(17.7, IMC.BAIXO_PESO)
				.addFaixa(24.2, IMC.PESO_NORMAL)
				.addFaixa(27.4, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 18, 18)
				.addFaixa(18.8, IMC.BAIXO_PESO)
				.addFaixa(25.6, IMC.PESO_NORMAL)
				.addFaixa(28.8, IMC.SOBREPESO)
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE));
	}

	/**
	 * Calcula o resutado do IMC de acordo com a altura, peso, sexo e idade
	 * @param altura A altura da pessoa
	 * @param peso O pessoa da pessoa
	 * @param sexo O sexo
	 * @param idade A idade
	 * @return Retorna um
	 */
	public String calcularIMC(double altura, double peso, String sexo, int idade) {
		// Formula para calcular o IMC
		double imc = peso / (altura * altura);
		// Seleciona a configuração de faixas de acordo com a idade e sexo
		Optional<ConfiguracaoFaixa> faixaConfig = getConfiguracaoFaixaByIdadeESexo(idade, sexo);
		// Utiliza lambda para retornar o IMC correto ou uma mensagem de inválido
		return faixaConfig.map(cf -> cf.getImc(imc)).orElse(IMC.INVALIDO);
	}

	/**
	 * Retorna aconfiguração de faixas de acordo com a idade e sexo
	 * @param idade idade da pessoa
	 * @param sexo Sexo da pessoa, podendo ser "feminino", "masculino" ou "ambos", ou apenas a primeira letra de cada
	 * @return Retorna um Optional contendo ou não uma configuração que atenda as opções
	 */
	private Optional<ConfiguracaoFaixa> getConfiguracaoFaixaByIdadeESexo(int idade, String sexo) {
		//Pega somnete a primeira letra da frase
		char s = sexo != null ? sexo.toUpperCase().charAt(0) : 0;
		//Utiliza Stream para filtrar as configuraçoes que atendem as condicoes
		//E retorna o primeiro resultado somente.
		return configuracoesFaixa.stream().filter(cf -> cf.match(idade, s)).findFirst();
	}
}
