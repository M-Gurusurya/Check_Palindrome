import java.util.Scanner;

public class Check_Palindrome {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        String str=scanner.next();
        int start=0;
        int end=str.length()-1;
        System.out.println(checkpalindrome(str,start,end));
    }
    public static boolean checkpalindrome(String str,int start,int end)
    {
        if(start<end)
        {
            if(str.charAt(start)!=str.charAt(end))
            {
                return false;
            }
        }
        if(start>end)
        {
            return true;
        }
        return checkpalindrome(str,start+1,end-1);
    }
}
