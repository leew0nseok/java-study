//상속

class Animal{
    String name;

    void setName(String name){
        this.name = name;
    }
}

class Dog extends Animals {
    void sleep(){
        System.out.println(this.name + " zzz");
    }
}

class HouseDog extends Dog{
    //생성자 (생성자는 객체가 생성될 때 호출)
    HouseDog(String name){
        this.setName(name);
    }
    HouseDog(int type){
        if(type == 1)
            this.setName("yorkshire");
        else if(type == 2)
            this.setName("bulldog");
    }

    void sleep(){
        System.out.println(this.name + " zzz in house");
    }
    void sleep(int hour){
        System.out.println(this.name + " zzz in house for " + hour + "hours");
    }
}

public class inHeritance {
    public static void main(String[] args){
        Dog dog = new Dog();
        dog.setName("poppy");
        System.out.println(dog.name);
        dog.sleep();

        HouseDog houseDog = new HouseDog("happy");
        HouseDog yorkshire = new HouseDog(1); //생성자 오버로딩

        System.out.println(houseDog.name);
        System.out.println(yorkshire.name);

        //houseDog.setName("happy");
        houseDog.sleep(); //메소드 오버라이딩
        houseDog.sleep(3); //메소드 오버로딩

    }
}
