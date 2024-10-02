public class Strings {
    public static void main(String[] args) {

        /*
            LITERAL STRINGS
         */
        char percentSign = '%'; // Imprimira el simbolo de % (si añadimos mas caracteres, incluyendo espacios, habra un error).
        String percentString = "% erer"; // Imprimira % como una cadena de caracteres; (si añadimos mas caracteres no habra error).
        System.out.println(percentSign);
        System.out.println(percentString);

        String name = "Jesús Mateo Rendón Ávila"; // notese que los Strings van entre comillas dobles "..."
        System.out.println(name);

        String miNombre = "Jesús Mateo Rendón Ávila"; // Reutiliza el valor en memoria de la variable name.

        /*
            OBJECT STRINGS (uso de new keyword).
         */

        String nameNew = new String("Jesús Mateo Rendón Ávila"); // Crea una nueva dirección en memoria para la variable nameNew.
        System.out.println(name);

        /*
            DEMOSTRACIÓN
         */
        String literalString1 = "abc";
        String literalString2 = "abc";
        System.out.println(literalString1 == literalString2);

        String objectString1 = new String("xyz");
        String objectString2 = new String("xyz");
        System.out.println(objectString1 == objectString2);

        /*
            FORMATO DE STRINGS
         */
        String saludo = "Hola soy Mateo Rendon, soy de la Ciudad de Mexico y tengo 31 años."; // Tenemos varia información que puede almacenarse en una variable
        System.out.println(saludo);

        String nombre = "Mateo Rendon";
        String ciudad = "Ciudad de Mexico";
        int edad = 31;

        // Concatenación
        String saludo2 = "Hola soy " + nombre + ", soy de la " + ciudad + " y tengo " + edad + " años.";
        System.out.println(saludo2);

        String saludo3 = String.format("Hola soy %s, soy de la %s y tengo %d años.", nombre, ciudad, edad);
        System.out.println(saludo3);

        /*
            METODOS DE STRING
         */
        String myName = "Jesus Mateo Rendon Avila";

        System.out.println(myName.length()); // arroja el numero de caracteres de un string, incuyendo espacios
        System.out.println(myName.toUpperCase()); // cambia las minusculas por mayuscuñas
        System.out.println(myName.toLowerCase()); // Cambia las mayusculas por minusculas
        System.out.println(myName.isEmpty());  // Revisa si un String es vacio

        String myNameAgain = "Jesus Mateo Rendon Avila";
        System.out.println(myNameAgain.equals(myName)); // Compara que dos Strings sean iguales

        String myNameNoCapitals = "jesus mateo rendon avila";
        System.out.println(myNameNoCapitals.equalsIgnoreCase(myName)); // compara dos Strings sin tomar en cuenta mayusculas

        System.out.println(myName.replace("Jesus", "Emilinao")); // reemplaza una palabra por otra (no modifica el valor del string original)

        System.out.println(myName.contains("Mateo")); // Revisa si existe una palabra en un string

    }
}
