public class Main {
    public static void main(String[] args) {

        int[] arrayTask14 = new int[]{12, 43, 100, 4, 24, 6, 63};
        String[] arrayOfStringsTask5 = {"tube", "youtube", "alabama", "africa",
                "antarctica", "arctica", "rambler"};
        NodeString head = new NodeString(arrayOfStringsTask5[0]);
        ListString list = new ListString(head);
        for (int i = 1; i < arrayOfStringsTask5.length; i++) {
            list.push(arrayOfStringsTask5[i]);
        }
        //list.printList();

        System.out.println(Task1_4_5.task5(list));




        /*Node head = new Node(arrayTask14[0]);
        List list = new List(head);
        for (int i = 1; i < arrayTask14.length; i++) {
            list.push(arrayTask14[i]);
        }
        //list.printList();
        System.out.println();
        list = Task01.task4(list);
        list.printList();*/
    }
}
