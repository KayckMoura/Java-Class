package Heranca;

import java.util.Date;

public class Escola {
public static void main(String[] args) {
	
	Aluno k = new Aluno("Kayck Gabriel", "700.698.744.57", new Date());
	
	System.out.println("Veja como os atributos foram preenchidos\n\nNome: " + k.nome);
	
	System.out.println("CPF: " + k.cpf);
	System.out.println("Data de nascimento: " + k.data_nascimento.toString());
}
}
