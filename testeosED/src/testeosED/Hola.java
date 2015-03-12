package testeosED;

public class Hola {
	public static void main(String[] args) {
		System.out.println("Hola 1.0, esta es la documentacion de las pruebas:");
		
		String documentacion=""
				+ "En la pestaña GitRepositories le damos a clonar repositorio," + "\n"
				+ "introducimos la url del repositorio, nuestro nombre y usuario," + "\n"
				+ "tambien marcamos la casilla de bajar todo el contenido despues" + "\n"
				+ "de crear el repositorio." + "\n"
				+ "Una vez hecho esto nos habra aparecido el proyecto en nuestra" + "\n"
				+ "vista de Package Explorer, podemos realizar cualquier cambio y" + "\n"
				+ "despues resubir haciendo click derecho en el proyecto y" + "\n"
				+ "'Team/Remote/Push', se nos abrira una ventana el la que " + "\n"
				+ "seleccionaremosle la rama a utilizar y la añadiremos, tambien" + "\n"
				+ "le damos a force update para que sobreescriba y en finish." + "\n"
				+ "De esta forma ya hemos subido el fichero modificado, pero sin" + "\n"
				+ "cambiar el comentario, para hacerlo se hacen los mismos pasos" + "\n"
				+ "pero en 'Team/commit' en el que lo primero que hara sera" + "\n"
				+ "pedirnos el nuevo comentario para la version.";
		
		System.out.println(documentacion);
	}
}
