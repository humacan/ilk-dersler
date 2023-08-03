package __Squestions;
public class stringtersyazdirma {
    public static void main(String[] args) {
        String yazi="java ne kadar guzel bir program";
        String ters="";

        for (int i = yazi.length()-1; i >=0 ; i--) {
            ters+=yazi.charAt(i);
        }
        System.out.println(ters);
    }
}
