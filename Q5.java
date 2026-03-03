import java.util.*;
class Q5
{
    public static void main(String[] args)
    {
    int a, b, c, temp;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();

    if(a < b){
        temp = a;
        a = b;
        b = temp;
    }
    else if(b < c){
        temp = b;
        b = c;
        c = temp;
    }
    else if(a < c){
        temp = a;
        a = c;
        c = temp;
    }
    System.out.println(a);
    }
}