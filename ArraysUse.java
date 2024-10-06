import java.util.Arrays;

public class ArraysUse {
    public static void main(String[] args){
        //char vowels[] = new char[5];
        char vowels[]= new char[6];// cambiamos la logitud del array de 5 a 6.

        // a e i o u
        // Tenemos en la linea de abajo a _ _ _ _
        vowels[0] = 'a';

        // llenemos los caracteres necesarios
        vowels[1] = 'e';
        vowels[2] = 'i';
        vowels[3] = 'o';
        vowels[4] = 'u';
        vowels[5] = 'x';
        System.out.println(Arrays.toString(vowels));

        // Creamos un nuevo array con otra forma:
        char ejes[] = {'x', 'y', 'z'};
        System.out.println(Arrays.toString(ejes));  // cambiaremos los elementos del arreglo "ejes".
        ejes[0] = 'w';
        ejes[1] = 'x';
        ejes[2] = 'y';
        System.out.println(Arrays.toString(ejes)); // hemos cambiado los elementos del arreglo.

        // Metodos del array.
        System.out.println("el arreglo ejes tiene " + ejes.length + " elementos");

        //
        // ORDENAMIENTO DEL ARRAY
        //
        String nombre[] = {"Mateo", "Michael","Ambar", "Paulina", "Itzel", "Gonzalo", "Chuchin", "Quetzalli"};
        System.out.println(Arrays.toString(nombre)); // Arreglaremos por orden alfabetico.

       // Arrays.sort(nombre); // Ordenara el array en orden alfabetico.
        //System.out.println(Arrays.toString(nombre));

        int satrtingIndex = 1;
        int endingIndex = 5;

        Arrays.sort(nombre, satrtingIndex, endingIndex); // El ordenamiento no es inclusivo para el ultimo digito.
        // Se ordenara el arreglo solo del indice 1 al 4 (5 no inclusivo).
        System.out.println(Arrays.toString(nombre));

        //
        // ENCONTRAR EL INDICE DE UN ELEMENTO DEL ARREGLO.
        //
        String autos[] = {"Ferrari", "Mercedes Benz", "Tesla", "BMW", "Volks Waggen", "Fiat"};
        Arrays.sort(autos); // Ordenamiento del array autos.
        System.out.println(Arrays.toString(autos));

        int foundItemIndex = Arrays.binarySearch(autos, "Tesla"); // buscara el indice de "Tesla".
        System.out.println(foundItemIndex);

        // Busqueda a partir de un cierto indice
        // Usaremos los valores definidos previamente.
        int foundSpecificIndex = Arrays.binarySearch(autos, satrtingIndex, endingIndex, "Fiat");
        System.out.println(foundSpecificIndex);

        //
        // FILL METHOD
        //
        Arrays.fill(autos, "Porsche");
        System.out.println(Arrays.toString(autos));

        int numeros[] = {1, 2, 3, 4, 5};
        int copiaNumeros[] = numeros;
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copiaNumeros));

        // Los arrays en Java son referencetype:
        Arrays.fill(numeros, 34);
        System.out.println(Arrays.toString(numeros));
        System.out.println(Arrays.toString(copiaNumeros)); // copiaNumeros esta apuntando a la referencia en memoria de numeros

        // EVITAR LA REFERENCIA EN UNA COPIA DE ARRAYS
        int pares[]= {2,4,6,8,10};
        int copiaPares[] = Arrays.copyOf(pares, pares.length); // Evita la referencia en memoria de pares

        Arrays.fill(pares, 2);
        System.out.println(Arrays.toString(pares));
        System.out.println(Arrays.toString(copiaPares));

        // Hacer una copia con mas elementos.
        int copiaPares2[] = Arrays.copyOf(copiaPares, copiaPares.length);
        System.out.println(Arrays.toString(copiaPares2));

        // COMPARAR DOS ARRAYS
        System.out.println(Arrays.equals(copiaPares, copiaPares2));






    }
}