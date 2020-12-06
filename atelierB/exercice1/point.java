package Exercice1;

public class Point {
public int x;
public int y;

public Point( int x , int y)
{
	this.x=x;
	this.y=y;

}

@Override
public String toString() {
	return "Point [x=" + x + ", y=" + y + " la distance entre deux point est: \" + Math.abs(x - y) +\"]";
}







}
