package Enumai;


public enum Sonant {
    a,e,i,u,o,ai,ei,ie,uo,au,iau,ė,iū;

    public static Sonant get(int index){
        return Sonant.values()[index];
    }
}
