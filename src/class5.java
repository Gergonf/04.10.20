import java.util.Scanner;


public class class5{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();

        if(x*x+y*y<=1&&((y<=x)&&(y>=-x))){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }

    }
}
