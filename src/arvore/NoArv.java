package arvore;

import dados.Item;

public class NoArv {

	private Item info;
	private NoArv esq, dir;

	public NoArv(Item elem) {
		this.info = elem;
		this.esq = null;
		this.dir = null;
	}

	public Item getInfo() {
		return info;
	}

	public void setInfo(Item elem) {
		this.info = elem;
	}

	public NoArv getEsq() {
		return esq;
	}

	public void setEsq(NoArv novoNo) {
		this.esq = novoNo;
	}

	public NoArv getDir() {
		return dir;
	}

	public void setDir(NoArv novoNo) {
		this.dir = novoNo;
	}
	
	

}
