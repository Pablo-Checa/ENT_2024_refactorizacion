package ejercicio6;

public class Animal {
	
	/**
	 * Atributo del tipo de animal
	 */
    private String tipo;

    /**
     * Constructor del animal
     * @param tipo Tipo de animal.
     */
    public Animal(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Menú switch que según el animal que se ponga sacará un sonido u otro.
     */
    public void hacerSonido() {
        switch (tipo) {
        case "Perro":
            System.out.println("Guau!");
            break;
        case "Gato":
            System.out.println("Miau!");
            break;
        case "Pajaro":
            System.out.println("Pío!");
            break;
        default:
            System.out.println("Sonido desconocido");
            break;

       }
    }
}
