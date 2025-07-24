package OOPS3.INTROO;

public class InheritanceTWO {

     public static void main ( String args[]){
        InheritanceONE box = new InheritanceONE();
        System.out.println(box.e + " " + box.w + " " + box.h);


        InheritanceONE box2 = new InheritanceONE(4);
        System.out.println(box2.e + " " + box2.w + " " + box2.h);


        InheritanceONE box3 = new InheritanceONE(4.5 ,5.5 , 6.5);
        System.out.println(box.e + " " + box.w + " " + box.h);

        InheritanceONE box4 = new InheritanceONE(box3);
        System.out.println(box4.e + " " + box4.w + " " + box4.h);


     }
    
}
