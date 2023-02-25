package HomeWork6;

// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить
// поля и методы. Реализовать в java.
// 2) Создать коллекцию ноутбуков.
// 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации
// и выведет
// ноутбуки, отвечающие фильтру.
// Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение,
// Цвет - Значение
// 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие
// по условиям.

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HomeWork6.Notebook ChuwiAH401 = new HomeWork6.Notebook("Chuwi", "AH-401", "Black", 15.6, "LCD", 8, 256, "SSD");
        HomeWork6.Notebook SamsungS101 = new HomeWork6.Notebook("Samsung", "S-101", "Black", 15.6, "LCD", 8, 512, "SSD");
        HomeWork6.Notebook SamsungS150 = new HomeWork6.Notebook("Samsung", "S-150", "Green", 17.0, "TFT", 16, 512, "SSD");
        HomeWork6.Notebook AsusTUF504 = new HomeWork6.Notebook("ASUS", "TUF-504", "Red", 15.6, "OLED", 32, 2048, "HDD 2.0");
        HomeWork6.Notebook AsusTUF555 = new HomeWork6.Notebook("ASUS", "TUF-555", "White", 15.6, "TFT", 16, 1024, "SSD");

        List<HomeWork6.Notebook> notebookList = List.of(ChuwiAH401, SamsungS101, SamsungS150, AsusTUF504, AsusTUF555);

        Scanner scannerUser = new Scanner(System.in);
        System.out.println("Выберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        int choiceUserSearch = scannerUser.nextInt();
        Scanner scannerRequestUserForSearch = new Scanner(System.in);
        System.out.println("Напишите интересующий цвет или бренд: ");
        String requestUserForSearch = scannerRequestUserForSearch.nextLine();

        if (choiceUserSearch == 1) {
            for (HomeWork6.Notebook color : notebookList) {
                if (color.getColor().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(color.printInfo());
                }
            }

        } else if (choiceUserSearch == 2){
            for (HomeWork6.Notebook brand : notebookList) {
                if (brand.getBrand().equalsIgnoreCase(requestUserForSearch)) {
                    System.out.println(brand.printInfo());
                }
            }
        } else {
            System.out.println("Ошибка.\nВыберите параметр для поиска, где:\n1 - по цвету\n2 - по бренду");
        }

        scannerUser.close();

       /* Scanner s = new Scanner(new File("C:\\Users\\User\\IdeaProjects\\homework6\\src\\main\\java\\homework6\\ListOfNotebook.txt"));
        ArrayList<String> listOfNotebook = new ArrayList<String>();
        while (s.hasNext()){
            listOfNotebook.add(s.next());
        }
        s.close();*/

    }


}
