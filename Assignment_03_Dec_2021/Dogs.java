package Assignment_03_Dec_2021;

public class Dogs {
    public void speak() {
        System.out.println("woof!");
    }

    public static void main(String[] args) {
        Dogs d = new Dogs();
        d.speak();
        Dogs b = new Beagle();
        b.speak();
    }
}

class Beagle extends Dogs {
    @Override
    public void speak() {
        System.out.println("arf arf");
    }
}