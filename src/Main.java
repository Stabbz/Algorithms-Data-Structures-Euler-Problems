import linkedlist.LinkedListDz;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
public class Main {

    public static void main(String[]args) {

        LinkedListDz list = new LinkedListDz();

        list.add(5);
        list.add(7);
        list.add(3);

        list.printList();

        list.deleteMiddleElement();
        list.deleteMiddleElement();
        list.deleteMiddleElement();

        list.printList();

    }

}

