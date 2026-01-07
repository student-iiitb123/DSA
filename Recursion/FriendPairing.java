public class FriendPairing {
    public static int pair(int a){
        if(a ==1 || a==2) return a;

        return pair(a-1) + (a-1)*pair(a-2);

    }
    public static void main(String[] args) {
        int n =3;
       int c = pair(n);
       System.out.println(c);
    }
}
