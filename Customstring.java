import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
//import java.io.ArrayIndexOutOfBoundsException;
import java.util.*;

public class Customstring {
    String str;
    String str2;
    boolean isCompare = false;

    public Customstring(String str, String str2) {
        this.str = str;
        this.str2 = str2;

    }

    public String toLowercase() { // 1

        char[] arr = str.toCharArray();
        char[] arr1 = new char[arr.length];
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] >= 65 && arr[i] <= 90) {
                arr[i] = (char) (arr[i] + 32);

            }

        }
        // for (int i = 0; i < arr.length; i++) {
        // // //System.out.print(charArray[i]);
        // return arr1[i];

        // // }

        // System.out.println();

        // }
        String str = new String(arr);
        return str;

    }

    public String toUppercase() { // 2
        char[] arr = str.toCharArray();
        char[] arr1 = new char[arr.length];
        for (int i = 0; i < str.length(); i++) {
            if (arr[i] >= 97 && arr[i] <= 122) {
                arr[i] = (char) (arr[i] - 32);

            }
        }
        // for (int i = 0; i < arr.length; i++) {
        // System.out.print(charArray[i]);
        // return arr1;
        String str = new String(arr);
        return str;
    }

    // return 0;

    // System.out.println();

    public int length() {
        int i = 0; // 3
        for (char length : str.toCharArray()) {
            // System.out.println(length);
            i++;
        }
        // System.out.println(i);
        // System.out.println();
        // return length;
        return i;
    }

    public char toCharArray() { // 4
        char[] charArrary = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArrary[i] = str.charAt(i);

        }
        // char ch = new char[];
        for (char c : charArrary) {
            // System.out.println(c);
            // return c;
        }
        // char ch = new char(c);
        // return ch;

        // System.out.println();
        return 0;

    }

    public boolean Equal() { // 5
        if (str == str2) {
            // System.out.println("true");
            return true;
        } else {
            // System.out.println("false");
            return false;
        }

    }

    public String concat() { // 6

        // con = str+str1;
        // System.out.println("Concate String is:");
        // System.out.println(str+str);
        return str + str2;

    }

    public String tostring() { // 7
        char arr[] = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            arr[i] = str.charAt(i);
            System.out.println(arr[i]);
        }
        return str;
    }

    public boolean compareto() { // 8
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != str2.charAt(i)) {
                isCompare = false;
                break;
            }
            isCompare = true;
            // return isCompare;

        }
        // System.out.println(isCompare);
        return isCompare;
    }

    public String Replace() { // 9
        char r;
        Scanner sc = new Scanner(System.in);
        System.out.println("Replace the String");
        r = sc.next().charAt(0);
        sc.nextLine();
        String replace = "";
        // String s2;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == r) {
                replace = replace + "*";
            } else {
                replace = replace + str.charAt(i);
            }
        }

        // System.out.println(replace);
        return replace;

    }

    public String split() { // 10
        List<String> lst = new ArrayList<String>();
        char[] charArray = str.toCharArray();
        String strTemp = "";
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != ' ') {
                strTemp = strTemp + charArray[i];
            } else {
                lst.add(strTemp);
                strTemp = "";
            }
        }
        lst.stream().forEach(n -> System.out.println(n));
        return strTemp;

    }

    public String trim() { // 11
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (str.charAt(i) == ' ') {
            i++;
        }
        for (; i < str.length(); i++) {
            sb.append(str.charAt(i));
        }
        String a = sb.toString();
        int j = a.length() - 1;
        while (a.charAt(j) == ' ') {
            j--;
        }
        String result = a.substring(0, j + 1);
        // System.out.println(result);
        return result;
    }

    public String Substring() { // 12
        String newStr = "";
        int start = 3, end = 6;
        for (int i = start; i < end; i++)
            newStr += String.valueOf(str.charAt(i));
        String str = new String(newStr);
        // System.out.println(newStr);
        return newStr;
    }

    // public char charat(int index) {
    // FileWriter fw = new FileWriter("Zohocorporation");
    // fw.write(str);
    // fw.close();
    // FileReader fr = new FileReader("Zohocorporation");
    // char ch[] = new char [str.length()];
    // int k=0, l=0;
    // while((k=fr.read())!=-1){
    // ch[l]= (char)k;
    // l++;
    // }

    // System.out.println(ch[9]);
    // // return ch[9];
    // // }

    // char[] arr = str.toCharArray();

    // if (index<0||index>=arr.length) {
    // throw ArrayIndexOutOfBoundsException;

    // }

    // return arr[index];

}
