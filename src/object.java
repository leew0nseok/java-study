class Animal{
    String name;

    public void setName(String name){
        this.name = name;
    }
}


public class object {
    public static void main(String[] args){
        Animal cat = new Animal();
        Animal dog = new Animal();

        cat.setName("야옹이");
        dog.setName("멍멍이");

        System.out.println(cat.name);
        System.out.println(dog.name);
        //cat, dog의 이름이 다르게 출력됨.
        //클래스에서 가장 중요한 부분은 그 뭐라해도 이 객체 변수의 값이 독립적으로 유지된다는 점
        //객체 지향적이라는 말의 의미도 결국 이 객체 변수의 값이 독립적으로 유지

    }
}
