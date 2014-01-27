/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package elcellervins;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author Reixowtf
 */
public class Controlador {

    Vi vi;
    HashMap<String, TreeMap<String, Vi>> vins;
    TreeMap<String, Vi> currentVins;

    public Controlador() {
        vins = new HashMap<String, TreeMap<String, Vi>>();
        currentVins = new TreeMap<String, Vi>();
    }

    public void afegirNegre(String dataCata, String tipus, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        vi = new ViNegre(dataCata, tipus, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor, varietatRaim, aromes, sabors, preu, temps, qualificacio);
    }

    public void afegirBlanc(String dataCata, String tipus, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        vi = new ViBlanc(dataCata, tipus, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor, varietatRaim, aromes, sabors, preu, temps, qualificacio);
    }

    public void afegirRosat(String dataCata, String tipus, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        vi = new ViRosat(dataCata, tipus, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor, varietatRaim, aromes, sabors, preu, temps, qualificacio);
    }

    public void afegirViEspumos(String dataCata, String tipus, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        vi = new ViEspumos(dataCata, tipus, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor, varietatRaim, aromes, sabors, preu, temps, qualificacio);
    }

    public HashMap<String, TreeMap<String, Vi>> obtenirTotsProductes() {
        return vins;
    }

    public TreeMap<String, Vi> obtenirVinsTipus(String tipus) {
        Iterator<Map.Entry<String, TreeMap<String, Vi>>> it = vins.entrySet().iterator();
        Map.Entry<String, TreeMap<String, Vi>> v;
        while (it.hasNext()) {
            v = it.next();
            if(v.getKey().contains(tipus)){
                return v.getValue();
            }
        }
        return new TreeMap<String, Vi>();
    }
    
    public void obtenirDadesEntrades(String tipusVi){
        if(tipusVi.equalsIgnoreCase("Negre")){
            
        }else  if(tipusVi.equalsIgnoreCase("Blanc")){
            
        }else  if(tipusVi.equalsIgnoreCase("Rosat")){
            
        }else  if(tipusVi.equalsIgnoreCase("Espumos")){
            
        }
    }
}
