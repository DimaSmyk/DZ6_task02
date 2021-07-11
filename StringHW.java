package selfwork06.task02;

public class StringHW {
    public static String i = "abcd";
    static String newStr;
    static String newStr2;

    public static void main(String[] args) {
        refactor();
        refactor2();
    }

    public static void refactor() {

        if (i.length() % 2 == 0) {
            newStr = i.substring(i.length()/2 - 1, i.length()/2 + 1);
        } else {
            newStr = i.substring(i.length()/2,i.length()/2+1);
        }
        System.out.println(newStr);
    }

    public static void refactor2() {

        if (i.length() % 2 == 0){
            newStr2 = i.substring(i.length()/2 );
            i = i.substring(0,i.length()/2);
            newStr2 = newStr2 + i;
        }else{
            newStr = i.substring(i.length()/2,i.length()/2+1);
            newStr2 = i.substring(i.length()/2 + 1);
            i = i.substring(0,i.length()/2);
            newStr2 = newStr2 + newStr + i;
        }
        System.out.println(newStr2);
    }
}
