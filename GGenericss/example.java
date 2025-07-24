package GGenericss;

public class example {
    public static class pair<k, v> {
        private k key ;
        private v value ;
        public pair (k key , v value){
            this.key = key ;
            this.value = value ;
        }
        public k getkey(){
            return key ;
        }
        public v getvalue(){
            return value ;
        }
    }
    public static void main(String[] args){
        pair<String,Integer> p1 = new pair <String,Integer> ("one",1);
        
        System.out.println(p1.getkey() + " : " + p1.getvalue());
     
    }
    
}
