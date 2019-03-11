
public abstract class UnidadeCombate {
	
	protected int identificacao;
	protected int militares;
	protected Localidade localidadebaseada;
	
	public void setLocalidadeBaseada(Localidade localidade) {
		this.localidadebaseada = localidade;
	}
	
	public Localidade getLocalidadeBaseada() {
		return this.localidadebaseada;
	}
	
	public void setIdentificacao(int identificacao) {
		this.identificacao = identificacao;
	}
	
	public int getIdentificacao() {
		return this.identificacao;
	}
	
	public void setQtdMilitares(int militares) {
		this.militares = militares;
	}
	
	public int getQtdMilitares() {
		return this.militares;
	}
	
	public abstract int calculaPotenciaAbsoluta();
	
	public double calculaPotenciaRelativa(Localidade localidade) {
		return this.calculaPotenciaAbsoluta() * this.getLocalidadeBaseada().getInfluenciaLocalidade(localidade);
	}
	

}
