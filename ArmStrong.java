import java.util.Scanner;

public class ArmStrong{
    public boolean armStrong(){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String s = String.valueOf(num);
        int len = s.length();
        int count=0;
        for(int i=0;i<len;i++)
        {
            count+=(int)Math.pow(Integer.parseInt(String.valueOf(s.charAt(i))),len);
        }
        if(count==num)
        return true;
        return false;
    }
    public static void main(String[] args) {
        ArmStrong ar = new ArmStrong();
        System.out.println(ar.armStrong());
    }
// Write your code here
}
