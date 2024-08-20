import java.util.*;
public class Factorial{
    public static void main(String[] a)
    {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=1;
        for(int i=1;i<=n;i++)
        {
            count*=i;
        }
        System.out.print(count);
    }
// Write Your Code Here
}
