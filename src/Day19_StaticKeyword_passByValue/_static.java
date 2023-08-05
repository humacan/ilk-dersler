package Day19_StaticKeyword_passByValue;

public class _static {
    static String staticV="Java Candir";
    String InstanceV="Selenium Heyecandir";

    public static void main(String[] args) {
        staticV="Java Hayattir";
        staticMethod();
    }
    public static void staticMethod(){
        System.out.println("Static method calisti");
        System.out.println(staticV);
        //System.out.println(instanceV);

    }
    public void staticOlmayanMethod(){
        System.out.println("Static olmayan method calisti");
        System.out.println(staticV);
        staticMethod();
    }

}
