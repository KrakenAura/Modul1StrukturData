package Kegiatan1;

public class Segitiga <N> {
    private N alas;
    private N tinggi;

    public Segitiga(N alas, N tinggi){
        this.alas=alas;
        this.tinggi=tinggi;
    }

    public N getTinggi(){
        return tinggi;
    }

    public N getAlas(){
        return alas;
    }

    public void getResultAsDouble(){
        double luas = (Double) getAlas() * (Double) getTinggi() / 2;
        System.out.println("Luas Segitiga dalam Double : "+luas);
    }

    public void getResultAsInt(){
        int luas = (Integer) getTinggi() * (Integer) getAlas() / 2;
        System.out.println("Luas Segitiga dalam Integer : "+luas);
    }
}

