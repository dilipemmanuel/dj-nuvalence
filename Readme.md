# Rectangle Feature Assignment


## Introduction
This is a Java based library that helps to analyze rectangles and features that exist among rectangles. For the scope of the library following features have been covered.

1. Intersection: Detetermines whether two rectangles have one or more intersecting lines and produce a result identifying the points of intersection. 

2. Containment: Determines whether a rectangle is wholly contained within another rectangle.

3. Adjacency: Determines whether two rectangles are adjacent. Adjacency is defined as the sharing of at least one side. Side sharing may be proper, sub-line or partial. _Please note : A contained rectangle sharing a side is not considered as Adjacent Rectangle_ 
- A sub-line share is a share where one side of rectangle A is a line that exists as a set of points
wholly contained on some other side of rectangle B
- Partial is one where some line
segment on a side of rectangle A exists as a set of points on some side of Rectangle B. 
- Proper is one where line segment on a side  of rectangle A is shared with completely with the some other side of rectangle B.  

## Dependencies
This is a java based gradle project. The only dependency for running this project as well as building is JDK 8 and above, junit-jupiter-api:5.8.1 ,junit-jupiter-engine:5.8.1 and gradle.

## How to build
On the root folder of the project run the following command to build and generate the excutable jar file

on Mac Osx
> ./gradlew build

On Windows
> gradle build

## How to Run

To execute the jar library 
>java -jar nuvalence-x.xx.jar 


## Examples 

Once the jar is executed in command prompt following command shows up

```
Provide X,Y coordinates of first rectangle Bottom-left corner and Top-Right corner (Ex:  0,0,4,4) 
<Enter your corodinates for Rectangle A as comma seperatedd values>

Provide X,Y coordinates of second rectangle Bottom-left corner and Top-Right corner (Ex:  0,0,4,4) 
<Enter your corodinates for Rectangle B as comma seperatedd values>

Select Feature  
 1. Intersection 
 2. Adjacency 
 3. Containment 
 4. All

 select the feature that needs to be checked for the two rectangle.
<input the number eg. 4 to analyse all features>
```

## Output
Following are the valid results for each feature

#### Intersection
- Intersection
- No Intersection
***
#### Adjacency
- No Adjacency
- Adjacency Proper
- Adjacency Subline
- Adjacency Partial
***
#### Containment
- Containment
- No Containment
- Intersection - No Containment
***