import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int secretNumber;
        int attempts = 3;
        // Загадываем число
        secretNumber = random.nextInt(10); // Генерируем случайное число от 0 до 9

        // Цикл для обработки попыток угадывания числа
        while (attempts > 0) {
            System.out.println("У вас осталось " + attempts + " попыток.");
            System.out.print("Введите ваше предположение: ");
            int guess = scanner.nextInt();

            // Проверяем, угадал ли пользователь число
            if (guess == secretNumber) {
                System.out.println("Поздравляем! Вы угадали число.");
                break; // Выходим из цикла, так как число угадано
            } else if (guess < secretNumber) {
                System.out.println("Загаданное число больше вашего предположения.");
            } else {
                System.out.println("Загаданное число меньше вашего предположения.");
            }

            attempts--; // Уменьшаем количество оставшихся попыток
        }
    }
}

