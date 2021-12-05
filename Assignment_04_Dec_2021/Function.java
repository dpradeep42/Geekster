package Assignment_04_Dec_2021;

public class Function {
    public static void talk() {
        System.out.println("hello there!");
    }

    public static void talk(String name) {
        System.out.println("hello " + name);
    }

    public static void main(String[] args) {
        talk("Name");
    }
}
