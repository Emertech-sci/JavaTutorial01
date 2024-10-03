import java.util.Scanner; // importa la clase Scanner.

public class UserInputs {
    public static void main(String[] args) {
        Scanner scann = new Scanner(System.in); // crea un nuevo Scanner con nombre scann.

        System.out.print("Please enter your name: ");
        String name = scann.nextLine(); // Almacena el input del usuario en la variable name.

        System.out.println(String.format("Hello %s, how olda are you?: ", name));
        int age = scann.nextInt();
        scann.nextLine(); // Limpia el buffer del Scanner

        System.out.printf("Great, %d is an amazing age to start coding.\nWhat language do your prefer?: ", age);
        String language = scann.nextLine();

        System.out.printf("%s is a very popular programming language!\n", language);

        // Parse
        System.out.print("En que semestre vas: ");
        int semester = Integer.parseInt(scann.nextLine());

        System.out.printf("Amazing, i Loved my %d semester!", semester);

        scann.close();
    }
}
