import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите название - ");
        String boloneze = scanner.nextLine();

        System.out.print("Введите количество макароны - ");
        String makaroni = scanner.nextLine();

        System.out.print("Введите количество фарша - ");
        String farsh = scanner.nextLine();

        System.out.print("Введите количество масла - ");
        String masla = scanner.nextLine();

        PrintWriter printWriter = new PrintWriter("file.txt");
        printWriter.println("Название блюда: " + boloneze);
        printWriter.println("Макароны: " + makaroni);
        printWriter.println("Фарш: " + farsh);
        printWriter.println("Масла: " + masla);

        printWriter.close();
    }
}