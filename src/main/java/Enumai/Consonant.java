package Enumai;

public enum  Consonant {
    b,c,d,f,g,h,j,k,l,m,n,o,p,r,s,t,u,v,z,č,š,ž;

    public static Consonant get(int index){
        return Consonant.values()[index];
    }
}
