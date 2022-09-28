package com.assignment.services;

import com.assignment.entity.Rectangle;


/**
 * Containment Description.
 *
 * @author DilipEmmanuel
 */
public final class Containment implements IFeature
{
	public static String CONTAINMENT = "Containment";
	public static String NO_CONTAINMENT = "No Containment";
	public static String INT_NO_CONTAINMENT = "Intersection - No Containment";

	@Override
	public String checkFeature(final Rectangle r1, final Rectangle r2)
	{
		int xMin= Math.min(r1.getX1(), r2.getX1());
		if(xMin == r2.getX1()) {
			Rectangle temp = r1;
			r1 = r2;
			r2 = temp;
		}
		int x = r1.getX1();
		int y = r1.getY1();

		Intersection feature = new Intersection();
		final boolean flag = feature.isIntersection(r1, r2);

		if(!(x <= r2.getX1() && r1.getX2()>= r2.getX2()))
			return flag?INT_NO_CONTAINMENT:NO_CONTAINMENT;

		if( !(y <= r2.getY1() || r1.getY2() >= r2.getY2()))
			return flag?INT_NO_CONTAINMENT:NO_CONTAINMENT;

		return CONTAINMENT;
	}
}
