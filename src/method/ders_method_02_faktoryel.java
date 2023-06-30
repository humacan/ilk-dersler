package method;
public class ders_method_02_faktoryel {
    public static void main(String[] args) {
        ders_method_01_ana.ikiSayiTopla();     // backa bir class ta yer alan methodu bu class a cagirdik

        int sonuc=faktoryelHesapla(6); // asahidaki static methodu main methoda cagirdik
        System.out.println(sonuc);
    }
    public static int faktoryelHesapla(int sayi){
        int faktoryel=1;
        for (int i = sayi; i>=1 ; i--) {
            faktoryel*=i;
        }
        return faktoryel;
    }
}
