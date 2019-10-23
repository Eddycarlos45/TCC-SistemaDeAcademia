/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Lab01_Aluno
 */
public class AlteraData {

    public Date trintaDias(Date dataAtual, int quant) {
        
        
        Calendar cal = Calendar.getInstance();

        cal.setTime(dataAtual);

        // Substract 30 days from the calendar
        cal.add(Calendar.MONTH, quant);

        return cal.getTime();
    }

    public Date trintaDias(Date dataAtual) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
