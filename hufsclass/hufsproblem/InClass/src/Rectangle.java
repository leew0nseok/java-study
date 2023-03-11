public class Rectangle extends Shape{
    int width;
    int height;

    Rectangle(){};

    int getArea(){
        return width * height;
    }
    public void draw(){
        System.out.println("Rectangle ¸ð¾ç");
    }
}
