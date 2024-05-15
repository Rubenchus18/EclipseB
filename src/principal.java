import java.util.*;
public class principal {
	static Scanner sc= new Scanner(System.in);
	public static void main(String[]args) {
		ArrayList<String> empresas = new ArrayList<String>();
		ArrayList<Luchador>luchadores= new ArrayList<Luchador>();
		int opcion;
		boolean salir=true , salir2=true;
		rellenarPatrocinadores(empresas,luchadores);
		
		System.out.println("1.Imprimir Luchar");
		System.out.println("2.Modificar Luchar");
		System.out.println("3.Empezar combate");
		opcion=sc.nextInt();
		switch(opcion) {
		case 1:
			imprimir(luchadores);
			break;
		case 2:
				System.out.println("1.Añadir luchador");
				System.out.println("2.Eliminar luchador");
				opcion=sc.nextInt();
				switch(opcion) {
				case 1:
					añadir(luchadores);
					break;
				case 2:
					elmininar(luchadores);
					break;
				}
			break;
		case 3:
			Comabte comabte = hacercombate(empresas,luchadores);
			realizarcombate(comabte);
			break;
		}
	}
	public static void rellenarPatrocinadores(ArrayList<String> empresas,ArrayList<Luchador>luchadores) {
		empresas.add("Telepizza");
		empresas.add("ColaCao");
		empresas.add("Grefusa");
		empresas.add("Spotify");
		empresas.add("Pepsi");
		
		luchadores.add(new Pegador("JuanCarlos","Alemania",23));
		luchadores.add(new Tecnico("Adrian","Membrilla",19));
		luchadores.add(new Tecnico("Michael","Cuba",20));
		luchadores.add(new Pegador("MiguelAngel","Iraq",25));
		luchadores.add(new Pegador("JuanAntonio","Etiopia",18));
		luchadores.add(new Pegador("Alfonso","Humilde",23));
		luchadores.add(new Tecnico("Sergio","Portugal",32));
		luchadores.add(new Pegador("Antonio","Rusia",19));
	}
	public static void imprimir(ArrayList<Luchador>luchadores) {
		for(int i=0;i<luchadores.size();i++) {
			System.out.println(luchadores.get(i));
		}
	}
	public static void añadir(ArrayList<Luchador>luchadores) {
		int opcion,edad;
		String nombre,nacionalidad;
		
		System.out.println("Dime cual 1.Pegador 2.Tecnico");
		opcion=sc.nextInt();
		System.out.println("Dime el nombre");
		nombre=sc.next();
		System.out.println("Dime la nacionalidad");
		nacionalidad=sc.next();
		System.out.println("Dime la edad");
		edad=sc.nextInt();
		switch(opcion) {
		case 1:
				luchadores.add(new Pegador(nombre,nacionalidad,edad));
			break;
		case 2:
				luchadores.add(new Tecnico(nombre,nacionalidad,edad));
			break;
		}
	}
	public static void elmininar(ArrayList<Luchador>luchadores) {
		int opcion;
		System.out.println("Dime la opcion");
		opcion=sc.nextInt();
		luchadores.remove(opcion);
	}
	public static Comabte hacercombate(ArrayList<String> empresas,ArrayList<Luchador>luchadores) {
		String empresa;
		int empresaaleatoria,luchadoraleatorio;
		ArrayList<Luchador>competidor=new ArrayList<Luchador>();
		empresaaleatoria=(int)(Math.random()*empresas.size());
		empresa=empresas.get(empresaaleatoria);
		for(int i=0;i<4;i++) {
			luchadoraleatorio=(int)(Math.random()*luchadores.size());
			competidor.add(luchadores.remove(luchadoraleatorio));
		}
		return new Comabte(empresa,competidor);
	}
	public static void realizarcombate(Comabte combate) {
		int golpeador, victima,golpe,daño, bloqueo,vida;
		System.out.println("El combate es patrocinado por "+ combate.getEmpresa() + " y tendra un premio de: "+ combate.getPremio());
		System.out.println("Luchador del combate:");
		for(int i=0;i<combate.getLuchadoresCombate().size();i++) {
			System.out.println(combate.getLuchadoresCombate().get(i).toString());
		}
		System.out.println("######################################################## \nCombate:");
		do {
			golpeador=(int)(Math.random()*combate.getLuchadoresCombate().size());
			victima=(int)(Math.random()*combate.getLuchadoresCombate().size());
			golpe=(int)(Math.random()*3);
		switch(golpe){
		case 1:
				daño=combate.getLuchadoresCombate().get(golpeador).getAtaque();
				if(combate.getLuchadoresCombate().get(victima).getClass()==Tecnico.class) {
					Tecnico tecnico=(Tecnico)(combate.getLuchadoresCombate().get(victima));
					bloqueo=(int)(Math.random()*tecnico.getDefensa());
					daño=daño-bloqueo;
				}
				vida=combate.getLuchadoresCombate().get(victima).getVida();
				combate.getLuchadoresCombate().get(victima).setVida(daño-vida);
				System.out.println("Le ha quitado de vida el luchador "+ combate.getLuchadoresCombate().get(victima).getNombrem() + daño);
				
				if(combate.getLuchadoresCombate().get(victima).getVida()<=0) {
					System.out.println(combate.getLuchadoresCombate().get(victima).getNombrem()+" esta KO");
					combate.getLuchadoresCombate().remove(victima);
					
				}
				break;
		case 2:
			daño=combate.getLuchadoresCombate().get(golpeador).getAtaque();
			if(combate.getLuchadoresCombate().get(victima).getClass()==Tecnico.class) {
				Tecnico tecnico=(Tecnico)(combate.getLuchadoresCombate().get(victima));
				bloqueo=(int)(Math.random()*tecnico.getDefensa());
				daño=daño-bloqueo;
			}
			vida=combate.getLuchadoresCombate().get(victima).getVida();
			combate.getLuchadoresCombate().get(victima).setVida(daño-vida);
			System.out.println("Le ha quitado de vida el luchador "+ combate.getLuchadoresCombate().get(victima).getNombrem() + daño);
			
			if(combate.getLuchadoresCombate().get(victima).getVida()<=0) {
				System.out.println(combate.getLuchadoresCombate().get(victima).getNombrem()+" esta KO");
				combate.getLuchadoresCombate().remove(victima);
				
			}
			break;
		case 3:
			daño=1;
			if(combate.getLuchadoresCombate().get(golpeador).getClass()==Tecnico.class) {
				Tecnico tecnico=(Tecnico)(combate.getLuchadoresCombate().get(victima));
				bloqueo=(int)(Math.random()*tecnico.getDefensa());
				daño=daño-bloqueo;
			}
			vida=combate.getLuchadoresCombate().get(victima).getVida();
			combate.getLuchadoresCombate().get(victima).setVida(daño-vida);
			System.out.println("Le ha quitado de vida el luchador "+ combate.getLuchadoresCombate().get(victima).getNombrem() + daño);
			
			if(combate.getLuchadoresCombate().get(victima).getVida()<=0) {
				System.out.println(combate.getLuchadoresCombate().get(victima).getNombrem()+" esta KO");
				combate.getLuchadoresCombate().remove(victima);
				
			}
			break;		
		}
		}while(combate.getLuchadoresCombate().size()>1);
		System.out.println("El combate lo ha ganado "+ combate.getLuchadoresCombate().get(0).getNombrem() + " por ser el ultimo en quedar de pie");
	}

}
