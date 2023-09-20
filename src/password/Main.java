package password;
import java.util.Scanner;
public class Main {
public static final Scanner keyboard=new Scanner(System.in);
public static void main(String[] args) {
	Generator generator=new Generator(keyboard);
	generator.mainLoop();
	keyboard.close();
}
}
//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