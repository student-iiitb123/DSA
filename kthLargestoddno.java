import java.util.*;
public class kthLargestoddno {
    public static void main(String args[]){
        int l = -3;
        int r = 3;
        int k =3;
       
        
        ArrayList<Integer> a = new ArrayList<>();
        while(l<=r){
            if(l%2 != 0){
            a.add(l);
            
            }
              l++;
        }
     
     Collections.sort(a, Collections.reverseOrder());
     System.out.print(a.get(k-1));
}
}