import java.util.Scanner;



public class Peaklass {

    public static void algus() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        TekstiMeetodid.TavalineVäljund("TektstipõhineRPG versioon 0.1");
        TekstiMeetodid.TavalineVäljund("Mängu alustamiseks vali enda tegelasele nimi: ");

        String nimi = "";
        while (nimi.length() == 0) {
            nimi = TekstiMeetodid.TavalineSisend(s);
            if (nimi.length() == 0) TekstiMeetodid.TavalineVäljund("Nimi ei saa olla tühi sõne, sisestage nimi: ");
        }

        Mängija mängija = new Mängija(nimi);

        System.out.println();
        TekstiMeetodid.TavalineTähthaavalVäljund("Mäng algab!");
        TekstiMeetodid.AeglaneVäljund("...");

        TekstiMeetodid.TavalineTähthaavalVäljund("Sa ärkad üles keset põldu.");
        TekstiMeetodid.TavalineTähthaavalVäljund("Ringi vaadates märkad, et sinust asub vasakul pool tee, mis ületab küngast (ei näe hetkel sellest üle).\nParemalt poolt ümbritseb sind tihe kuusemets.");

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("Metsa viib aastakümnetega sissetallutud jalgrada, selle ees silt: ");
        TekstiMeetodid.TavalineVäljund("-".repeat(11));
        TekstiMeetodid.TavalineVäljund("| " + "HO/ATUs" + " |");
        TekstiMeetodid.TavalineVäljund("|" + "KoLET|SED" + "|");
        TekstiMeetodid.TavalineVäljund("-".repeat(11));

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("Korraga kuuled sa enda tagant nördinud, kuid siiski mures häält hüüdmas:");
        TekstiMeetodid.TavalineTähthaavalVäljund("'Hei!\nHei sine sääl!'\n");
        TekstiMeetodid.TavalineTähthaavalVäljund("Sa võpatad ja pöörad ennast ümber.");
        TekstiMeetodid.TavalineTähthaavalVäljund("'Minä sinu asemel kül' sinnä äi lähiks!'");

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("Sinuga rääkis mees, kes istus hobusekaarikul, seljas räpane linasest särk ja suus õlekõrs.");
        TekstiMeetodid.TavalineTähthaavalVäljund("Järsku, ühe liigutuse peale kaarik peatus ning eeldatav talumees vaatas sulle küsitleva pilguga otsa.");
        TekstiMeetodid.TavalineTähthaavalVäljund("'Ärä eksnud võih mis?'");

        TekstiMeetodid.LugemisePunkt(s);

        TekstiMeetodid.TavalineTähthaavalVäljund("'K'tahad võin su paari mündi eest lähimasse linna ära viia, mis arvad?'");

        TekstiMeetodid.TavalineVäljund("[1. Lähed temaga linna/2. Lähed metsa]");

        String linna = TekstiMeetodid.KindelSisend(s, new String[] {"1", "2"});

        if (linna.equals("1")) {
            TekstiMeetodid.TavalineTähthaavalVäljund("Kontrollides oma taskuid, leiad sa 5 kõlisevat pronksmünti");
            TekstiMeetodid.AeglaneVäljund("...Aeg...möödub...");
            LooAreng looAreng = new LooAreng(mängija, s);
            looAreng.Algus();
        }
        else {
            TekstiMeetodid.TavalineTähthaavalVäljund("Lausud: 'Ei, ma vist saan siin ise hakkama. Aga tänan pakkumast.'");
            TekstiMeetodid.TavalineTähthaavalVäljund("Mees mõtleb korra\n'Nu kui sa nii ärväd...'\nning asub edasi liikuma, lahkudes vaikselt sumbuva kapjade klabinaga.");

            TekstiMeetodid.LugemisePunkt(s);

            TekstiMeetodid.TavalineTähthaavalVäljund("Kuna sul on vaja midagi süüa leida, otsustad minna metsa jahile.");
            TekstiMeetodid.TavalineTähthaavalVäljund("Metsas on küllaltki palju külmem ning on näha, kuidas päike hakkab taevast horisondi taha vajuma.");

            TekstiMeetodid.LugemisePunkt(s);

            TekstiMeetodid.TavalineTähthaavalVäljund("Peale lühikest aega ajutise varjualuse ehitamist, kuuled enda ümber oksade raginat.");
            TekstiMeetodid.AeglaneVäljund("...raks...");

            TekstiMeetodid.TavalineTähthaavalVäljund("Järsku hüppab põõsast välja haavatud verejanune hunt, kes tormab otsejoones sinu poole.");

            TekstiMeetodid.TavalineVäljund("[1. Põgened/2. Võitled]");

            String valik = TekstiMeetodid.KindelSisend(s, new String[] {"1","2"});

            if (valik.equals("1")) {
                TekstiMeetodid.TavalineTähthaavalVäljund("Otsustad joosta ning sprindid viimase valguse poole.");
                TekstiMeetodid.TavalineTähthaavalVäljund("Järsku komistad ja kukud, kuid näed, et oled väljunud tihkest metsast ja hunt on jäänud seisma -" +
                        "ta ei saa metsast lahkuda.");

                TekstiMeetodid.LugemisePunkt(s);
                TekstiMeetodid.TavalineTähthaavalVäljund("Leiad end uuesti tee juures ning otsustad minna hobukaariku jälgedes, sest tundub, et kohalik loodus sind ei salli.");
                TekstiMeetodid.AeglaneVäljund("...Aeg...möödub...");
                LooAreng looAreng = new LooAreng(mängija, s);
                looAreng.Algus();
            }
            else {
                Hunt hunt = new Hunt();
                Võitlus võitlus = new Võitlus(mängija, hunt, s);
                võitlus.Algus();
                mängija.lisaVarustust("hundinahk");
                TekstiMeetodid.TavalineTähthaavalVäljund("Elasid kuidagi selle õudusunenäo üle, kuid vähemalt said endale hundinaha");
                TekstiMeetodid.TavalineTähthaavalVäljund("Otsutad, et enam pole metsas ööbimine eriti tark idee ja suundud metsast välja.");

                TekstiMeetodid.LugemisePunkt(s);

                TekstiMeetodid.TavalineTähthaavalVäljund("Metsast välja jõudes avastad end viimase päikesevalguse käes sama tee juures, kus üles ärkasid.");
                TekstiMeetodid.TavalineTähthaavalVäljund("Hakkad sammuma mööda teed lähima asustuse poole, lootusega, et enam SEDA ei juhtu.");

                TekstiMeetodid.LugemisePunkt(s);

                LooAreng looAreng = new LooAreng(mängija, s);
                looAreng.Algus();
            }

        }


        //TekstiMeetodid.TavalineTähthaavalVäljund("Tere tulemast, " + mängija.getNimi() + ", siia ilusasse maailma!");
    }

    public static void testVõitlus() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        Mängija mängija = new Mängija("Jaan");
        Hunt hunt = new Hunt();
        Võitlus võitlus = new Võitlus(mängija, hunt, s);
        võitlus.Algus();
    }

    public static void testEpisood() throws InterruptedException {
        Scanner s = new Scanner(System.in);
        Mängija mängija = new Mängija("Jaan");
        LooAreng looAreng = new LooAreng(mängija, s);
        looAreng.Algus();
    }

    public static void main(String[] args) throws InterruptedException  {
        algus();
        //testEpisood();
    }
}
