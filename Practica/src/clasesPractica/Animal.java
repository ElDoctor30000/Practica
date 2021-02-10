package clasesPractica;

class Animal{
int edad;
String nombre;
static int constante=5;
public void nace(){
System.out.println("Hola mundo");
	}

public void getNombre(){
System.out.println(nombre);
	}

public void getEdad(){
System.out.println(edad);
	}

public Animal(){
}

public Animal(int _edad, String _nombre){
edad = _edad;
nombre = _nombre;
}
}
