package com.assignment.entity;

import java.util.Objects;


/**
 * Rectangle Class
 * Holds the coordinates of a @Rectangle.
 *
 * @author DilipEmmanuel
 */
public class Rectangle
{
	/**
	 * Bottom-left corner x coordinate
	 */
	private int x1;

	/**
	 * Bottom-left corner y coordinate
	 */
	private int y1;

	/**
	 * Top-right corner x coordinate
 	 */
	private int x2;

	/**
	 * top-right corner y coordinate
 	 */
	private int y2;

	public Rectangle(int x1, int y1, int x2, int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}


	public int getX1()
	{
		return x1;
	}


	public void setX1(final int x1)
	{
		this.x1 = x1;
	}


	public int getY1()
	{
		return y1;
	}


	public void setY1(final int y1)
	{
		this.y1 = y1;
	}


	public int getX2()
	{
		return x2;
	}


	public void setX2(final int x2)
	{
		this.x2 = x2;
	}


	public int getY2()
	{
		return y2;
	}


	public void setY2(final int y2)
	{
		this.y2 = y2;
	}


//	public String checkIntersection(Rectangle r) {
//
//	}
//
//	public String checkAdjacency(Rectangle r) {
//
//	}
//
//	public String checkContainment(Rectangle r) {
//
//	}


	@Override
	public boolean equals(final Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (o == null || getClass() != o.getClass())
		{
			return false;
		}
		final Rectangle rectangle = (Rectangle) o;
		return x1 == rectangle.x1 && y1 == rectangle.y1 && x2 == rectangle.x2 && y2 == rectangle.y2;
	}


	@Override
	public int hashCode()
	{
		return Objects.hash(x1, y1, x2, y2);
	}


	@Override
	public String toString()
	{
		return "{" +
			   "x1=" + x1 +
			   ", y1=" + y1 +
			   ", x2=" + x2 +
			   ", y2=" + y2 +
			   '}';
	}
}
