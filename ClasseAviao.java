package ExerciciosClasseObjeto;

public class ClasseAviao {

	//Atributos --> caracteristicas -->
	String marca;
	String peso;
	String modelo;
	
	int anoFabricacao;
	int velocidade;
	
	//M�todos --> verbos --> a��es
	void embarque(){
		System.out.println("Embarcando...");
	
	}
	void acelerar(int aceleracao) {
		velocidade+=aceleracao;

	}
}
