import java.util.ArrayList;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {

        ArrayList<Laptop> LaptopList = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            LaptopList.add(new Laptop());
            LaptopList.get(i).randomLaptop();
        }
        // for (int i = 0; i < LaptopList.size(); i++) {
        //     LaptopList.get(i).info();
        // }

        Scanner sc = new Scanner(System.in);
        int key;
        boolean flag = true;
        int keyRam;
        int keySSD;
        String keyOs;
        String keyColor;
        while (flag) {
            System.out.println(
                    "Введите цифру, соответствующую нужному критерию:\n1 - ОЗУ\n2 - Объём жёсткого диска\n3 - Операционная система\n4 - Цвет");
            key = sc.nextInt();
            switch (key) {
                case 1:
                    System.out.println("Выберите количество ОЗУ:");
                    keyRam = sc.nextInt();
                    System.out.println("Подходящие ноутбуки:");
                    for (Laptop laptop : LaptopList) {
                        if (laptop.ram.equals(keyRam)) laptop.info();
                    }
                    flag = false;
                    break;
                case 2:
                    System.out.println("Выберите объём жесткого диска");
                    keySSD = sc.nextInt();
                    System.out.println("Подходящие ноутбуки:");
                    for (Laptop laptop : LaptopList) {
                        if (laptop.ssd.equals(keySSD)) laptop.info();
                    }
                    flag = false;
                    break;
                case 3:
                    System.out.println("Какую операционную систему предпочитаете?");
                    keyOs = sc.next();
                    System.out.println("Подходящие ноутбуки:");
                    for (Laptop laptop : LaptopList) {
                        if (laptop.OS.equals(keyOs)) laptop.info();
                    }
                    flag = false;
                    break;
                case 4:
                    System.out.println("Выберите какой именно цвет");
                    keyColor = sc.next();
                    System.out.println("Подходящие ноутбуки:");
                    for (Laptop laptop : LaptopList) {
                        if (laptop.color.equals(keyColor)) laptop.info();
                    }
                    flag = false;
                    break;
                default:
                    System.out.println("Error. Try again");
                    break;
            }
        }
        sc.close();
    }
}