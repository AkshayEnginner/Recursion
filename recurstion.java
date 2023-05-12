import java.util.*;
class recurstion
{
    Scanner sc = new Scanner(System.in);
    void function(int a)
    {
        if(a<=10)
        {
           System.out.println(a);
           function(a+1);
        }
    }
}
class main
{
    public static void main(String args[])
    {
        aks a = new aks();
        a.function(1);
    }
}