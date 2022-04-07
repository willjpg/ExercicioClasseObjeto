package ExerciciosClasseObjeto;

public class TestaCliente {
	/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

	public static void main(String[] args) {
		
		ClasseCliente cliente01 = new ClasseCliente();
		
		
		cliente01.nome = "Willian";
		cliente01.CPF = "123.456.789-12";
		cliente01.idade = 23;
		cliente01.dinheiro = 200;
		
		cliente01.comprando(150);
		System.out.println("Nome do cliente: "+cliente01.nome);
		System.out.println("Identificação do cliente: "+cliente01.CPF);
		System.out.println("Idade do cliente: "+cliente01.idade);
		System.out.println("O cliente ficou com: "+cliente01.dinheiro);
		
		
	}

}
