package Day36_inharitance_datatype_overriding;

import day34_inharitance.EHayvanlar;

public class FKuslar extends EHayvanlar {

    protected void kanat(){
        System.out.println("kanatlidirlar");
    }
    public void solunum(){
        System.out.println("nefes alirlar");
    }
    public void gaga(){
        System.out.println("gagalari vardir");
    }
    public void cogalma(){
        System.out.println("cogalirlar");
    }
}
