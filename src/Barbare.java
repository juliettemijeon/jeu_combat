import java.util.Random;
/**
 * Created by jmijeon on 24/01/2016.
 */
public class Barbare extends Personnage {

    private String nom;
    private int niveau = 0;
    private int pointsXP = 0;
    private int pointsVie = 10;
    private int force = 5;
    private final int _MAXPoint = 20;
    private boolean berserk;

    public Barbare(String nom) {
        super(nom);
    }

    private void berserk() {
            this.berserk = true;
            System.out.println("EEEUUUUAAAAAAARRRRGGGHHHHHH!!!!!");
            this.force = force * 2;
    }

    @Override
    protected int perdreVie(int pointaperdre) {
        this.pointsVie = this.pointsVie - pointaperdre;
        if(this.pointsVie<5){
            this.berserk();
        } else if(this.pointsVie <= 0){
            System.out.println("Game over");
        }
        return pointsVie;
    }

    @Override
    public void frapper(Personnage PersoAFrapper) {
        if (new Random().nextInt(2) == 1) {
            int pointaperdre = new Random().nextInt(2);
            if(this.berserk) {
                PersoAFrapper.perdreVie(pointaperdre*3);
            }else {
                PersoAFrapper.perdreVie(pointaperdre);
                this.gagnerXP();
            }
        }
    }
}