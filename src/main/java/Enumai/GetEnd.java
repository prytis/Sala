package Enumai;

public enum GetEnd {
    as, ys, is;

    public static GetEnd get(int index) {
        return GetEnd.values()[index];
    }
}

