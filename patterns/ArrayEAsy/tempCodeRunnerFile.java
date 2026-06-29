    for(int j =k+1;j<arr.length;j++){
        int temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;

       }