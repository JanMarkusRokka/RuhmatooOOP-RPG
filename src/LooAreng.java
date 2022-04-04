import java.util.Scanner;

public class LooAreng implements Sündmus {
    private Mängija mängija;
    private Scanner s;

    public LooAreng(Mängija mängija, Scanner s) {
        this.mängija = mängija;
        this.s = s;
    }

    public static void kõrtsiSaabumine() throws InterruptedException {
        int koputamisteArv = 0;
        Scanner s = new Scanner(System.in);

        TekstiMeetodid.TavalineTähthaavalVäljund("Oled jõudnud kohta, mis meenutab tavalisest veidike suuremat keskaegset küla."); // <-- implies et ta pole ise keskajast pärit seega isekai???
        TekstiMeetodid.TavalineTähthaavalVäljund("Kuna päike hakkab juba looja jõudma, on sul vaja varsti öömaja leida.");

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("Külas ei paista mitte ühtegi hingelist, seega otsustad veidi ringi vaadata.");
        TekstiMeetodid.AeglaneVäljund("...");

        TekstiMeetodid.TavalineTähthaavalVäljund("Leiad väikse onni mille aknast lõõmab kerge valgus.");

        while (true) {
            TekstiMeetodid.TavalineTähthaavalVäljund("Kuidas soovid käituda?");

            TekstiMeetodid.TavalineVäljund("[1] Koputad uksele \n[2] Katsud ukselinki \n[3] Kõnnid edasi");
            String uks = TekstiMeetodid.KindelSisend(s, new String[]{"1", "2", "3"});

            if (uks.equals("1")) {
                koputamisteArv++;
                if (koputamisteArv == 1) {
                    TekstiMeetodid.AeglaneVäljund("Kop-kop-ko..");
                    TekstiMeetodid.TavalineTähthaavalVäljund("Sa ei jõua koputamist lõpetatagi enne kui ukse vahelt pistab oma nina välja üks rusunud vana mees:");
                    TekstiMeetodid.TavalineTähthaavalVäljund("'Äh messa tahad?'");
                    TekstiMeetodid.TavalineTähthaavalVäljund("'Keri minema siit sa rõve kerjus!'");

                } else if (koputamisteArv == 2 || koputamisteArv > 3) {
                    TekstiMeetodid.AeglaneVäljund("Kop-kop-kop");
                    TekstiMeetodid.TavalineTähthaavalVäljund("*Vaikus*");

                } else if (koputamisteArv == 3) {
                    TekstiMeetodid.AeglaneVäljund("Kop-ko..");
                    TekstiMeetodid.TavalineTähthaavalVäljund("Ukse alt libiseb 5 hõbemünti"); // võid siin täpsustada seda raha

                }


            } else if (uks.equals("2")) {
                // kui uksele on koputatud, siis enam sisse ei pääse (vanamees pani ukse lukku)
                if (koputamisteArv > 1) {
                    TekstiMeetodid.TavalineTähthaavalVäljund("*Uks on lukus*");

                } else {

                    TekstiMeetodid.TavalineTähthaavalVäljund("Katsud linki ja saad aru et uks on avatud");
                    TekstiMeetodid.TavalineTähthaavalVäljund("Kudias käitud?");

                    TekstiMeetodid.TavalineTähthaavalVäljund("[1] Hüüad: 'Kas keegi on siin?' \n[2] Sisened onni");

                    String link = TekstiMeetodid.KindelSisend(s, new String[]{"1", "2"});

                    if (link.equals("1")) {
                        // vanamees läheb närvi ja pussitab su ära, insert dark souls 'u died'
                        break;
                    } else {
                        // leiad pimedas mingi asja ja tõmbad nahhuj
                        break;
                    }
                }

            } else {
                break;
            }
        }
        TekstiMeetodid.AeglaneVäljund("...");
        TekstiMeetodid.TavalineTähthaavalVäljund("Sa kõnnid kuni näed suurt maja.");
        TekstiMeetodid.TavalineTähthaavalVäljund("Majast on tunda maitsva toidu hõngu ja on kuulda rahva suminat, seega sa kõnnid üha lähemale.");

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("Sa näed maja peal rippumas silti: ");

        TekstiMeetodid.TavalineVäljund("-".repeat(26));
        TekstiMeetodid.TavalineVäljund("| ☆ Suure Tõlla Kõrts ☆ |"); // seda nime võib muuta ka XD
        TekstiMeetodid.TavalineVäljund("-".repeat(26));

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("Kõrtsu sisenedes tervitab sind muhe punasepõseline mees ja sa tunned, et sa oled lõpuks seal kus vaja.");

        TekstiMeetodid.AeglaneVäljund("...");

        TekstiMeetodid.TavalineTähthaavalVäljund("This is teh end of demo version pay 10 dolla to get the full experience: ");
        TekstiMeetodid.AeglaneVäljund("EE912200221048806582");

    }

    @Override
    public void Algus() throws InterruptedException {
        //Edaspidised episoodid (peale terve mängu algust) tulevad siia.
        kõrtsiSaabumine();
    }
}
