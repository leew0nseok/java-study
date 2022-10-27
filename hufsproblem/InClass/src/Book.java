public class Book {
    String title;
    String author;
    Book(){
        this.title ="";
        this.author = "";
    };
    Book(String t){
        this.title = t;
        this.author = "작자미상";
    }
    Book(String t, String a){
        this.title = t;
        this.author = a;

    }
    void show(){
        System.out.println("제목: " + title + ", 작가: " + author);
    }

}
