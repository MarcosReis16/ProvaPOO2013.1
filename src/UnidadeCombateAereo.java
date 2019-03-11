
public class UnidadeCombateAereo extends UnidadeCombate {

	private int caças;
	
	public void setQtdCaças(int caças) {
		this.caças = caças;
	}
	
	public int getQtdCaças() {
		return this.caças;
	}
	
	@Override
	public int calculaPotenciaAbsoluta() {
		return this.getQtdMilitares() + 10*this.getQtdCaças();
	}
}
