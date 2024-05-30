public class BasicRegEx {
    public static void main(String[] args) {
        String str = "A1";
        System.out.println(str.matches("[A-Za-z][0-9]"));
        String str1 = "a";
        System.out.println(str1.matches("\\w"));
        String str2 = "abcdef787%";
        System.out.println(str2.matches("\\w*"));
        String str3 = "johncena5@gmail.com.np";
        System.out.println(str3.matches("\\w*@gmail.(.*)"));
    }
}
