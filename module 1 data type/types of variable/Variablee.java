
public class Variablee {

    static int Scopecount = 0;
    int instance = 10;

    public static void main(String args[]) {
        int localvar = 5;
        System.out.println(" local  :" + localvar);
        System.out.println(" static  :" + Scopecount);

        Variablee obj = new Variablee();
        System.out.println(" instance  :" + obj.instance);
         

    }
};
    // we cant print  normal declared variables of all datatypes without object 
    // we cam use static declared data type directly using system.out.println we did not  required to create any object