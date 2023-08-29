import java.util.*;
import java.lang.*;
public class temp
{
    public static void main(String args[])
    {
       try (Scanner sc = new Scanner(System.in)) {
        System.out.println("welcome");
        System.out.println("Enter your username");
        String a=sc.nextLine();
        System.out.println("Enter your password");
        String b=sc.nextLine();
        String user1="HarshGoel";
        String upw1="Harsh@Goel";
        String user2="RudreshHVyas";
        String upw2="Rudresh@1501";
        if(a==user1)
        {
            System.out.println("checking for harsh goel password");
            if(b==upw1)
            {
                System.out.println("WELCOME HARSH GOEL");
            }
            else{
                System.out.println("check your password");
            }
        }
        if(a==user2)
        {
            System.out.println("checking for Rudresh goel password");
            if(b==upw2)
            {
                System.out.println("WELCOME RUDRESH H VYAS");
            }
            else{
                System.out.println("check your password");
            }
        }
    }
}
}