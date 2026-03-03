import java.util.*;
class Q9
{
    public static void main(String[] args)
    {   
        Scanner st = new Scanner(System.in);
        int n = st.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++){
            sum += i;
        }
        System.out.println(sum);
    }
}