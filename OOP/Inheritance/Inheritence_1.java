package OOP;

class common{
    void eat(){
        System.out.println("All animals eat");
    }
}
class lion extends common{
    void roar(){
        System.out.println("Lions roar");
    }
}
public class Inheritence_1{
    public static void main(String[] args){
        lion mylion= new lion();
        mylion.eat();
        mylion.roar();
    }
}