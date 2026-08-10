import java.util.*;

// public class Stringbases{ 
//     public static void main(String[] args){
//         //String str = "Preeti Singh"; 
//         //System.out.println(str);

//         // Scanner input = new Scanner(System.in);
//         // String st = input.next();
//         // System.out.println(st);

//         // Scanner input = new Scanner(System.in);
//         // String st = input.nextLine();
//         // System.out.println(st);

//         // String str = "Hello World";
//         // int len = str.length();
//         //System.out.println(len);
//         //System.out.println(str.charAt(1));
//         //System.out.println(str.indexOf('e'));

//         // String str = "Hello";
//         // char ch = str.charAt(3);
//         //System.out.println(ch);

//         //String gtr = "Hello";
//         //System.out.println(str.compareTo(gtr));

//         //System.out.println(str.startsWith("Hel"));
//         //System.out.println(str.concat(gtr));

//         // str += 10;
//         // System.out.println(str);

//         // for(int i = 1; i < 3; i++){
//         //     System.out.print(str.substring(i));
//         // }

//         // String str = "abcd";

//         // for(int i = 0; i <= 3; i++){
//         //     for(int j = i+1 ; j <= 4; j++){
//         //         System.out.println(str.substring(i,j)+ " ");
//         //     }
//         // }

//         //String s = "Hello"; // -> Heylo
//         //String x = "Hello";
//         //x = "Mello";
//         //System.out.println(x); 

//         // s = s.substring(0,2) + 'y' + s.substring(3);
//         // System.out.println(s);

//         // String str = "";
//         // for(int i = 0; i <= 10; i++){
//         //     str += i;
//         // }
//         // System.out.println(str);

//         //  String s1 = "Hello";
//         //  String s2 = "Hello";
//         //  String s3 = new String("Hello");
//         // System.out.println(s1==s2);
//         // System.out.println(s1==s3);

//         //System.out.println(s1.equals(s3));

//         // StringBuilder str = new StringBuilder("Hello");
//         // str.append(" World");
//         // System.out.println(str);

//         // StringBuilder str = new StringBuilder("Hello");
//         // str.setCharAt(0,'m');
//         // System.out.println(str);

//         // StringBuilder str = new StringBuilder("Hello");
//         // str.insert(2, 'y');
//         // System.out.println(str);

//         // StringBuilder str = new StringBuilder("Preeti");
//         // str.reverse();
//         // System.out.println(str);

//         // StringBuilder str = new StringBuilder("Hello");
//         // str.delete(1,3);
//         // System.out.println(str);

//         Scanner input = new Scanner(System.in);
//         StringBuilder str = new StringBuilder(input.nextLine());
//         System.out.println(str);

//         for(int i = 0; i < str.length(); i++){
            
//             boolean flag = true;
//             char ch = str.charAt(i);
//             int ascii = (int)ch;

//             if(ascii >= 97) flag = false;
//             if(flag == true){
//                 ascii += 32;
//                 char dh = (char)ascii;
//                 str.setCharAt(i,dh);
//             }
//             else{
//                 ascii -= 32;
//                 char dh = (char)ascii;
//                 str.setCharAt(i, dh);
//             }
//         }
//         System.out.println(str);
//     }
// }

/*public class Stringbases{
    public static void main(String[] args){
        String str = "aaabbbbccddde";
        String ans = " " + str.charAt(0);
        int count = 1;

        for(int i = 1; i < str.length(); i++){
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);

            if(curr == prev){
                count++;
            }
            else{
                if(count > 1) ans += count;
                count = 1;
                ans += curr;
            }
        }
        if(count > 1) ans += count;
        System.out.println(ans);
    } 
}*/

/*public class Stringbases{
    public static void main(String[] args){
        String str = "I am an online educator";
        String ans = "";
        StringBuilder sb = new StringBuilder(" ");

        for(int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                sb.append(ch);
            }
            else{
                sb.reverse();
                ans += sb;
                ans += sb;
                sb = new StringBuilder(" ");
            }
        }
        sb.reverse();
        ans += sb;
        System.out.println(ans);
    }
}*/

public class Stringbases {
    public static void main(String[] args) {
        String str = "abba";
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                if (isPalindrome(str.substring(i, j))) {
                    count++;
                }
            }
        }
        System.out.println("The no of palindromes: " + count);
    }

    public static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
