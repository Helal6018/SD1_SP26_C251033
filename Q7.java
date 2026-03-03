import java.util.*;
class Q7
{
    public static void main(String[] args)
    {   
        int n;
        Scanner st = new Scanner(System.in);
        n = st.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(+ n + " x " + i + " = " + (n * i));
        }
        System.out.println(n);
    }
}