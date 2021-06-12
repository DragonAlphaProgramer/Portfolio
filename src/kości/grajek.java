/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kości;

/**
 *
 * @author Patryk
 */
public class grajek {
    String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
    int szostki, piatki, czworki, trojki, dwojki, jedynki;
    int trzy_te_same, cztery_te_same, piec_te_same, full, cztery_po_kolei, piec_po_kolei, para1, para2, szansa;
    int premia, sumaG, sumaD, razem;
    boolean czy6, czy5, czy4, czy3, czy2, czy1, czy3x, czy4x, czy5x, czy4p, czy5p, czyfull, czypara, czy2pary, czyszansa;

    public int getPremia() {
        return premia;
    }

    public boolean isCzy6() {
        return czy6;
    }

    public void setCzy6(boolean czy6) {
        this.czy6 = czy6;
    }

    public boolean isCzy5() {
        return czy5;
    }

    public void setCzy5(boolean czy5) {
        this.czy5 = czy5;
    }

    public boolean isCzy4() {
        return czy4;
    }

    public void setCzy4(boolean czy4) {
        this.czy4 = czy4;
    }

    public boolean isCzy3() {
        return czy3;
    }

    public void setCzy3(boolean czy3) {
        this.czy3 = czy3;
    }

    public boolean isCzy2() {
        return czy2;
    }

    public void setCzy2(boolean czy2) {
        this.czy2 = czy2;
    }

    public boolean isCzy1() {
        return czy1;
    }

    public void setCzy1(boolean czy1) {
        this.czy1 = czy1;
    }

    public boolean isCzy3x() {
        return czy3x;
    }

    public void setCzy3x(boolean czy3x) {
        this.czy3x = czy3x;
    }

    public boolean isCzy4x() {
        return czy4x;
    }

    public void setCzy4x(boolean czy4x) {
        this.czy4x = czy4x;
    }

    public boolean isCzy5x() {
        return czy5x;
    }

    public void setCzy5x(boolean czy5x) {
        this.czy5x = czy5x;
    }

    public boolean isCzy4p() {
        return czy4p;
    }

    public void setCzy4p(boolean czy4p) {
        this.czy4p = czy4p;
    }

    public boolean isCzy5p() {
        return czy5p;
    }

    public void setCzy5p(boolean czy5p) {
        this.czy5p = czy5p;
    }

    public boolean isCzyfull() {
        return czyfull;
    }

    public void setCzyfull(boolean czyfull) {
        this.czyfull = czyfull;
    }

    public boolean isCzypara() {
        return czypara;
    }

    public void setCzypara(boolean czypara) {
        this.czypara = czypara;
    }

    public boolean isCzy2pary() {
        return czy2pary;
    }

    public void setCzy2pary(boolean czy2pary) {
        this.czy2pary = czy2pary;
    }

    public boolean isCzyszansa() {
        return czyszansa;
    }

    public void setCzyszansa(boolean czyszansa) {
        this.czyszansa = czyszansa;
    }

    public void setPremia() {
        if ((getJedynki() + getDwojki() + getTrojki() + getCzworki() + getPiatki() + getSzostki()) >= 63) {
            this.premia = 35;
        } else {
            this.premia = 0;
        }
    }

    public int getSumaG() {
        return sumaG;
    }

    public void setSumaG() {
        this.sumaG = getJedynki() + getDwojki() + getTrojki() + getCzworki()
                + getPiatki() + getSzostki() + getPremia();
    }

    public int getSumaD() {
        return sumaD;
    }

    public void setSumaD() {
        this.sumaD = getTrzy_te_same() + getCztery_te_same() + getPiec_te_same()
                + getPara1() + getPara2() + getFull()
                + getPiec_po_kolei() + getCztery_po_kolei() + getSzansa();
    }

    public int getRazem() {
        return razem;
    }

    public void setRazem() {
        this.razem = getSumaD()+getSumaG();
    }

    public int getSzostki() {
        return szostki;
    }

    public void setSzostki(int szostki) {
        this.szostki = szostki;
    }

    public int getPiatki() {
        return piatki;
    }

    public void setPiatki(int piatki) {
        this.piatki = piatki;
    }

    public int getCzworki() {
        return czworki;
    }

    public void setCzworki(int czworki) {
        this.czworki = czworki;
    }

    public int getTrojki() {
        return trojki;
    }

    public void setTrojki(int trojki) {
        this.trojki = trojki;
    }

    public int getDwojki() {
        return dwojki;
    }

    public void setDwojki(int dwojki) {
        this.dwojki = dwojki;
    }

    public int getJedynki() {
        return jedynki;
    }

    public void setJedynki(int jedynki) {
        this.jedynki = jedynki;
    }

    public int getTrzy_te_same() {
        return trzy_te_same;
    }

    public void setTrzy_te_same(int trzy_te_same) {
        this.trzy_te_same = trzy_te_same;
    }

    public int getCztery_te_same() {
        return cztery_te_same;
    }

    public void setCztery_te_same(int cztery_te_same) {
        this.cztery_te_same = cztery_te_same;
    }

    public int getPiec_te_same() {
        return piec_te_same;
    }

    public void setPiec_te_same(int piec_te_same) {
        this.piec_te_same = piec_te_same;
    }

    public int getFull() {
        return full;
    }

    public void setFull(int full) {
        this.full = full;
    }

    public int getCztery_po_kolei() {
        return cztery_po_kolei;
    }

    public void setCztery_po_kolei(int cztery_po_kolei) {
        this.cztery_po_kolei = cztery_po_kolei;
    }

    public int getPiec_po_kolei() {
        return piec_po_kolei;
    }

    public void setPiec_po_kolei(int piec_po_kolei) {
        this.piec_po_kolei = piec_po_kolei;
    }

    public int getPara1() {
        return para1;
    }

    public void setPara1(int para1) {
        this.para1 = para1;
    }

    public int getPara2() {
        return para2;
    }

    public void setPara2(int para2) {
        this.para2 = para2;
    }

    public int getSzansa() {
        return szansa;
    }

    public void setSzansa(int szansa) {
        this.szansa = szansa;
    }

}
