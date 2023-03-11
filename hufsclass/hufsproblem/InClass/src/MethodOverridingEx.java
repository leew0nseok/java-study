public class MethodOverridingEx {
    public static void main(String[] args){
        paint(new Shape());
        //paint(new Line());
        paint(new Rectangle());
        paint(new Circle());
    }
    public static void paint(Shape s){
        s.draw();
    }
}
