package ExerciciosClasseObjeto;

public class TestaEletronico {
/*3) Crie uma classe produto eletr�nico e apresente os atributos e m�todos
referentes esta classe, em seguida crie um objeto produto eletr�nico,
defina as instancias deste objeto e apresente as informa��es deste objeto
no console.*/
	public static void main(String[] args) {
		
		ClasseEletronico notebook = new ClasseEletronico();
		
		
		notebook.marca = "Asus";
		notebook.modelo = "A5FFL";
		notebook.cor = "Preto fosco";
		notebook.polegadas = "13'";
		notebook.placaGrafica = "Nvidia GT 950M";
		notebook.processador = "Intel i5 2.2";
		notebook.armazenamento = 1;
		notebook.ram = 6;
		
		notebook.sistema();
		
		System.out.println("� um notebook: "+notebook.marca);
		System.out.println("Modelo: "+notebook.modelo);
		System.out.println("Cor: "+notebook.cor);
		System.out.println(notebook.polegadas+ " de tela");
		System.out.println("Armazenamento de: "+notebook.armazenamento+"TeraByts");
		System.out.println("Placa Gr�fica: " + notebook.placaGrafica);
		System.out.println("RAM: "+notebook.ram);
				notebook.desliga();

	}

}
