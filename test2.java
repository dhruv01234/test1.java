package p6;

interface i1
{
  default public void m1()
{
  System.out.println("welcome");
}
}
interface i2
{
  default public void m1()
  {
    System.out.println("hello");
  }
}
class abc
{
  public void m1()
  {
    System.out.println("inside the class");
  }
}
public class Testt  extends abc implements  i2,i1{
  public static void main(String[] args) {
    Testt obj1 = new Testt();
    obj1.m1();
  }

}
