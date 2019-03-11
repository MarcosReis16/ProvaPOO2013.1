
public class Localidade {
	
	private String nome;
	private RegiaoInfluencia[] regioesinfluencia = new RegiaoInfluencia[0];
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setRegioesInfluencia(RegiaoInfluencia[] regioesinfluencia){
		this.regioesinfluencia = regioesinfluencia;
	}
	
	public RegiaoInfluencia[] getRegioesInfluencia() {
		return this.regioesinfluencia;
	}
	
	public boolean isIgual(Localidade localidade) {
		return this.getNome().equals(localidade.getNome());
	}

	public boolean verificaLocalidadeemRegiao(RegiaoInfluencia regiao) {
		if(this.getNome() == regiao.getLocalidade().nome)
			return true;
		return false;
	}
	
	public RegiaoInfluencia[] addRegiaoInfluencia(RegiaoInfluencia regiaoinfluencia) {
		if(verificaLocalidadeemRegiao(regiaoinfluencia))
			return this.getRegioesInfluencia();
		RegiaoInfluencia[] novo = new RegiaoInfluencia[this.getRegioesInfluencia().length+1];
		for(int i = 0;i<this.getRegioesInfluencia().length;i++) {
			novo[i] = this.regioesinfluencia[i];
		}
		novo[this.getRegioesInfluencia().length] = regiaoinfluencia;
		
		return novo;
	}
	
	public double getInfluenciaLocalidade(Localidade localidade) {
		for(RegiaoInfluencia regiao : this.getRegioesInfluencia()) 
			if(regiao.verificaRegiaoLocalidade(localidade))
				return regiao.getInfluencia();
		return 0;
	}
	
	

}
