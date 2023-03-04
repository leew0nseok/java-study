public class AutoCar implements OperateCar{
    int speed;
    int degree;
    public AutoCar(){
        this.degree =0;
    }
    @Override
    public void start(){
        System.out.println("자동차가 출발합니다.");

    }
    @Override
    public void stop(){
        System.out.println("자동차가 정지합니다.");

    }
    @Override
    public void setSpeed(int speed){
        this.speed = speed;
        System.out.println("자동차가 속도를 "+this.speed + "km/h로 바꿉니다.");

    }
    @Override
    public void turn(int degree){
        this.degree = degree;
        System.out.println("자동차가 방향을 "+this.degree + "만큼 바꿉니다.");

    }
}
