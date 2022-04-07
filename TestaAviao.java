package ExerciciosClasseObjeto;

public class TestaAviao {
	/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

	public static void main(String[] args) {
		
		ClasseAviao aviao = new ClasseAviao();
		
		
		aviao.marca = "Airbus";
		aviao.modelo = "Boeing 747";
		aviao.peso = "295 000 kg";
		aviao.velocidade = 0;
		aviao.anoFabricacao = 2000;
		
		aviao.embarque();
		aviao.acelerar(800);
		System.out.println("É um avião da: "+aviao.marca);
		System.out.println("Modelo: "+aviao.modelo);
		System.out.println("Foi fabricado em: "+aviao.anoFabricacao);
		System.out.println("Pesa: "+aviao.peso);
		System.out.println("E sua velocidade está em: "+aviao.velocidade+"Km/h.");
		
	}
	
}
