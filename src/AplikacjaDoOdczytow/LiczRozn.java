
package AplikacjaDoOdczytow;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;


public class LiczRozn {
    
    public static int OblRozDni(String data1, String data2){
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        
        Date data1D = null;
        try {
            data1D = dateFormat.parse(data1);
        } catch (ParseException ex) {
            Logger.getLogger(AplikacjaDoOdczytow.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar data1DC = Calendar.getInstance();
        data1DC.setTime(data1D); 
        
        Date data2D = null;
        try {
            data2D = dateFormat.parse(data2);
        } catch (ParseException ex) {
            Logger.getLogger(AplikacjaDoOdczytow.class.getName()).log(Level.SEVERE, null, ex);
        }
        Calendar data2DC = Calendar.getInstance();
        data2DC.setTime(data2D);

          long czasWMili = data1DC.getTimeInMillis() - data2DC.getTimeInMillis();
          long liczbaMSwDobie = 1000 * 60 * 60 * 24; 
          Calendar miliPomiedzy = Calendar.getInstance();
          miliPomiedzy.setTimeInMillis(czasWMili);  
          long różnica = miliPomiedzy.getTimeInMillis()/liczbaMSwDobie;
            
            
            
            
return (int) różnica;

}
    
  
    
    
    
    
    
    
    
}
