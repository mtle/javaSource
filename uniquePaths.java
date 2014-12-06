/***
A robot is located at the top-left corner of a m x n grid (marked
‘Start’ in the diagram below). The robot can only move either down
or right at any point in time. The robot is trying to reach the
bottom-right corner of the grid (marked ‘Finish’ in the diagram below).
How many possible unique paths are there?
*/
/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class uniquePaths
{
	public static final int r = 2;
	public static final int c = 2;
	
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		System.out.println("(" + r + "," + c + ")" + backtrack(r, c) );
	}
	public static int bt(int x, int y)
	{
		if (x==r && y==c) return 1;
		else if (x>r || y>c) return 0;
		else return bt(x+1,y) + bt(x,y+1);
	}
	public static int backtrack(int r, int c)
	{
		return bt(0,0);
	}
	public static int bt_dp (int x, int y)
	{
		Vector<Vector<Integer>> v = new Vector<Vector<Integer>>(r+2, c+2);
		//Vector<Integer>[] v = new Vector<Integer>[c];
	}
}
