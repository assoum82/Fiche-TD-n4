// Ben Said   Zine El Abidine
package fiche_4;

/**
 *
 * @author Zinou
 */
public class PointA extends Point{
    
    public PointA (double x, double y)
    {
        super (x,y);
    }
    
    public PointA (double x){
        super (x);
    }
    
    public PointA (){
        super ();
    }
    
    public String AfficheCord (){
        return "("+ getX () +","+ getY() +")";
    }
}
