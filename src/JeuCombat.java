/**
 * Created by jmijeon on 23/01/2016.
 */
public class JeuCombat {
    public static void main(String[]args)
    {
        Personnage totor = new Barbare("totor");
        Personnage tata = new Personnage("tata");

        while(0 < totor.getPointsVie() &&  0<tata.getPointsVie()){
            totor.frapper(tata);
            tata.frapper(totor);
            System.out.println(totor);
            System.out.println(tata);
        }

    }
}
