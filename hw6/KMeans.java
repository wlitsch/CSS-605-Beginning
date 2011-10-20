/*
 * clustering package specifically for the classification of Prisoners Dilemma scores
 */
package clustering;
import java.util.ArrayList;
import java.util.Random;
/**
 *
 * @author William
 */
public class KMeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // set or initialize variables
        int k = 3;
        int maxIter = 100;
        int count = 0;
        double relTol = 1;
        double absTol = 100;
        double oldEnergy;
        double totalEnergy = 1e20;
        ArrayList<Cluster> clusters;
        ArrayList<Point> points;
        ArrayList<Point> centroids = new ArrayList(k);
        ClusterIO io = new ClusterIO();
        Random r = new Random();
        
        // read points from file
        points = io.readPoints("Player_Scores.txt");
        
        // make k random centroids
            for (int i = 0; i < k; i++) {
                centroids.add(new Point(r.nextDouble()*io.getMaxX(),r.nextDouble()*io.getMaxY()));
            }
        
         
        // Do while loop
        do {

            // assign k centroids
            clusters = new ArrayList(k);
            for (int i = 0; i < k; i++) {
                clusters.add(new Cluster(centroids.get(i)));
            }

            // assign points to clusters
            for (Point p : points){
                double dist = 1e10;
                int nearest = 0;
                for (int i = 0; i < k; i++){
                    if (clusters.get(i).getDistance(p) < dist) {
                        dist= clusters.get(i).getDistance(p);
                        nearest = i;
                    }
                }
                //System.out.println("nearest: " + nearest);
                clusters.get(nearest).addPoint(p); 
                //System.out.println("point " + p.getX() + " " + p.getY());
          
            }

            // recalculate the centroids and then find their energy
            oldEnergy = totalEnergy;
            totalEnergy = 0;
            centroids = new ArrayList(k);
            for (Cluster c: clusters){
                centroids.add(c.recalculateCentroid());
                totalEnergy += c.getEnergy();
            }
            System.out.println("total " + totalEnergy);
            // increment counter
            count++;
        
        } while (oldEnergy - totalEnergy > relTol && totalEnergy > absTol && count < maxIter);
        
       // write the clusters to a file with the following format (Score_1 Score_2, cluster_number)
        io.writePoints("Clusters.txt", clusters);      
    
    }
}
