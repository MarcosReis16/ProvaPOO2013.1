
public class RegiaoInfluencia {
	
	private Localidade localidade;
	private double influencia;
	
	public Localidade getLocalidade() {
		return this.localidade;
	}
	
	public void setInfluencia(double influencia) {
		this.influencia = influencia;
	}
	
	public double getInfluencia() {
		return this.influencia;
	}
	
	public boolean verificaRegiaoLocalidade(Localidade localidade) {
		return this.getLocalidade().isIgual(localidade);
	}
	

}
