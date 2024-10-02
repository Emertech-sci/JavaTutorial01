public class DataTypes {

    public static void main(String[] args) {

        /*
            INTEGER TYPES
        */
        byte singleByte = 100; // -128 to 127
        short smallNumber = 20_000; // -32,768 to 32767
        int anInteger = 2_147_483_647; // -2147483648 to 2147483647
        long aLargenumber = 9223372036854775807L; // -9223372036854775808 to 9223372036854775807

        //Conversiones
        int num1 = 5;
        double num2 = num1;
        System.out.println(num2); // No serviria asignando al reves

        //double num3 = 234.24;
        //int num4 = num3;
        //System.out.println(num4);

        double num5 = 34.7;
        int num6 = (int) num5;
        System.out.println(num6); // Perdemos el valor decimal .7 al castear un double a un int

        /*
            DECIMAL TYPES (floating-point)
        */
        float aFloat = 3.4028F;
        double aDouble = 1.79769313;

        /*
            BOOLEAN TYPES
        */
        boolean isWeekend = false;
        boolean isWorkday = true;

        /*
            CHARACTER TYPE
        */
        char copySymbol = '\u00A9';
        System.out.println(copySymbol);
    }
}
