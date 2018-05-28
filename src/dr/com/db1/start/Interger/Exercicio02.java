package dr.com.db1.start.Interger;

public class Exercicio02 {
	private Double primeiroValor = 0d;
	private Double segundoValor = 0d;

	public Double getPrimeiroValor() {
		return primeiroValor;
	}

	public void setPrimeiroValor(Double primeiroValor) {
		this.primeiroValor = primeiroValor;
	}

	public Double getSegundoValor() {
		return segundoValor;
	}

	public void setSegundoValor(Double segundoValor) {
		this.segundoValor = segundoValor;
	}

	public Double subtrair() {
		return segundoValor - primeiroValor;
	}

}
