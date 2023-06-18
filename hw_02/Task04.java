package Exception.homework.hw_02;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        emptyString();
    }

    public static void emptyString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст:");
        String str = scanner.nextLine();
        scanner.close();
        if (str == "") {
            throw new RuntimeException("Строка не должна быть пустой");
        }
    }
}
