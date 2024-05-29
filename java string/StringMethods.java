public class StringMethods {
    public static void main(String[] args) {
        String str = "   This is a string.    ";
        System.out.println("Original: \" " + str + "\"");
        str = str.trim();
        System.out.println("After trimming: " + str);
        System.out.println("Length of string : " + str.length());
        System.out.println("To upperCase : " + str.toUpperCase());
        System.out.println("Substring (7) : " + str.substring(7));
        System.out.println(str.replace("a", "the"));
        System.out.println(str.startsWith("Ti"));
        System.out.println(str.charAt(5));
        System.out.println(str.indexOf("str"));
        // String comparisons
        String str1 = "Java";
        String str2 = "java";
        String str3 = "JavaScript";
        System.out.println(str1.compareTo(str2));
        System.out.println(str1.compareToIgnoreCase(str2));
        System.out.println(str1.equals(str2));
        System.out.println(str1.equalsIgnoreCase(str2));
    }
}
