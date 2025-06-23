
public class MethodOverloading {
 public int add (int a, int b){
    return a+b;
 }
 public int add (int a,int b,int c){
    return a+b+c;
 }

 public static void main(String[] args) {
    MethodOverloading m = new MethodOverloading();
    System.out.println("--");
    System.out.println(m.add(4,5));
    System.out.println(m.add(2,3,5));
 }
}
