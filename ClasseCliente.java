package ExerciciosClasseObjeto;

public class ClasseCliente {

	//Atributos --> caracteristicas -->
	String nome;
	String CPF;
	int idade;
	int dinheiro;
	
	//Métodos --> verbos --> ações
	void cadastro(){
		System.out.println("Fazendo cadastro...");
	}
	
	void comprando(int gastou) {
		dinheiro-=gastou;
	}
	
}
