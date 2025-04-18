class Box{
    double width,height,depth;
    Box(){
        System.out.println("Constructing a box");
        width=height=depth=20;
    }
    double volume(){
        return width*height*depth;
    }
}
public class Main2 {
    public static void main(String[] args) {
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
        vol= mybox1.volume();
        System.out.println("Volume is:"+vol);

        vol= mybox2.volume();
        System.out.println("Volume is:"+vol);
    }
}
