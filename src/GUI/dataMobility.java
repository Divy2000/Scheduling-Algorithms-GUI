/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
/**
 *
 * @author divyp
 */
public class dataMobility {
    String[][] data;
    void fetchData(int[] at,int[] bta,int[] iobt,int[] btb){
        String ats[] = new String[at.length],btas[] = new String[at.length],iobts[]= new String[at.length],btbs[]= new String[at.length],ps[] = new String[at.length];
        for(int i=0;i<at.length;i++){
            ats[i] = String.valueOf(at[i]);
            btas[i] = String.valueOf(bta[i]);
            iobts[i] = String.valueOf(iobt[i]);
            btbs[i] = String.valueOf(btb[i]);
            ps[i] = String.valueOf(0);
        }
       String[][] fetch = {ats,btas,iobts,btbs,ps};
       data = fetch;
    }
    void fetchData(int[] at,int[] bta,int[] iobt,int[] btb,int[] p){
        String ats[] = new String[at.length],btas[] = new String[at.length],iobts[]= new String[at.length],btbs[]= new String[at.length],ps[] = new String[at.length];
        for(int i=0;i<at.length;i++){
            ats[i] = String.valueOf(at[i]);
            btas[i] = String.valueOf(bta[i]);
            iobts[i] = String.valueOf(iobt[i]);
            btbs[i] = String.valueOf(btb[i]);
            ps[i] = String.valueOf(p[i]);
        }
       String[][] fetch = {ats,btas,iobts,btbs,ps};
       data = fetch;
    }
    String[][] getData(){
        return data;
    }
}
