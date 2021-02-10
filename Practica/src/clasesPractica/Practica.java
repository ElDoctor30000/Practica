package clasesPractica;


class Perro extends Animal{

Perro(){
edad = 0;
nombre ="Tobi";
}

Perro(int edad, String nombre){
super(edad,nombre);
}

static void get1(Perro dog){
dog.getEdad();
}
}



class Practica {

	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		for (int i=0;i<10;i++) {
		numeros[i]=i;
		
		}
		
		int f = 0;
		do {
			f++;
		}
		while (f<10);
		
		Perro perro = new Perro(5,"Boby");
		perro.getNombre();
		
		
		
		
	}

}
