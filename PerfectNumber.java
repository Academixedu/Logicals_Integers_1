import java.util.Scanner;

public class PerfectNumber{
// Write Your code here
public static void main(String[] args) {
     Scanner obj= new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=0;
        int s=obj.nextInt();
        for(int i=1;i<s;i++){
            if(s%i==0){
                num=num+i;
                System.out.println(i);
            }
        }
        if(num==0){
        System.out.println("Perfect number " +s);

        }

    }
    
}
