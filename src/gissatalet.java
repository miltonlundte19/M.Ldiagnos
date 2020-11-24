import javax.swing.*;
import java.awt.*;

public class gissatalet {
    public static void main(String[] args) {
        double svar1;
        int svar2;
        svar1 =  Math.random()*100;
        svar2 = (int) svar1;
        boolean k = true;
        System.out.print(svar2);
        int nedre = 1;
        int upppre = 100;
        int fgis = 0;
        String text = "Gisa på ett tall mellen " + nedre + " och " + upppre;
        int gis = 0;
        int agis = 0;
        String svar = "det tog " + gis + " försök att gisa " + svar2;
        boolean i = true;
        boolean c = false;
        boolean y = true;
        try {
            gis = Integer.parseInt(JOptionPane.showInputDialog(text));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "skrivit fell så gisningen blir 50");
            gis = 50;
            fgis++;
        } catch (HeadlessException e) {
            e.printStackTrace();
        }
        while (k ) {
            while (i) {
                c = false;
                try {
                    gis = Integer.parseInt(JOptionPane.showInputDialog(text));
                } catch (NumberFormatException e) {
                     c = true;
                    fgis++;
                    JOptionPane.showMessageDialog(null,"du gisade fell försök i gen!" + "\nmåste vara ett hel tal");
                } catch (HeadlessException e) {
                    e.printStackTrace();
                }

                    break;
                if (c = false) {
                    i = false;
                }
            }

            if (gis == svar2) {
                switch (agis) {
                    case 0:
                        svar = "Gratis du gisade rett på första försöket!!";
                        y = false;
                        break;
                    default:
                        agis++;
                        k = false;
                        break;
                }
            }else if (gis < svar2) {
                nedre = gis;
                agis++;
            }else if (gis > svar2) {
                upppre = gis;
                agis++;
            }else {
                fgis++;
                JOptionPane.showMessageDialog(null, "du gisade på ett tal som inte är giltigt");
            }
        }
        if (fgis < 5) {y = false;}
        if (y = true) {
            svar = svar + "\ndu gisade fell " + fgis + " gånger";
        }
        JOptionPane.showMessageDialog(null, svar);
    }
}
