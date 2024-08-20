import java.util.Scanner;

public class PerfectNumber{
// Write Your code here
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number");
    int n = sc.nextInt();
    int temp=0;
    for (int i=1;i<n;i++){
        if(n%i==0){
          temp=temp+i;
           System.out.println(i);

}
}
if (temp==n){
    System.out.println("Perfect number = "+n);
}
else{
    System.out.println("Not a perfect number = "+n);
}
}
}
