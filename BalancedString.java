
class BalancedString {
    static int BalancedPartition(String str, int n){
        if (n == 0)
            return 0;

        int l = 0, r = 0;
        int ans = 0;

        for(int i = 0; i < n; i++) {
            if (str.charAt(i) == 'L'){
                l++;
            } else if (str.charAt(i) == 'R'){
                r++;
            }

            if (l == r){
                ans++;
            }
        }
        return ans;
    }

    public static void main(String[] args){
        String str = "LRRL";
        int n = str.length();

        System.out.println(BalancedPartition(str, n));
    }
}