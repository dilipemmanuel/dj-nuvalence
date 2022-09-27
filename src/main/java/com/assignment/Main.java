package com.assignment;

import java.util.Scanner;

import com.assignment.entity.Rectangle;
import com.assignment.services.Adjacency;
import com.assignment.services.Containment;
import com.assignment.services.IFeature;
import com.assignment.services.Intersection;



public class Main {

    public static void main(String[] args) throws Exception
    {
        int selection = 4;

        IFeature feature1 = new Intersection();
        IFeature feature2 = new Adjacency();
        IFeature feature3 = new Containment();

        if(args.length< 9){
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object

            System.out.println(" Provide X,Y coordinates of first rectangle Bottom-left corner and Top-Right corner (Ex:  0,0,4,4) ");
            String cord1 = myObj.nextLine();
            Rectangle r1 = createRectanglefromString(cord1);


            System.out.println(" Provide X,Y coordinates of second rectangle Bottom-left corner and Top-Right corner (Ex:  0,0,4,4) ");
            String cord2 = myObj.nextLine();
            Rectangle r2 = createRectanglefromString(cord2);

            System.out.println("Select Feature to be analysed \n 1. Intersection \n 2. Adjacency \n 3. Containment \n 4. All");
            String feature = myObj.nextLine();
            if(feature == null||  feature.trim().isEmpty())
                throw new Exception("Invalid feature selection" +feature);
            try {
                selection = Integer.parseInt(feature);
                if (selection <1 || selection >4)
                    throw new Exception("Invalid feature selection" +feature);
            } catch (NumberFormatException e) {
                throw new Exception("Input String is not a valid feature selection : " + feature);
            }

            System.out.println("====================================");
            System.out.println("======= Features Analysed =========");
            System.out.println("====================================");
            System.out.println( "Rectangle A :" +r1.toString());
            System.out.println( "Rectangle B :" +r2.toString());
            if(selection ==1 || selection ==4 )
                System.out.println("Intersection between A & B : "+feature1.checkFeature(r1,r2));
            if(selection ==2 || selection ==4 )
                System.out.println("Adjacency between A & B : "+feature2.checkFeature(r1,r2));
            if(selection ==3 || selection ==4 )
                System.out.println("Containment between A & B : "+feature3.checkFeature(r1,r2));
        }
        else
        {
            selection = Integer.parseInt(args[0]);
            if (selection <1 || selection >4)
                throw new Exception("Invalid feature selection" +selection);

            int x1 = Integer.parseInt(args[1]);
            int y1 = Integer.parseInt(args[2]);
            int x2 = Integer.parseInt(args[3]);
            int y2 = Integer.parseInt(args[4]);
            int x3 = Integer.parseInt(args[5]);
            int y3 = Integer.parseInt(args[6]);
            int x4 = Integer.parseInt(args[7]);
            int y4 = Integer.parseInt(args[8]);


            Rectangle r1 = new Rectangle(x1, y1, x2, y2);
            Rectangle r2 = new Rectangle(x3, y3, x4, y4);


            System.out.println(feature1.checkFeature(r1, r2));
            System.out.println(feature2.checkFeature(r1, r2));
            System.out.println(feature3.checkFeature(r1, r2));
        }
    }

    private static Rectangle createRectanglefromString(String coord) throws Exception
    {
        if (coord == null || coord.trim().isEmpty())
            throw new Exception("Invalid coorridates for Rectangle" +coord);

        String[] xy = coord.split(",");
        if(xy.length <4)
            throw new Exception("Invalid coorridates for Rectangle" +coord);
        return new Rectangle(Integer.parseInt(xy[0]),Integer.parseInt(xy[1]),Integer.parseInt(xy[2]),Integer.parseInt(xy[3]));
    }
}
