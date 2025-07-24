// using space with default constructor (implicit cals)
class Hyena{
    Hyena(){
        System.out.println("default case ; ") ;

    }
}
class Sher extends Hyena{
    Sher(){
        // super is implicity calling here 
        System.out.println("Sher bhai aagya");
    }
}
public class IMPlicitcalls {
    public static void main (String agrs[]){
        Sher child= new Sher();
     //   System.out.println(Sher());   gives error

    }
    
}
