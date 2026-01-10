public class SubStringPrint {

    public static void printSubstringEnd(String s, int start, int end) {
        if (end > s.length()) {
            return;
        }

        System.out.println(s.substring(start, end));
        printSubstringEnd(s, start, end + 1);
    }

    public static void printSubstring(String s, int start) {
        if (start >= s.length()) {
            return;
        }

        printSubstringEnd(s, start, start + 1);
        printSubstring(s, start + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        printSubstring(str, 0);
    }
}
