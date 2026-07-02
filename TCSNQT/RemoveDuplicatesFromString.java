//METHOD 1 : BRUTEFORCE USING INDEXOF()

// import java.util.*;
// public class RemoveDuplicatesFromString {
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         String str = sc.nextLine();
//         String result = "";
//         for(char ch: str.toCharArray()){
//             if(result.indexOf(ch) == -1)
//                 result += ch;
//         }
//         System.out.println(result);
//     }
// }

//METHOD 2 : USING HASHSET
// import java.util.*;
// public class RemoveDuplicatesFromString{
//     public static void main(String[] args) {
//         Scanner sc= new Scanner(System.in);
//         String str = sc.nextLine();
//         StringBuilder ans = new StringBuilder();
//         HashSet<Character> set = new HashSet<>();
//         for(char ch:str.toCharArray()){
//             if(!set.contains(ch)){
//                 set.add(ch);
//                 ans.append(ch);
//             }
//         }
//         System.out.println(ans);
//     }
// }

// Method 3 : Using Frequency
import java.util.*;
public class RemoveDuplicatesFromString{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        boolean[] visited = new boolean[26];
        StringBuilder ans = new StringBuilder();
        for(char ch: str.toCharArray()){
            if(!visited[ch - 'a']){
                visited[ch - 'a'] =true;
                ans.append(ch);
            }
        }
        System.out.println(ans);
    }
/
}