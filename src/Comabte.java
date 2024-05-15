import java.util.ArrayList;

public class Comabte {
	private String empresa;
	private ArrayList<Luchador>luchadoresCombate;
	private int premio;
	
	public Comabte(String empresa, ArrayList<Luchador> luchadoresCombate) {
		super();
		this.empresa = empresa;
		this.luchadoresCombate = luchadoresCombate;
		this.premio =1000*(int)(Math.random()*10);
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public ArrayList<Luchador> getLuchadoresCombate() {
		return luchadoresCombate;
	}

	public void setLuchadoresCombate(ArrayList<Luchador> luchadoresCombate) {
		this.luchadoresCombate = luchadoresCombate;
	}

	public int getPremio() {
		return premio;
	}

	public void setPremio(int premio) {
		this.premio = premio;
	}

	@Override
	public String toString() {
		return "Comabte [empresa=" + empresa + ", luchadoresCombate=" + luchadoresCombate + ", premio=" + premio + "]";
	}
	
}
