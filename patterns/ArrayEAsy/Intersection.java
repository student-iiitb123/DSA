import java.util.ArrayList;

public class Intersection {
    public static void main(String[] args) {

        int arr[][] = {{0,2},{5,10},{13,23},{24,25}};
        int brr[][] = {{1,5},{8,12},{15,24},{25,26}};

        ArrayList<ArrayList<Integer>> a = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr.length && j < brr.length) {

            int start1 = arr[i][0];
            int end1 = arr[i][1];

            int start2 = brr[j][0];
            int end2 = brr[j][1];

           if (end1 >= start2) {

    int k = Math.max(start1, start2);
    int l = Math.min(end1, end2);

    ArrayList<Integer> temp = new ArrayList<>();

    temp.add(k);
    temp.add(l);

    a.add(temp);
}

            if (end1 < end2) {
                i++;
            } else {
                j++;
            }
        }
        System.out.print(a);
    }
}