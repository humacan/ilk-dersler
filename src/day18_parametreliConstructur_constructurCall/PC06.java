package day18_parametreliConstructur_constructurCall;

public class PC06 {
    PC06(){                                               //7. calisir
        System.out.println("Parametresiz Constructor");   //8.calisir

    }                                                     //9.calisir
    PC06(int sayi){                                       // 5.calisir
        //PC06(); java bu sekilde yazimi method call kabul eder
        //yani constructor lar cons. ismi yazilarak CAGRILAMAZ

        this(); // constructor call ilk satira yazilir      // 6.calisir
        //bir constructor in icinde baska bir constructor i calistirmak istersek
        // this(istenen argumentler) yazariz
        System.out.println("int parametreli constructor"); //10. calisir
    }                                                      //11. calisir
    PC06(String str){                                      //3. calisir ==> java
        this(3);                                      //4. calisir
        System.out.println("String parametreli cons.");    //12.calisir
    }                                                       //13.calisir

    public static void main(String[] args) {              // 1. calisir
        PC06 obj=new PC06("java");                    // 2. calisir
    }                                                     //12. calisir

}
