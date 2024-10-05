import java.util.Scanner;

public class Switch {
    // switch cases are faster than if else statements in Java.
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

        switch(operation){
            case "sum":
                System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", number1, number2, number1 - number2);
                break;
            case "mult":

                System.out.printf("%f X %f = %f", number1, number2, number1 * number2);
                break;

            case "div":
                if (number2 == 0){
                    System.out.println("You can not divide by 0");
                }else {
                    System.out.printf("%f + %f = %f", number1, number2, number1 + number2);
                }
                break;
            default:
                System.out.printf("%s is not a suported operation", operation);
        }

    }
}
