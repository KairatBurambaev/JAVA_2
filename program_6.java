import java.util.Scanner;
import java.util.logging.*;
import java.io.IOException;

public class program_6 {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        Logger logger = Logger.getLogger(program_6.class.getName());
        ConsoleHandler ch = new ConsoleHandler();

        SimpleFormatter sFormat = new SimpleFormatter();
        ch.setFormatter(sFormat);
        
        System.out.print("Первое число: ");
        int x = inp.nextInt();
        System.out.print("Математический знак: ");
        String math_symbol = inp.next();
        System.out.print("Второе число: ");
        int y = inp.nextInt();

        switch (math_symbol) {
            case ("-"):
                logger.info(Integer.toString(x-y));
                break;
            case ("+"):
                logger.info(Integer.toString(x+y));
                break;
            case ("*"):
                logger.info(Integer.toString(x*y));
                break;
            case ("/"):
                logger.info(Integer.toString(x/y));
                break;
        }
    }
}