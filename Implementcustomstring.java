import java.nio.charset.UnsupportedCharsetException;

public class Implementcustomstring {
    public static void main(String[] args) {

        String str = "  T e n kaaaaaaaaa s i ";
        String str2 = "Tenkasi";

        Customstring obj_customstring = new Customstring(str, str2);

        //  1 uppercase  
        //  2 lowercase 
        //  3 length 
        //  4 tochararray 
        //  5 tostring 
        //  6 equal 
        //  7 substring 
        //  8 trim 
        //  9 split 
        // 10 replace 
        // 11 compareto 
        // 12 concate 
        // 13 charat  

        // System.out.println(obj_customstring.toUppercase());
        // System.out.println(obj_customstring.toLowercase());
        // System.out.println(obj_customstring.length());
        // System.out.println(obj_customstring.toCharArray());
        // System.out.println(obj_customstring.tostring());
        // System.out.println(obj_customstring.Equal());
        // System.out.println(obj_customstring.Substring());
       // System.out.println(obj_customstring.trim());
      // System.out.println(obj_customstring.split());
       //System.out.println("raj".trim());
       //System.out.println(obj_customstring.Replace());
       System.out.println(obj_customstring.concat());

       //System.out.println(obj_customstring.charat(11));

    }
}
