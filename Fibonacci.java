import java.util.Scanner;

public class Fibonacci{
// Write your code here
public int fib()
{
    Scanner sc = new Scanner(System.in);
    int num= sc.nextInt();
    int arr[] = new int[num+10];
    arr[0]=0;
    arr[1]=1;
    arr[2]=1;
    if(num==0)
    return 99;
     if(num==1 || num==2)
    return 1;
    else 
    {
        for(int i=3;i<=num;i++)
        {
            arr[i]=arr[i-1]+arr[i-2];
        }
        
    }
    int value=0;
    for(int h=arr.length-1;h>=0;h--)
    {
        if(arr[h]!=0)
       {value = arr[h];
        break;}
    }
    return value;
  //  return 99;

}
public static void main(String[] args) {
    Fibonacci fi = new Fibonacci();
    System.out.println(fi.fib());
}
}
