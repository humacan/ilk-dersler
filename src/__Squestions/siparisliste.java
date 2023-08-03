package __Squestions;
import java.util.Scanner;
public class siparisliste {
    public static void main(String[] args) {
        int toplam=0;
        while (true){
            System.out.println("lutfen yapmak istediginiz islemi secinizi+" +
                    "\n1 - Corba cesitleri"+
                    "\n2 - Ana yemekler"+
                    "\n3 - Salata+" +
                    "\n4 - Icecekler+" +
                    "\n5 - Tatlilar+" +
                    "\n6 - Hesap ozeti");
            Scanner in=new Scanner(System.in);
            int siparis=in.nextInt();

            switch (siparis){
                case 1: {
                    System.out.println("Corbalar" +
                            "\n1 - ezogelin" +
                            "\n2 - mercimek" +
                            "\n3 - yayla");
                    int corba=in.nextInt();
                    switch (corba) {
                        case 1:
                            System.out.println("ezogelin secildi, tutar 20 TL");
                            toplam += 20;
                            break;
                        case 2:
                            System.out.println("mercimek secildi, tutar 20 TL");
                            toplam += 20;
                            break;
                        case 3:
                            System.out.println("yayla secildi, tuar 20 TL");
                            toplam += 20;
                            break;
                    }break;
                }
                case 2: {

                    System.out.println("Ana yemekler" +
                            "\n1 - iskender" +
                            "\n2 - sis kebap" +
                            "\n3 - cag kababi");
                    int anayemekler=in.nextInt();
                    switch (anayemekler) {
                        case 1:
                            System.out.println("iskender sectiniz, tutar 50 TL");
                            toplam += 50;
                            break;
                        case 2:
                            System.out.println("sis kebap sectiniz, tutar 50 TL");
                            toplam += 50;
                            break;
                        case 3:
                            System.out.println("cag kebap sectiniz, tutar 50 TL");
                            toplam += 50;
                            break;
                    }
                    continue;
                }
                case 3: {
                    System.out.println("Salata" +
                            "\n1 - coban salata " +
                            "\n2 - amerikan salata" +
                            "\n3 - rus salata");
                    int salata=in.nextInt();
                    switch (salata) {
                        case 1:
                            System.out.println("coban salata sectiniz, tutar 50 TL");
                            toplam += 50;
                            break;
                        case 2:
                            System.out.println("amerikan salata sectiniz, tutar 50 TL");
                            toplam += 50;
                            break;
                        case 3:
                            System.out.println("rus salata sectiniz, tutar 50 TL");
                            toplam += 50;
                            break;
                    }
                    continue;
                }
                case 4: {
                    System.out.println("Icecek" +
                            "\n1 - Ayran " +
                            "\n2 - Kola" +
                            "\n3 - Gazoz");
                    int icecekler=in.nextInt();
                    switch (icecekler) {
                        case 1:
                            System.out.println("ayran sectiniz, tutar 20 TL");
                            toplam += 20;
                            break;
                        case 2:
                            System.out.println("kola sectiniz, tutar 20 TL");
                            toplam += 20;
                            break;
                        case 3:
                            System.out.println("gazoz sectiniz, tutar 20 TL");
                            toplam += 20;
                            break;
                    }
                    continue;
                }
                case 5: {
                    System.out.println("Tatlilar" +
                            "\n1 - Sutlac " +
                            "\n2 - Kunefe" +
                            "\n3 - Puding");
                    int tatlilar=in.nextInt();
                    switch (tatlilar) {
                        case 1:
                            System.out.println("kunefe sectiniz, tutar 40 TL");
                            toplam += 20;
                            break;
                        case 2:
                            System.out.println("kunefe sectiniz, tutar 40 TL");
                            toplam += 20;
                            break;
                        case 3:
                            System.out.println("puding sectiniz, tutar 40 TL");
                            toplam += 20;
                            break;
                    }
                    continue;
                }
                case 6:
                    System.out.println("Tum siparis listesi toplam tutar:  " + toplam);
               System.exit(0);
        }
    }
}}