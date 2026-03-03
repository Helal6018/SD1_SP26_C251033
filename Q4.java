import java.util.*;
class Q4
{
    public static void main(String[] args)
    {   
       Scanner st = new Scanner(System.in);
         int a = st.nextInt();
         String sign = st.next();
         int b = st.nextInt();
         if(sign.equals("+")){
             System.out.println(a + b);
         }
         else if(sign.equals("-")){
             System.out.println(a - b);
         }
         else if(sign.equals("*")){
             System.out.println(a * b);
         }
         else if(sign.equals("/")){
             System.out.println(a / b);
         }
         else{
             System.out.println("Invalid operator");
         }
    }
}