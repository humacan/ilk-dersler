package Arrays;
public class ders02_Array_Eleman_bulma {
    public static void main(String[] args) {

        int[] arr2={1,2,3,4,5,6,7,5,2,5};

        elemanSayisiYazdir(arr2,3);  //1
        elemanSayisiYazdir(arr2,2);  //2
        elemanSayisiYazdir(arr2,5);  //5

        String[] arr3={"a","b","c","d","e","f","g","a"};
        elemanSayisiYazdir2(arr3,"a"); //2

    }
    public static void elemanSayisiYazdir(int[] arr, int  arananSayi){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i]==arananSayi){
                sayac++;
            }
        }System.out.println(sayac);
    }
    public static void elemanSayisiYazdir2(String[] arr, String  arananharf){

        int sayac=0;

        for (int i = 0; i <arr.length ; i++) {
            if (arr[i].equals(arananharf)){  // String ifade esitlik kontrolu icin "equals" kullandik
                sayac++;
            }
        }System.out.println(sayac);
    }
}
