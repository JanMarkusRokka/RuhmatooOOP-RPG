import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TekstiMeetodid {

    public static void TavalineVäljund(String sisend) throws InterruptedException {
        Thread.sleep(100);
        System.out.println(sisend);
        System.out.println();
    }

    public static void TähthaavalVäljund(String sisend, int kiirus) throws InterruptedException {
        for (int i = 0; i < sisend.length(); i++) {
            System.out.print(sisend.charAt(i));
            Thread.sleep(kiirus);
        }
        System.out.println("\n");
    }

    public static void AeglaneVäljund(String sisend) throws InterruptedException {
        TähthaavalVäljund(sisend, 500);
    }

    public static void TavalineTähthaavalVäljund(String sisend) throws InterruptedException {
        TähthaavalVäljund(sisend, 35);
    }

    public static String TavalineSisend(Scanner scanner) {
        String sisend = scanner.nextLine();
        return sisend;
    }

    public static String KindelSisend(Scanner scanner, String[] võimalikudSisendid) throws InterruptedException {
        List<String> sisendid = new ArrayList<>();
        for (int i = 0; i < võimalikudSisendid.length; i++) {
            sisendid.add(võimalikudSisendid[i]);
        }
        String sisend = scanner.nextLine();
        while (!sisendid.contains(sisend)) {
            sisend = scanner.nextLine();
            TavalineVäljund("Sisesta üks väärtustest: " + sisendid);
        }
        return sisend;
    }

    public static void LugemisePunkt(Scanner scanner) {
        System.out.println("[VAJUTA ENTER]");
        scanner.nextLine();
    }


}
