package linkedlist.singly;

public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> list = new MyLinkedList<>();
        list.add("manish");
        list.add("neeraj");
        list.add("ashu");
        list.add("sudhanshu");
        list.add("rajat");
        System.out.println(list.size());
        list.remove(4);
        list.printMyLinkedList();
        System.out.println(list.size());


       /*MyLinkedList withoutGenericList = new MyLinkedList();
       withoutGenericList.add("manish");
       withoutGenericList.add(10);
       withoutGenericList.add(new StringBuffer("neeraj"));

       withoutGenericList.printMyLinkedList();*/

    }
}
