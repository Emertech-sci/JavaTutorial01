import java.util.Arrays;

public class ForLoops {
    public static void main(String[] args){
        for(int number =1; number <= 10; number++){ // inicializacion; condicion;
            System.out.print(number + "\t");
        } // cierre de loop

        System.out.println();

        int numbers[] = {1,2,3,4,5,6,7,8,9,10};
        int sum = 0;

        for(int index = 1; index < numbers.length; index++){
            sum += numbers[index];
        }
        System.out.println(sum);

        // representa el factorial de 7
        int factorial[] = {1,2,3,4,5,6,7};
        int mult = 1;

        for (int index = 0; index < factorial.length; index++){
            mult *= factorial[index];
            System.out.println(mult);
        }
        System.out.println("El factorial 7! es: " + mult);

        // otro forloop
        int value = 5;
        for(int multiplier = 1; multiplier <= 10; multiplier++){
            System.out.printf("%d X %d = %d\n", value, multiplier, value * multiplier);
        }


    } // cierre de main
} // cierre de clase
