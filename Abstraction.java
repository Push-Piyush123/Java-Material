//process of hiding certain details and showing only essentaial information to user
// we cant make object of abstract class -no body


abstract class Car {
   abstract public void fueltype();

   public void color(){
    System.out.println("Black Color");
   }

}
class tata extends Car {
    public void fueltype(){
        System.out.println("Disel");
    }
}
public class Abstraction {
    public static void main(String[] args) {
        tata a =new tata();
        a.fueltype();
        a.color();
    }
}