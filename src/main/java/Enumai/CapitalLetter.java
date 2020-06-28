package Enumai;

public enum CapitalLetter {
    A,B,C,D,E,F,G,H,J,K,L,M,N,O,P,R,S,T,U,V,Z,Č,Š,Ž;

    public static CapitalLetter get(int index){
        return CapitalLetter.values()[index];
    }

}
