
public class Pegador extends Luchador {
		
	public Pegador(String nombre,String nacionalidad,int edad) {
		this.nombre = nombre;
		this.nacionalidad = nacionalidad;
		this.edad = edad;
		this.vida = 50;
		this.ataque = (int)(25+Math.random()*25);
			
	}

	@Override
	public String toString() {
		return "Pegador [nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", edad=" + edad + ", vida=" + vida
				+ ", ataque=" + ataque + "]";
	}
	
}
