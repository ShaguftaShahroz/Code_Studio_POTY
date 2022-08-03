/* Problem of the day:Moderate
  Sorted Matrix:
  Problem Statement:
  You are given an NxN matrix "mat" of positive integers, where every row and column is sorted in non-decreasing order.
  Your task is to return a list containing all elements of the matrix in sorted order.
*/
import java.util.*;

public class Solution {
	
	public static List<Integer> sortedMatrix(int[][] mat, int n) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
                pq.add(mat[i][j]);
        }
        List<Integer> ans = new ArrayList<>();
        while(!pq.isEmpty())
            ans.add(pq.poll());
        return ans;
	}

}
