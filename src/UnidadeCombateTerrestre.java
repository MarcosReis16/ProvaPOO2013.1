
public class UnidadeCombateTerrestre extends UnidadeCombate {
	
	private int tanques;
	private int blindados;
	
	public void setQtdTanques(int tanques) {
		this.tanques = tanques;
	}
	
	public int getQtdTanques() {
		return this.tanques;
	}
	
	public void setQtdBlindados(int blindados) {
		this.blindados = blindados;
	}
	
	public int getQtdBlindados() {
		return this.blindados;
	}
	
	@Override
	public int calculaPotenciaAbsoluta() {
		return this.getQtdMilitares() + 3*this.getQtdBlindados() + 5*this.getQtdTanques();
	}
	
	
}
