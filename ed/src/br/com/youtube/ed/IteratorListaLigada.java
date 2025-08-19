package br.com.youtube.ed;

public class IteratorListaLigada<TIPO> {
	
	public IteratorListaLigada(Elemento<TIPO> atual) {
		this.elemento = atual;
		
	}

	private Elemento<TIPO> elemento;
	
	public boolean temProximo() {
		if (elemento.getProximo() == null) {
			return false;
		}else {
			return true;
		}
	}
	
	public Elemento <TIPO> getProximo(){
	    elemento = elemento.getProximo();
		return elemento;
	}
	
}
