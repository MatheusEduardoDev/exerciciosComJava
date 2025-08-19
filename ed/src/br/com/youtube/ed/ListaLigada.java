package br.com.youtube.ed;

public class ListaLigada <TIPO>{

	private Elemento <TIPO> primeiro;
	private Elemento <TIPO> ultimo;
	private int tamanho;

	public ListaLigada() {
		this.tamanho = 0;

	}

	public Elemento <TIPO> getPrimeiro() {
		return primeiro;
	}

	public void setPrimeiro(Elemento <TIPO> primeiro) {
		this.primeiro = primeiro;
	}

	public Elemento <TIPO> getUltimo() {
		return ultimo;
	}

	public void setUltimo(Elemento <TIPO> ultimo) {
		this.ultimo = ultimo;
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public void adicionar(TIPO novoValor) {
		Elemento <TIPO>novoElmento = new Elemento <TIPO>(novoValor);
		if (this.primeiro == null && this.ultimo == null) {
			this.primeiro = novoElmento;
			this.ultimo = novoElmento;
		} else {
			this.ultimo.setProximo(novoElmento);
			this.ultimo = novoElmento;

		}
		this.tamanho++;

	}

	public void remover(TIPO valorProcurado) {
		Elemento <TIPO> anterior = null;
		Elemento <TIPO> atual = this.primeiro;
		for (int i = 0; i < this.tamanho; i++) {
			if (atual.getValor().equals(valorProcurado)) {
				if (this.tamanho == 1) {
					this.primeiro = null;
					this.ultimo = null;
					
				}
				if (atual == primeiro) {
					this.primeiro = atual.getProximo();
					atual.setProximo(null);
				} else if (atual == ultimo) {
                          this.ultimo = anterior;
                          anterior.setProximo(null);
				} else {
					anterior.setProximo(atual.getProximo());
					atual = null;
				}
				this.tamanho--;
				break;
			}
			anterior = atual;
			atual = atual.getProximo();

		}

	}

	public Elemento get(int posiçao) {
		Elemento atual = this.primeiro;
		for (int i = 0; i < posiçao; i++) {
			if (atual.getProximo() != null) {
				atual = atual.getProximo();
			}

		}

		return atual;
	}

	public IteratorListaLigada<TIPO> getIterator(){
		return new IteratorListaLigada<TIPO>(this.primeiro);
	}
}
