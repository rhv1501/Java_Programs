import java.util.*;
class pgen
{
    public static void main(String args[])
    {
    try (Scanner sc = new Scanner(System.in)) {
        System.out.println("welcome to password generator");
        Random rd=new Random();
        System.out.println("enter the length of the password");
        int n=sc.nextInt();
        String small="abcdefghijklmnopqrstuvwxyz";
        String big="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String num="1234567890";
        String special="!@$%^&*-+?";
        String values=small+big+num+special;
        char[] password=new char[n];
        for(int i=0;i<n;i++)
        {
         password[i]=values.charAt(rd.nextInt(values.length()));
        }
        System.out.println(password);
        
    }
}
}