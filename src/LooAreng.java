import java.util.Scanner;

public class LooAreng implements Sündmus {
    private Mängija mängija;
    private Scanner s;

    public LooAreng(Mängija mängija, Scanner s) {
        this.mängija = mängija;
        this.s = s;
    }

    public static void kõrtsiSaabumine() throws InterruptedException {
        TekstiMeetodid.TavalineTähthaavalVäljund("Oled jõudnud kohta, mis meenutab tavalisest veidike suuremat keskaegset küla.");
        //jne
    }


    @Override
    public void Algus() throws InterruptedException {
        //Edaspidised episoodid (peale terve mängu algust) tulevad siia.
        this.kõrtsiSaabumine();
    }
}
