import java.util.Scanner;


public class class7{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float x = in.nextFloat();
        float y = in.nextFloat();

        if((y<=1&&x>=0&&x*x+y*y<=1)||(y<=1&&x>=0&&x*x+y*y>1&&y>=x-1)){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");

        }

    }
}
