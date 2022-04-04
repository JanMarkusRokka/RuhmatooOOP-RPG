import java.util.ArrayList;
import java.util.List;

public class Mängija {
    private List<String> varustus = new ArrayList<>();
    private int kogemuseTase;
    private String nimi;
    private int elupunktid;
    private int rahakott;

    public Mängija(String nimi) {
        this.kogemuseTase = 0;
        this.elupunktid = 30;
        this.nimi = nimi;
        this.rahakott = 5;
    }

    public List<String> getVarustus() {
        return varustus;
    }

    public void setVarustus(List<String> Varustus) {
        this.varustus = Varustus;
    }

    public int getKogemuseTase() {
        return kogemuseTase;
    }

    public void setKogemuseTase(int kogemuseTase) {
        this.kogemuseTase = kogemuseTase;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String nimi) {
        this.nimi = nimi;
    }

    public int getElupunktid() {
        return elupunktid;
    }

    public void setElupunktid(int elupunktid) {
        this.elupunktid = elupunktid;
    }

    public int ründeJõud() {
        if (varustus.size() == 0) {
            return (int) Math.round(Math.random() * 3)+2;
        }
        return 0;
    }

    public int kaitseVõimekus() {
        if (varustus.size() == 0) {
            return 1;
        }
        return 0;
    }

    public void lisaVarustust(String ese) throws InterruptedException {
        this.varustus.add(ese);
        TekstiMeetodid.TavalineTähthaavalVäljund("Oled saanud eseme: " + ese + ".");
    }

    public void esemedSeljakotis() {
        System.out.println(this.varustus);
    }
}
