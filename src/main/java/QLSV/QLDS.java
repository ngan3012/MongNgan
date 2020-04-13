/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QLSV;
import java.util.ArrayList;
/**
 *
 * @author KetNgan
 */

public abstract class QLDS implements IQLDS{
    
    ArrayList<CaNhan> dscanhan =new ArrayList<>() ;

    public QLDS() {
    }
    

    public QLDS(ArrayList<CaNhan> dscanhan) {
        this.dscanhan = dscanhan;
    }
    
    
    @Override
    public int them(CaNhan p) {
        dscanhan.add(p);
        return 1;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int xoa(String ten) {
        for (int i=0;i<dscanhan.size(); i++){
            if (dscanhan.get(i).getHoTen() == ten)
                dscanhan.remove(i);
        }
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 1;
    }

    public void InDS() {
        for (int i = 0; i<dscanhan.size(); i++){
            dscanhan.get(i).HienThiTT();
        }
        //throw new UnsupportedOperationException("Not supported yet."); 
    }
    
}

