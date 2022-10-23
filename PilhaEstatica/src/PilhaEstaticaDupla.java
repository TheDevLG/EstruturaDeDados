
public class PilhaEstaticaDupla implements EmpilhavelDupla {

	private int PonteiroTopoComum;
	private int PonteiroTopoInvertida;
	private Object[] dados;
	private int tamanho;

	public PilhaEstaticaDupla() {
		this(10);
	}

	public PilhaEstaticaDupla(int tamanho) {
		this.tamanho = tamanho;
		PonteiroTopoComum = -1;
		PonteiroTopoInvertida = tamanho;
		dados = new Object[tamanho];
	}

	public void empilharComum (Object elemento) {
		if(!EstaCheiaComum()) {
			PonteiroTopoComum++;
			dados[PonteiroTopoComum] = elemento;
		} else System.out.println("Pilha Cheia!");
	}

	public Object desempilharComum() {
		Object ElementoTopo = null;

		if(!EstaVaziaComum()) {
			ElementoTopo = dados[PonteiroTopoComum];
			PonteiroTopoComum--;

		} else System.out.println("Pilha Vazia!");
		return ElementoTopo;
	}

	public Object topoComum() {
		Object ElementoTopo = null;

		if(!EstaVaziaComum()) {
			ElementoTopo = dados[PonteiroTopoComum];

		} else System.out.println("Pilha Vazia!");
		return ElementoTopo;
	}

	public boolean EstaCheiaComum() {
		return (PonteiroTopoComum == PonteiroTopoInvertida - 1);
	}

	public boolean EstaVaziaComum(){
		return (PonteiroTopoComum == -1);
	}

	public String imprimirComum() {
		String resultado = "[ ";
		for (int i = 0; i <= PonteiroTopoComum; i++) {
			resultado += dados[i] + " ";
		}
		return resultado + "]";
	}

	public void empilharInvertida (Object elemento) {
		if(!EstaCheiaInvertida()) {
			PonteiroTopoInvertida--;
			dados[PonteiroTopoInvertida] = elemento;
		} else System.out.println("Pilha Cheia!");
	}

	public Object desempilharInvertida() {
		Object ElementoTopo = null;

		if(!EstaVaziaInvertida()) {
			ElementoTopo = dados[PonteiroTopoInvertida];
			PonteiroTopoInvertida++;

		} else System.out.println("Pilha Vazia!");
		return ElementoTopo;
	}

	public Object topoInvertida() {
		Object ElementoTopo = null;

		if(!EstaVaziaInvertida()) {
			ElementoTopo = dados[PonteiroTopoInvertida];

		} else System.out.println("Pilha Vazia!");
		return ElementoTopo;
	}

	public boolean EstaCheiaInvertida() {
		return (EstaCheiaComum());
	}

	public boolean EstaVaziaInvertida(){
		return (PonteiroTopoInvertida == tamanho);
	}

	public String imprimirInvertida() {
		String resultado = "[ ";
		for (int i = tamanho -1; i >= PonteiroTopoInvertida; i--) {
			resultado += dados[i] + " ";
		}
		return resultado + "]";
	}

}
