
public class PilhaDuplaPrincipal {

	public static void main(String[] args) {

		//Testando as funcionalidades da pilha estática dupla
		
		EmpilhavelDupla pilha = new PilhaEstaticaDupla(5);
		
		pilha.empilharComum("Luiz");		
		pilha.empilharComum("Gustavo");
		pilha.empilharComum("Virgens");
		pilha.empilharInvertida("Matos");
		pilha.empilharInvertida(":)");
		pilha.empilharComum("excedente"); //tentando empilhar objeto além do tamanho do Array, deverá retornar "Pilha Cheia"
		
		
		System.out.println(pilha.imprimirComum()); //Testando método imprimir comum
		System.out.println(pilha.imprimirInvertida()); //Testando método imprimir invertida
		
		pilha.desempilharInvertida();
		String teste = (String) pilha.desempilharInvertida(); //Testando método desempilhar invertida e seu retorno de objeto, deverá retornar "Matos"
		
		System.out.println(pilha.imprimirInvertida()); //Imprimindo após desempilhar duas vezes a invertida
		System.out.println("dado desempilhado que foi armazenado: " + teste);
		
		pilha.desempilharComum();
		pilha.desempilharComum();
		pilha.desempilharComum();
		pilha.desempilharComum(); //Tentando desempilhar com a pilha vazia, deverá retornar "Pilha Vazia!"

	}

}
