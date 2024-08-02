 import java.util.Scanner;
public class Palindrome{
    public void palin(){
        Scanner in = new Scanner(System.in);
        System.out.println("enter number");
        int f=in.nextInt();
        int temp=0;
        int pal=f;
        while(f!=0){
            int rem = f%10;
            temp=temp*10+rem;
            f=f/10;
        }
        if(temp==pal){
        System.out.println("palindrome is :"+temp);

    }
    else{
        System.out.println("not palindrome");
    }
}
    public static void main(String[] args){
        Palindrome fa = new Palindrome();
        fa.palin();


    }
// Write Your code here
}
