package entities; //pactoe da classe

public class Triangle { //nome da classe
	
	public double a; //atributos da classe
	public double b; //public pois indica que podemos utilizar ele em outros arquivos
	public double c;
	
	//criar uma função que calcula a área para mim
	public double area () { //tipo de dado que o método retorna void
		double p = (a + b + c) / 2.0;
		return Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}

}
