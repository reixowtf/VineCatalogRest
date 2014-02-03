/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package elcellervins;

import java.util.ArrayList;

/**
 *
 * @author Reixowtf
 */
public class ViEspumos extends Vi{

    public ViEspumos(String dataCata, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        super(dataCata, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor, varietatRaim, aromes, sabors, preu, temps, qualificacio);
    }
    
    /*Tipus d'elaboracio de vins espumosos(pag 18)
        Gasificats, granvos o cuve closse i cava
    */
    
    /*Tipus de vins espumosos (pag20)
       Dolç (+50gr/l) "Els seguents mirarlos al llibre", semisec, sec, extrasec, brut, extra brut 
    */
}
