public class Main {
    public static void main(String[] args) {
        /*
        For this challenge, create an abstract class to define items that can be stored in a list.
        The class should contain 2 references to items which will represent the next and previous
        items (in the case of a linked list).
        I.e., if you call your abstract class ListItem, then it would have 2 member variables of
        type ListItem that will hold references to the next/right and previous/left ListItems.

        The abstract class will also need to hold a value - try to be as flexible as possible
        when defining the type of this value.

        The class will also need methods to move to the next item and back to the previous item,
        and methods to set the next and previous items.

        You should also specify a compareTo() method that takes a parameter of the same type as the
        class and returns 0 if the values are equal, greater than zero if the value sorts greater than
        the parameter and less than zero if it sorts less than the parameter.

        Create a concrete class from your abstract list item class and use this in a LinkedList
        class to implement a linked list that will add items in order (so that they are sorted
        alphabetically). Duplicate values are not added.

        Note that you are creating your own LinkedList class here, not using the built-in Java one..

        The rules for adding an item to the linked list are:
        If the head of the list is null, make the head refer to the item to be added.
        If the item to be added is less than the current item in the list, add the item before the
          current item (i.e., make the previous item's "next" refer to the new item, and the new item's
          "next" refer to the current item).
        If the item to be added is greater than the current item, move onto the next item and compare
          again (if there is no next item then that is where the new item belongs).

        Care will be needed when inserting before the first item in the list (as it will not have a previous
        item).

        You will also need a method to remove an item from the list.

        Hint: If you are creating classes with names such as List, LinkedList, Node etc, make sure that
        you create your classes before referring to them. In previous videos we have often referred to
        classes that we create later, but if you use names that IntelliJ recognises as Java classes (such
        as LinkedList) then it will create imports for them and possibly cause you problems later.

        Optional: create a class to use your concrete class to implement a Binary Search Tree:
        When adding items to a Binary Search Tree, if the item to be added is less than the current item
        then move to the left, if it is greater than the current item then move to the right.

        The new item is added when an attempt to move in the required direction would involve following a
        null reference.
        Once again, duplicates are not allowed.

        Hint: to avoid typing loads of "addItem" lines, split a string into an array and create your list in
        a loop as in the example below.
        */
        MyLinkedList list = new MyLinkedList(null);
        //SearchTree list = new SearchTree(null);
        list.traverse(list.getRoot());

        String stringData = "5 7 3 9 8 2 1 0 4 6";
        String[] data = stringData.split(" ");

        for (String s : data) {
            list.addItem(new Node(s));
        }

        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("5"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("0"));
        list.removeItem(new Node("4"));
        list.removeItem(new Node("2"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("9"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("8"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("6"));
        list.traverse(list.getRoot());
        list.removeItem(new Node("7"));
        list.traverse(list.getRoot());
        list.removeItem(list.getRoot());
        list.traverse(list.getRoot());
    }
}