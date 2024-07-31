
public class Palindrome{
// Write Your code here
public static void main(String[] args) {
        int temp=0;
        //Scanner in=new Scanner(System.in);
        //System.out.println("Enter the number");
        //int b=in.nextInt();
        int b=12121;
        int pal=b;
        while(b!=0){
            int rem=b%10;
            temp=temp*10+rem;
            b=b/10;
        }
        if(pal==temp){
            System.out.println("This is Palindrome number");
            
        }
        else{
            System.out.println("This is NOt a Palindrome number");
        }
    }
    
}
