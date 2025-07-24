//package OOPS ADVANCED S;

//public class ONE {
 //   public static void main(String[] args) {
        // store 5 roll no.
      //  int [] numbers = new int [5];

        // store 5 names
   //     String [] names = new String[5];

        // now i want a container to store data - names, rollno., marks etc..
        // Your apprache:
        // > Int [] rollno = new int [5];
        // > String [] Studentname = new string [5];
        // > Float [] marks = new float [5]

         // you have created 3 different objects for 3 different entities, which is not feasible
       // Suppose ,what if i want a data structure in which every single element stores above
       //this is where classes and objects came into java.
       // initializing a class:
      // Statement []students=new Statement[];
      // class Student{
        //       int [] roll no.=new int[5];
          //     String StudentName=new String[];
           //    float[]marks=new float[5]; 





           // car are just like a template  , for ex car is an template and from that many companies have created so many brands and cars 

           // for ex if a car can have - seats , engine , price , this iss an general template every car has like maruti , ferrai etc 

           // car teplates does not exist physically , though you can find cars and models . templates are like rule of something  car  brands has to follow while making a car 

           // 1 . class is an template of an object 
           // 2. an object is an instance of an class 

           // classes are" logical construct " objects are -> " physcial reality "
           
           // for ex -> i have created 3 objects of te class ( it have 3 reference variable 7 with the (.) operator , the are linked with the instance variable of the class )

           // you will get nul wheyn try to print an empty object 
           // System.out.println(students);

           // to see something insted of null , we use "new" keyword  dynamically  allocaed memory at run time  & returns a reference variable to it 

           // student student1 = new student();  // happening at run time 
           //  |                                  // after verification JVM running your code & memory is being allocated 
           //  happening at compile time 
           // code is executing 
           // errors are shown 
           // source code -> byte code 

           // now , when i do 
           //S1.name 
           //S1. roll no         >      if checks weather i have assigned a value & if not , it prints the default value instead 

