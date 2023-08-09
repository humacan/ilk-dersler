package day32_StringBuilde_AccessModifier;
public class C06_Runner {
    public static void main(String[] args) {

        C05 obj=new C05();
        //System.out.println(obj.privateSayi); private oldugu icin ulasilamaz
        System.out.println(obj.defaultSayi);

        obj.defaultSayi=21;
        System.out.println(obj.defaultSayi); //21

        System.out.println(obj.protectedSayi);
        obj.protectedSayi=23;
        System.out.println(obj.protectedSayi);

        System.out.println(obj.publicSayi);
        obj.publicSayi=40;
        System.out.println(obj.publicSayi);

    }
}
