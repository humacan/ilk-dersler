package ArrayList;
import java.util.ArrayList;
import java.util.List;
public class ders11_baska_clastan_calistirma {
    public static void main(String[] args) {
        // bir onceki clasta istenmeyen methodu burda kullanalim
        List<String> urunler=new ArrayList<>();

        urunler.add("nutella");
        urunler.add("cokoprens");
        urunler.add("cikolatali");
        urunler.add("cokomel");

        String istenmeyenHarf="o";

        System.out.println(ders10_istenmeyeni_sil.istenmeyenHarfIcerenleriSil(urunler,istenmeyenHarf));
        // --> [nutella]

        System.out.println(ders10_istenmeyeni_sil.istenmeyenHarfIcerenleriSil(urunler, "a"));
        // -->  [cokoprens, cokomel]


    }
}
