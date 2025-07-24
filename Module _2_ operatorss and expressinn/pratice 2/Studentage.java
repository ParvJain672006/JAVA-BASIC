//Create a program to check if a student is eligible (age >= 18 AND grade >= 70)
//using &&

public class Studentage {
    public static void main ( String args []){
        int age = 18 ; 
        int grade = 70 ;
        boolean IsEligible = age>=18 && grade >=70;
        System.out.println("is Eliigible : "+ IsEligible);
    }
    
}
