
public class Tecnico extends Luchador{
	private int defensa;
	public Tecnico(String nombre,String nacionalidad,int edad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.vida = 50;
		this.ataque = (int)(1+Math.random()*10);
		this.defensa=(int)(1+Math.random()*10);
	}
	public int getDefensa() {
		return defensa;
	}
	public void setDefensa(int defensa) {
		this.defensa = defensa;
	}
	@Override
	public String toString() {
		return "Tecnico [defensa=" + defensa + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad="
				+ edad + ", vida=" + vida + ", ataque=" + ataque + "]";
	}
	
	
}
