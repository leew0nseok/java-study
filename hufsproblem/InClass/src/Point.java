public class Point {
    int x;
    int y;
    Point(){};
    Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }
    void showPoint(){
        System.out.println("(" + this.x+ ","+ this.y+ ")");
    }
}
