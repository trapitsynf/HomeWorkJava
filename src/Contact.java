import java.util.*;

public class Contact {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        if (phoneBook.containsKey(name)) {
            phoneBook.get(name).add(phoneNum);
        } else {
            ArrayList<Integer> phoneNumList = new ArrayList<>();
            phoneNumList.add(phoneNum);
            phoneBook.put(name, phoneNumList);
        }
    }

    public static HashMap<String, ArrayList<Integer>> getPhoneBook() {
        List<Map.Entry<String, ArrayList<Integer>>> list = new LinkedList<>(phoneBook.entrySet());
        list.sort((o1, o2) -> Integer.compare(o2.getValue().size(), o1.getValue().size()));

        HashMap<String, ArrayList<Integer>> sortedPhoneBook = new LinkedHashMap<>();

        for (Map.Entry<String, ArrayList<Integer>> entry : list) {
            sortedPhoneBook.put(entry.getKey(), entry.getValue());
        }
        return sortedPhoneBook;
    }
}
