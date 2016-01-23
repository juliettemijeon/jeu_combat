/**
 * Created by jmijeon on 26/11/2015.
 */
public class Personnage {
    private String nom;
    int niveau;
    int pointsXP;
    int pointsVie;
    int force;

    //Dans la version PHP de l'exercice il fallait déclarer des constantes PERSONNAGE_FRAPPE, PERSONNAGE_TUE et CEST_MOI, qu'en est-il en java?

    public Personnage(String nom, int niveau, int pointsVie, int pointsXP, int force) {
        this.nom = nom;
        this.niveau = 0;
        this.pointsVie = 10;
        this.pointsXP = 0;
        this.force = 5;
    }

    /**
     * SETTERS
     * @return
     */

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setNiveau(int niveau) {
        this.niveau = niveau;
    }

    public void setPointsVie(int pointsVie) {
        this.pointsVie = pointsVie;
    }

    public void setForce(int force) {
        this.force = force;
    }

    public void setPointsXP(int pointsXP) {
        this.pointsXP = pointsXP;
    }

    /**
     * GETTERS
     * @return
     */
    public String getNom() {
        return nom;
    }

    public int getNiveau() {
        return niveau;
    }

    public int getPointsVie() {
        return pointsVie;
    }

    public int getForce() {
        return force;
    }

    public int getPointsXP() {
        return pointsXP;
    }

    /**
     * Déclaration des méthodes
     * @param PersoAFrapper
     */
    public void frapper(Personnage PersoAFrapper) {
        this.frapper(PersoAFrapper);
        //random pour indiquer si le coup a porté ou non
        //Si le coup a porté :
        this.gagnerXP();
    }

    public int perdreVie(int pointsVie) {
        pointsVie --;
        if(pointsVie == 0)
            System.out.println("Game over");
        return pointsVie;
    }

    public void gagnerXP(){
        if(pointsXP<100){
            pointsXP++;
        } else {
            this.gagnerNiveau();
        }
    }

    public void gagnerNiveau(){
        if(pointsXP==100)
        System.out.println("Vous avez gagné un niveau!");
        this.pointsVie = pointsVie+5;
        this.force = force+5;
        this.pointsXP = 0;
        niveau++;

    }
}
