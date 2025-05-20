import java.util.Scanner;
public class EOL{
    public static void main(String[] Args){
        Scanner scanner = new Scanner(System.in);
        int linenumber = 1;
        while(scanner.hasNextLine()){
            String line = scanner.nextLine();
            System.out.println(linenumber + " " + line);
            linenumber++;
        }
        scanner.close();
    }
}
