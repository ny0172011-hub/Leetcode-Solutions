import java.util.*;
public class FriendsPairingProblem {
    public static int pair(int n){
        if(n==1||n==2){
            return n;
        }
        return pair(n-1)* (n-1)*pair(n-2);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Boys:");
        int n=sc.nextInt();
        System.out.println(pair(n));
    }
}
