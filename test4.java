package p6;


interface test
{
  public abstract void square();  // abstract method in interface 
}
class arithmetic implements test  // arithmetic class implements the arithmetic interfacee 
{
  
  // define behaviour of the abstract method 
  @Override
  public void square() {
    System.out.println(2*2);
  }
}
public class Test57 {
  public static void main(String[] args) {
    arithmetic obj = new arithmetic();
    obj.square();
  }
}
