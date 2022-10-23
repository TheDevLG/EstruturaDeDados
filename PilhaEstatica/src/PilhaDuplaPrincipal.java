
public class PilhaDuplaPrincipal {

	public static void main(String[] args) {

		//Testando as funcionalidades da pilha est�tica dupla
		
		EmpilhavelDupla pilha = new PilhaEstaticaDupla(5);
		
		pilha.empilharComum("Luiz");		
		pilha.empilharComum("Gustavo");
		pilha.empilharComum("Virgens");
		pilha.empilharInvertida("Matos");
		pilha.empilharInvertida(":)");
		pilha.empilharComum("excedente"); //tentando empilhar objeto al�m do tamanho do Array, dever� retornar "Pilha Cheia"
		
		
		System.out.println(pilha.imprimirComum()); //Testando m�todo imprimir comum
		System.out.println(pilha.imprimirInvertida()); //Testando m�todo imprimir invertida
		
		pilha.desempilharInvertida();
		String teste = (String) pilha.desempilharInvertida(); //Testando m�todo desempilhar invertida e seu retorno de objeto, dever� retornar "Matos"
		
		System.out.println(pilha.imprimirInvertida()); //Imprimindo ap�s desempilhar duas vezes a invertida
		System.out.println("dado desempilhado que foi armazenado: " + teste);
		
		pilha.desempilharComum();
		pilha.desempilharComum();
		pilha.desempilharComum();
		pilha.desempilharComum(); //Tentando desempilhar com a pilha vazia, dever� retornar "Pilha Vazia!"

	}

}
