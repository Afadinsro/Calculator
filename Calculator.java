public class Calculator{
  
  public static void main(String[] args){
    switch (args[0]){
      case "add":
        double a = Double.parseDouble(args[1]);
        double b = Double.parseDouble(args[2]);
        System.out.println(a+b);
        break;
      case "subtract":
        double c = Double.parseDouble(args[1]);
        double d = Double.parseDouble(args[2]);
        System.out.println(c-d);
        break;
      case "multiply":
        double e = Double.parseDouble(args[1]);
        double f = Double.parseDouble(args[2]);
        System.out.println(e*f);
        break;	   
    }
  }
  
}