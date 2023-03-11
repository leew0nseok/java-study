class ShopService{
    private static ShopService shopservice = new ShopService();
    private ShopService(){}

    static ShopService getInstance(){
        return shopservice;
    }
}
public class fivethrid {
    public static void main(String[] args){
        ShopService obj1 = ShopService.getInstance();
        ShopService obj2 = ShopService.getInstance();

        if(obj1 == obj2){
            System.out.println("���� ShopService ��ü�Դϴ�. ");
        }
        else{
            System.out.println("�ٸ� ShopService ��ü�Դϴ�. ");
        }
    }
}
