import java.util.Scanner;

public class Palindrome{
    public static String armStrong(int num)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Give your Value");
        int a = in.nextInt();
         String s = String.valueOf(a);
        int max = s.length()/2;
        int count=0;
        int i=0;
        
       
        int j=s.length()-1;
        while (i<max && (j)>=max) {
            if(s.charAt(i)==s.charAt(j))
            count++;
            i++;
            j--;
        }   
        if(count==max)
        return ("yes it is palindrome");
       
        return ("no it is not a palindrome ");
    }
    public static void main(String[] args) {
        System.out.println(armStrong(0));
    }
// Write your code here
}
