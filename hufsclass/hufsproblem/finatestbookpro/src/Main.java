public class Main {

    public static void main(String[] args) {

        Examination[] t = { new MidTerm(false), new FinTerm(true) };

        for (Examination exam : t)
            exam.test();
    }
}


// 추상 클래스 Examination 를 작성하시오

abstract class Examination{
    public boolean current;
    public void test(){
        if (this.current == true) {
            System.out.println(getCurrent() + " 기간입니다.");
        }
        else{
            System.out.println(getCurrent() + " 지났습니다.");
        }
    }
    String getCurrent(){
        return "override";
    }
}

// 구현 클래스 MidTerm 을 작성하시오
class MidTerm extends Examination{
    MidTerm(boolean current){
        this.current = current;
    }
    @Override
    String getCurrent(){
        return "Mid-Term";
    }
}


// 구현 클래스 FinTerm 을 작성하시오
class FinTerm extends Examination{
    FinTerm(boolean current){
        this.current = current;
    }
    @Override
    String getCurrent(){
        return "Fin-Term";
    }
}