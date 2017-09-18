/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikacjaDoOdczytow;

/**
 *
 * @author puszatek
 */
public class Szacowanie {
    
    public static long szacuj (int odcP, int odcB, String dataP, String dataB, String dataS)
    {
    int dniPom = LiczRozn.OblRozDni(dataB, dataP);
    int dniDo = LiczRozn.OblRozDni(dataS, dataB);
    int zuz = odcB - odcP;
    int zuzD = zuz/dniPom;
    double wsp = 0.80;
    int zuzPo = dniDo*zuzD;
    double odcS = odcB + (zuzPo*wsp);
    
    
    
    
    return (long) odcS;   
    }
    
    
    
    
    
}
