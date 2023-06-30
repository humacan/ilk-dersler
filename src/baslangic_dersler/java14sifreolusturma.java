package baslangic_dersler;     // COKLU SECENEKLERI KARSILAYAN SIFRE OLUSTURMA SURECI

public class java14sifreolusturma {
    public static void main(String[] args) {

        int flag=0;           // secenekleri karsilamasini kontrol icin olusturuldu
        String sifre="a23abdcfe5";

        if (sifre.charAt(0)>='a' && sifre.charAt(0)<='z') {                                     // sifre ilk harfi 'a' ve 'z' araligindaysa
            flag++;
        }else{
            System.out.println("ilk harf kucuk harf olmali");
        }
        if (sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9'){        // sifre son harfi '1' ve '9' arasindaysa
            flag++;
        }else{
            System.out.println("son karakter rakam olmali");
        }
        if (sifre.contains(" ")){                                                               // sifre bosluk iceriyorsa
            System.out.println("sifre bosluk icermemeli");
        }else{flag++;
        }
        if (sifre.length()==10){                                                                // sifre uzunlugu 10 karakterse
            flag++;
        }else{
            System.out.println("sifre uzunlugu 10 karakter olmali");
        }if (flag==4){                                                                        // flag integeri 4'e ulastiysa(her if'in altinda sart saglanirsa flag'i bir arttir komutu iyi okunmali)
            System.out.println("Tebrikler sifreniz basari ile olusturuldu");

        }
    }
}
