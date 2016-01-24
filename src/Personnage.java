import java.util.Random;


/**
 * Created by jmijeon on 26/11/2015.
 */
public class Personnage {
    protected String nom;
    protected int niveau = 0;
    protected int pointsXP = 0;
    protected int pointsVie = 10;
    protected int force = 5;
    protected final int _MAXPoint = 20;

    public Personnage(String nom) {
        this.nom = nom;
    }

    /**
     * GETTERS
     *
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
     *
     * @param PersoAFrapper
     */
    public void frapper(Personnage PersoAFrapper) {
        //random pour indiquer si le coup a porté ou non
        if (new Random().nextInt(2) == 1) {
            int pointaperdre = new Random().nextInt(2);
            PersoAFrapper.perdreVie(pointaperdre);
            //Si le coup a porté :
            this.gagnerXP();
        }


    }

    protected int perdreVie(int pointaperdre) {
        this.pointsVie = this.pointsVie - pointaperdre;
        if (this.pointsVie <= 0)
            System.out.println("Game over");
        return pointsVie;
    }

    protected void gagnerXP() {
        if (this.pointsXP < _MAXPoint) {
            this.pointsXP++;
        } else {
            this.gagnerNiveau();
        }
    }

    protected void gagnerNiveau() {
        if (pointsXP == _MAXPoint) {
            System.out.println("Félicitations "+this.getNom()+", vous avez gagné un niveau!");
        }
        this.pointsVie = pointsVie + 5;
        this.force = force + 5;
        this.pointsXP = 0;
        this.niveau++;

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Nom : => " + nom + ',');
        sb.append("Niveau : => " + niveau + ',');
        sb.append("PointsXP : => " + pointsXP + ',');
        sb.append("PointsVie : => " + pointsVie + ',');
        sb.append("Force : => " + force );

        return sb.toString();
    }


}
