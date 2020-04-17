import java.util.ArrayList;
/*

 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Asus
 */
public class LsiPemilu {
    private int index;
    
    public LsiPemilu(int index) {
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
        objList.add(new MyObject("Jokowi Amin", 55.71));
        objList.add(new MyObject("Prabowo Sandi", 44.29));
        return objList;
    }
    
    private ArrayList<MyObject> dpr() {
        ArrayList<MyObject> objList = new ArrayList();
        objList.add(new MyObject("PDIP", 19.69));
        objList.add(new MyObject("Gerindra", 12.52));
        objList.add(new MyObject("Golkar", 12.19));
        objList.add(new MyObject("PKB", 9.71));
        objList.add(new MyObject("Demokrat", 6.83));
        objList.add(new MyObject("PKS", 8.04));
        objList.add(new MyObject("PAN", 6.15));
        objList.add(new MyObject("NASDEM", 8.61));
        objList.add(new MyObject("Garuda", 0.98));
        objList.add(new MyObject("PSI", 2.37));
        objList.add(new MyObject("PKPI", 0.39));
        objList.add(new MyObject("Berkarya", 2.41));
        objList.add(new MyObject("Hanura", 1.89));
        objList.add(new MyObject("PPP", 4.34));
        objList.add(new MyObject("PBB", 0.93));
        objList.add(new MyObject("Perindo", 2.95));
        objList.add(new MyObject("Undecided Voters", 0));
        return objList;
    }
    
    private ArrayList<MyObject> dpd() {
        ArrayList<MyObject> objList = new ArrayList();
        objList.add(new MyObject("PDIP", 19.8));
        objList.add(new MyObject("Gerindra", 12.50));
        objList.add(new MyObject("Golkar", 12.21));
        objList.add(new MyObject("PKB", 9.56));
        objList.add(new MyObject("Demokrat", 6.81));
        objList.add(new MyObject("PKS", 8.04));
        objList.add(new MyObject("PAN", 6.16));
        objList.add(new MyObject("NASDEM", 8.53));
        objList.add(new MyObject("Garuda", 0.98));
        objList.add(new MyObject("PSI", 2.37));
        objList.add(new MyObject("PKPI", 0.39));
        objList.add(new MyObject("Berkarya", 2.41));
        objList.add(new MyObject("Hanura", 1.89));
        objList.add(new MyObject("PPP", 4.34));
        objList.add(new MyObject("PBB", 0.93));
        objList.add(new MyObject("Perindo", 2.95));
        objList.add(new MyObject("Undecided Voters", 0));
        return objList;
    }
    
    private ArrayList<MyObject> dprdProv() {
        ArrayList<MyObject> objList = new ArrayList();
        objList.add(new MyObject("PDIP", 19.60));
        objList.add(new MyObject("Gerindra", 13.45));
        objList.add(new MyObject("Golkar", 11.63));
        objList.add(new MyObject("PKB", 8.51));
        objList.add(new MyObject("Demokrat", 7.46));
        objList.add(new MyObject("PKS", 9.94));
        objList.add(new MyObject("PAN", 6.90));
        objList.add(new MyObject("NASDEM", 7.46));
        objList.add(new MyObject("Garuda", 0.59));
        objList.add(new MyObject("PSI", 2.13));
        objList.add(new MyObject("PKPI", 0.26));
        objList.add(new MyObject("Berkarya", 2.12));
        objList.add(new MyObject("Hanura", 1.61));
        objList.add(new MyObject("PPP", 4.34));
        objList.add(new MyObject("PBB", 0.83));
        objList.add(new MyObject("Perindo", 2.65));
        objList.add(new MyObject("Undecided Voters", 9.08));
        return objList;
    }
    
    private ArrayList<MyObject> dprdKab() {
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
}
