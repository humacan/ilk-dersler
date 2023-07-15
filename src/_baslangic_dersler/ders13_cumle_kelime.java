package _baslangic_dersler;
public class ders13_cumle_kelime {
    public static void main(String[] args) {
        String cumle = "java iyi ki varsin java";
        String kelime = "java";

        int ilk = cumle.indexOf(kelime);   // kelimeyi bastan bulmak icin yeni int variable
        int son = cumle.lastIndexOf(kelime); // kelimeyi sondan bulmak icin yeni int variable


        if (ilk == -(1)) {                                                    // ilk int'i indexi cumle icinde yoksa
            System.out.println("aradginiz kelime bulunamadi");
        } else if (ilk==son) {                                                // ilk ve son int'i index i birbirine esitse
            System.out.println("aradiginiz kelime 1 kere kullanilmis");
            
        }else{
            System.out.println("aradiginiz kelime birden fazla kullanilmis"); // yukaridaki sartlar saglanmamissa kalan olasilik
        }
    }
}

