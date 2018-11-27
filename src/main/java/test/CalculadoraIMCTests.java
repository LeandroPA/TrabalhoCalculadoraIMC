package test;

import control.CalculadoraIMC;
import control.IMC;
import org.junit.Assert;
import org.junit.Test;

/**
 * Classe de testes utilizando todas as combinações, com valores minimos, máximos, abaixo e acima do mínimo e máximo
 * para idades e IMC (altura e peso gerados aleatoriamente para combinar com o IMC desejado)
 * @author Leandro Pereira - 5404889
 */
public class CalculadoraIMCTests {

	private CalculadoraIMC imc = new CalculadoraIMC();

	@Test
	public void testAdultoBaixoPesoMuitoGraveIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.63, 42.36, "M", 19), IMC.BAIXO_PESO_MUITO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoMuitoGraveIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.63, 42.36, "M", 20), IMC.BAIXO_PESO_MUITO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoMuitoGraveIdadeMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.63, 42.36, "M", 65), IMC.BAIXO_PESO_MUITO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoMuitoGraveIdadeAbaixaDaMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.63, 42.36, "M", 64), IMC.BAIXO_PESO_MUITO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoMuitoGraveIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.63, 42.31, "M", 19), IMC.BAIXO_PESO_MUITO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoMuitoGraveIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.63, 42.31, "M", 20), IMC.BAIXO_PESO_MUITO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoMuitoGraveIdadeMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.63, 42.31, "M", 65), IMC.BAIXO_PESO_MUITO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoMuitoGraveIdadeAbaixaDaMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.63, 42.31, "M", 64), IMC.BAIXO_PESO_MUITO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 39.49, "M", 19), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 39.49, "M", 20), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 39.49, "M", 65), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeAbaixaDaMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 39.49, "M", 64), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 39.59, "M", 19), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 39.59, "M", 20), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 39.59, "M", 65), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeAbaixaDaMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 39.59, "M", 64), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 41.75, "M", 19), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 41.75, "M", 20), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 41.75, "M", 65), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeAbaixaDaMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 41.75, "M", 64), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 41.70, "M", 19), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 41.70, "M", 20), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 41.70, "M", 65), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoGraveIdadeAbaixaDaMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.57, 41.70, "M", 64), IMC.BAIXO_PESO_GRAVE);
	}

	@Test
	public void testAdultoBaixoPesoIdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 39.33, "M", 19), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 39.33, "M", 20), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 39.33, "M", 65), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeAbaixaDaMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 39.33, "M", 64), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 39.43, "M", 19), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 39.43, "M", 20), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 39.43, "M", 65), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeAbaixaDaMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 39.43, "M", 64), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 42.59, "M", 19), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 42.59, "M", 20), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 42.59, "M", 65), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeAbaixaDaMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 42.59, "M", 64), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 42.54, "M", 19), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 42.54, "M", 20), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 42.54, "M", 65), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoBaixoPesoIdadeAbaixaDaMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 42.54, "M", 64), IMC.BAIXO_PESO);
	}

	@Test
	public void testAdultoPesoNormalIdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 47.41, "M", 19), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 47.41, "M", 20), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 47.41, "M", 65), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeAbaixaDaMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 47.41, "M", 64), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 47.51, "M", 19), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 47.51, "M", 20), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 47.51, "M", 65), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeAbaixaDaMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 47.51, "M", 64), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 63.85, "M", 19), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 63.85, "M", 20), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 63.85, "M", 65), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeAbaixaDaMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 63.85, "M", 64), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 63.80, "M", 19), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 63.80, "M", 20), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 63.80, "M", 65), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoPesoNormalIdadeAbaixaDaMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 63.80, "M", 64), IMC.PESO_NORMAL);
	}

	@Test
	public void testAdultoSobrepesoIdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 76.61, "M", 19), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 76.61, "M", 20), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 76.61, "M", 65), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeAbaixaDaMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 76.61, "M", 64), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 76.71, "M", 19), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 76.71, "M", 20), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 76.71, "M", 65), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeAbaixaDaMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 76.71, "M", 64), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 91.72, "M", 19), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 91.72, "M", 20), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 91.72, "M", 65), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeAbaixaDaMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 91.72, "M", 64), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 91.68, "M", 19), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 91.68, "M", 20), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 91.68, "M", 65), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoSobrepesoIdadeAbaixaDaMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.75, 91.68, "M", 64), IMC.SOBREPESO);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 87.77, "M", 19), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 87.77, "M", 20), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 87.77, "M", 65), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeAbaixaDaMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 87.77, "M", 64), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 87.87, "M", 19), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 87.87, "M", 20), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 87.87, "M", 65), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeAbaixaDaMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 87.87, "M", 64), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 102.19, "M", 19), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 102.19, "M", 20), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 102.19, "M", 65), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeAbaixaDaMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 102.19, "M", 64), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 102.14, "M", 19), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 102.14, "M", 20), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 102.14, "M", 65), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau1IdadeAbaixaDaMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.71, 102.14, "M", 64), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 66.70, "M", 19), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 66.70, "M", 20), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 66.70, "M", 65), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeAbaixaDaMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 66.70, "M", 64), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 66.80, "M", 19), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 66.80, "M", 20), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 66.80, "M", 65), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeAbaixaDaMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 66.80, "M", 64), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 76.03, "M", 19), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 76.03, "M", 20), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 76.03, "M", 65), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeAbaixaDaMaximaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 76.03, "M", 64), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 75.98, "M", 19), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 75.98, "M", 20), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 75.98, "M", 65), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau2IdadeAbaixaDaMaximaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 75.98, "M", 64), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testAdultoObesidadeGrau3IdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.77, 125.37, "M", 19), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testAdultoObesidadeGrau3IdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.77, 125.37, "M", 20), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testAdultoObesidadeGrau3IdadeMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.77, 125.37, "M", 65), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testAdultoObesidadeGrau3IdadeAbaixaDaMaximaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.77, 125.37, "M", 64), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testAdultoObesidadeGrau3IdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.77, 125.47, "M", 19), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testAdultoObesidadeGrau3IdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.77, 125.47, "M", 20), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testAdultoObesidadeGrau3IdadeMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.77, 125.47, "M", 65), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testAdultoObesidadeGrau3IdadeAbaixaDaMaximaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.77, 125.47, "M", 64), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testIdosoFemininoBaixoPesoIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 56.88, "F", 66), IMC.BAIXO_PESO);
	}

	@Test
	public void testIdosoFemininoBaixoPesoIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 56.88, "F", 67), IMC.BAIXO_PESO);
	}

	@Test
	public void testIdosoFemininoBaixoPesoIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 56.83, "F", 66), IMC.BAIXO_PESO);
	}

	@Test
	public void testIdosoFemininoBaixoPesoIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 56.83, "F", 67), IMC.BAIXO_PESO);
	}

	@Test
	public void testIdosoFemininoPesoNormalIdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 43.79, "F", 66), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoFemininoPesoNormalIdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 43.79, "F", 67), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoFemininoPesoNormalIdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 43.89, "F", 66), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoFemininoPesoNormalIdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 43.89, "F", 67), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoFemininoPesoNormalIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 53.73, "F", 66), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoFemininoPesoNormalIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 53.73, "F", 67), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoFemininoPesoNormalIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 53.68, "F", 66), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoFemininoPesoNormalIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 53.68, "F", 67), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoFemininoSobrepesoIdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 72.94, "F", 66), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoFemininoSobrepesoIdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 72.94, "F", 67), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoFemininoSobrepesoIdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 73.04, "F", 66), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoFemininoSobrepesoIdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 73.04, "F", 67), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoFemininoSobrepesoIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 86.19, "F", 66), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoFemininoSobrepesoIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 86.19, "F", 67), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoFemininoSobrepesoIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 86.14, "F", 66), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoFemininoSobrepesoIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 86.14, "F", 67), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau1IdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.49, 71.32, "F", 66), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau1IdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.49, 71.32, "F", 67), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau1IdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.49, 71.42, "F", 66), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau1IdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.49, 71.42, "F", 67), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau1IdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.49, 82.22, "F", 66), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau1IdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.49, 82.22, "F", 67), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau1IdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.49, 82.17, "F", 66), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau1IdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.49, 82.17, "F", 67), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau2IdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.80, 120.25, "F", 66), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau2IdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.80, 120.25, "F", 67), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau2IdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.80, 120.35, "F", 66), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau2IdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.80, 120.35, "F", 67), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau2IdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.80, 135.93, "F", 66), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau2IdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.80, 135.93, "F", 67), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau2IdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.80, 135.88, "F", 66), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau2IdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.80, 135.88, "F", 67), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau3IdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.62, 110.27, "F", 66), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau3IdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.62, 110.27, "F", 67), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau3IdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.62, 110.37, "F", 66), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testIdosoFemininoObesidadeGrau3IdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.62, 110.37, "F", 67), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testIdosoMasculinoBaixoPesoIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.51, 50.01, "M", 66), IMC.BAIXO_PESO);
	}

	@Test
	public void testIdosoMasculinoBaixoPesoIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.51, 50.01, "M", 67), IMC.BAIXO_PESO);
	}

	@Test
	public void testIdosoMasculinoBaixoPesoIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.51, 49.96, "M", 66), IMC.BAIXO_PESO);
	}

	@Test
	public void testIdosoMasculinoBaixoPesoIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.51, 49.96, "M", 67), IMC.BAIXO_PESO);
	}

	@Test
	public void testIdosoMasculinoPesoNormalIdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 65.89, "M", 66), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoMasculinoPesoNormalIdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 65.89, "M", 67), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoMasculinoPesoNormalIdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 65.99, "M", 66), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoMasculinoPesoNormalIdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 65.99, "M", 67), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoMasculinoPesoNormalIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 80.96, "M", 66), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoMasculinoPesoNormalIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 80.96, "M", 67), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoMasculinoPesoNormalIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 80.91, "M", 66), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoMasculinoPesoNormalIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 80.91, "M", 67), IMC.PESO_NORMAL);
	}

	@Test
	public void testIdosoMasculinoSobrepesoIdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 82.10, "M", 66), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoMasculinoSobrepesoIdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 82.10, "M", 67), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoMasculinoSobrepesoIdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 82.20, "M", 66), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoMasculinoSobrepesoIdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 82.20, "M", 67), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoMasculinoSobrepesoIdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 90.98, "M", 66), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoMasculinoSobrepesoIdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 90.98, "M", 67), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoMasculinoSobrepesoIdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 90.93, "M", 66), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoMasculinoSobrepesoIdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 90.93, "M", 67), IMC.SOBREPESO);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau1IdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.27, 48.60, "M", 66), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau1IdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.27, 48.60, "M", 67), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau1IdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.27, 48.70, "M", 66), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau1IdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.27, 48.70, "M", 67), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau1IdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.27, 56.46, "M", 66), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau1IdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.27, 56.46, "M", 67), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau1IdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.27, 56.41, "M", 66), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau1IdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.27, 56.41, "M", 67), IMC.OBESIDADE_GRAU_I);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau2IdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 122.79, "M", 66), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau2IdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 122.79, "M", 67), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau2IdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 122.89, "M", 66), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau2IdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 122.89, "M", 67), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau2IdadeMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 139.73, "M", 66), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau2IdadeAcimaDaMinimaIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 139.73, "M", 67), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau2IdadeMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 139.68, "M", 66), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau2IdadeAcimaDaMinimaIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 139.68, "M", 67), IMC.OBESIDADE_GRAU_II);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau3IdadeMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.85, 136.95, "M", 66), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau3IdadeAcimaDaMinimaIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.85, 136.95, "M", 67), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau3IdadeMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.85, 137.05, "M", 66), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testIdosoMasculinoObesidadeGrau3IdadeAcimaDaMinimaIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.85, 137.05, "M", 67), IMC.OBESIDADE_GRAU_III);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso2AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 29.27, "F", 2), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso2AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 29.22, "F", 2), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal2AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.39, 28.65, "F", 2), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal2AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.39, 28.75, "F", 2), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal2AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.39, 34.63, "F", 2), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal2AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.39, 34.58, "F", 2), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso2AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.40, 35.33, "F", 2), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso2AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.40, 35.43, "F", 2), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso2AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.40, 37.29, "F", 2), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso2AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.40, 37.24, "F", 2), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade2AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.25, 29.89, "F", 2), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade2AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.25, 29.99, "F", 2), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso4AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.88, 49.69, "F", 4), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso4AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.88, 49.64, "F", 4), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal4AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.30, 23.88, "F", 4), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal4AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.30, 23.98, "F", 4), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal4AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.30, 28.24, "F", 4), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal4AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.30, 28.19, "F", 4), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso4AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.45, 35.37, "F", 4), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso4AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.45, 35.47, "F", 4), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso4AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.45, 37.80, "F", 4), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso4AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.45, 37.75, "F", 4), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade4AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.82, 59.84, "F", 4), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade4AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.82, 59.94, "F", 4), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso6AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.32, 23.72, "F", 6), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso6AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.32, 23.67, "F", 6), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal6AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.24, 21.12, "F", 6), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal6AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.24, 21.22, "F", 6), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal6AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.24, 26.14, "F", 6), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal6AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.24, 26.09, "F", 6), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso6AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 42.74, "F", 6), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso6AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 42.84, "F", 6), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso6AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 46.53, "F", 6), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso6AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 46.48, "F", 6), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade6AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.29, 31.17, "F", 6), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade6AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.29, 31.27, "F", 6), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso8AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.44, 28.88, "F", 8), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso8AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.44, 28.83, "F", 8), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal8AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.84, 47.45, "F", 8), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal8AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.84, 47.55, "F", 8), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal8AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.84, 61.47, "F", 8), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal8AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.84, 61.42, "F", 8), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso8AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.29, 30.34, "F", 8), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso8AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.29, 30.44, "F", 8), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso8AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.29, 34.13, "F", 8), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso8AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.29, 34.08, "F", 8), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade8AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.70, 59.58, "F", 8), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade8AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.70, 59.68, "F", 8), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso10AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.86, 50.36, "F", 10), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso10AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.86, 50.31, "F", 10), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal10AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.39, 28.26, "F", 10), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal10AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.39, 28.36, "F", 10), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal10AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.39, 38.49, "F", 10), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal10AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.39, 38.44, "F", 10), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso10AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 55.16, "F", 10), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso10AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 55.26, "F", 10), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso10AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 63.23, "F", 10), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso10AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 63.18, "F", 10), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade10AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 68.89, "F", 10), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade10AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.73, 68.99, "F", 10), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso12AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.78, 48.64, "F", 12), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso12AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.78, 48.59, "F", 12), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal12AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 28.12, "F", 12), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal12AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 28.22, "F", 12), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal12AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 39.40, "F", 12), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal12AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 39.35, "F", 12), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso12AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.28, 35.60, "F", 12), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso12AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.28, 35.70, "F", 12), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso12AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.28, 40.97, "F", 12), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso12AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.28, 40.92, "F", 12), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade12AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 65.11, "F", 12), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade12AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 65.21, "F", 12), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso14AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 49.50, "F", 14), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso14AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.74, 49.45, "F", 14), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal14AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.62, 43.09, "F", 14), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal14AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.62, 43.19, "F", 14), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal14AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.62, 61.00, "F", 14), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal14AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.62, 60.95, "F", 14), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso14AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.33, 41.27, "F", 14), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso14AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.33, 41.37, "F", 14), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso14AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.33, 47.96, "F", 14), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso14AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.33, 47.91, "F", 14), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade14AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.36, 50.36, "F", 14), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade14AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.36, 50.46, "F", 14), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso16AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 39.27, "F", 16), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso16AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 39.22, "F", 16), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal16AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.59, 38.98, "F", 16), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal16AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.59, 39.08, "F", 16), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal16AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.59, 62.04, "F", 16), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal16AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.59, 61.99, "F", 16), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso16AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.83, 82.43, "F", 16), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso16AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.83, 82.53, "F", 16), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso16AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.83, 96.30, "F", 16), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso16AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.83, 96.25, "F", 16), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade16AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.26, 45.77, "F", 16), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade16AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.26, 45.87, "F", 16), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso18AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.44, 37.59, "F", 18), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoBaixoPeso18AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.44, 37.54, "F", 18), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal18AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.47, 39.38, "F", 18), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal18AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.47, 39.48, "F", 18), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal18AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.47, 55.17, "F", 18), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoPesoNormal18AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.47, 55.12, "F", 18), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso18AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.48, 56.12, "F", 18), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso18AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.48, 56.22, "F", 18), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso18AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.48, 66.00, "F", 18), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoSobrepeso18AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.48, 65.95, "F", 18), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade18AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.67, 84.27, "F", 18), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteFemininoObesidade18AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.67, 84.37, "F", 18), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso2AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 28.61, "M", 2), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso2AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.38, 28.56, "M", 2), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal2AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 41.66, "M", 2), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal2AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 41.76, "M", 2), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal2AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 50.00, "M", 2), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal2AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 49.95, "M", 2), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso2AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 63.69, "M", 2), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso2AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 63.79, "M", 2), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso2AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 66.99, "M", 2), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso2AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.87, 66.94, "M", 2), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade2AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 28.63, "M", 2), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade2AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 28.73, "M", 2), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso4AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 35.80, "M", 4), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso4AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 35.75, "M", 4), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal4AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 38.78, "M", 4), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal4AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 38.88, "M", 4), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal4AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 45.30, "M", 4), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal4AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 45.25, "M", 4), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso4AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 46.62, "M", 4), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso4AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 46.72, "M", 4), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso4AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 48.90, "M", 4), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso4AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 48.85, "M", 4), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade4AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 32.49, "M", 4), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade4AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 32.59, "M", 4), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso6AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.50, 31.35, "M", 6), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso6AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.50, 31.30, "M", 6), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal6AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 20.89, "M", 6), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal6AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 20.99, "M", 6), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal6AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 25.15, "M", 6), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal6AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 25.10, "M", 6), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso6AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.30, 28.78, "M", 6), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso6AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.30, 28.88, "M", 6), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso6AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.30, 30.78, "M", 6), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso6AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.30, 30.73, "M", 6), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade6AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.33, 32.42, "M", 6), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade6AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.33, 32.52, "M", 6), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso8AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.24, 21.68, "M", 8), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso8AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.24, 21.63, "M", 8), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal8AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.83, 47.60, "M", 8), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal8AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.83, 47.70, "M", 8), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal8AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.83, 59.46, "M", 8), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal8AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.83, 59.41, "M", 8), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso8AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.88, 62.96, "M", 8), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso8AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.88, 63.06, "M", 8), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso8AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.88, 70.54, "M", 8), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso8AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.88, 70.49, "M", 8), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade8AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 53.84, "M", 8), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade8AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.64, 53.94, "M", 8), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso10AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 33.58, "M", 10), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso10AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.52, 33.53, "M", 10), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal10AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.69, 41.75, "M", 10), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal10AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.69, 41.85, "M", 10), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal10AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.69, 54.97, "M", 10), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal10AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.69, 54.92, "M", 10), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso10AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 49.46, "M", 10), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso10AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 49.56, "M", 10), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso10AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 56.17, "M", 10), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso10AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.60, 56.12, "M", 10), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade10AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 32.79, "M", 10), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade10AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 32.89, "M", 10), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso12AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.42, 31.10, "M", 12), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso12AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.42, 31.05, "M", 12), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal12AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.42, 31.30, "M", 12), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal12AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.42, 31.40, "M", 12), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal12AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.42, 42.19, "M", 12), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal12AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.42, 42.14, "M", 12), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso12AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.44, 43.60, "M", 12), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso12AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.44, 43.70, "M", 12), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso12AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.44, 49.62, "M", 12), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso12AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.44, 49.57, "M", 12), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade12AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.84, 81.30, "M", 12), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade12AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.84, 81.40, "M", 12), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso14AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 24.41, "M", 14), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso14AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.22, 24.36, "M", 14), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal14AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 30.12, "M", 14), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal14AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 30.22, "M", 14), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal14AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 41.04, "M", 14), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal14AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.35, 40.99, "M", 14), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso14AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 44.98, "M", 14), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso14AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 45.08, "M", 14), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso14AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 51.54, "M", 14), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso14AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.41, 51.49, "M", 14), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade14AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.33, 46.04, "M", 14), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade14AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.33, 46.14, "M", 14), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso16AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 45.73, "M", 16), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso16AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 45.68, "M", 16), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal16AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 44.24, "M", 16), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal16AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 44.34, "M", 16), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal16AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 60.26, "M", 16), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal16AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.58, 60.21, "M", 16), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso16AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.34, 43.50, "M", 16), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso16AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.34, 43.60, "M", 16), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso16AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.34, 49.05, "M", 16), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso16AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.34, 49.00, "M", 16), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade16AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.51, 62.52, "M", 16), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade16AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.51, 62.62, "M", 16), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso18AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.88, 66.30, "M", 18), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoBaixoPeso18AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.88, 66.25, "M", 18), IMC.BAIXO_PESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal18AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.82, 62.32, "M", 18), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal18AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.82, 62.42, "M", 18), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal18AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.82, 84.65, "M", 18), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoPesoNormal18AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.82, 84.60, "M", 18), IMC.PESO_NORMAL);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso18AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 66.41, "M", 18), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso18AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 66.51, "M", 18), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso18AnosIMCMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 74.50, "M", 18), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoSobrepeso18AnosIMCAbaixoDoMaximo() {
		Assert.assertEquals(imc.calcularIMC(1.61, 74.45, "M", 18), IMC.SOBREPESO);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade18AnosIMCMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 79.41, "M", 18), IMC.OBESIDADE);
	}

	@Test
	public void testCriancaAdolescenteMasculinoObesidade18AnosIMCAcimaDoMinimo() {
		Assert.assertEquals(imc.calcularIMC(1.66, 79.51, "M", 18), IMC.OBESIDADE);
	}
}
