import java.util.*;
        // Complete the function
       
        // a=a.toLowerCase();
        // b=b.toLowerCase();
        
        // char[] achar=a.toCharArray();
        // char[] bchar=b.toCharArray();

        // Arrays.sort(achar);
        // Arrays.sort(bchar);

        // if(achar.equals(bchar)) return true;
        // else return false;
        
        // return Arrays.equals(achar, bchar);
public class anagram {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        int alen=a.length();
        int blen=b.length();
        int[] char_freq=new int[26];
        a=a.toLowerCase();
        b=b.toLowerCase();

         for(int i=0;i<a.length();i++)
         {
             char curr_char=a.charAt(i);
             int index=curr_char-'a';
             char_freq[index]++;
         }

         for(int i=0;i<b.length();i++)
         {
             char curr_char=b.charAt(i);
             int index=curr_char-'a';
             char_freq[index]--;
         }

         for(int i=0;i<26;i++)
         {
             if(char_freq[i] != 0) return false;
         }
         return true;



        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

        
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
