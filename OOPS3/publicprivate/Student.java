package OOPS3.publicprivate;
public class Student {
    public String name = "parv";
    private  int age = 18; 

    public void AGE() {
        System.out.println("I am immortal " + age);
    }

    private void Display() {
        System.out.println("parv jain");
    }

    public void Hero() {
        Display();
    }
}

