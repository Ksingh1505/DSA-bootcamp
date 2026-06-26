// import java.util.*;
// public class CheckAnagram {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s1 = sc.nextLine();
//         String s2 = sc.nextLine();
//         char[] a = s1.toCharArray();
//         char[] b = s2.toCharArray();
//         Arrays.sort(a);
//         Arrays.sort(b);
//         System.out.println(Arrays.equals(a,b) ? "Anagram" : "Not Anagram");
//     }
// }

import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s1= sc.nextLine();
        String s2 = sc.nextLine();

        if(s1.length() != s2.length()){
            System.out.println("Not Anagram");
        }

        int[] freq = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
            freq[s2.charAt(i) - 'a']--;
        }
        for(int x:freq)
            if(x != 0){
                System.out.println("not anagram");
                return;
            }
            System.out.println("anagram");
    }
}