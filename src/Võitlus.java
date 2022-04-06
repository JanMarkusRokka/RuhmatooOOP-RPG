import java.util.Scanner;

public class Võitlus implements Sündmus {
    private Mängija mängija;
    private Vastane vastane;
    private Scanner scanner;

    public Võitlus(Mängija mängija, Vastane vastane, Scanner scanner) throws InterruptedException {
        this.mängija = mängija;
        this.vastane = vastane;
        this.scanner = scanner;
    }

    @Override
    public void Algus() throws InterruptedException {
        TekstiMeetodid.TavalineTähthaavalVäljund("-".repeat(20));

        TekstiMeetodid.TavalineTähthaavalVäljund("Oled asunud võitlusse vastasega " + vastane.getNimi());

        while (mängija.getElupunktid()>0 && vastane.getEluPunktid()>0) {
            TekstiMeetodid.TavalineVäljund(mängija.getNimi() + " elusid " + mängija.getElupunktid() + "|" + vastane.getNimi() + " elusid " + vastane.getEluPunktid());
            TekstiMeetodid.TavalineTähthaavalVäljund("[1] Tavaline rünnak\n[2] Tugev rünnak\n[3] Kaitsmine");
            String sisend = TekstiMeetodid.KindelSisend(this.scanner, new String[] {"1","2","3"});

            int rünnak = 0;
            int taastumine = 0;
            if (sisend.equals("1")) {
                rünnak = mängija.ründeJõud()- vastane.getKaitseVõimekus();
                if (rünnak <= 0) {
                    TekstiMeetodid.TavalineTähthaavalVäljund("Vastase kaitse oli liiga hea, löök ei läinud läbi.");
                }
            }
            else if (sisend.equals("2")) {
                //Tugev rünnak
                //50% võimalus, et saab pihta, kuid ründevõimekus on 2x suurem.
                rünnak = 2*((((int) (Math.random()*2))*(mängija.ründeJõud())))-vastane.getKaitseVõimekus();
                if (rünnak <= 0) {
                    TekstiMeetodid.TavalineTähthaavalVäljund("Lõid vastasest mööda.");
                }
            }
            else {
                int varasem = mängija.getElupunktid();
                taastumine = (int) Math.round(Math.random()*3);
                while (taastumine > 0 && mängija.getElupunktid() < 30) {
                    mängija.setElupunktid(mängija.getElupunktid()+1);
                    taastumine--;
                }
                TekstiMeetodid.TavalineTähthaavalVäljund("Kaitsmise ajal taastasid " + (mängija.getElupunktid()-varasem) + " elupunkti.");
            }
            if (rünnak > 0) {
                vastane.setEluPunktid(vastane.getEluPunktid() - rünnak);
                TekstiMeetodid.TavalineVäljund("Rünnak võttis vastaselt " + vastane.getNimi() + " " + rünnak + " elupunkti.");
            }
            if (vastane.getEluPunktid() > 0) {
                int vastase_valik = (int) (Math.random()*3);
                if (vastase_valik == 0) {
                    int varasem = vastane.getEluPunktid();
                    int kaitsmine = (int) (Math.random() * 3);
                    while (vastane.getEluPunktid() < vastane.getMaxEluPunktid() && kaitsmine > 0) {
                        vastane.setEluPunktid(vastane.getEluPunktid()+1);
                        kaitsmine--;
                    }
                    TekstiMeetodid.TavalineTähthaavalVäljund(vastane.getNimi() + " taastas kaitsmise hetkel " + (vastane.getEluPunktid()-varasem) + " elupunkti.");

                }
                else {
                    int vRünnak = vastane.getLöögiVõimekus()-((int)Math.round(Math.random()*3))-mängija.kaitseVõimekus();
                    if (vRünnak > 0) {
                        mängija.setElupunktid(mängija.getElupunktid()-vRünnak);
                        TekstiMeetodid.TavalineTähthaavalVäljund("Vastane " + vastane.getNimi() + " lõi sinust välja " + vRünnak + " elupunkti.");
                    }
                    else TekstiMeetodid.TavalineTähthaavalVäljund("Vastase" + vastane.getNimi() + " rünnak ei olnud efektiivne.");
                }
            }
        }
        if (mängija.getElupunktid() > 0) {
            TekstiMeetodid.TavalineTähthaavalVäljund("Oled võitnud!");
        }
        else {
            TekstiMeetodid.TavalineTähthaavalVäljund("Oled kaotanud...");
            TekstiMeetodid.AeglaneVäljund("Mäng läbi...");
            TekstiMeetodid.TavalineTähthaavalVäljund("Uuesti alustamiseks vajuta [ENTER]");
            TekstiMeetodid.TavalineSisend(scanner);
            Peaklass.algus();
        }
        TekstiMeetodid.TavalineTähthaavalVäljund("-".repeat(20));
    }
}
