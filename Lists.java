import java.util.ArrayList;
import java.util.Comparator;

public class Lists {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        // int double float boolean
        // Integer: reference type form for int
        // Double Float Boolean

        numbers.add(5); //4
        numbers.add(1); //0
        numbers.add(4); //3
        numbers.add(6); //5
        numbers.add(3); //2
        numbers.add(23); //6
        numbers.add(2); //1

        System.out.println(numbers.toString());

        // Print a single vlaue
        System.out.println(numbers.get(3));

        numbers.remove(3); // removera el elemnto en el indice 3 (4)
        System.out.println(numbers.toString());


        numbers.remove(Integer.valueOf(5));
        System.out.println(numbers.toString());

        //numbers.clear(); // Limpiara la lista eliminando todos sus elementos.
        //System.out.println(numbers.toString());

        numbers.set(2,Integer.valueOf(32)); // reemplaza el valor de un elemento por otro.
        System.out.println(numbers.toString());

        numbers.sort(Comparator.naturalOrder()); // acomoda los elementos con el uso de la clase Comparator y el metodo naturalOrder().
        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());

        System.out.println(numbers.size()); // nos dice cuantos elemntos pertencen a la lista.
        System.out.println(numbers.contains(Integer.valueOf(234))); // checa si un elemento pertenece a nuestra lista.
        System.out.println(numbers.isEmpty()); // revisa si la liosta es vacia

        numbers.forEach(number -> {
            System.out.println(number * 2);
        });

        System.out.println(numbers.toString());

        System.out.println();

        ArrayList<Integer> pares = new ArrayList<>();
        pares.add(2);
        pares.add(4);
        pares.add(6);
        pares.add(8);
        pares.add(10);

        System.out.println("before:" + pares.toString());

        pares.forEach(par -> {
            pares.set(pares.indexOf(par), par * 2);
        });

        pares.sort(Comparator.naturalOrder());
        System.out.println("after:" + pares.toString());


    }// cierre main
}//cierre calse
