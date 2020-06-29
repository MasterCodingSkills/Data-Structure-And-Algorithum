package array.unsorted;

import CutomExceptions.CutomArrayException;

import java.lang.reflect.Array;

public class CustomArray<T> {
    private T[] array;
    private int totalElements;

    public CustomArray(Class<T> clazz,int initialCapacity) {
        if(initialCapacity < 0) {
            throw  new CutomArrayException("Initial Size must be a positive number");
        }
        this.array = (T[]) Array.newInstance(clazz,initialCapacity);
    }

    public boolean addAll(T ... values) {
        for(T obj : values) {
            insert(obj);
        }
        return  true;
    }
    public boolean insert(T element)  {
        if(totalElements == array.length) {
            throw new CutomArrayException("Array Already Full");
        }

        totalElements++;
        array[totalElements-1] = element;
        return true;
    }

    public void displayArray() {
        if(totalElements > 0) {
            int temp = totalElements;
            for(T obj : array) {
                if(obj == null) break;
                System.out.print(obj + ((temp > 1) ? ", ": ""));
                temp--;
            }
        }
    }

    public boolean remove(int index) {
        return true;
    }

    public boolean remove(T element ) {
        return true;
    }
}
