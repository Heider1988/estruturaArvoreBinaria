package arvore;

public class Arvore {

	private NoArv raiz;
	private int quantNos;

	public Arvore() {
		this.raiz = null;
		this.quantNos = 0;
	}

	public NoArv getRaiz() {
		return raiz;
	}

	public int getQuantNos() {
		return quantNos;
	}

	// eVazia
	public boolean eVazia() {
		return (this.raiz == null);
	}

}
