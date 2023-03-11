public class Main {

    public static void main(String[] args) {

        Examination[] t = { new MidTerm(false), new FinTerm(true) };

        for (Examination exam : t)
            exam.test();
    }
}


// �߻� Ŭ���� Examination �� �ۼ��Ͻÿ�

abstract class Examination{
    public boolean current;
    public void test(){
        if (this.current == true) {
            System.out.println(getCurrent() + " �Ⱓ�Դϴ�.");
        }
        else{
            System.out.println(getCurrent() + " �������ϴ�.");
        }
    }
    String getCurrent(){
        return "override";
    }
}

// ���� Ŭ���� MidTerm �� �ۼ��Ͻÿ�
class MidTerm extends Examination{
    MidTerm(boolean current){
        this.current = current;
    }
    @Override
    String getCurrent(){
        return "Mid-Term";
    }
}


// ���� Ŭ���� FinTerm �� �ۼ��Ͻÿ�
class FinTerm extends Examination{
    FinTerm(boolean current){
        this.current = current;
    }
    @Override
    String getCurrent(){
        return "Fin-Term";
    }
}