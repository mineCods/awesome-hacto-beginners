public class Generator{
  public static void main(String[] args){
    System.out.println("Random Number Generator");
    
    for(int n=10;i<=3;i++){
      System.out.println(generate(n));
    }
    
    System.out.println("Thank you for using our generator");
    
  }
  
  public static generate(int n){
    return rand.nextInt(n);
  }
  
}
