
public class UnidadeCombateAereo extends UnidadeCombate {

	private int ca�as;
	
	public void setQtdCa�as(int ca�as) {
		this.ca�as = ca�as;
	}
	
	public int getQtdCa�as() {
		return this.ca�as;
	}
	
	@Override
	public int calculaPotenciaAbsoluta() {
		return this.getQtdMilitares() + 10*this.getQtdCa�as();
	}
}
