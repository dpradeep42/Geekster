package FirstHand_Oct_26;

public class TypeCasting {
    public static void main(String[] args) {
        int i = 9;
        double d = i; // Automatic casting: int to double

        System.out.println(i);
        System.out.println(d);

        System.out.println(((Object) i).getClass().getName());
        System.out.println(((Object) d).getClass().getName());

        // Narrowing Casting or Manual Casting
        double d1 = 9.78d;
        int i1 = (int) d1; // Manual casting: double to int

        System.out.println(d1);
        System.out.println(i1);

        System.out.println(((Object) i1).getClass().getName());
        System.out.println(((Object) d1).getClass().getName());
    }
}
