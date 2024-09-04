public class MultipleClasses{
 public static void main(String[] args){
 System.out.println(" You are inside ABC main class ");
  MultipleClasses.main(10,23);
  MultipleClasses.main();
  
}
public static void main(int a,int b){
System.out.println("you are inside BCA main class"+a+b);
}

public static void main(){
System.out.println("you are inside the DEF class");
}
}