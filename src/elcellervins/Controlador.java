/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elcellervins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.TreeMap;

/**
 *
 * @author Reixowtf
 */
public class Controlador {
    Vi vi;
    HashMap<String, TreeMap<String, Vi>> vins;
    TreeMap<String, Vi> currentVins;
    
    public Controlador(){
        vins = new HashMap<String, TreeMap<String, Vi>>();
        currentVins = new  TreeMap<String, Vi>();
    }
    
    public void nouNegre(String dataCata, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        vi = new ViNegre(dataCata, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor, varietatRaim, aromes, sabors, preu, temps, qualificacio);
    }
    
    public void nouBlanc(String dataCata, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        vi = new ViBlanc(dataCata, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor, varietatRaim, aromes, sabors, preu, temps, qualificacio);
    }
    
    public void nouRosat(String dataCata, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        vi = new ViRosat(dataCata, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor, varietatRaim, aromes, sabors, preu, temps, qualificacio);
    }
    
    public void nouCava(String dataCata, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        vi = new Cava(dataCata, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor, varietatRaim, aromes, sabors, preu, temps, qualificacio);
    }
    
    public void obtenirTotsProductes(){
        
    }
}
