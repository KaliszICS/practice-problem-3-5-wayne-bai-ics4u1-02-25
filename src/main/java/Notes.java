
class Notes {
	public static void main(String[] args) {

	}

	public static int dfs(String[][] arr) {

		//start - bottom left
		int curRow = arr.length - 1;
		int curCol = 0;

		// keep track of number of steps
		int noOfMoves = 0;

		return dfsHelper(arr, noOfMoves, curRow, curCol);
		
	}

	public static int dfsHelper(String[][] arr, int moves, int row, int col) {


		// base case
		// going out of bounds
		// Reached the finish

		//recursive call - more than one
		//go right - change variables accordingly, col, moves
		//go up - change row, moves

		//return - minimum steps (or the valid steps)

	}
























	public static int dfsHelper(String[][] arr, int curRow, int curCol, int noOfMoves) {

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//base case
		//there isn't just one

		//base case 1: When you go out of bounds

		//base case 2: reach the finish
		//check the value at a move and see if it is the finish


		//recursive call to move right

		//recursive call to move up

		//compare and choose the pathway(noOfMoves) that was shorter
		//ensure that the number you send back is a valid number.

		//return the shorter pathway(noOfMoves)
		
	}
}
