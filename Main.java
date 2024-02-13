import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите свой вес (в киллограмах, например 78,2):");
        float weight = scanner.nextFloat();

        System.out.print("Введите свой рост (в метрах, например 1,89):");
        float height = scanner.nextFloat();

        System.out.print("Введите свой возраст:");
        float age = scanner.nextFloat();

        float IMT = weight / (height * 2);
        float idealWeight = (float) (24.9 * height * 2);
        float BMR = (float) (88.36 + (13.4 * weight) + (4.8 * height) - (5.7 * age));

        if (IMT > 24.9) {
            System.out.println("Рекомендуется снизить вес для достижения идеального веса.\n");
            System.out.println("Ваш идеальный вес: " + idealWeight + "кг.");
            System.out.println("Необходимо сбросить: " + (weight - idealWeight) + "кг.");
            System.out.println("Рекомендуемый дневной прием калорий: " + BMR);
        } else if (IMT < 18.5) {
            System.out.println("Рекомендуется увеличить потребление пищи для набора веса.\n");
            System.out.println("Ваш идеальный вес: " + idealWeight + "кг.");
            System.out.println("Необходимо набрать: " + (idealWeight - weight) + "кг.");
            System.out.println("Рекомендуемый дневной прием калорий: " + BMR);
        } else {
            System.out.println("Ваш вес находится в пределах нормы.\n");
            System.out.println("Ваш идеальный вес: " + idealWeight + "кг.");
            System.out.println("Рекомендуемый дневной прием калорий: " + BMR);
        }

    }
}
