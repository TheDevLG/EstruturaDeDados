
public class PilhaEstatica implements Empilhavel{

	private int PonteiroTopo;
	private Object[] dados;
	private int tamanho;
	
	public PilhaEstatica() {
		this(10);
	}

	public PilhaEstatica(int tamanho) {
		this.tamanho = tamanho;
		PonteiroTopo = -1;
		dados = new Object[tamanho];
	}

	public void empilhar (Object elemento) {
		if(!EstaCheia()) {
			PonteiroTopo++;
			dados[PonteiroTopo] = elemento;
		} else System.out.println("Pilha Cheia!");
	}

	public Object desempilhar() {
		Object ElementoTopo = null;

		if(!EstaVazia()) {
			ElementoTopo = dados[PonteiroTopo];
			PonteiroTopo--;

		} else System.out.println("Pilha Vazia!");
		return ElementoTopo;
	}

	public Object topo() {
		Object ElementoTopo = null;

		if(!EstaVazia()) {
			ElementoTopo = dados[PonteiroTopo];
			
		} else System.out.println("Pilha Vazia!");
		return ElementoTopo;
	}

	public boolean EstaCheia() {
		return (PonteiroTopo == tamanho - 1);
	}

	public boolean EstaVazia(){
		return (PonteiroTopo == -1);
	}

	public String imprimir() {
		String resultado = "[ ";
		for (int i = 0; i <= PonteiroTopo; i++) {
			resultado += dados[i] + " ";
		}
		return resultado + "]";
	}








}
