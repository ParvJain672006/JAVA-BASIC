public class Basic{
    String name ;
    int age;
    float grade ;


    // method 
    void displayinfo(){
        System.out.print(" name " + name + " age " + age + " grade " + grade);
    }
    public static void main ( String args[]){
        Basic S1 = new Basic();
        S1.name = "alice";
        S1.age= 24;
        S1.grade= 99.2f;
        S1.displayinfo();


    }



};