public class pattern19 {
    public static void main(String[] args) {
        for(int i =0;i<5;i++){
            for(int j =0;j<5-i;j++){
                System.out.print("*");
            }
            for(int k =0;k<2*i;k++){
                System.out.print(" ");
            }
            for(int l=0;l<5-i;l++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=0;i<5;i++){
            for(int j =0;j<=i;j++){
                System.out.print("*");
            }

            for(int k =0;k<8-2*i;k++){
                System.out.print(" ");
            }


            for(int l=0;l<=i;l++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
    
}
