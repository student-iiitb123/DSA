public class CountFrequency {
    public static void main(String[] args) {
        int arr[] = {10,5,10,15,10,5};
        int hash[] = new int[16];

        for(int i =0;i<arr.length;i++){
            hash[arr[i]] ++;
        }

        for(int i =0;i<hash.length;i++){
            System.out.print(hash[i]);
        }

    }
}
