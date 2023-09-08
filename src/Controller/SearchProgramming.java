package Controller;

import Common.Algorithm;
import Common.Library;
import Model.Element;
import View.Menu;

public class SearchProgramming extends Menu<String> {

    static String[] mc = {"Linear Search", "Binary Search", "Exit"};

    protected Library library;
    protected Algorithm algorithm;
    protected int[] array;
    protected int size_array;

    public SearchProgramming(Element element) {
        super("PROGRAMMING", mc);
        library = new Library();
        algorithm = new Algorithm();
        size_array = element.getSize_array();
        array = element.getArray();
    }

    public void execute(int n) {
        algorithm.buddleSort(array);
        library.display(array);
        int value = library.getInt("\nEnter number to find: ", 1, 100);
        switch (n) {
            case 1:
                System.out.println("Found value: " + value + " at index:" + algorithm.linearSearch(array, value));
                break;
            case 2:
                System.out.println("Found value: " + value + " at index: " + algorithm.binarySearch(array, value));
                break;
            case 3:
                System.exit(0);
                break;
        }
    }
}
