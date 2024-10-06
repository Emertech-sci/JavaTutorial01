public class WhileLoop {
    public static void main(String[] args) {

        int number = 5;
        int multiplier = 1;

        while(multiplier <= 10){
            System.out.printf("%d X %d = %d\n",number, multiplier, number * multiplier);
            multiplier++;
        } // cierre de while

        System.out.println();

        int myAge = 31;
        int currentYear = 2024;
        int myYear = 1;
        do{
            System.out.printf("En el anio %d tendre: %d\n", currentYear, myAge);
            myAge++;
            currentYear++;
        }while(currentYear <= 2040);


    } // cierre de main
} // cierre de clase
