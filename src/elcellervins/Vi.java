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
public abstract class Vi {
    private String dataCata, tipus, nom, productor, regio, alcohol, profunditat, tonalitat, netedat, intensitatColor, sec_dols, cos, acides, instensitatSabor;
    private ArrayList<String> varietatRaim, aromes, sabors;
    private float preu;
    private byte temps, qualificacio;

    /*public vi(){
    dataCata = new SimpleDateFormat("yyyy/MM/dd").format(new Date());
    nom = "";
    }*/
    
    //Tipus és si el vi és jove, de criansa o vi per cava.
    public Vi(String dataCata, String tipus, String nom, String productor, String regio, String alcohol, String profunditat, String tonalitat, String netedat, String intensitatColor, String sec_dols, String cos, String acides, String instensitatSabor, ArrayList<String> varietatRaim, ArrayList<String> aromes, ArrayList<String> sabors, float preu, byte temps, byte qualificacio) {
        this.dataCata = dataCata;
        this.tipus = tipus;
        this.nom = nom;
        this.productor = productor;
        this.regio = regio;
        this.alcohol = alcohol;
        this.profunditat = profunditat;
        this.tonalitat = tonalitat;
        this.netedat = netedat;
        this.intensitatColor = intensitatColor;
        this.sec_dols = sec_dols;
        this.cos = cos;
        this.acides = acides;
        this.instensitatSabor = instensitatSabor;
        this.varietatRaim = varietatRaim;
        this.aromes = aromes;
        this.sabors = sabors;
        this.preu = preu;
        this.temps = temps;
        this.qualificacio = qualificacio;
    }

    /*Classificació de les olors: (pag 7/8)
        Vegetals, Florals, frutals, 'esteres', especiades, animals, balsàmics, 'empireumàtics', fusta, químics.
    */
    
    /*Classificació del color dels vins blancs: (pag 11)
        Groc pàlic, groc llimona, groc 'pajizo', or brillant, or vell, ocre
    */
    
    /*Classificació dels aromes del vi blanc: (pag )
        
    */
    
    /*Classificació del gust dels vins blancs: (pag 11)
        Fresc, equilibrat, desequilibrat , 'descarnado', 'acidulo'
    */
    
    /*Classificació del color del vi negre: (pag 17)
        Vermell, cirera, rubí, 'Teja', pell de ceva, ocre
    */
    
    /*Classificació dels aromes del vi negre: (pag 17)
        Fruita 'Roia', herbes, vegetals, flors, especies, balsàmics, minerals, cafés, fruta madura, sotabosc, pasteleria, torrat, 'gomas', olorosos, animals
    */
    
    /*Classififació del gust del vi negre (pag 17)
        aspre, 'aterciopelado', 'sedoso', 'descarnado', 'acídulo'
    */
    
    
    
    
    public String getDataCata() {
        return dataCata;
    }

    public void setDataCata(String dataCata) {
        this.dataCata = dataCata;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getProductor() {
        return productor;
    }

    public void setProductor(String productor) {
        this.productor = productor;
    }

    public String getRegio() {
        return regio;
    }

    public void setRegio(String regio) {
        this.regio = regio;
    }

    public String getAlcohol() {
        return alcohol;
    }

    public void setAlcohol(String alcohol) {
        this.alcohol = alcohol;
    }

    public String getProfunditat() {
        return profunditat;
    }

    public void setProfunditat(String profunditat) {
        this.profunditat = profunditat;
    }

    public String getTonalitat() {
        return tonalitat;
    }

    public void setTonalitat(String tonalitat) {
        this.tonalitat = tonalitat;
    }

    public String getNetedat() {
        return netedat;
    }

    public void setNetedat(String netedat) {
        this.netedat = netedat;
    }

    public String getIntensitatColor() {
        return intensitatColor;
    }

    public void setIntensitatColor(String intensitatColor) {
        this.intensitatColor = intensitatColor;
    }

    public String getSec_dols() {
        return sec_dols;
    }

    public void setSec_dols(String sec_dols) {
        this.sec_dols = sec_dols;
    }

    public String getCos() {
        return cos;
    }

    public void setCos(String cos) {
        this.cos = cos;
    }

    public String getAcides() {
        return acides;
    }

    public void setAcides(String acides) {
        this.acides = acides;
    }

    public String getInstensitatSabor() {
        return instensitatSabor;
    }

    public void setInstensitatSabor(String instensitatSabor) {
        this.instensitatSabor = instensitatSabor;
    }

    public ArrayList<String> getVarietatRaim() {
        return varietatRaim;
    }

    public void setVarietatRaim(ArrayList<String> varietatRaim) {
        this.varietatRaim = varietatRaim;
    }

    public ArrayList<String> getAromes() {
        return aromes;
    }

    public void setAromes(ArrayList<String> aromes) {
        this.aromes = aromes;
    }

    public ArrayList<String> getSabors() {
        return sabors;
    }

    public void setSabors(ArrayList<String> sabors) {
        this.sabors = sabors;
    }

    public float getPreu() {
        return preu;
    }

    public void setPreu(float preu) {
        this.preu = preu;
    }

    public byte getTemps() {
        return temps;
    }

    public void setTemps(byte temps) {
        this.temps = temps;
    }

    public byte getQualificacio() {
        return qualificacio;
    }

    public void setQualificacio(byte qualificacio) {
        this.qualificacio = qualificacio;
    }
    
    
}
