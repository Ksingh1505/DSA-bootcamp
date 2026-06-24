import java.util.*;
public class ReverseAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        // String rev = "";
        // for(int i=str.length() - 1; i>= 0; i--){
        //     rev += str.charAt(i);
        
        // }
        // System.out.println(rev);
        StringBuilder rev = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            rev.append(str.charAt(i));
        }

        System.out.println(rev);
    }
}

// public class Main {
//     public static void main(String[] args) {
//         String str = "Hello";
//         String reversed = new StringBuilder(str).reverse().toString();

//         System.out.println(reversed);
//     }
// }
