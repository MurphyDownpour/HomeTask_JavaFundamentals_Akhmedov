package by.htp.branching.main;

import java.util.Scanner;

/**
 * Программа — льстец. На экране высвечивается вопрос «Кто ты: мальчик или девочка? Введи Д или М».
 * В зависимости от ответа на экране должен появиться текст «Мне нравятся девочки!» или «Мне нравятся мальчики!».
 */

public class Task21 {
    public static void main(String[] args) {
        System.out.print("Кто ты: мальчик или девочка? Введи Д или М ");
        Scanner sc = new Scanner(System.in);
        String choice = sc.next().toUpperCase();

        switch (choice) {
            case "Д":
                System.out.println("Мне нравятся девочки!");
                break;
            case "М":
                System.out.println("Мне нравятся мальчики!");
                break;
            default:
                System.out.println("Мне нравятся бесполые!");
                break;
        }
    }
}
