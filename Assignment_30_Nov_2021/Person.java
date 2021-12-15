package Assignment_30_Nov_2021;

public class Person {
    String Name;
    String Email;
    int age;
    int phonenumber;

    // constructor

    Person() {
        this.Name = "Pradeep Kumar Dasari";
        this.Email = "dpradeep42@gmail.com";
        this.age = 22;
        this.phonenumber = 1234567890;
    }

    public Person(String theName) {
        this.Name = theName;
    }

    public Person(String theName, int theage) {
        this.Name = theName;
        this.age = theage;
    }

    public Person(String theName, int theage, String theEmail) {
        this.Name = theName;
        this.age = theage;
        this.Email = theEmail;
    }

    public Person(String theName, int theage, String theEmail, int thephonenumber) {
        this.Name = theName;
        this.age = theage;
        this.Email = theEmail;
        this.phonenumber = thephonenumber;
    }
    // get methods

    public String getName() {
        return this.Name;
    }

    public String getEmail() {
        return this.Email;
    }

    public int getAge() {
        return this.age;
    }

    public int getNumber() {
        return this.phonenumber;
    }

    // set methods

    public void setName(String theName) {
        this.Name = theName;
    }

    public void setEmail(String theEmail) {
        this.Email = theEmail;
    }

    public void setAge(int theage) {
        this.age = theage;
    }

    public void setphonenumber(int thephonenumber) {
        this.phonenumber = thephonenumber;
    }

    public String toString() {
        return this.Name + " " + this.Email + " " + this.phonenumber;
    }

    public static void main(String[] args) {
        Person p = new Person("Hamid");
        System.out.println(p);

        Person p1 = new Person();
        System.out.println(p1.getName());
        System.out.println(p1.getEmail());
        System.out.println(p1.getAge());
        System.out.println(p1.getNumber());

        Person p2 = new Person();
        p2.setName("Pradeep Kumar Dasari");
        p2.setEmail("dpradeep42@gmail.com");
        p2.setAge(22);
        p2.setphonenumber(1234567890);
        System.out.println(p2.getName());
        System.out.println(p2.getEmail());
        System.out.println(p2.getAge());
        System.out.println(p2);
    }
}