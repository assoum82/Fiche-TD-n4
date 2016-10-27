// Ben Said   Zine El Abidine
package fiche_4;

/**
 *
 * @author Zinou
 */
public class Fiche_4 {

  
    public static void main(String[] args) {
     
        Point P1 = new Point (2.0,1.5);
        PointA P2 = new PointA (5.0,4.75);       
        PointNom P3 = new PointNom("A",1.0,0.0);
        
        System.out.println("Les Coordonnées de P1 : (" +P1.getX() +"," +P2.getY() +")");
        System.out.println("Les Coordonnées de P2 : " +P2.AfficheCord());
        System.out.println("Les Coordonnées de P3 : " +P3.AfficheCord());
    }
    
}
