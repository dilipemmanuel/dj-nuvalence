package assignment.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.assignment.entity.Rectangle;
import com.assignment.services.Adjacency;
import com.assignment.services.Containment;


/**
 * ContainmentTest Description.
 *
 * @author DilipEmmanuel
 */
public final class ContainmentTest
{
	@Test
	public void checkContainmentFeatureCollisonCase(){
		Containment feature = new Containment();
		Rectangle entity1 = new Rectangle(0, 0, 4, 4);
		Rectangle entity2 = new Rectangle(0,0,4,4);
		Assertions.assertTrue(Containment.CONTAINMENT.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}


	@Test
	public void checkContainmentFeatureIntersectionCase(){
		Containment feature = new Containment();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(3,1,7,4);
		Assertions.assertTrue(Containment.INT_NO_CONTAINMENT.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}


	@Test
	public void checkContainmentFeatureNegativeCase(){
		Containment feature = new Containment();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(5,1,7,4);
		Assertions.assertTrue(Containment.NO_CONTAINMENT.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}

	@Test
	public void checkContainmentFeatureAdjacencyCase(){
		Containment feature = new Containment();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(4,0,7,4);
		Assertions.assertTrue(Containment.NO_CONTAINMENT.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}


	@Test
	public void checkContainmentFeatureContainmentCase(){
		Containment feature = new Containment();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(1,1,3,3);
		Assertions.assertTrue(Containment.CONTAINMENT.equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}

}
