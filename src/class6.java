import java.util.Scanner;


public class class6{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();

        if(y>=1-x&&y>=2*x*x&&x<=1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }

    }
}
