package entities;

public class ConversorDeMoeda {

	public static double IOF = 0.06;
	
	public static double dolarParaReal(double dolar, double reais) {
		return dolar * reais * (1.0 + IOF);
	}
	
}
