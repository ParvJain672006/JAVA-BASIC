

public class Overloadimnng {
    public static void main ( String args []){
        System.out.println("area of square "+ calculation(4));
        System.out.println("area of rectangle "+ calculation(4,5));
    }
    public static int calculation(int side){
        return side * side;
    }
    public static int calculation(int length , int breadth){
        return length * breadth;

    }
  
};
