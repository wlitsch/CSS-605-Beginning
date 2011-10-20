/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package clustering;
import java.io.*;
import java.util.ArrayList;

/**
 *
 * @author William
 */
public class ClusterIO {
    
    ArrayList<Point> points = new ArrayList();
    double maxX = 0;
    double maxY = 0;
    
    public ArrayList<Point> readPoints(String file){
        try {
            BufferedReader in = new BufferedReader(new FileReader(file));
            String line = in.readLine();
            while (line != null) {
                
                //System.out.println(line);
                String[] s = line.split(" "); // tokenize into an array
                //System.out.println(s[0]);
                //System.out.println(s[1]);
                //System.out.println(s[2]);
                //System.out.println(s[3]);
                Point p = new Point((new Integer(s[2])).intValue(),(new Integer(s[3])).intValue());
                //System.out.println("x:" + p.getX());
                //System.out.println("y:" + p.getY());
                //System.out.println(p.toString());
                points.add(p); // insert 3rd and 4th entry of array into point x and y respectively
                if (p.getX() > maxX) {// if larger than maxX or maxY reset maxX or maxY
                    maxX = p.getX();
                }
                if (p.getY() > maxY) {// if larger than maxX or maxY reset maxX or maxY
                    maxY = p.getY();
                }
                line = in.readLine();     // read in a string
            }
            in.close();
            return points;
        } catch (IOException e) {
            System.out.println("Read Error");
            e.printStackTrace();     
            return points;
        }
    }
    
    public void writePoints(String s, ArrayList<Cluster> clusters){
        try {
            PrintWriter out = new PrintWriter(new FileWriter(s));
            int count = 1;
            for (Cluster c: clusters){
                for (Point p: c.getPoints()){
                    out.println(p.getX() + " " + p.getY() + " " + count + " " + c.getCentroid().getX() + " " + c.getCentroid().getY());
                }
                count++;
            }
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println("printing error");
        }
    }
    
    public double getMaxX(){
        return maxX;
    }
    
    public double getMaxY(){
        return maxY;
    }
}
