public class Book {
    String title;
    String author;
    Book(){
        this.title ="";
        this.author = "";
    };
    Book(String t){
        this.title = t;
        this.author = "���ڹ̻�";
    }
    Book(String t, String a){
        this.title = t;
        this.author = a;

    }
    void show(){
        System.out.println("����: " + title + ", �۰�: " + author);
    }

}
