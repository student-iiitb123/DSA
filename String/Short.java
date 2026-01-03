
public class Short {
    public static void main(String[] args) {
        String str = "WNEENESENNN";
        int initialX =0;
        int initialY =0;
        int x =0;
        int y =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'W'){
                x--;
            }
            else if(str.charAt(i) =='N'){
                y++;
            }
            else if(str.charAt(i) == 'S'){
                y--;
            }
            else{
                x++;
            }


        }

        double distance = Math.sqrt(
    (y - initialY) * (y - initialY) +
    (x - initialX) * (x - initialX)
);
System.out.println(distance);


         


    }
}