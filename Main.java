import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
        int key;
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        Phonebook phonebook = new Phonebook();
        while (flag) {
            System.out.println("Введите команду:\n1 - добавить контакт\n2 - вывести все контакты\n3 - выход");
            key = scanner.nextInt();
            switch (key) {
            case 1:
                System.out.println("Введите фамилию:");
                String female = scanner.next();
                System.out.println("Введите телефон:");
                Integer phone = scanner.nextInt();
                phonebook.addContact(female, phone);
                break;
            case 2:
                for (var item : phonebook.hashMap.entrySet()) {
                    System.out.printf("%s : %s\n", item.getKey(), item.getValue().toString());
                }
                System.out.println();
                break;
            case 3:
                System.out.println("Программа завершена.");
                flag = false;
                break;
            default:
                System.out.println("Такой команды не существует.\n");
                break;
           } 
        }
        scanner.close();
    }
}

class Phonebook {
    public Map<String, List<Integer>> hashMap = new HashMap<>();
    
    public void addContact(String female, Integer phone){
        List<Integer> phones = new ArrayList<>();
        if(hashMap.containsKey(female)){
            addToList(female, phone);
        }else{
            phones.add(phone);
            hashMap.put(female, phones);
        }
    }

    public void addToList(String Key, Integer phone) {
    List<Integer> phones2 = hashMap.get(Key);
    if(phones2 == null) {
         phones2 = new ArrayList<Integer>();
         phones2.add(phone);
         hashMap.put(Key, phones2);
    } else {
        if(!phones2.contains(phone)) phones2.add(phone);
    }
}
}