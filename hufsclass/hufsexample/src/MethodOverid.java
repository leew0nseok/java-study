public class MethodOverid {
    public static void main(String[] args){

        paint(new Shape());
        paint(new Line());
        paint(new Circle());
        paint(new Rectangle());
    }
    public static void paint(Shape sh){
        sh.draw();
    }
}
