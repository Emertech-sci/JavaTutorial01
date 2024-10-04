import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scan.nextDouble();
        scan.nextLine();
        System.out.print("Enter the second number: ");
        double number2 = scan.nextDouble();
        scan.nextLine();

        System.out.print("What operation do you want to perform?: ");
        String operation = scan.nextLine();

        if(operation.equals("sum")){
            System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
        }else if(operation.equals("sub")){
            System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
        }else if(operation.equals("mult")){
            System.out.printf("%f * %f = %f", number1, number2, number1 * number2);
        }else if(operation.equals("div")) {
            if (number2 == 0) {
                System.out.println("Cannot divide by 0");
            } else {
                System.out.printf("%f / %f = %f", number1, number2, number1 / number2);
            }
        }else{
            System.out.printf("%s is not a supported operation", operation);
        }
    } // cierra el main
} // cierra la clase
