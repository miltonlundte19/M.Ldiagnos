import javax.swing.*;
import java.awt.*;

public class gissatalet {
    public static void main(String[] args) {
        double svar1;
        int svar2;
        svar1 =  Math.random()*100;
        svar2 = (int) svar1;
        boolean k = false;
        System.out.print(svar2);
        int nedre = 1;
        int upppre = 100;
        String text = "Gisa på ett tall mellen" + nedre + "och" + upppre;
        int gis;
        int agis = 0;
        String svar = "det tog" + gis + "försök att gisa" + svar2;
        try {
            gis = Integer.parseInt(JOptionPane.showInputDialog(text));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "skrivit fell så gisningen blir 50");
            gis = 50;
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
        while (k ) {
            try {
                gis = Integer.parseInt(JOptionPane.showInputDialog(text));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (HeadlessException e) {
                e.printStackTrace();
            }

            if (svar2 == gis) {
                if (agis==0) {
                    svar = "Gratis du gisade rett på första försöket!!";
                    break;
                }
                agis++;
                k = true;

            }else if (gis < svar2) {
                nedre = gis;
                agis++;
            } else if (gis > svar2) {
                upppre = gis;
                agis++;
            }
        }
        JOptionPane.showMessageDialog(null, svar);
    }
}
