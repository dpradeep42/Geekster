package Assignment_01_Dec_2021;

class Animal {
    static int CountAnimals = 0;
    static int age = 0;

    public String type;
    private String name;
    private String voice;
    private int NumberLegs;

    Animal() {
        this("default_type", "dafault_name", "default_voice", 4);
    }

    Animal(String type, String name, String voice) {
        this(type, name, voice, 4);
        this.type = type;
        this.name = name;
        this.voice = voice;
    }

    Animal(String type, String name, String voice, int NumberLegs) {
        this.type = type;
        this.name = name;
        this.voice = voice;
        this.NumberLegs = NumberLegs;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        Animal.age = age;
    }

    public static int getCountAnimals() {
        return CountAnimals;
    }

    public static void setCountAnimals(int countAnimals) {
        CountAnimals = countAnimals;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }

    public int getNumberLegs() {
        return NumberLegs;
    }

    public void setNumberLegs(int numberLegs) {
        NumberLegs = numberLegs;
    }

    public static void incrementAge() {
        System.out.println("age is " + age + " count is " + CountAnimals);
        CountAnimals++;
    }

    public String toString() {
        return " type of animals " + this.type + ", name is " + this.name + " with " + this.NumberLegs +
                " legs" + " that says " + this.voice;

    }

}

public class Animals {
    public static void main(String[] args) {
        System.out.println("**DOG**");
        Animal dog = new Animal("dog", "Rover", "bark");
        Animal.age = 15;
        Animal.incrementAge();
        System.out.println(dog.getType());
        System.out.println(dog.getName());
        System.out.println(dog.getVoice());
        System.out.println(dog.getType());
        System.out.println(dog);
        System.out.println();

        System.out.println("**CAT**");
        Animal cat = new Animal();
        cat.setType("cat");
        cat.setVoice("Meow");
        Animal.age = 6;
        Animal.incrementAge();
        System.out.println(cat.getName());
        System.out.println(cat.getVoice());
        System.out.println(cat.getType());
        System.out.println(cat);
        System.out.println();

        System.out.println("*ELEPHANT**");
        Animal elephant = new Animal("elephant", "Griffin", "trumpet");
        Animal.age = 30;
        Animal.incrementAge();
        System.out.println(elephant);
        System.out.println();

        System.out.println("So far, " + Animal.CountAnimals + " animals have been created.");
    }
}
