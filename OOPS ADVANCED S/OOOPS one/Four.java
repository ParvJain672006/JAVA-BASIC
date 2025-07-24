public class Four {
    public static void main ( String args []){
        // 1 . wrapper class examples 
        int a = 19 ;
        int b = 20;
        Integer c = 30 ;
        Integer d = 40;

        // the above one is an primitive one example & it {int }  will not give  you much options
         // for the " integer" now give you an object which gives lots of properties which integer
         // if i try to swap the premetive values  , they ont't swap only pass by reference values swap with each other 
         
         swap(a,b);
         swap2(c,d);
         System.out.println(a+" " + b);
         final A john  = new Four.A("john doe");
         john.name="othername";


 static void swap ( int a , int b ){
        int temp = a ;
        a = b ;
        b = temp ;

    }

    static void swap2 ( integer c , integer d ){
        int temp = c ;
        c = d ;
        d= temp;
         // in this case also they wont swap due to internal working of the 'final ' keyword 
         // -> final integer c = 30 , integer d = 40;
         
    }
    }

    static void swap ( int a , int b ){
        int temp = a ;
        a = b ;
        b = temp ;

    }

    static void swap2 ( integer c , integer d ){
        int temp = c ;
        c = d ;
        d= temp;
         // in this case also they wont swap due to internal working of the 'final ' keyword 
         // -> final integer c = 30 , integer d = 40;
         
    }

    static class A {
        final int num = 10 ;
        String name ;
        public A (string name ){
            this.name=name;
 

            // the case with  final  is   you cannot change the value , when its primitive data type and for the reference one you can  change the datatype
        }

    }

    
}
