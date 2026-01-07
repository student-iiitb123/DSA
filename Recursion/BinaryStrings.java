import java.util.ArrayList;

public class BinaryStrings {
    public static void main(String[] args) {
        int n = 3;

        ArrayList<String> list = new ArrayList<>();
        list.add("");

        for (int i = 0; i < n; i++) {
            ArrayList<String> next = new ArrayList<>();

            for (String s : list) {
                next.add(s + "0"); // always allowed

                if (s.isEmpty() || s.charAt(s.length() - 1) != '1') {
                    next.add(s + "1");
                }
            }

            list = next;
        }

        for (String s : list) {
            System.out.println(s);
        }
    }
}
