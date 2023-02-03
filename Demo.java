import java.util.Arrays;

public class Demo {
    public static void main(String[] args) {
        Demo d = new Demo();
        String s1 = "garden";
        String s2 = "danger";
        d.isAnagram(s1, s2);
    }

    public void isAnagram(String s1, String s2) {
        boolean result = true;
        if (s1.length() != s2.length()) {
            result = false;
        } else {
            char[] s1_char = s1.toCharArray();
            char[] s2_char = s2.toCharArray();
            Arrays.sort(s1_char);
            Arrays.sort(s2_char);
            for (int i = 0; i < s1_char.length; i++) {
                if (s1_char[i] != s2_char[i]) {
                    result = false;
                    break;
                }
            }
        }
        System.out.println(s1 + " and " + s2 + " are Anagrams?: " + result);
    }
}