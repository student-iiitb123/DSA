import java.util.*;

public class AbsoluteDiffrence {
    public static void main(String[] args) {
        int a[] = {4,1,8,7};
        int b[] = {2,3,6,5};

        Arrays.sort(a);
        Arrays.sort(b);
        int sum =0;

        for(int i =0;i<b.length;i++){
            int abs =Math.abs(a[i] - b[i]);
          
            sum = sum +abs;

        }
        System.out.println(sum);
    }
}
