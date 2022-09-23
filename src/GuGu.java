public class GuGu {
    public void dan(int n){
        for(int i =1; i <10; i++){
            System.out.println(String.format("%d", n) + "*" + String.format("%d", i) + "=" +  n * i);
        }
    }
    public static void main(String[] args){
        GuGu gugu = new GuGu();
        for(int j =2; j <10; j++){
            gugu.dan(j);
        }

    }
}
