package for_loop;        //String ifadeye tersten yazdirma
public class ders19_for_loop_tersyazdirma {
    public static void main(String[] args) {
        String input="Java Candir, Can.";
        String output="";

        for (int i = input.length()-1; i >=0 ; i--) {
            output += input.charAt(i);      // Bu ifadenin uzun hali ==> output = output + input.charAt(i);
            
        }
            System.out.println(output);
    }
}
