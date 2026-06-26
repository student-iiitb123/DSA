public class Vistited {
    public static void main(String[] args) {
      int arr[] = {10, 5, 10, 15, 10, 5};
      boolean[] visited = new boolean[6];
      for(int i =0;i<6;i++){
        if(visited[i]){
            continue;
        }
        int frequency =1;
        for(int j =i+1;j<6;j++){
          if(arr[i] == arr[j]){
            frequency++;
            visited[j] = true;
          }
        }
        System.out.println(arr[i] + " -> " + frequency);

      }


    }
}
