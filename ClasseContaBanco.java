package ExerciciosClasseObjeto;

public class ClasseContaBanco {

	//Atributos --> caracteristicas -->
		String apelido;
		String CPF;
		String nome;
		int numeroConta;
		int pin;
		int idade;
		int dinheiro;
		
		//M�todos --> verbos --> a��es
		void conta(){
			System.out.println("Bem vindo "+apelido+"!");
		}
		
		void corrente(int deposita,int retira) {
			dinheiro+=deposita;
			dinheiro-= retira;
		}
		
	}