package assignment02;

abstract class Shape
{
	abstract void draw();
}

 class Line extends Shape
{
	void draw()
	{
		System.out.println("Line drawn");
	}
}
 
 class Rectangle extends Shape
{
	   void draw()
	 {
		System.out.println("Rectangle drawn"); 
	 }
 }
 
 class Cube extends Shape
 {
	  void draw()
	 {
		System.out.println("Cube drawn"); 
	 }
 }
 
public class Solution_05
{
     public static void main(String[] args)
     {
    	 Shape li = new Line();
    	 li.draw();
    	 Shape Rect = new Rectangle();
    	 Rect.draw();
    	 Shape Cu = new Cube();
         Cu.draw();
     }
}
