public class Book {
    String title;
    String author;

    public Book(){
        this.title = "";
        this.author = "";

    }
    public Book(String bookName){
        this.title = bookName;
        this.author = "���ڹ̻�";

    }

    public Book(String bookName, String name){
        this.title = bookName;
        this.author = name;

    }
    void show(){
        System.out.println("����: " + title + ", �۰�: " + author);
    }
}
