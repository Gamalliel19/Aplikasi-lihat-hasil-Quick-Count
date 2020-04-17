
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
public class IndoPemilu {
    private int index;
    
    public IndoPemilu(int index) {
        this.index = index;
    }
    
    public ArrayList<MyObject> getSelectedIndex() {
       switch(this.index) {
           case Constants.PRESIDEN:
               return presiden();
           case Constants.DPR_RI:
               return dpr();
           case Constants.DPD:
               return dpd();
           case Constants.DPRD_PROV:
               return dprdProv();
           case Constants.DPRD_KOTA:
               return dprdKab();    
           
           default:
               return null;
       }
    }
    
    // fake data
    private ArrayList<MyObject> presiden() {
        ArrayList<MyObject> objList = new ArrayList();
        objList.add(new MyObject("Jokowi Amin", 52.92));
        objList.add(new MyObject("Prabowo Sandi", 47.08));
        return objList;
    }
    
    private ArrayList<MyObject> dpr() {
        ArrayList<MyObject> objList = new ArrayList();
        objList.add(new MyObject("PDIP", 19.37));
        objList.add(new MyObject("Gerindra", 13.03));
        objList.add(new MyObject("Golkar", 12.75));
        objList.add(new MyObject("PKB", 9.65));
        objList.add(new MyObject("Demokrat", 7.01));
        objList.add(new MyObject("PKS", 10.02));
        objList.add(new MyObject("PAN", 7.55));
        objList.add(new MyObject("NASDEM", 7.12));
        objList.add(new MyObject("Garuda", 1.98));
        objList.add(new MyObject("PSI", 2.10));
        objList.add(new MyObject("PKPI", 0.43));
        objList.add(new MyObject("Berkarya", 2.40));
        objList.add(new MyObject("Hanura", 2.01));
        objList.add(new MyObject("PPP", 4.08));
        objList.add(new MyObject("PBB", 1.72));
        objList.add(new MyObject("Perindo", 3.44));
        objList.add(new MyObject("Undecided Voters", 14.72));
        return objList;
    }
    
    private ArrayList<MyObject> dpd() {
        ArrayList<MyObject> objList = new ArrayList();
        objList.add(new MyObject("PDIP", 21.92));
        objList.add(new MyObject("Gerindra", 12.62));
        objList.add(new MyObject("Golkar", 12.14));
        objList.add(new MyObject("PKB", 8.98));
        objList.add(new MyObject("Demokrat", 7.06));
        objList.add(new MyObject("PKS", 9.29));
        objList.add(new MyObject("PAN", 6.06));
        objList.add(new MyObject("NASDEM", 7.68));
        objList.add(new MyObject("Garuda", 0.53));
        objList.add(new MyObject("PSI", 2.10));
        objList.add(new MyObject("PKPI", 0.22));
        objList.add(new MyObject("Berkarya", 2.26));
        objList.add(new MyObject("Hanura", 1.59));
        objList.add(new MyObject("PPP", 4.41));
        objList.add(new MyObject("PBB", 0.71));
        objList.add(new MyObject("Perindo", 2.42));
        objList.add(new MyObject("Undecided Voters", 10));
        return objList;
    }
    
    private ArrayList<MyObject> dprdProv() {
        ArrayList<MyObject> objList = new ArrayList();
        objList.add(new MyObject("PDIP", 19.43));
        objList.add(new MyObject("Gerindra", 13.37));
        objList.add(new MyObject("Golkar", 11.64));
        objList.add(new MyObject("PKB", 8.97));
        objList.add(new MyObject("Demokrat", 7.63));
        objList.add(new MyObject("PKS", 9.66));
        objList.add(new MyObject("PAN", 6.83));
        objList.add(new MyObject("NASDEM", 7.84));
        objList.add(new MyObject("Garuda", 0.57));
        objList.add(new MyObject("PSI", 2.07));
        objList.add(new MyObject("PKPI", 0.27));
        objList.add(new MyObject("Berkarya", 2.12));
        objList.add(new MyObject("Hanura", 1.64));
        objList.add(new MyObject("PPP", 0.84));
        objList.add(new MyObject("PBB", 0.71));
        objList.add(new MyObject("Perindo", 2.67));
        objList.add(new MyObject("Undecided Voters", 8.02));
        return objList;
    }
    
    private ArrayList<MyObject> dprdKab() {
        ArrayList<MyObject> objList = new ArrayList();
        objList.add(new MyObject("PDIP", 19.7));
        objList.add(new MyObject("Gerindra", 12.88));
        objList.add(new MyObject("Golkar", 11.86));
        objList.add(new MyObject("PKB", 9.19));
        objList.add(new MyObject("Demokrat", 8.06));
        objList.add(new MyObject("PKS", 8.75));
        objList.add(new MyObject("PAN", 6.77));
        objList.add(new MyObject("NASDEM", 8.29));
        objList.add(new MyObject("Garuda", 0.53));
        objList.add(new MyObject("PSI", 2.03));
        objList.add(new MyObject("PKPI", 0.23));
        objList.add(new MyObject("Berkarya", 2.14));
        objList.add(new MyObject("Hanura", 1.36));
        objList.add(new MyObject("PPP", 4.61));
        objList.add(new MyObject("PBB", 0.77));
        objList.add(new MyObject("Perindo", 2.84));
        objList.add(new MyObject("Undecided Voters", 1.55));
        return objList;
    }
}
