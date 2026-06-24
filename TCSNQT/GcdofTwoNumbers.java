import java.util.*;
public class GcdofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two number: ");
        int a=sc.nextInt(), b=sc.nextInt();
        while(b != 0){
            int temp = b;
            b = a%b;
            a=temp;
        }
        System.out.println(a);
    }
    
}