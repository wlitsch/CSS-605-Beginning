
package clustering;
import java.util.*;
/**
 * Cluster of points
 * @author William
 */
public class Cluster {
    
    ArrayList<Point> points;
    Point centroid;
    double energy;
    
    public Cluster(Point centroid) {
        this.points = new ArrayList();
        this.centroid = centroid;
        energy = 0;
    }
    
    /**
     * calculates the centroid of the set of points
     */
    public Point recalculateCentroid() {
        double sumX = 0;
        double sumY = 0;
        for (Point p: points){
            sumX += p.getX();
            sumY += p.getY();
        }
        centroid = new Point(sumX/points.size(),sumY/points.size());
        return centroid;
    }
    
    /**
     * adds point and then calls calculateCentroid()
     * @param p 
     */
    public void addPoint(Point p) {
        points.add(p);
        energy += getDistance(p);
        //System.out.println("energy: " + energy);
    }
    
    /**
     * get energy of the cluster
     */
    public double getEnergy(){
        //System.out.println(energy);
        return energy;
    }
    
    public double getDistance(Point p){
        return Math.pow(centroid.getX()-p.getX(),2) + Math.pow(centroid.getY()-p.getY(),2);
    }
    
    public ArrayList<Point> getPoints(){
        return points;
    }
    
    public Point getCentroid(){
        return centroid;
    }

}
