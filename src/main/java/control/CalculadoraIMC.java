//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

package control;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

public class CalculadoraIMC {
	public List<ConfiguracaoFaixa> configuracoesFaixa = new ArrayList();

	public CalculadoraIMC() {
		configuracoesFaixa.add(new ConfiguracaoFaixa('A', 19, 65)
				.addFaixa(16.0D, IMC.BAIXO_PESO_MUITO_GRAVE)
				.addFaixa(17.0D, IMC.BAIXO_PESO_GRAVE)
				.addFaixa(18.5D, IMC.BAIXO_PESO)
				.addFaixa(25.0D, IMC.PESO_NORMAL)
				.addFaixa(30.0D, IMC.SOBREPESO)
				.addFaixa(35.0D, IMC.OBESIDADE_GRAU_I)
				.addFaixa(40.0D, IMC.OBESIDADE_GRAU_II)
				.addFaixa(127.0D, IMC.OBESIDADE_GRAU_III));

		configuracoesFaixa.add(new ConfiguracaoFaixa('F', 66, 200)
				.addFaixa(22.0D, IMC.BAIXO_PESO)
				.addFaixa(27.1D, IMC.PESO_NORMAL)
				.addFaixa(32.1D, IMC.SOBREPESO)
				.addFaixa(37.1D, IMC.OBESIDADE_GRAU_I)
				.addFaixa(42.0D, IMC.OBESIDADE_GRAU_II)
				.addFaixa(127.0D, IMC.OBESIDADE_GRAU_III));

		configuracoesFaixa.add(new ConfiguracaoFaixa('M', 66, 200)
				.addFaixa(22.0D, IMC.BAIXO_PESO)
				.addFaixa(27.1D, IMC.PESO_NORMAL)
				.addFaixa(30.1D, IMC.SOBREPESO)
				.addFaixa(35.1D, IMC.OBESIDADE_GRAU_I)
				.addFaixa(40.0D, IMC.OBESIDADE_GRAU_II)
				.addFaixa(127.0D, IMC.OBESIDADE_GRAU_III));

		configuracoesFaixa.add(
				new ConfiguracaoFaixa('F', 2, 18)
				.addFaixa(2, 14.8D, IMC.BAIXO_PESO)
						.addFaixa(2, 18.0D, IMC.PESO_NORMAL)
						.addFaixa(2, 19.1D, IMC.SOBREPESO)
						.addFaixa(2, 127.0D, IMC.OBESIDADE)
						.addFaixa(4, 14.1D, IMC.BAIXO_PESO)
						.addFaixa(4, 16.8D, IMC.PESO_NORMAL).addFaixa(4, 18.05D, IMC.SOBREPESO).addFaixa(4, 127.0D, IMC.OBESIDADE).addFaixa(6, 13.7D, IMC.BAIXO_PESO).addFaixa(6, 17.1D, IMC.PESO_NORMAL).addFaixa(6, 18.7D, IMC.SOBREPESO).addFaixa(6, 127.0D, IMC.OBESIDADE).addFaixa(8, 14.0D, IMC.BAIXO_PESO).addFaixa(8, 18.2D, IMC.PESO_NORMAL).addFaixa(8, 20.6D, IMC.SOBREPESO).addFaixa(8, 127.0D, IMC.OBESIDADE).addFaixa(10, 14.6D, IMC.BAIXO_PESO).addFaixa(10, 20.0D, IMC.PESO_NORMAL).addFaixa(10, 23.0D, IMC.SOBREPESO).addFaixa(10, 127.0D, IMC.OBESIDADE).addFaixa(12, 15.4D, IMC.BAIXO_PESO).addFaixa(12, 21.7D, IMC.PESO_NORMAL).addFaixa(12, 25.1D, IMC.SOBREPESO).addFaixa(12, 127.0D, IMC.OBESIDADE).addFaixa(14, 16.4D, IMC.BAIXO_PESO).addFaixa(14, 23.3D, IMC.PESO_NORMAL).addFaixa(14, 27.2D, IMC.SOBREPESO).addFaixa(14, 127.0D, IMC.OBESIDADE).addFaixa(16, 15.4D, IMC.BAIXO_PESO).addFaixa(16, 24.6D, IMC.PESO_NORMAL).addFaixa(16, 28.8D, IMC.SOBREPESO).addFaixa(16, 127.0D, IMC.OBESIDADE).addFaixa(18, 18.2D, IMC.BAIXO_PESO).addFaixa(18, 25.6D, IMC.PESO_NORMAL).addFaixa(18, 30.2D, IMC.SOBREPESO).addFaixa(18, 127.0D, IMC.OBESIDADE));
		configuracoesFaixa.add((new ConfiguracaoFaixa('M', 2, 18)).addFaixa(2, 15.1D, IMC.BAIXO_PESO).addFaixa(2, 18.2D, IMC.PESO_NORMAL).addFaixa(2, 19.2D, IMC.SOBREPESO).addFaixa(2, 127.0D, IMC.OBESIDADE).addFaixa(4, 14.4D, IMC.BAIXO_PESO).addFaixa(4, 16.9D, IMC.PESO_NORMAL).addFaixa(4, 17.8D, IMC.SOBREPESO).addFaixa(4, 127.0D, IMC.OBESIDADE).addFaixa(6, 14.0D, IMC.BAIXO_PESO).addFaixa(6, 17.0D, IMC.PESO_NORMAL).addFaixa(6, 18.3D, IMC.SOBREPESO).addFaixa(6, 127.0D, IMC.OBESIDADE).addFaixa(8, 14.2D, IMC.BAIXO_PESO).addFaixa(8, 17.8D, IMC.PESO_NORMAL).addFaixa(8, 20.0D, IMC.SOBREPESO).addFaixa(8, 127.0D, IMC.OBESIDADE).addFaixa(10, 14.6D, IMC.BAIXO_PESO).addFaixa(10, 19.3D, IMC.PESO_NORMAL).addFaixa(10, 22.0D, IMC.SOBREPESO).addFaixa(10, 127.0D, IMC.OBESIDADE).addFaixa(12, 15.5D, IMC.BAIXO_PESO).addFaixa(12, 21.0D, IMC.PESO_NORMAL).addFaixa(12, 24.0D, IMC.SOBREPESO).addFaixa(12, 127.0D, IMC.OBESIDADE).addFaixa(14, 16.5D, IMC.BAIXO_PESO).addFaixa(14, 22.6D, IMC.PESO_NORMAL).addFaixa(14, 26.0D, IMC.SOBREPESO).addFaixa(14, 127.0D, IMC.OBESIDADE).addFaixa(16, 17.7D, IMC.BAIXO_PESO).addFaixa(16, 24.2D, IMC.PESO_NORMAL).addFaixa(16, 27.4D, IMC.SOBREPESO).addFaixa(16, 127.0D, IMC.OBESIDADE).addFaixa(18, 18.8D, IMC.BAIXO_PESO).addFaixa(18, 25.6D, IMC.PESO_NORMAL).addFaixa(18, 28.8D, IMC.SOBREPESO).addFaixa(18, 127.0D, IMC.OBESIDADE));
	}

	public String calcularIMC(double altura, double peso, String sexo, int idade) {
		return this.calcularIMC(peso / (altura * altura), sexo, idade);
	}

	public String calcularIMC(double imc, String sexo, int idade) {
		System.out.println("IMC: " + BigDecimal.valueOf(imc).setScale(2, RoundingMode.HALF_EVEN) + " ");
		Optional<ConfiguracaoFaixa> faixaConfig = this.getConfiguracaoFaixaByIdadeESexo(idade, sexo);
		return (String)faixaConfig.map((cf) -> {
			return cf.getImc(imc, idade);
		}).orElse("OPÇÕES INVÁLIDAS");
	}

	private Optional<ConfiguracaoFaixa> getConfiguracaoFaixaByIdadeESexo(int idade, String sexo) {
		char s = sexo.toUpperCase().charAt(0);
		return this.configuracoesFaixa.stream().filter((cf) -> {
			return cf.match(idade, s);
		}).findFirst();
	}
}
