public class Vastane {
    private int eluPunktid;
    private double löögiVõimekus;
    private int kaitseVõimekus;
    private String nimi;

    public Vastane(int eluPunktid, double löögiVõimekus, int kaitseVõimekus, String nimi) {
        this.eluPunktid = eluPunktid;
        this.löögiVõimekus = löögiVõimekus;
        this.kaitseVõimekus = kaitseVõimekus;
        this.nimi = nimi;
    }

    public int getEluPunktid() {
        return eluPunktid;
    }

    public void setEluPunktid(int eluPunktid) {
        this.eluPunktid = eluPunktid;
    }

    public double getLöögiVõimekus() {
        return löögiVõimekus;
    }

    public void setLöögiVõimekus(double löögiVõimekus) {
        this.löögiVõimekus = löögiVõimekus;
    }

    public int getKaitseVõimekus() {
        return kaitseVõimekus;
    }

    public void setKaitseVõimekus(int kaitseVõimekus) {
        this.kaitseVõimekus = kaitseVõimekus;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }
}
