package OOPs2.StaticEcample;

public class USer {
    int age ;
    String name;
    int Salary;
    boolean married;
    static long population;

    public USer(int age, String name, int salary, boolean married) {
        this.age = age;
        this.name = name;
        this.Salary = salary;
        this.married = married;
        USer.population += 1;
    }


    public void Displayinfo(){
        System.out.println(name + "age " + age + "salary" + Salary + "married" + married);

    }
}
   

// points to remember 

// 1-> in the user class , there's no need for a main () method uncless you 're  writing a test or trying  it independently .

//2 -> import statements are also unessary when using classes in the  same pacakage , it is because java automatically recognize them within the  pacakage heriarcy 

//3-> those properties which are independent from the object  from which they  are being  are created are called -- static variables 

// 4--> population is common to voth the object of the parent class . but there a   doubt  ? static is independent of the object , they why used  with this keyword ??
// it should be used  with the class  instead 
 