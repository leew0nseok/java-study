public class Book {
    String title;
    String author;

    public Book(){
        this.title = "";
        this.author = "";

    }
    public Book(String bookName){
        this.title = bookName;
        this.author = "작자미상";

    }

    public Book(String bookName, String name){
        this.title = bookName;
        this.author = name;

    }
    void show(){
        System.out.println("제목: " + title + ", 작가: " + author);
    }
}
