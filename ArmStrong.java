import java.util.Scanner;

public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.print("Enter a Number:");
        int num=sc.nextInt();
        int  temp, remainder, result=0, n=0;    
        temp= num;   
        for (;temp != 0; temp /= 10, ++n);  
        temp = num;    
        for (;temp!=0; temp/= 10)    
        {
            remainder = temp % 10;     
            result += Math.pow(remainder, n);      
        }
        if(result== num)
            System.out.println(num+" is an Armstrong number.");
        else
            System.out.println(num+" is not an Armstrong number.");
    }
}