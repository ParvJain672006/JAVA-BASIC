package pratice5;


public class Pratice {
    public static String Student( String name  ) {
        System.out.println("name of student is parv" + name);
        return name ;

    }
    public static int Age( int age  ) {
        System.out.println("student age is " + age);
        return age ;
    }

    public static int Phone( int phone ) {
        System.out.println("student phone is " + phone);
        return phone ;
    }
    public static void main (String args[]){
        String name = "parv";
        int age = 20;
        int phone = 9826;
        Student(name);
        Age(age);
        Phone(phone);
    }
   
    };
    

