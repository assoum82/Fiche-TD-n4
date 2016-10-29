// Ben Said   Zine El Abidine
package fiche_4;

/**
 *
 * @author Zinou
 */
public class PointNom extends PointA {
    
    private String Name;
    
    public PointNom (String Name, double x, double y){
        super (x,y);
        this.Name = Name;        
    }
    
    @Override
    public String AfficheCord ()
    {
        return this.Name + "("+ getX () +","+ getY() +")";
    }
}
//
