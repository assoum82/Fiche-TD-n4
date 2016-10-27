// Ben Said   Zine El Abidine
package fiche_4;

/**
 *
 * @author Zinou
 */
public class Point {
   
    private double x,y ;
    
    public Point (double x , double y)
    {
        this.x = x;
        this.y = y;
    }
    
    public Point (double x)
    {
        this.x = this.y = x;
    }
    
    public Point () {}
    
    public double getX (){
        return this.x;
    }
    
    public double getY (){
        return this.y;
    }
    
    public void Deplace (double dx, double dy)
    {
        x+= dx;
        y+= dy;
    }
}
