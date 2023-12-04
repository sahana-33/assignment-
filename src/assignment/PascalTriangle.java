package assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class PascalTriangle {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        
	        System.out.print("Enter the number of rows for Pascal's triangle: ");
	        int numRows = scanner.nextInt();
	        
	        List<List<Integer>> result = generatePascalsTriangle(numRows);
	        
	        System.out.println("Output: " + result);
	    }

	    public static List<List<Integer>> generatePascalsTriangle(int numRows) {
	        List<List<Integer>> triangle = new ArrayList<>();

	        if (numRows <= 0) {
	            return triangle;
	        }

	        for (int i = 0; i < numRows; i++) {
	            List<Integer> row = new ArrayList<>();

	            for (int j = 0; j <= i; j++) {
	                if (j == 0 || j == i) {
	                    row.add(1);
	                } else {
	                    row.add(triangle.get(i - 1).get(j - 1) + triangle.get(i - 1).get(j));
	                }
	            }

	            triangle.add(row);
	        }

	        return triangle;
	    }
	}