package com.assignment.services;

import com.assignment.entity.Rectangle;


/**
 * Adjacency Description.
 *
 * @author DilipEmmanuel
 */
public final class Adjacency implements IFeature
{

	@Override
	public String checkFeature(final Rectangle r1, final Rectangle r2)
	{
		int r1_width = r1.getX2()-r1.getX1();
		int r2_width = r2.getX2()-r2.getX1();
		int r1_height = r1.getY2()-r1.getY1();
		int r2_height = r2.getY2()-r2.getY1();




			//r1[0,0   4,4] r2 [1,0  4,4]
		//intersection points
		int x5 = Math.max(r1.getX1(), r2.getX1()); //1
		int y5 = Math.max(r1.getY1(), r2.getY1()); //0
		int x6 = Math.min(r1.getX2(), r2.getX2()); //4
		int y6 = Math.min(r1.getY2(), r2.getY2()); //4

		//
		int x7 = Math.min(r1.getX1(), r2.getX1()); // 0
		int y7 = Math.min(r1.getY1(), r2.getY1()); // 0
		int x8 = Math.max(r1.getX2(), r2.getX2()); // 4
		int y8 = Math.max(r1.getY2(), r2.getY2()); // 4

		if(x5 == x6){
			if(y5 == y7 && y6 == y8) {
				return "Adjacency Proper";
			} else if( (y5 ==r1.getY1() && y6 == r1.getY2()) ||
					    y5 ==r2.getY1() && y6 == r2.getY2()){
				return "Adjacency Sub line";
			} else {
				return "Adjacency Partial";
			}

		}

		if(y5 == y6){
			if(x5 == x7 && x6 == x8) {
				return "Adjacency Proper";
			} else if( (x5 ==r1.getX1() && x6 == r1.getX2()) ||
					   x5 ==r2.getX1() && x6 == r2.getX2()){
				return "Adjacency Sub line";
			} else {
				return "Adjacency Partial";
			}

		}

		return "No Adjacency";
	}
}
