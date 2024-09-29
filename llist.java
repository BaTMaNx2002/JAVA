
import java.util.*;

public class reverseALinkedList{

    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(4);
        list.add(1);
        System.out.println("Original List: " + list);

        // Create a second linked list and add the original list's elements
        LinkedList<Integer> list2 = new LinkedList<>(list);
        
        // Reverse the second linked list
        Collections.reverse(list2);
        System.out.println("Reversed List: " + list2);
        
        
    }
}

