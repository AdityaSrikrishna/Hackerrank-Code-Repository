import java.util.Scanner;
public class Multiple{
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        for(int i=1; i<11; i++){
            System.out.println(a + " x " + i + " = " + (a*i));
        }
    }
}
