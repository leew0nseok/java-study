public class AnnoymousWorkExample {
    public static void main(String[] args){
        AnnoymousWork annoy = new AnnoymousWork();
        annoy.field.start();
        annoy.method1();
        annoy.method2(new Worker(){
            @Override
            public void start() {
                System.out.println("테스트를 합니다.");
            }
        });
    }
}
