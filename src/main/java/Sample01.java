import java.util.Random;
import java.util.Scanner;

public class Sample01 {

    static int counter = 3;
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        while (true) {

            System.out.println("Угадайте число от 0 до 9");
            int correctNumber = random.nextInt(10);

            int playerAnswer = sc.nextInt();

            for (int i = 1; i < counter; i++) {
                if (playerAnswer < correctNumber) {

                    System.out.println("Ваше число меньше чем загаданное, попробуйте ещё раз");
                    playerAnswer = sc.nextInt();

                } else if (playerAnswer > correctNumber) {

                    System.out.println("Ваше число больше чем загаданное, попробуйте ещё раз");
                    playerAnswer = sc.nextInt();

                } else {
                    System.out.println("Вы угадали загаданное число");
                    break;
                }
            }

            System.out.println(playerAnswer == correctNumber ? "Повторить игру ещё раз? 1 - да / 0 - нет" :
                    "Вы проиграли. Повторить игру ещё раз? 1 - да / 0 - нет");
            playerAnswer = sc.nextInt();

            if (playerAnswer == 0)
                break;

        }

    }



}
