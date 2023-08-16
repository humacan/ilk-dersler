package Day33_encapsulatino_inheritance;
public class C05_Runner {
    public static void main(String[] args) {
        C04_Okul okul=new C04_Okul();
// okul adi private yapip encapsule ettigimiz variable
        System.out.println(okul.getOkuladi());

        okul.setOkuladi("Java Koleji");

        // okul adresi public variable
        System.out.println(okul.okuladresi);

        okul.okuladresi="Ankara/Cankaya";

        System.out.println(okul.okuladresi);

    }
}
