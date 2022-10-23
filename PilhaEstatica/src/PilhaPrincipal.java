
public class PilhaPrincipal {

	public static void main(String[] args) {
		
		//Testando as funcionalidades da pilha est�tica
		
		Empilhavel pilha = new PilhaEstatica(5);
		
		pilha.empilhar("Luiz");		
		pilha.empilhar("Gustavo");
		pilha.empilhar("Virgens");
		pilha.empilhar("Matos");
		pilha.empilhar(":)");
		pilha.empilhar("excedente"); //tentando empilhar objeto al�m do tamanho do Array, dever� retornar "Pilha Cheia"
		
		
		System.out.println(pilha.imprimir()); //Testando m�todo imprimir
		
		pilha.desempilhar();
		String teste = (String) pilha.desempilhar(); //Testando m�todo desempilhar e seu retorno de objeto, dever� retornar "Matos"
		
		System.out.println(pilha.imprimir()); //Imprimindo ap�s desempilhar duas vezes
		System.out.println("dado desempilhado que foi armazenado: " + teste);
		
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.desempilhar();
		pilha.desempilhar(); //Tentando desempilhar com a pilha vazia, dever� retornar "Pilha Vazia!"
		
	}

}
