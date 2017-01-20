public class Calculator{
  
  public static void main(String[] args){
    switch (args[0]){
      case "add":
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        System.out.println(a+b);
        break;
      case "subtract":
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        System.out.println(a-b);
        break;
    }
  }
  
}