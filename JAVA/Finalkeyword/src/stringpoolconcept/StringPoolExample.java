package stringpoolconcept;

public class StringPoolExample {
    public static void main(String[] args) {
        String s1 = "trupti";
        String s2 = new String("trupti");
        System.out.println(s1.equals(s2));
        System.out.println(s1==s2);
        System.out.println(s1);
        System.out.println(s2);
    }
}
