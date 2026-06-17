
import java.util.*;
public class CheckEvenOrOdd {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a number: ");
        int n= sc.nextInt();
        System.out.println(n % 2 ==0 ? "Even" : "Odd");
        sc.close();
    }
}
