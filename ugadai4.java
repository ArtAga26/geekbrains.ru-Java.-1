
import java.util.Random;
import java.util.Scanner;
public class ugadai4 {



    private static final int MAX_VALUE = 10;

        class popitka4 {

        public static final int MAX_VALUE = 10;

        public String main(String[] args) {

            Random rand = new Random();
            int x = rand.nextInt(MAX_VALUE + 1);

            Scanner scanner = new Scanner(System.in);
            System.out.println("Угадай число");

            System.out.println("Загаданное число от 0 до " + MAX_VALUE);



            private static String checkInput(int i; int x );
            {
                if (i < 0 || i > MAX_VALUE - 1) {
                    return "Загаданное число вне диапазона";
                }
                if (i > x) return "Загаданное число больше";
                if (i < x) return "Загаданное число меньше";
                return "Угадано";
            }
            scanner.close();
        }
    }
}
