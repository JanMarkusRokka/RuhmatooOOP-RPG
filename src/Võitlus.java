public class Võitlus implements Sündmus {
    private Mängija mängija;
    private Vastane vastane;

    public Võitlus(Mängija mängija, Vastane vastane) {
        this.mängija = mängija;
        this.vastane = vastane;
        this.Algus();
    }

    @Override
    public void Algus() {
        while (mängija.getElupunktid()>0 && vastane.getEluPunktid()>0) {
            System.out.println("aaaaa");
            vastane.setEluPunktid(0);
        }
    }


    @Override
    public void Lõpp() {

    }
}
