/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AplikacjaDoOdczytow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Łukasz Kowalczyk
 */
public class AplikacjaDoOdczytow {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    AplikacjaDoOdczytow szac2 = new AplikacjaDoOdczytow();
        long wart = szac2.AplikacjaDoOdczytow(100, 200, "2017-01-15", "2017-02-15", "2017-03-01");
        System.out.print(wart);
    
    }
    
        public long AplikacjaDoOdczytow(int wskP, int wskB, String dataP, String dataB, String DataS)
    {   
       
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        Date dataP2 = null;
        try {
            dataP2 = dateFormat.parse(dataP);
        } catch (ParseException ex) {
            Logger.getLogger(AplikacjaDoOdczytow.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar dataP2C = Calendar.getInstance();
        dataP2C.setTime(dataP2); 
        Date dataB2 = null;        
        try {
            dataB2 = dateFormat.parse(dataB);
        } catch (ParseException ex) {
            Logger.getLogger(AplikacjaDoOdczytow.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar dataB2C = Calendar.getInstance();
        dataB2C.setTime(dataB2);
        System.out.println("dataP"+dataP);
        System.out.println("dataP2"+dataP2);
        System.out.println("dataP2C"+dataP2C);
        System.out.println("dataB"+dataB);
        System.out.println("dataB2"+dataB2);
        System.out.println("dataB2C"+dataB2C);
    long czasWMili = dataB2C.getTimeInMillis() - dataP2C.getTimeInMillis();
    System.out.println("czasWMiliB2C"+dataB2C.getTimeInMillis());
    System.out.println("czasWMiliP2C"+dataP2C.getTimeInMillis());
    System.out.println("czasWMili"+czasWMili);
    long liczbaMSwDobie = 1000 * 60 * 60 * 24; 
    Calendar miliPomiedzy = Calendar.getInstance();
    System.out.println("miliPomiedzy"+miliPomiedzy);
    miliPomiedzy.setTimeInMillis(czasWMili);  
    System.out.println("czasWMili"+czasWMili);
       long różnica = miliPomiedzy.getTimeInMillis()/liczbaMSwDobie;
        System.out.println("różnica"+różnica);
        long dzienny;
        dzienny = (wskB - wskP)/różnica;
        System.out.println("dzienny"+dzienny);
        
        
        
        
        
        
        return  różnica;
    }
    
    
}