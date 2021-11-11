package Nov_11_2021;

public class Arrays {
    public static void main(String[] args) {
        // Declaration
        int intArray[];
        int[] intArray2;
        // Above both methods of declarations are correct

        byte byteArray[];
        short shortsArray[];
        boolean booleanArray[];
        long longArray[];
        float floatArray[];
        double doubleArray[];
        char charArray[];

        int intArray3[]; // declaring array
        intArray = new int[20]; // allocating memory to array

        int[] intArray4 = new int[20]; // Declaring and allocating memory at a time

        int[] intArray5 = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //System.out.println(Arrays.toString(intArray5));
        // Declaring array literal

        int[] intArray6 = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        //System.out.println(Arrays.toString(intArray6));
        // Declaring array literal
    }
}
