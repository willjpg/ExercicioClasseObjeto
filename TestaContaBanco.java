package ExerciciosClasseObjeto;
/*6) Crie uma classe conta bancaria e apresente os atributos e métodos
referentes esta classe, em seguida crie um objeto conta bancaria, defina
as instancias deste objeto e apresente as informações deste objeto no
console.*/
public class TestaContaBanco {

	public static void main(String[] args) {
		
		ClasseContaBanco cliente = new ClasseContaBanco();
		
		cliente.apelido = "Will";
		cliente.nome = "Willian Ferdinando da Silveira";
		cliente.CPF = "123.456.789-12";
		cliente.idade = 21;
		cliente.dinheiro = 2000;
		cliente.numeroConta = 3168469;
		cliente.pin = 258;
		
		
		
		System.out.println("Digite o número da conta: "+cliente.numeroConta);
		System.out.println("Digite o pin: "+cliente.pin);
		System.out.println();
		cliente.conta();
		System.out.println("Nome do cliente: "+cliente.nome);
		System.out.println("Identificação do cliente: "+cliente.CPF);
		System.out.println("Idade do cliente: "+cliente.idade);
		System.out.println("O cliente tem: "+cliente.dinheiro+"R$");
		
		System.out.println();
		cliente.corrente(50, 200);
		System.out.println("O cliente tem: "+cliente.dinheiro+"R$");
		
		

	}

}
