public class Demo{
    public static void main(String[] args) {
        Demo d = new Demo();
        String s1 = "garden";
        String s2 = "danger";
        d.isAnagram(s1, s2);
    }

    public void isAnagram(String s1, String s2){
        boolean result = false;
        System.out.println(s1 + " and " + s2 +" are Anagrams?: " + result);
    }
}