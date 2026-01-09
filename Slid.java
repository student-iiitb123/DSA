public class Slid {
    public static void main(String[] args) {

        int[][] arr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

       

        while (sr <= er && sc <= ec) {

            // 1️⃣ top row
            for (int i = sc; i <= ec; i++) {
                System.out.print(arr[sr][i] + " ");
            }
            sr++;

            // 2️⃣ right column
            for (int i = sr; i <= er; i++) {
                System.out.print(arr[i][ec] + " ");
            }
            ec--;

            // 3️⃣ bottom row
            
                for (int i = ec; i >= sc; i--) {
                    System.out.print(arr[er][i] + " ");
                }
                er--;
            

            // 4️⃣ left column
          
                for (int i = er; i >= sr; i--) {
                    System.out.print(arr[i][sc] + " ");
                }
                sc++;
              // spiral matrix
        }
    }
}
