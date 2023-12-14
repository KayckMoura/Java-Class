package Heranca;

public class Moto extends Veiculo {
	
 public String cilindradas;

	public Moto(String _cor, String _cilindradas, String _modelo) {
		super(_cor, _cilindradas, _modelo);
		this.cor = _cor;
		this.cilindradas = cilindradas;
		this.modelo = _modelo;
		
	}
	
	public String motorizada;
	
}