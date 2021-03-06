package Nov_11_2021;

public class DataTypes {
    public static void main(String[] args) {
        System.out.println("Max value from Byte class:" + Byte.MAX_VALUE);
        System.out.println("Min value from Byte class:" + Byte.MIN_VALUE);
        Byte b = 123;
        System.out.println(b);
        System.out.println(b.getClass().getName());

        // Short
        System.out.println("Max value from Short class:" + Short.MAX_VALUE);
        System.out.println("Min value from Short class:" + Short.MIN_VALUE);
        Short s = 32767;
        System.out.println(s);
        System.out.println(s.getClass().getName());

        // Int
        System.out.println("Max value from Int class:" + Integer.MAX_VALUE);
        System.out.println("Min value from Int class:" + Integer.MIN_VALUE);
        int i = 32767;
        System.out.println(i);

        // Long
        System.out.println("Max value from Long class:" + Long.MAX_VALUE);
        System.out.println("Min value from Long class:" + Long.MIN_VALUE);
        long l = 32767;
        System.out.println(l);

        // Float
        System.out.println("Max value from Float class:" + Float.MAX_VALUE);
        System.out.println("Min value from Float class:" + Float.MIN_VALUE);
        float f = 123.456f;
        System.out.println(f);

        // Double
        System.out.println("Max value from Double class:" + Double.MAX_VALUE);
        System.out.println("Min value from Double class:" + Double.MIN_VALUE);
        double d = 123.456d;
        System.out.println(d);

        //float and double
        System.out.println("\n\nfloat and double");
        float fl = 1.0123457899f;
        System.out.println(fl);
        double dou = 1.01234567890102030405;
        System.out.println(dou);
        System.out.print("\n\n");

        // Boolean
        boolean bool = true;
        System.out.println(bool);
        boolean bool1 = false;
        System.out.println(bool1);

        // Char
        char c = 'B';
        System.out.println(c);

        char var1 = 65, var2 = 66, var3 = 67;
        System.out.println(var1);
        System.out.println(var2);
        System.out.println(var3);

        // String
        String S = "Hello World"; //Variables are case sensitive
        System.out.println(S + "\n\n");

        //Practice
        System.out.println("--------------------PRactice--------------------");
        char ch = 'a';
        System.out.println(ch);
        System.out.println(ch + ch);
        ch = 3;
        System.out.println(ch);
        System.out.println(ch);
        ch = 'A';
        System.out.println((int)ch);
    }
}
