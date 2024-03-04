import java.util.Scanner;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();

            // Удаление пробелов и приведение к нижнему регистру
            input = input.replaceAll("\\s+", "").toLowerCase();

            // Проверка на палиндром
            boolean isPalindrome = true;
            for (int i = 0; i < input.length() / 2; i++) {
                if (input.charAt(i) != input.charAt(input.length() - 1 - i)) {
                    isPalindrome = false;
                    break;
                }
            }

            if (isPalindrome) {
                System.out.println("Строка является палиндромом.");
            } else {
                System.out.println("Строка не является палиндромом. Программа завершается.");
                break;
            }
        }

        scanner.close();
    }
}
