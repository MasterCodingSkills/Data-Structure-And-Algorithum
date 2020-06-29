package array.unsorted;

import CutomExceptions.CutomArrayException;

public class Main {
    public static void main(String[] args) throws CutomArrayException {
        CustomArray<String> array = new CustomArray<>(String.class,6);
        array.addAll("manish","jangra");
        array.displayArray();
    }
}
