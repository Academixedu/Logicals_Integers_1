public class Fibonacci{
// Write your code here
public static void main(String args[]){
    int a=1;
    int b=2;
    int c;
    int limit=5;
    System.out.println(a);
    System.out.println(b);
    for(int i=1;i<=limit;i++){
      c=a+b;
      System.out.println(c+",");
      a=b;
      b=c;
    }

}
}
