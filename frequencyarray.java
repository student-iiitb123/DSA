public class frequencyarray {
    public static void main(String[] args) {
        int arr[] = new int[26];
        String s = "aabbccd";
        for(int i =0;i<s.length();i++){
            char ch = s.charAt(i);
            arr[ch-'a']++;
        }

      

        }
}
