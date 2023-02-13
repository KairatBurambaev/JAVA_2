import java.util.Arrays;
import java.util.Scanner;
// import java.util.logging.ConsoleHandler;
// import java.util.logging.Level;
// import java.util.logging.XMLFormatter;
// import java.util.logging.FileHandler;
import java.util.logging.*;
import java.io.IOException;

public class program_4 {
    public static void main(String[] args) throws IOException {
        Scanner inp = new Scanner(System.in);

        Logger logger = Logger.getLogger(program_4.class.getName());
        ConsoleHandler ch = new ConsoleHandler();
        FileHandler fh = new FileHandler("thecode.log");
        logger.addHandler(fh);

        XMLFormatter xml = new XMLFormatter();
        ch.setFormatter(xml);
        fh.setFormatter(xml);

        System.out.print("Введите длину массива: ");
        int[] nums = new int[inp.nextInt()];
        
        for (int i = 0; i < nums.length; i++) {
            System.out.format("Введите %d элемент массива: ", i+1);
            nums[i] = inp.nextInt();
            }
        boolean bool = false;
        int bubble;
        logger.info(Arrays.toString(nums));
        while(!bool) {
            bool = true;
            for (int i = 0; i < nums.length-1; i++) {
                if (nums[i] > nums[i+1]) {
                    bool = false;
                    bubble = nums[i];
                    nums[i] = nums[i+1];
                    nums[i+1] = bubble;
                }
            }
            logger.info(Arrays.toString(nums));
        }
    }
}