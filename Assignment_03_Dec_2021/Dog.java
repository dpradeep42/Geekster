package Assignment_03_Dec_2021;

public class Dog {
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    public boolean equals(Object other) {
        Dog d1 = (Dog) other;
        return this.name == d1.name;

    }

    public static void main(String[] args) {
        Dog d1 = new Dog("Rufus");
        Dog d2 = new Dog("Sally");
        Dog d3 = new Dog("Rufus");
        Dog d4 = d3;
        System.out.println(d1.equals(d2));
        System.out.println(d2.equals(d3));
        System.out.println(d1.equals(d3));
        System.out.println(d3.equals(d4));

    }
}