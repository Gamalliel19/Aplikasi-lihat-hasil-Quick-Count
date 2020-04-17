
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author putrimaulana
 */
public class LembagaSurvey {
    private int index;
    
    public LembagaSurvey(int index) {
        this.index = index;
    }
    public ArrayList<MyObject> getSelectItem(int subIndex) {
        switch(this.index) {
            case Constants.CHARTA:
                ChartaPemilu jp = new ChartaPemilu(subIndex);
                return jp.getSelectedIndex();
            case Constants.INDO:
                IndoPemilu ip = new IndoPemilu(subIndex);
                return ip.getSelectedIndex();
            case Constants.LSI:
                LsiPemilu kp = new LsiPemilu(subIndex);
                return kp.getSelectedIndex();
            default:
                return null;
        }
    }
    
    
}
