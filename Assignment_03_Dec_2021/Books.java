package Assignment_03_Dec_2021;

abstract class Book {
    String title;

    abstract void setTitle(String s);

    String getTitle() {
        return title;
    }
}

class MyBook extends Book {

    @Override
    void setTitle(String s) {
        this.title = s;
    }
}

public class Books {
    public static void main(String[] args) {
        MyBook chapter = new MyBook();
        chapter.setTitle("A tale of two cities");
        System.out.println("The title is: " + chapter.getTitle());
    }
}