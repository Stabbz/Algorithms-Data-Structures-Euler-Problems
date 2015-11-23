import linkedlist.LinkedListDz;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Damyan Damyanov <damyan.damyanov@scalefocus.com> on 11/11/15.
 */
class Teibal {
    int a = 5;
}
public class Main extends Teibal  {

    int a = 6;
    static int b = 5;


    public static void beh(){
        System.out.println("4");
        throw new StackOverflowError();
    }
    public static void main(String[]args) {

        LinkedListDz list = new LinkedListDz();


        int[] test = {1,9,3241,5,3,79,31,5,7,5,32,7,2,1};
        InsertionSort.sort(test);

        for(int a : test){
            System.out.print(a + " ");
        }
    }
}

class Course {
    String courseName;
    Course() {
        Course c = new Course();
        c.courseName = "Oracle";
    }

}
class EJavaGuruPrivate2 {
    public static void main(String args[]) {

    }
}

