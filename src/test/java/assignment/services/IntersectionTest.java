package assignment.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.assignment.entity.Rectangle;
import com.assignment.services.Intersection;


/**
 * IntersectionTest Description.
 *
 * @author DilipEmmanuel
 */
public final class IntersectionTest
{
	@Test
	public void checkIntersectionCase(){
		Intersection feature = new Intersection();

		// left -right
		Rectangle entity1 = new Rectangle(0, 0, 4, 4);
		Rectangle entity2 = new Rectangle(3,1,7,4);
		Assertions.assertTrue(Intersection.INTERACTION.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));

		// Top -bottom
		entity2 = new Rectangle(1,3,3,5);
		Assertions.assertTrue(Intersection.INTERACTION.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));

		//corners
		entity2 = new Rectangle(3,3,6,6);
		Assertions.assertTrue(Intersection.INTERACTION.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));

	}


	@Test
	public void checkNoIntersectionCase(){
		Intersection feature = new Intersection();
		Rectangle entity1 = new Rectangle(0, 0, 4, 4);
		Rectangle entity2 = new Rectangle(5,1,7,4);
		Assertions.assertTrue(Intersection.NO_INTERACTION.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}


	@Test
	public void checkIntersectionContainmentCase(){
		Intersection feature = new Intersection();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(1,1,3,3);
		Assertions.assertTrue(Intersection.NO_INTERACTION.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}


	@Test
	public void checkIntersectionAdjacencyCase(){
		Intersection feature = new Intersection();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(4,1,7,3);
		Assertions.assertTrue(Intersection.NO_INTERACTION.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}

}
