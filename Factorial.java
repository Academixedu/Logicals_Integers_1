import java.util.Scanner;
public class Factorial{
// Write Your Code Here
public static void main(String[] args) {
    int temp=1;
    Scanner sd= new Scanner(System.in);
    System.out.println("enter the value");
    int a=sd.nextInt();
    for(int i=1;i<=a;i++){
        temp=temp*i;
        System.out.println("factorial: "+temp);
    }


}
}
