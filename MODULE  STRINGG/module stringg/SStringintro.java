public class SStringintro {
    public static void main ( String args[]){
        int str []= {1,2,3,4,5,19};
        int a = 19;
        String name = "parv jain ";
        System.out.println(name);
        String b ="parv ";
        b = "jain ";
        b= "parv";
        System.out.println(b);

    }
    
}

// everything that starts with a capital letter ("s" , "A") is class in java 
// when you see the synatx of the string object it is : datatype reference variable = String object 
// some important concepts of "strings" manipulation are - 
// a . String pool
// b. immutablity


// working of the string poll 
// => string pool is the storage data structure inside the heap memory . it is used to store the string objects . now , to optimize this data  structue , it  prevents the entire of duplicate copies into the pool 
// for ex String name = " kunal ";
// String b = "kunal";
//both are pointing towards a single object in the string pool (i.e.kunal ) , so no seprate a & b objeects 


//doubt1.  some of you might think , it i modigy my object in string, the other one will also get affected?
		 // string are immature in  java, so once assigned, you can't change for this.
         
// i created  an string object with 'b' its reference  , now later , assigned b with "jain " .you will see that old one is modified & new one is  preserved  . when i work 
// b = parv.
// then in the string pool i created  another object " parv " along side  " laksh " &  b is pointing towards both the objects now 

// why do we cant modify string objects !
// for 'n ' no of person with the value = parv , if i change any one , all will get affected hence , for specify reason they are immutable 


