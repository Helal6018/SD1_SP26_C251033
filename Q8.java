import java.util.*;
class Q8
{
    public static void main(String[] args)
    {   
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        long fact = 1;
        for(int i = 1; i <= n; i++){
            fact *= i;
        }
        System.out.println(fact);
    }
}