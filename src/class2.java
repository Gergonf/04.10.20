import java.util.Scanner;


public class class2{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();

        if(y<=2-x*x && ((y>=x &&x<=0) || (y>=0 &&x>=0))){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }

    }
}
