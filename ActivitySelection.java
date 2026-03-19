import java.util.*;

public class ActivitySelection {
    public static void main(String args[]){
        ArrayList<Integer> a = new ArrayList<>();
      
        int start[] = {1,2,3};
        int end[] = {10,3,4};
          int TwoDarray[][] = new int[start.length][3];
          for(int i =0;i<start.length;i++){
             TwoDarray[i][0] = i;
             TwoDarray[i][1] = start[i];
             TwoDarray[i][2] = end[i];
          }
          //lamda function;
            Arrays.sort(TwoDarray, Comparator.comparingDouble(o -> o[2]));

        int maxActivity = 1;
        a.add(TwoDarray[0][0]);
        int lastJob = TwoDarray[0][2];
        for(int i=1;i<start.length;i++){
            if(TwoDarray[i][1] >= lastJob){
                a.add(TwoDarray[i][0]);
                maxActivity++;
                lastJob = TwoDarray[i][2];

            }
        }
      for(int i =0;i<a.size();i++){
        System.out.print("A"+a.get(i)+ " ");
      }
       
    }
}
