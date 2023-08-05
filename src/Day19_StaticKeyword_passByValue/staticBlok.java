package Day19_StaticKeyword_passByValue;

public class staticBlok {
    public static void main(String[] args) {
        System.out.println("main method callisti");
    }
    static {
        /*
        Static blok lar class calismaya baslar baslamaz devreye girer tum diger kod lardan
        HATTA main method dan bile once calisir
        -birden fazla static block varsa yukaridan asagi dogru silari olarak calisir

         */
        System.out.println("Static blok calisti");
    }
    static {
        System.out.println("2.static blook calisti");
    }

}
