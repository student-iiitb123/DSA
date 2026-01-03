
public class Search {
    public static void main(String[] args) {
           int[][] arr = {
            {10,20,30,40},
            {15,25,35,45},
            {27,29,37,48},
            {32,33,39,50}
        };

        int key = 29;
        int sc=3;
        int sr=0;
        

        
        while(sc >= 0 && sr <= 3){
            if(arr[sr][sc] > key){
                sc--;
            }
            else if(arr[sr][sc] < key){
                sr++;
            }
            else{ System.out.println(sr);
                System.out.println(sc);
                break;
               
            }
        }
    
    
    }
}
