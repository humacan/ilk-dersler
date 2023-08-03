package _baslangic_dersler;  //parse
public class data_casting_wrapper_parse {
    public static void main(String[] args) {

        String sayi= "15.60$";
        String sayi1="16.78$";


        sayi=sayi.replace("$","");
        sayi1=sayi1.replace("$","");

        System.out.println(Double.parseDouble(sayi)+Double.parseDouble(sayi1));  //32.38
        System.out.println(sayi+sayi1);  // 15.6016.78

    }
}
