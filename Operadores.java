public class Operadores {
    public static void main(String[] args) {
        int num1 = 36;
        int num2 = 12;

        /*
            OPERADORES ARITMETICOS
        */

        // Adición (suma).
        int suma = num1 + num2;
        System.out.println(suma); // 48

        num1 += 5; // Suma la cantidad de num1 + 5 a num1.
        System.out.println(num1);

        num1++; // sma la cantidad de 1 a num1.
        System.out.println(num1);

        // Substracción (resta).
        int resta = num2 - num1;
        System.out.println(resta);

        // Multiplicación.
        int mult = num1 * num2;
        System.out.println(mult);

        // Division.
        int div = num1 / num2; // Division exacta.
        System.out.println(div);

        double num3 = 24; // cambiamos de un int a un double para tener resultado con decimales.
        int num4 = 13;
        double divDecimal = num3 / num4; // Division con decimal.
        System.out.println(divDecimal);

        // Remainder (modulo).
        int mod = num1 % num2;
        System.out.println(mod);

        /*
            OPERADORES RELACIONALES
         */

        int op1 = 23;
        int op2 = 14;

        // Igual que
        boolean igualQue = op1 == op2;
        System.out.println(igualQue);

        // Distinto que
        boolean distintoQue = op1 != op2;
        System.out.println(distintoQue);

        // Mayor que
        boolean mayorQue = op2 > op1;
        System.out.println(mayorQue);

        // Menor que
        boolean menorQue = op2 < op1;
        System.out.println(menorQue);

        // Mayor o igual que
        boolean mayorIgual = op1 >= op2;
        System.out.println(mayorIgual);

        // Menor o igual que
        boolean menorIgual = op1 <= op2;
        System.out.println(menorIgual);

        /*
            OPERADORES LOGICOS
         */

        // Y (&&)
        byte edad = 30;
        if(edad >= 18 && edad <= 40){ // Imprimira el if ya que efectivamente compara que a,bas propiedades se cumplan
            System.out.println("Eres jvoen!");
        }else{
            System.out.println("Eres un adulto");
        }

        // Ó (||)
        if(edad > 50 || edad < 20){ // Imprimira el else ya que no cumple al menos una condicion para el if (cambiemos una de ella para ue sea true)
            System.out.println("No eres joven");
        }else{
            System.out.println("¡Eres joven!");
        }

        // Negación (¬)
        boolean mayorEdad = edad >= 18; // basado en edad = 30 entonces mayorEdad es true
        boolean negacionMayorEdad = !mayorEdad; //al hacer la negación de mayorEdad, esta se vuelve false
        System.out.println(negacionMayorEdad);

        /*
            OPERADORES DE ADICIÓN Y SUSTRACCIÓN
         */
        int score = 0;
        int turn = 10;

        // Adición
        score ++; //suma 1 al valor orginal de la variable score
        System.out.println(score);
        System.out.println(score ++); // suma 1 al valor de lavariable score pero no la imprime de inmediato sino que almacena el valor en memoria para referencias futuras
        System.out.println(score); // imprimirá el valor de la variable score con la modificación de la linea anterior
        System.out.println(++ score);

        // Sustracción
        turn --;
        System.out.println(turn);
    }
}
