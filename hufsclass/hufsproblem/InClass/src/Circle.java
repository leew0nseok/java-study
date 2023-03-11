public class Circle extends Shape{
    int radius;
    String name;
    Circle(){};
    Circle(int r, String n){
        radius = r;
        name = n;
    };

    int getRadius(){
        return radius;
    }
    String getName(){
        return name;
    }

    double getSize(){
        return this.radius * this.radius * 3.14;
    }
    public void draw(){
        System.out.println("Circle ¸ð¾ç");
    }
}
