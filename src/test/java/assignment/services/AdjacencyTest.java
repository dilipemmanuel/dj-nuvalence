package assignment.services;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.assignment.entity.Rectangle;
import com.assignment.services.Adjacency;


/**
 * AdjacencyTest Description.
 *
 * @author DilipEmmanuel
 */
public final class AdjacencyTest
{
	@Test
	public void checkAdjacencyFeatureCollisonCase(){
		Adjacency feature = new Adjacency();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(0,0,4,4);
		Assertions.assertTrue("No Adjacency".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}

	@Test
	public void checkAdjacencyFeatureFailCase(){
		Adjacency feature = new Adjacency();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(5,0,7,4);
		Assertions.assertTrue("No Adjacency".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}


	@Test
	public void checkAdjacencyFeatureIntersectionCase(){
		Adjacency feature = new Adjacency();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(3,1,7,4);
		Assertions.assertTrue("No Adjacency".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}



	@Test
	public void checkAdjacencyFeatureContainmentCase(){
		Adjacency feature = new Adjacency();
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(1,1,3,3);
		Assertions.assertTrue("No Adjacency".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}



	@Test
	public void checkAdjacencyFeaturePositive(){

		Adjacency feature = new Adjacency();

		//Right -Left
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(4,0,8,4);
		Assertions.assertTrue("Adjacency Proper".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));


		//Top-bottom
		entity2 = new Rectangle(0,4,4,6);
		System.out.println(feature.checkFeature(entity1, entity2));
		Assertions.assertTrue("Adjacency Proper".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}


	@Test
	public void checkAdjacencyFeatureSublineCondition(){
		Adjacency feature = new Adjacency();
		//Right-Left
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(4,1,8,3);
		Assertions.assertTrue("Adjacency Sub line".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));

		//Top-bottom
		entity2 = new Rectangle(1,4,3,6);
		Assertions.assertTrue("Adjacency Sub line".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));


	}


	@Test
	public void checkAdjacencyFeaturePartialCondition(){
		Adjacency feature = new Adjacency();
		//Right-left
		Rectangle entity1 = new Rectangle(0,0,4,4);
		Rectangle entity2 = new Rectangle(4,2,8,6);
		Assertions.assertTrue("Adjacency Partial".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));

		//Top-bottom
		entity2 = new Rectangle(2,4,6,6);
		Assertions.assertTrue("Adjacency Partial".equalsIgnoreCase(feature.checkFeature(entity1, entity2)));
	}

}
