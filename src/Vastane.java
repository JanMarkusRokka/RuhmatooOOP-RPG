public class Vastane {
    private int maxEluPunktid;
    private int eluPunktid;
    private int löögiVõimekus;
    private int kaitseVõimekus;
    private String nimi;

    public Vastane(int maxEluPunktid, int eluPunktid, int löögiVõimekus, int kaitseVõimekus, String nimi) {
        this.maxEluPunktid = maxEluPunktid;
        this.eluPunktid = eluPunktid;
        this.löögiVõimekus = löögiVõimekus;
        this.kaitseVõimekus = kaitseVõimekus;
        this.nimi = nimi;
    }

    public int getMaxEluPunktid() {
        return maxEluPunktid;
    }

    public int getEluPunktid() {
        return eluPunktid;
    }

    public void setEluPunktid(int eluPunktid) {
        this.eluPunktid = eluPunktid;
    }

    public int getLöögiVõimekus() {
        return löögiVõimekus;
    }

    public void setLöögiVõimekus(int löögiVõimekus) {
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
