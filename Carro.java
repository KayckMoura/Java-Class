package Heranca;

public class Carro extends Veiculo {
	
 public String cilindradas;
private String ano;

	public Carro(String _cor, String _ano, String _modelo) {
		super(_cor, _ano, _modelo);
		this.cor = _cor;
		this.ano = _ano;
		this.modelo = _modelo;

	}

	public String motorizada;
	
}