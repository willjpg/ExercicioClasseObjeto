package ExerciciosClasseObjeto;

public class ClasseAviao {

	//Atributos --> caracteristicas -->
	String marca;
	String peso;
	String modelo;
	
	int anoFabricacao;
	int velocidade;
	
	//Métodos --> verbos --> ações
	void embarque(){
		System.out.println("Embarcando...");
	
	}
	void acelerar(int aceleracao) {
		velocidade+=aceleracao;

	}
}
