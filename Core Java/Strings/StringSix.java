package Strings;

public class StringSix {
    public static void main(String[] args) {
         StringBuilder builder = new StringBuilder();
         for(int i = 0;i<26; i++){
            char ch = (char)('a'+i);
            builder.append(ch);
         }
            System.out.println(builder.toString());
            builder.deleteCharAt(0);
            System.out.println(builder);
            // try to explore as many builder functions as you can
    }
}
