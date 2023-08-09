package __Squestions;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class wisemarket {
    public static void main(String[] args) {
     /* Bir market yazılımı yazdığınızı düşünerek aşşağıdaki menü ile giriş yapıp, ilgili bölüme yönlendiren
     alışveriş yaptıran ve sepet tutarını hesaplayarak hafızada tutan, kasaya gidince giş yazdıran bir program
     hazırlayın
     ==================== WISE MARKET KASA PROGRAMI ===================================
     ilk programa girildiginde bizi bir menu karsilasin bu secenekler
     1 ŞARKÜTERİ ÜRÜNLERİ
     2 MANAV ÜRÜNLERİ
     3 MARKET ÜRÜNLERİ
     secime gore ,
     4-urunleri listele ve
     5-fiyatlari gelsin
     Variable'ları belirleyelim
     urunAdi, urunFiyat
      /* ÖDEV: Müşteriden ödediği miktarı alıp sisteme giren ve verdiği para yeterli ise para üstünü yazdıran,
      yeterli değilse verdiğiniz miktar yeterli değildir diye uyarak kodu ekleyiniz  */
        int bakiye=0;
        int toplam = 0;
        int urun=0;

        List<String> liste=new ArrayList<>();
        while (true) {
            System.out.println("==================== WISE MARKET KASA PROGRAMI ============================");
            System.out.println("lutfen yapmak istediginiz islemi secinizi+" +
                    "\n1 - Sarkuteri Urunleri" +
                    "\n2 - Manav Urunleri" +
                    "\n3 - Market Urunleri" +
                    "\n4 - Urunleri Listele" +
                    "\n5 - Hesap ozeti " +
                    "\n6 - Cikis");
            System.out.println("Toplam Alisveris miktari: "+toplam+" TL");
            Scanner in = new Scanner(System.in);
            int secim = in.nextInt();
            switch (secim) {
                case 1: {
                    System.out.println("Sarkuteri Urunler" +
                            "\n1 - Sucuk" +
                            "\n2 - Pastirma" +
                            "\n3 - Salam" +
                            "\n4 - Sosis" +
                            "\n5 - Dana Jambon");

                    int sarkuteri = in.nextInt();
                    switch (sarkuteri) {
                        case 1:
                            System.out.println("Sucuk secildi, tutar 100 TL");
                            toplam += 100;
                            bakiye-=100;
                            urun++;
                            liste.add("Sucuk");
                            break;
                        case 2:
                            System.out.println("Pastirma secildi, tutar 120 TL");
                            toplam += 120;
                            bakiye-=120;
                            urun++;
                            liste.add("Pastirma");
                            break;
                        case 3:
                            System.out.println("Salam secildi, tuar 100 TL");
                            toplam += 100;
                            bakiye-=100;
                            urun++;
                            liste.add("Salam");
                            break;
                        case 4:
                            System.out.println("Sosis secildi, tuar 100 TL");
                            toplam += 100;
                            bakiye-=100;
                            urun++;
                            liste.add("Sosis");
                            break;
                        case 5:
                            System.out.println("Dana Jambon secildi, tuar 120 TL");
                            toplam += 120;
                            bakiye-=120;
                            urun++;
                            liste.add("Dana Jambon");
                            break;
                    }


                    break;
                }
                case 2: {
                    System.out.println("Manav urunleri" +
                            "\n1 - Karpuz" +
                            "\n2 - Kavun" +
                            "\n3 - Elma" +
                            "\n4 - Armut" +
                            "\n5 - Muz");

                        int manav = in.nextInt();
                        switch (manav) {
                            case 1:
                                System.out.println("Karpuz sectiniz,kg tutari 50 TL");
                                toplam += 40;
                                bakiye-=40;
                                urun++;
                                liste.add("Karpuz");
                                break;
                            case 2:
                                System.out.println("Kavun sectiniz, kg tutari 30 TL");
                                toplam += 30;
                                bakiye-=30;
                                urun++;
                                liste.add("Kavun");
                                break;
                            case 3:
                                System.out.println("Elma sectiniz, kg tutari 20 TL");
                                toplam += 20;
                                bakiye-=20;
                                urun++;
                                liste.add("Elma");
                                break;
                            case 4:
                                System.out.println("Armut sectiniz, kg tutari 20 TL");
                                toplam += 20;
                                bakiye-=20;
                                urun++;
                                liste.add("Armut");
                                break;
                            case 5:
                                System.out.println("Muz sectiniz, kg tutari 60 TL");
                                toplam += 60;
                                bakiye-=60;
                                urun++;
                                liste.add("Muz");
                                break;
                        }

                    continue;
                }
                case 3: {
                    System.out.println("Market Urunleri" +
                            "\n1 - Pirinc " +
                            "\n2 - Peynir" +
                            "\n3 - Aycicek Yagi" +
                            "\n4 - Makarna");

                        int market= in.nextInt();
                        switch (market) {
                            case 1:
                                System.out.println("Pirinc sectiniz, kg tutari 50 TL");
                                toplam += 50;
                                bakiye-=50;
                                urun++;
                                liste.add("Pirinc");
                                break;
                            case 2:
                                System.out.println("Peynir sectiniz, tutar 70 TL");
                                toplam += 70;
                                bakiye-=70;
                                urun++;
                                liste.add("Peynir");
                                break;
                            case 3:
                                System.out.println("Aycicek yagi sectiniz, kg tutari 60 TL");
                                toplam += 60;
                                bakiye-=60;
                                urun++;
                                liste.add("Aycicek Yagi");
                                break;
                            case 4:
                                System.out.println("Makarna, Paket tutari 40 TL");
                                toplam += 40;
                                bakiye-=40;
                                urun++;
                                liste.add("Makarna");
                                break;
                    }

                    continue;
                }
                case 4:
                    System.out.print("Siparis ettiginiz urunler: "+liste);
                    System.out.println("");

                    break;
                case 5:
                    System.out.println("Toplam tutar: "+toplam);
                    boolean flag=true;
                    while (flag){
                        System.out.println("Lutfen odeme miktarini giriniz");
                        bakiye=in.nextInt();
                        if (bakiye<toplam)
                        {
                            System.out.println("Bakiyeniz Siparis urunlerinizin toplamini karsilamiyor" +
                                    "\nLutfen tekrar deneyiniz");
                        }else{
                            System.out.println("Siparis ettiginiz "+urun+" urunun toplam tutari: "+toplam+" TL"+
                                    "\nKalan tutar : "+(bakiye-toplam)+" TL");
                            System.out.println("Bizi terchi ettiginiz icin tesekkurler " +
                                             "\n======Wise Market iyi gunler diler======");
                            System.exit(0);
                        }

                    }
                    break;
                case 6:
                    System.out.println("Programdan cikiliyor" +
                            "\nWise Market Iyi gunler diler!!!");
                    System.exit(0);
            }

        }

    }
}