
public class PilhaEstaticaInvertida implements Empilhavel{

	private int PonteiroTopo;
	private Object[] dados;
	private int tamanho;
	
	public PilhaEstaticaInvertida() {
		this(10);
	}

	public PilhaEstaticaInvertida(int tamanho) {
		this.tamanho = tamanho;
		PonteiroTopo = tamanho;
		dados = new Object[tamanho];
	}

	public void empilhar (Object elemento) {
		if(!EstaCheia()) {
			PonteiroTopo--;
			dados[PonteiroTopo] = elemento;
		} else System.out.println("Pilha Cheia!");
	}

	public Object desempilhar() {
		Object ElementoTopo = null;

		if(!EstaVazia()) {
			ElementoTopo = dados[PonteiroTopo];
			PonteiroTopo++;

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
		return (PonteiroTopo == 0);
	}

	public boolean EstaVazia(){
		return (PonteiroTopo == tamanho);
	}

	public String imprimir() {
		String resultado = "[ ";
		for (int i = tamanho -1; i >= PonteiroTopo; i--) {
			resultado += dados[i] + " ";
		}
		return resultado + "]";
	}








}
