
public class PilhaPrincipal {

	public static void main(String[] args) {
		
		//Testando as funcionalidades da pilha estática
		
		Empilhavel pilha = new PilhaEstatica(5);
		
		pilha.empilhar("Luiz");		
		pilha.empilhar("Gustavo");
		pilha.empilhar("Virgens");
		pilha.empilhar("Matos");
		pilha.empilhar(":)");
		pilha.empilhar("excedente"); //tentando empilhar objeto além do tamanho do Array, deverá retornar "Pilha Cheia"
		
		
		System.out.println(pilha.imprimir()); //Testando método imprimir
		
		pilha.desempilhar();
		String teste = (String) pilha.desempilhar(); //Testando método desempilhar e seu retorno de objeto, deverá retornar "Matos"
		
		System.out.println(pilha.imprimir()); //Imprimindo após desempilhar duas vezes
		System.out.println("dado desempilhado que foi armazenado: " + teste);
		
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.desempilhar(); //Tentando desempilhar com a pilha vazia, deverá retornar "Pilha Vazia!"
		
	}

}
