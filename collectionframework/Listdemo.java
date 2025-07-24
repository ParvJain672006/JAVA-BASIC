import java.util.*;
public class Listdemo{
    public static void main ( Strig args[]){
        ArrayList<String> Students =  new ArrayList<>();
        Students.add("alice");
        Students.add("Bob");
        Students.add("jasmine ");

        System.out.println("list student :" + Students.get(0));
        Students.set(1,"baba");
        for(String myStudent : Students){
            System.out.println("students are : " + Students);

        }
    }
    System.out.println(Students.size());
    Students.remove(2);
    System.out.println(Students.size());

}