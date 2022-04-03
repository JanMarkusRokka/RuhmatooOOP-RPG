import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Mängija {
    private List<String> seljakott = new ArrayList<>();
    private int kogemuseTase;
    private String nimi;
    private int elupunktid;

    public Mängija(String nimi) {
        this.kogemuseTase = 0;
        this.elupunktid = 30;
        this.nimi = nimi;
    }

    public List<String> getSeljakott() {
        return seljakott;
    }

    public void setSeljakott(List<String> seljakott) {
        this.seljakott = seljakott;
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

    public void lisaSeljakotti(String ese) {
        this.seljakott.add(ese);
    }

    public void esemedSeljakotis() {
        System.out.println(this.seljakott);
    }
}
