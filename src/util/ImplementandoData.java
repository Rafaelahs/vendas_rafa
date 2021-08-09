
package util;

import java.util.Calendar;
import java.util.Date;


public class ImplementandoData extends Data {

   @Override
    public Date dataAtual() {
        var dataAtual = new Date();
        return dataAtual;
    }

    @Override
    public Date dataEntrega() {
        var dataAtual = dataAtual();
      Calendar cal = Calendar.getInstance(); 
        cal.setTime(dataAtual ); 
        cal.add(Calendar.DATE, 10);
       return cal.getTime();
    }
    
}
