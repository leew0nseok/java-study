public class CircleCode {
    public static void main(String[] args){
        Circle javapizza = new Circle(10, "자바피자");
        Circle javadonut = new Circle(2, "자바도넛");

        System.out.println("반지름(" + javapizza.getRadius() +") : "+ javapizza.getName() + "의 면적은 " + javapizza.getSize());
        System.out.println("반지름(" + javadonut.getRadius() +") : "+ javadonut.getName() + "의 면적은 " + javadonut.getSize());

    }
}
