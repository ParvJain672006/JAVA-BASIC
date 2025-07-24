package pratice;

 class parentt {
    parentt(){
        System.out.println("this is parent class");

    }
    void show(){
        System.out.println("this is second parent ");
    }
    
}

class Child extends parentt{
    Child(){
        super();
        System.out.println("this is child ");

    }

    void Display(){
        super.show();
        System.out.println( "this is child childs ");


        
    }
    

}
