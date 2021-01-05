package AbstracSinif;

public class Abstrac {
    public static void main(String[] args) {
    GeometrikFiqur kvadrat = new Kvadradt(7);
    kvadrat.alanihesabla();
    kvadrat.cevreniHesabla();
        ((Kvadradt)kvadrat).adiniYaz();

    GeometrikFiqur duzbucaqli =new Duzbucaqli(8,12);
    duzbucaqli.alanihesabla();
    duzbucaqli.cevreniHesabla();
        ((Duzbucaqli)duzbucaqli).adiniYaz();

    GeometrikFiqur cevre = new Cevre(6);
    cevre.alanihesabla();
    cevre.cevreniHesabla();
        ((Cevre)cevre).adiniYaz();

        alanlariUzlesdir(kvadrat,duzbucaqli);
        alanVeCerveyiHesabla(kvadrat);
        alanVeCerveyiHesabla(duzbucaqli);
        alanVeCerveyiHesabla(cevre);
        saheleriHesabla(kvadrat,duzbucaqli);

    }

    public static void alanVeCerveyiHesabla(GeometrikFiqur gs1){

        gs1.cevreniHesabla();
        gs1.alanihesabla();

    }

    public static void alanlariUzlesdir(GeometrikFiqur gs1, GeometrikFiqur gs2){
        if(gs1.getHelablananYer()<gs2.getHelablananYer()){
            System.out.println("Birinci nin sahesi ikinciden balacadi");
        }else if(gs1.getHelablananYer()>gs2.getHelablananYer()){
            System.out.println("Birinci nin sahesi ikinciden boyukdu");
        }else{
            System.out.println(" Saheler bir birlerine bareberdir");
        }
    }

    public static void saheleriHesabla(GeometrikFiqur gs1,GeometrikFiqur gs2){
        if(gs1.getHesablananSaheler()<gs2.getHesablananSaheler()){
            System.out.println("Birinci nin sahesi ikinciden balacadi");
        }else if(gs1.getHesablananSaheler()>gs2.getHesablananSaheler()){
            System.out.println("Birinci nin sahesi ikinciden boyukdu");
        }else{
            System.out.println(" Saheler bir birlerine bareberdir");
        }
    }
}
abstract class GeometrikFiqur{

    private int birinciKunc;
    private int helablananYer;
    private int hesablananSaheler;

    abstract public void alanihesabla();
    abstract public void cevreniHesabla();

    public int getHesablananSaheler() {
        return hesablananSaheler;
    }

    public void setHesablananSaheler(int hesablananSaheler) {
        this.hesablananSaheler = hesablananSaheler;
    }

    public int getHelablananYer() {
        return helablananYer;
    }

    public void setHelablananYer(int helablananYer) {
        this.helablananYer = helablananYer;
    }

    public int getBirinciKunc() {
        return birinciKunc;
    }

    public void setBirinciKunc(int birinciKunc) {
        this.birinciKunc = birinciKunc;
    }
}
class Kvadradt extends GeometrikFiqur{
    public Kvadradt(int kunc) {
        this.setBirinciKunc(kunc);
    }

    @Override
    public void alanihesabla() {
        setHelablananYer(getBirinciKunc()*getBirinciKunc());
        System.out.println(" Alanin Sahesi : " + getHelablananYer());
    }

    @Override
    public void cevreniHesabla() {
        setHesablananSaheler(getBirinciKunc()*4);
        System.out.println("Cevrenin sahesi : " + getHesablananSaheler());
    }

    public void adiniYaz(){
        System.out.println("Men bir Kvadratam");
    }

}

class Duzbucaqli extends GeometrikFiqur{

    private  int ikinciKunc;



    public int getIkinciKunc() {
        return ikinciKunc;
    }


    public void setIkinciKunc(int ikinciKunc) {
        this.ikinciKunc = ikinciKunc;
    }

    public Duzbucaqli(int birinciKunc,int ikinciKunc) {
        setBirinciKunc(birinciKunc);
        this.ikinciKunc = ikinciKunc;
    }

    @Override
    public void alanihesabla() {
        setHelablananYer((getBirinciKunc()*ikinciKunc));
        System.out.println("Duzbucaqlinin sahesi : " + getHelablananYer());
    }

    @Override
    public void cevreniHesabla() {
        setHesablananSaheler(2*(getBirinciKunc()+ikinciKunc));
        System.out.println("Duzbucaqlinin cevresi : " + getHesablananSaheler());
    }

    public void adiniYaz(){
        System.out.println("Men bir Duzbucaqliyam");
    }

}

class Cevre extends GeometrikFiqur{

    public Cevre(int yariCap) {
        setBirinciKunc(yariCap);
    }

    @Override
    public void alanihesabla() {
        setHelablananYer((int) (3.14 * getBirinciKunc() * getBirinciKunc()));
        System.out.println("Dairenin Sahesi : " + getHelablananYer());
    }

    @Override
    public void cevreniHesabla() {
        setHelablananYer((int)(2 * 3.14 * getBirinciKunc()));
        System.out.println("Dairenin Cevresi : "+ getHelablananYer());
    }

    public void adiniYaz(){
        System.out.println("Men bir Daireyem");
    }
}