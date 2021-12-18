import java.util.Random;
import java.util.Scanner;

public class Sample02 {

    public static void main(String[] args) {

        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry",
                "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper",
                "pineapple", "pumpkin", "potato"};

        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        String correctAnswer = words[random.nextInt(words.length)];
        StringBuilder word = new StringBuilder(correctAnswer);

        System.out.println("Отгадайте слово");
        StringBuilder playerAnswer;

        StringBuilder test = new StringBuilder("###############");
        System.out.println(test);

        while (true) {


            playerAnswer = new StringBuilder(scanner.nextLine());

            for (int i = 0; i < playerAnswer.length(); i++) {
                if (i > word.length())
                    break;

                if (word.charAt(i) == playerAnswer.charAt(i)) {

                    test.insert(i, playerAnswer.charAt(i));
                    word.replace(i, i + 1, "#");

                }

            }

            System.out.println(test);

            if (playerAnswer.toString().equals(correctAnswer))
                break;

        }





    }

}
