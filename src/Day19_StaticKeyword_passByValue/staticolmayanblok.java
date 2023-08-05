package Day19_StaticKeyword_passByValue;

public class staticolmayanblok {
    public static void main(String[] args) {
        System.out.println("Main method calisti");

        staticolmayanblok obj=new staticolmayanblok();
        staticolmayanblok obj2=new staticolmayanblok();
        staticolmayanblok obj3=new staticolmayanblok();
    }
    static {
        System.out.println("static blok calisti");
    }
    {
        System.out.println("static olmayan method calisti");
    }
                        //  static blok calisti
                        //  Main method calisti
                        //  static olmayan method calisti
                        //  static olmayan method calisti
                        //  static olmayan method calisti
}
