
// Create a program to store 3 Strings in an array and print them in reverse
//order.


public class Two {
    public static void main ( String args[]){
        String arr[]={"parv", "laksh" , " Piyush"};
        for (int i=arr.length-1; i>=0 ;i--){
            System.out.println("reverse order is " + i + " " + arr[i]);
        }
        System.out.println();
    }
    
    
}
