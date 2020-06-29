package interviewQuestionsAsked;

import java.util.HashMap;

public class HashMapWorkingTest {
    public static void main(String[] args) {
        Person firstPerson = new Person("manish",26);
        Person secondPerson = new Person("manish",26);

        HashMap<Person,Integer> map = new HashMap<>();
        map.put(firstPerson,1);
        map.put(secondPerson,2);

        System.out.println(map);
    }
}


