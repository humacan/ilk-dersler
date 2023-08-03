package scope_arrays;
public class ders02_hastane {
    public static void main(String[] args) {
        ders01_Adoktor dok1=new ders01_Adoktor();  // tipki Scanner girdisi gibi yaptik

        System.out.println(dok1.askerlikYaptiMi);  // false
        dok1.isim="Kamil";
        dok1.soyisim="killibacak";
        dok1.dogumYili=1984;

        System.out.println(dok1.isim);  // isim tanimlanmis obje ile yazilmali yoksa kabul gormez

        ders01_Adoktor dok2=new ders01_Adoktor();  // ikinci bir doktor objesi olusturduk
        System.out.println(dok2.isim);  // null  -deger atanmadi

        dok2.soyisim="demir";
        System.out.println(dok2.soyisim);  // demir

        System.out.println(dok1);  // referansi yazdirir - scope_arrays.Adoktor@7b23ec81
        System.out.println(dok2);  // referansi yazdirir - scope_arrays.Adoktor@6acbcfc0

        System.out.println(dok1.fakulte);  //Tip
        System.out.println(dok2.fakulte);  //Tip

        dok1.isim="burcu";

        System.out.println(dok1.isim);  // isim guncellendi -burcu
        System.out.println(dok2.isim);  // null

        dok1.fakulte="Tip fakultesi";
        System.out.println(dok1.fakulte);  //Tip fakultesi
        System.out.println(dok2.fakulte);  //Tip fakultesi -fakulte static tanimlandigi icind
                                           // dok2 icinde guncellendi

        ders01_Adoktor dok3=new ders01_Adoktor();
        System.out.println(dok3.dogumYili);  // deger atanmamis  --0

        System.out.println(dok3.fakulte);   // fakulte static oldugu icin deger otomatik atandi -- Tip fakultesi

        System.out.println(ders01_Adoktor.fakulte); // Tip fakultesi
    // tavsiye edilen erisim => classIsmi.staticIsim

    }
}
