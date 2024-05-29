public class StringObject {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = new String("Java");
        System.out.println(str1==str2);
        System.out.println(str1==str3);

        char[] c = {'J', 'a', 'v', 'a'};
        byte[] b = {65, 66, 67, 68};
        String str4 = new String(c);
        String str5 = new String(b);
        System.out.println(c);
        System.out.println(str5);
        System.out.println(str1==str4);
    }
}
