package GGenericss;

public class BOundedEX {
    public  class BOUnded<T extends Number>{
        private T number ;
        public BOUnded(T number ){
            this.number  = number  ;
        }
        public double square (){
            return number.doubleValue ()* number .doubleValue();

        }
    }
    public static void main(String[] args){
        BOUnded<Integer> intBOunded = new BOUnded<>(5);
        BOUnded<Double> doubleBOunded = new BOUnded<>(3.14);
        System.out.println("Square of integer: " + intBOunded.square());
        System.out.println("Square of double: " + doubleBOunded.square());
    }
    }
    


    

