class Parent{
    public String nation;

    public Parent(){
        this("���ѹα�");
        System.out.println("Parent() Call");
    }

    public Parent(String nation){
        this.nation = nation;
        System.out.println("Parent(String nation) Call");
    }
}
class Child extends Parent{
    private String name;

    public Child(){
        this("ȫ�浿");
        System.out.println("Child() Call");
    }
    public Child(String name){
        this.name = name;
        System.out.println("Child(String name) Call");
    }
}

public class firstfive {
    public static void main(String[] args){
        Child child = new Child();
    }
}
