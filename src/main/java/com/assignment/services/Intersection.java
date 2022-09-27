package com.assignment.services;

import com.assignment.entity.Rectangle;


/**
 * Intersection Description.
 *
 * @author DilipEmmanuel
 */
public final class Intersection implements IFeature
{
	public static String INTERACTION = "Intersection";

	public static String NO_INTERACTION = "No Intersection";


	@Override
	public String checkFeature(final Rectangle r1, final Rectangle r2)
	{
		if (!isIntersection(r1,r2))
		{
			return NO_INTERACTION;
		}
		return INTERACTION ;
	}

	public boolean isIntersection(final Rectangle r1, final Rectangle r2) {
		int x5 = Math.max(r1.getX1(), r2.getX1());
		int y5 = Math.max(r1.getY1(), r2.getY1());
		int x6 = Math.min(r1.getX2(), r2.getX2());
		int y6 = Math.min(r1.getY2(), r2.getY2());

		// no intersection
		if (x6-x5<=0 || y6-y5<=0)
		{
			return false;
		}

		Rectangle int_rect = new Rectangle(x5,y5,x6,y6);
		if(r1.equals(int_rect) || r2.equals(int_rect)) {
			return false;
		}

		return true;
	}
}
