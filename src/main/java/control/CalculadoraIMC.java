package control;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
				.addFaixa(Byte.MAX_VALUE, IMC.OBESIDADE_GRAU_III)); // Byte.MAX_VALUE para considerar um valor "alto"
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
		//CONFIGURACAO PARA CRIANÇAS/ADOLESCENTES MENINAS
		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 2, 18)
				.addFaixa(2, 14.8, IMC.BAIXO_PESO)
				.addFaixa(2, 18.0, IMC.PESO_NORMAL)
				.addFaixa(2, 19.1, IMC.SOBREPESO)
				.addFaixa(2, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(4, 14.1, IMC.BAIXO_PESO)
				.addFaixa(4, 16.8, IMC.PESO_NORMAL)
				.addFaixa(4, 18.05, IMC.SOBREPESO)
				.addFaixa(4, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(6, 13.7, IMC.BAIXO_PESO)
				.addFaixa(6, 17.1, IMC.PESO_NORMAL)
				.addFaixa(6, 18.7, IMC.SOBREPESO)
				.addFaixa(6, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(8, 14.0, IMC.BAIXO_PESO)
				.addFaixa(8, 18.2, IMC.PESO_NORMAL)
				.addFaixa(8, 20.6, IMC.SOBREPESO)
				.addFaixa(8, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(10, 14.6, IMC.BAIXO_PESO)
				.addFaixa(10, 20.0, IMC.PESO_NORMAL)
				.addFaixa(10, 23.0, IMC.SOBREPESO)
				.addFaixa(10, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(12, 15.4, IMC.BAIXO_PESO)
				.addFaixa(12, 21.7, IMC.PESO_NORMAL)
				.addFaixa(12, 25.1, IMC.SOBREPESO)
				.addFaixa(12, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(14, 16.4, IMC.BAIXO_PESO)
				.addFaixa(14, 23.3, IMC.PESO_NORMAL)
				.addFaixa(14, 27.2, IMC.SOBREPESO)
				.addFaixa(14, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(16, 15.4, IMC.BAIXO_PESO)
				.addFaixa(16, 24.6, IMC.PESO_NORMAL)
				.addFaixa(16, 28.8, IMC.SOBREPESO)
				.addFaixa(16, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(18, 18.2, IMC.BAIXO_PESO)
				.addFaixa(18, 25.6, IMC.PESO_NORMAL)
				.addFaixa(18, 30.2, IMC.SOBREPESO)
				.addFaixa(18, Byte.MAX_VALUE, IMC.OBESIDADE));
		//CONFIGURACAO PARA CRIANÇAS/ADOLESCENTES MENINOS
		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 2, 18)
				.addFaixa(2, 15.1, IMC.BAIXO_PESO)
				.addFaixa(2, 18.2, IMC.PESO_NORMAL)
				.addFaixa(2, 19.2, IMC.SOBREPESO)
				.addFaixa(2, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(4, 14.4, IMC.BAIXO_PESO)
				.addFaixa(4, 16.9, IMC.PESO_NORMAL)
				.addFaixa(4, 17.8, IMC.SOBREPESO)
				.addFaixa(4, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(6, 14.0, IMC.BAIXO_PESO)
				.addFaixa(6, 17.0, IMC.PESO_NORMAL)
				.addFaixa(6, 18.3, IMC.SOBREPESO)
				.addFaixa(6, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(8, 14.2, IMC.BAIXO_PESO)
				.addFaixa(8, 17.8, IMC.PESO_NORMAL)
				.addFaixa(8, 20.0, IMC.SOBREPESO)
				.addFaixa(8, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(10, 14.6, IMC.BAIXO_PESO)
				.addFaixa(10, 19.3, IMC.PESO_NORMAL)
				.addFaixa(10, 22.0, IMC.SOBREPESO)
				.addFaixa(10, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(12, 15.5, IMC.BAIXO_PESO)
				.addFaixa(12, 21.0, IMC.PESO_NORMAL)
				.addFaixa(12, 24.0, IMC.SOBREPESO)
				.addFaixa(12, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(14, 16.5, IMC.BAIXO_PESO)
				.addFaixa(14, 22.6, IMC.PESO_NORMAL)
				.addFaixa(14, 26.0, IMC.SOBREPESO)
				.addFaixa(14, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(16, 17.7, IMC.BAIXO_PESO)
				.addFaixa(16, 24.2, IMC.PESO_NORMAL)
				.addFaixa(16, 27.4, IMC.SOBREPESO)
				.addFaixa(16, Byte.MAX_VALUE, IMC.OBESIDADE)

				.addFaixa(18, 18.8, IMC.BAIXO_PESO)
				.addFaixa(18, 25.6, IMC.PESO_NORMAL)
				.addFaixa(18, 28.8, IMC.SOBREPESO)
				.addFaixa(18, Byte.MAX_VALUE, IMC.OBESIDADE));
	}

	public String calcularIMC(double altura, double peso, String sexo, int idade) {
		return this.calcularIMC(peso / (altura * altura), sexo, idade);
	}

	public String calcularIMC(double imc, String sexo, int idade) {
		Optional<ConfiguracaoFaixa> faixaConfig = this.getConfiguracaoFaixaByIdadeESexo(idade, sexo);
		return faixaConfig.map(cf -> cf.getImc(imc, idade)).orElse("OPÇÕES INVÁLIDAS");
	}

	private Optional<ConfiguracaoFaixa> getConfiguracaoFaixaByIdadeESexo(int idade, String sexo) {
		char s = sexo.toUpperCase().charAt(0);
		return this.configuracoesFaixa.stream().filter(cf -> cf.match(idade, s)).findFirst();
	}
}
