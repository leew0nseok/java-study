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

        cat.setName("�߿���");
        dog.setName("�۸���");

        System.out.println(cat.name);
        System.out.println(dog.name);
        //cat, dog�� �̸��� �ٸ��� ��µ�.
        //Ŭ�������� ���� �߿��� �κ��� �� �����ص� �� ��ü ������ ���� ���������� �����ȴٴ� ��
        //��ü �������̶�� ���� �ǹ̵� �ᱹ �� ��ü ������ ���� ���������� ����

    }
}
