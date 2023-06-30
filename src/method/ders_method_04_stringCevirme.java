package method;

public class ders_method_04_stringCevirme {
    public static void main(String[] args) {

        System.out.println(tersineCevirme("Java Candir"));
        System.out.println(tersineCevirme("Anlasildi mi"));
    }
    public static String tersineCevirme(String metin){
    String tersMetin="";
        for (int i = metin.length()-1; i>=0; i--) {
           tersMetin += metin.charAt(i);
        }
        return tersMetin;
    }
}
