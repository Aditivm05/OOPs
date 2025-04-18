class Box1{
    double width,height,depth;
    Box1(double w, double h, double d ){
        width = w;
        depth = d;
        height = h;
    }
    double volume(){
        return width*height*depth;
    }
}

public class Main3 {
    public static void main(String[] args) {
        Box1 mybox1 = new Box1(10,20,30);
        double vol;
        vol= mybox1.volume();
        System.out.println("Volume is:"+vol);

        vol= mybox1.volume();
        System.out.println("Volume is:"+vol);
    }

}
