    import java.util.Scanner;
    public class Factorial{
        public static void main(String[] args){
            Scanner in = new Scanner(System.in);
            System.out.println("enter number");
            int temp=1;
            int f = in.nextInt();
    
            for(int i=1;i<=f;i++){
                temp=temp*i;
    
            }
            System.out.println("factorial is : "+temp);
        }
    // Write Your Code Here
    }
