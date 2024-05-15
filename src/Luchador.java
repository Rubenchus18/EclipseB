
public abstract class Luchador {
			
	protected String nombre,nacionalidad;
	protected int edad,vida,ataque;
	
	public String getNombrem() {
		return nombre;
	}
	public void setNombrem(String nombrem) {
		this.nombre = nombrem;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getVida() {
		return vida;
	}
	public void setVida(int vida) {
		this.vida = vida;
	}
	public int getAtaque() {
		return ataque;
	}
	public void setAtaque(int ataque) {
		this.ataque = ataque;
	}
	@Override
	public String toString() {
		return "Luchador [nombrem=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", vida=" + vida
				+ ", ataque=" + ataque + "]";
	}
	
	
}
