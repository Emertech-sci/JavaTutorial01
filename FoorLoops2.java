public class FoorLoops2 {
    public static void main(String[] args) {
        // Tablas de multiplicar.
        for(int number = 1; number <= 10; number++) {

            // nested forLoop
            for(int multiplier = 1; multiplier <=10; multiplier++) {
                System.out.printf("%d X %d = %d\n", number,multiplier,number*multiplier);
            }
        }

        for(int number = 1; number <= 50; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }

        int numbers[] = {1,2,3,4,5};
        for(int number : numbers) { // para todos los elementos number en numbers se imprimira ese elemento.
            System.out.println(number);
        }

        int sum = 0;
        for(int number : numbers) {
            sum += number;
        }
        System.out.println(sum);
    }
}
