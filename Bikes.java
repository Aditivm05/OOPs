class Animal{
    protected String type="Animal";
}
class Dog extends Animal{
    public String type="Mammel";
    void printt(){
        System.out.println("I am a "+type);
        System.out.println("i am a "+super.type);
    }
}
class Bikes{
    public static void main(String args[]){
        Dog d= new Dog ();
        d.printt();
    }
}