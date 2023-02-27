/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author koncsik.benedek
 */
public class DolgozoModel {
    private String nev;
    private int kor;
    private char neme;
    private int munkToltEv;

    public DolgozoModel(String nev, int kor, char neme, int munkToltEv) {
        this.nev = nev;
        this.kor = kor;
        this.neme = neme;
        this.munkToltEv = munkToltEv;
    }

    public DolgozoModel(String nev, int kor, char neme) {
        this(nev, kor, neme, 0);
    }

    public int getKor() {
        return kor;
    }

    public int getMunkToltEv() {
        return munkToltEv;
    }

    public String getNev() {
        return nev;
    }

    public char getNeme() {
        return neme;
    }

    @Override
    public String toString() {
        return "DolgozoModel{" + "nev=" + nev + ", kor=" + kor + ", neme=" + neme + ", munkToltEv=" + munkToltEv + '}';
    }
    
}
