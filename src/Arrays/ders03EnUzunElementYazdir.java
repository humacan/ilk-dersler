package Arrays;

public class ders03EnUzunElementYazdir {
    public static void main(String[] args) {

        String[] arr={"Melike","Berkay","inci","Eda","Nur"};
        String[] arr2={"Melike","Berkay","Su","Eda","Mustafa"};
        enUzunElement(arr);
        System.out.println("");
        enUzunElement(arr2);

    }
    public static void enUzunElement(String[] arr){
        String enUzunkelime=arr[0];
        String enKisakelime=arr[0];

        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].length()>enUzunkelime.length()){
                enUzunkelime=arr[i];
            }
            if (arr[i].length()<enKisakelime.length()){
                enKisakelime=arr[i];
            }
        }
        System.out.println("array deki en uzun kelime  >> "+enUzunkelime);
        System.out.println("array deki en uzun kelime  >> "+ enKisakelime);
    }
}
