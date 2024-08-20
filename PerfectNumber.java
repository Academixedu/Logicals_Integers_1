import java.util.*;
public class PerfectNumber{
    public static boolean number(double num){
        for(int  i=1;i<=num;i++)
        {
            if(num%i==0)
            return true;
            
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.print(number(num));
    }
// Write Your code here

}
