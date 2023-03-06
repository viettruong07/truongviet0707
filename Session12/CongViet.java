package Session12;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class CongViet {
    public static void main(String[] args) {
        List<String> friends = new ArrayList<>();

        friends.add("Bao");
        friends.add("Quang");
        friends.add("Hao");
        friends.add("Loc");

        System.out.println(friends);

        //Creating an ArrayList from another collection
        List<String> BestFriends = new ArrayList<>(friends);
        List<String> Nofriends = new ArrayList<>();
        Nofriends.add("Thang");
        Nofriends.add("Mai Anh");
        Nofriends.add("Viet");

        //Adding
        BestFriends.addAll(Nofriends);
        System.out.println(BestFriends);

        //Find the size of friends
        System.out.println("Here are the top " + friends.size());
        System.out.println(friends);

        //Get
        String friend1 = friends.get(0);
        String friend2 = friends.get(1);
        String friend3 = friends.get(friends.size() - 1);

        System.out.println("Friend 1 : " + friend1);
        System.out.println("Friend 2 : " + friend2);
        System.out.println("Friend 3 : " + friend3);

        //Set
        friends.set(3, "Long");
        System.out.println("Modifined top friends list: " + friends);

        //Remove
        friends.remove(3);
        System.out.println("After remove(3): " + friends);

        //Remove
        boolean isRomoved = friends.remove("Bao");
        System.out.println("After remove(\"Bao\"): " + friends);

        //Remove all the elements tha exist in a given collection
        List<Integer> hello = new ArrayList<>();
        hello.add(123);
        hello.add(234);
        hello.add(345);

        friends.removeAll(hello);
        System.out.println("After removeAll(hello): " +friends);

        //Remove all the elements that satisfy the given predicate
        friends.removeIf(n -> (n.charAt(1) == 'A'));
        System.out.println("After Removing alla elements that start with \"C\": " + friends);

        //Remove all elements from the ArrayList
        friends.clear();
        System.out.println("After clear: " + friends);
    }
}
