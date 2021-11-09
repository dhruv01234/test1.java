package p6;
class first{
  public first()
  {
    
    System.out.println(this.hashCode());
  }
}
class Second extends first
{
  Second ()
  {  super();
    
    System.out.println(this.hashCode());
  }
}
public class Test2 {
  public static void main(String[] args) {
    Second obj = new Second();

  }
}
