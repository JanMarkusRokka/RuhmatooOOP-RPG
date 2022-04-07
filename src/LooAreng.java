import java.util.Scanner;

public class LooAreng implements Sündmus {
    private Mängija mängija;
    private Scanner s;

    public LooAreng(Mängija mängija, Scanner s) {
        this.mängija = mängija;
        this.s = s;
    }

    public void kõrtsiSaabumine() throws InterruptedException {
        int koputamisteArv = 0;

        TekstiMeetodid.TavalineTähthaavalVäljund("Oled jõudnud kohta, mis meenutab tavalisest veidike suuremat keskaegset küla.");
        TekstiMeetodid.TavalineTähthaavalVäljund("Kuna päike hakkab juba looja jõudma, on sul varsti vaja öömaja leida.");

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("Külas ei paista mitte ühtegi hingelist, seega otsustad veidi ringi vaadata.");
        TekstiMeetodid.AeglaneVäljund("...");

        TekstiMeetodid.TavalineTähthaavalVäljund("Leiad väikse onni mille aknast lõõmab kerge valgus.");

        while (true) {
            TekstiMeetodid.TavalineVäljund("[1] Koputa uksele \n[2] Katsu ukselinki \n[3] Kõnni edasi");
            String uks = TekstiMeetodid.KindelSisend(s, new String[]{"1", "2", "3"});

            if (uks.equals("1")) {
                koputamisteArv++;
                if (koputamisteArv == 1 || koputamisteArv > 3) {
                    TekstiMeetodid.AeglaneVäljund("Kop-kop-kop");
                    TekstiMeetodid.TavalineTähthaavalVäljund("*Vaikus*");

                } else if (koputamisteArv == 2 ) {
                    TekstiMeetodid.AeglaneVäljund("Kop-ko..");
                    TekstiMeetodid.TavalineTähthaavalVäljund("Sa ei jõua koputamist lõpetatagi enne kui ukse vahelt pistab nina välja üks rusunud vana mees:");
                    TekstiMeetodid.TavalineTähthaavalVäljund("'Äh messa tahad? — Jälle mingid rõvedad kerjused!'");
                    TekstiMeetodid.TavalineTähthaavalVäljund("*Uks läheb pauguga kinni ja keeratakse lukku*");

                } else if (koputamisteArv == 3) {
                    TekstiMeetodid.AeglaneVäljund("Kop-kop-kop");
                    TekstiMeetodid.TavalineTähthaavalVäljund("*Ukse alt libiseb 5 hõbemünti*"); // võid siin täpsustada seda raha
                    TekstiMeetodid.TavalineTähthaavalVäljund("\033[3mTa vist ikka väga tahab, et teda rahule jäetaks.\033[0m");
                }

            } else if (uks.equals("2")) {
                // kui uksele on koputatud, siis enam sisse ei pääse (vanamees pani ukse lukku)
                if (koputamisteArv > 1) {
                    TekstiMeetodid.TavalineTähthaavalVäljund("*Uks on lukus*");

                } else {

                    TekstiMeetodid.TavalineTähthaavalVäljund("Katsud linki ja saad aru et uks on avatud.");
                    TekstiMeetodid.TavalineTähthaavalVäljund("Sa avad ukse ja sisened.");

                    TekstiMeetodid.TavalineTähthaavalVäljund("[1] 'Kas keegi on siin?'\n[2] Vaata ringi");

                    String link = TekstiMeetodid.KindelSisend(s, new String[]{"1", "2"});

                    if (link.equals("1")) {

                        TekstiMeetodid.TavalineTähthaavalVäljund("'Kas keegi on siin?'");
                        TekstiMeetodid.AeglaneVäljund("...");
                        TekstiMeetodid.TavalineTähthaavalVäljund("Silmapilgselt ilmub su ette üks kummaline mehike.");
                        TekstiMeetodid.TavalineTähthaavalVäljund("Sa üritad teha häält, kuid ükski lihas su kehas ei suuda liikuda.");
                        TekstiMeetodid.AeglaneVäljund("Mäng läbi...");

                        TekstiMeetodid.LugemisePunkt(s);
                        Peaklass.algus();
                        // mäng algab uuesti

                    } else {
                        TekstiMeetodid.TavalineTähthaavalVäljund("Sa otsustad veidi ringi vaadata.");
                        TekstiMeetodid.TavalineTähthaavalVäljund("Onni seinad on väga määrdunud ja ringi kõndides su jalad justkui kleepuvad maapinna külge.");
                        TekstiMeetodid.TavalineTähthaavalVäljund("Hais, mis sa tunned põletab su nina ja sa ei taha enam kaua siin viibida.");

                        TekstiMeetodid.LugemisePunkt(s);

                        TekstiMeetodid.TavalineTähthaavalVäljund("Osmik on täis ainult risu, kuid sulle torkab valusalt silma üks raamat.");
                        TekstiMeetodid.TavalineTähthaavalVäljund("Sa pühid raamatult tolmu ja näed pealkirja: ");
                        TekstiMeetodid.TavalineTähthaavalVäljund("~☆* Loitsude Raamat *☆~");

                        TekstiMeetodid.TavalineTähthaavalVäljund("Haarad kiirelt raamatu ja lahkud sellest kummalisest paigast koheselt.");
                        this.mängija.lisaVarustust("Loitsude Raamat");
                        TekstiMeetodid.LugemisePunkt(s);

                        break;
                    }
                }

            } else {
                if (koputamisteArv == 0) {
                    TekstiMeetodid.TavalineTähthaavalVäljund("*Sa ignoreerid onni ja jätkad kõndimist*");
                }
                break;
            }
        }
        TekstiMeetodid.AeglaneVäljund("...");
        TekstiMeetodid.TavalineTähthaavalVäljund("Sa kõnnid kuni näed suurt maja.");
        TekstiMeetodid.TavalineTähthaavalVäljund("Majast on tunda maitsva toidu hõngu ja on kuulda rahva suminat, seega sa kõnnid üha lähemale.");

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("Sa näed maja peal rippumas silti: ");

        TekstiMeetodid.TavalineVäljund("-".repeat(26));
        TekstiMeetodid.TavalineVäljund("| ☆ Suure Tõlla Kõrts ☆ |");
        TekstiMeetodid.TavalineVäljund("-".repeat(26));

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("Kõrtsu sisenedes tervitab sind muhe punasepõseline mees ja sa tunned, et sa oled lõpuks seal kus vaja.");

        TekstiMeetodid.AeglaneVäljund("...");

        TekstiMeetodid.TavalineTähthaavalVäljund("Siin on algversiooni lõpp.");
    }

    @Override
    public void Algus() throws InterruptedException {
        //Edaspidised episoodid (peale terve mängu algust) tulevad siia.
        this.kõrtsiSaabumine();
    }
}
