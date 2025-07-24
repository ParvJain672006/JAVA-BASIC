import java.util.ArrayList;

public class Basic {
    public static void main(String args[]) {
        ArrayList<String> Student = new ArrayList<>();   // initial copy 

        // add element 
        Student.add("alic");
        Student.add("alic");
        Student.add("alic");
        // access & modify 
        System.out.println("first student :" + Student.get(0));

        Student.set(1, "vella");
        // iterate 
        for (String myStudent : Student) {
            System.out.println("student :" + myStudent);
        }
        System.out.println("size: " + Student.size());
        Student.remove(2);
        System.out.println("now size: " + Student.size());
    }
}