package homework3;

import java.util.*;

public class HomeWork3 {

    public static String [] arrayWord = {"qwe", "qwe", "asd", "qaz", "wsx", "asd", "asd", "qwe", "zxc", "rty"};

    public static void main(String[] args) {
        countWord(arrayWord);

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addEntry("Ivanov", "89991112223300");
        phoneBook.addEntry("Ivanov", "89991112223301");
        phoneBook.addEntry("Ivanov", "89991112223302");
        phoneBook.addEntry("Ivanov", "89991112223303");
        phoneBook.addEntry("Petrov", "89991112223304");
        phoneBook.addEntry("Petrov", "89991112223305");
        phoneBook.addEntry("Petrov", "89991112223306");
        phoneBook.addEntry("Android", "89991112223307");
        phoneBook.addEntry("Ios", "89991112223308");
        phoneBook.addEntry("Java", "89991112223309");
        System.out.println("Ivanov Phone: " + phoneBook.getPhone("Ivanov"));
        System.out.println("Petrov Phone: " + phoneBook.getPhone("Petrov"));
        System.out.println("Android Phone: " + phoneBook.getPhone("Android"));
        System.out.println("Ios Phone: " + phoneBook.getPhone("Ios"));
        System.out.println("Java Phone: " + phoneBook.getPhone("Java"));

    }

    //Массив с набором слов
    public static void countWord(String [] arrayWord){
        TreeMap<String, Integer> mapWord = new TreeMap<>();
        for (int i = 0; i < arrayWord.length; i++) {
            mapWord.put(arrayWord[i], mapWord.getOrDefault(arrayWord[i], 0) + 1);
        }
        for(Map.Entry<String, Integer> entry : mapWord.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}

//Простой телефонный справочник
class PhoneBook {
    private TreeMap<String, List<String>> peoplePhone;

    PhoneBook(){
        peoplePhone = new TreeMap<>();
    }

    public void addEntry(String secondName, String phone){
        if(peoplePhone.containsKey(secondName)){
            peoplePhone.get(secondName).add(phone);
        } else {
            ArrayList<String> phoneList = new ArrayList<>();
            phoneList.add(phone);
            peoplePhone.put(secondName, phoneList);
        }
    }

    public List<String> getPhone(String secondName){
        if(peoplePhone.containsKey(secondName)){
            return peoplePhone.get(secondName);
        } else {
            return new ArrayList<>();
        }
    }
}
