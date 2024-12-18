package Acabou;

public class Triatleta implements Ciclista,Nadador,Corredor{
	String nome;
	int idade;
	boolean estado;
	
	@Override
	public void correr() {
		
		if (estado == true) {
			System.out.printf("%s está aquecido e pode correr \n", this.nome);
		}
		else {
			System.out.printf("%s não está aquecido,então não pode correr \n", this.nome);
		}
	}
	@Override
	public void nadar() {
		
		if (estado == true) {
			System.out.printf("%s está aquecido e pode nadar \n", this.nome);
		}
		else {
			System.out.printf("%s não está aquecido,então não pode nadar \n", this.nome);
		}
	}
	@Override
	public void pedalar() {
		
		if (estado == true) {
			System.out.printf("%s está aquecido, então pode pedalar \n", this.nome);
		}
		else {
			System.out.printf("%s não está aquecido,então não pode pedalar \n", this.nome);
		}
	}
	@Override
	public void aquecer() {
		
		if (estado == true) {
			System.out.printf("%s já está aquecido \n", this.nome);
		}
		else {
			System.out.printf("%s não está aquecido \n", this.nome);
			estado = true;
		}			
	}
}
