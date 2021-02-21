
public class TwoDArray {
private int [][] arrayInts;
    /**
     * Constructor for objects of class Util2DInteger
     * @param array to array
     */
	
    public TwoDArray(int[][] arrays)
    {
        this.arrayInts = arrays;
    }
    

    /**
     * Gets the largest integer in the array
     * @return the largest number in the array
     */
    public int getLargest()
    {
        int largest = arrayInts[0][0];//smallest int possible
        for(int a = 0; a < arrayInts.length; a++)
        {
            for(int b = 0; b < arrayInts[0].length; b++)
            {
                if(arrayInts[a][b] > largest)
                {
                    largest = arrayInts[a][b];//replace
                }
            }
        }
        return largest;
    }

    /**
     * Gets the product of the elements in the array
     * @return the product of the array
     */
    public int product()
    {
        int product = 1;//hold value, 1 wont make a change
        for(int x = 0; x < arrayInts.length; x++)
        {
            for(int y = 0; y < arrayInts[0].length; y++)
            {
                product = product * arrayInts[x][y];
            }
        }
        return product;
    }

    /**
     * Gets the element in the last column of the last row
     * @return the element in the last column of the last row
     */
    public int lastElement()
    {
    	//row,column
        return arrayInts[arrayInts.length -1][arrayInts[0].length -1];
    }

    /**
     * Returns true if the given number is in the array
     * @param number to array
     * @return true if the number is inside the array 
     */
    public boolean contains(int number)
    {
        boolean check = false;
        for(int i = 0; i < arrayInts.length; i++)//rows
        {
            for(int z = 0; z < arrayInts[0].length; z++)//columns
            {
                if(arrayInts[i][z] == number)
                {
                    check = true;
                }
            }
        }
        return check;
    }
    public static void main(String[] args)
    {
    	int[][] twoDArray = new int[3][3];
    	twoDArray[0][0] = 4;
    	twoDArray[0][1] = 21;
    	twoDArray[0][2] = 13;
    	twoDArray[1][0] = 48;
    	twoDArray[1][1] = 52;
    	twoDArray[1][2] = 67;
    	twoDArray[2][0] = 17;
    	twoDArray[2][1] = 81;
    	twoDArray[2][2] = 74;
    	TwoDArray list = new TwoDArray(twoDArray);
    	System.out.println("Total product of 2D Array"+list.product());
    	System.out.println(list.contains(100));
    	System.out.println("The last element in the 2D Array"+list.lastElement());
    	System.out.println("Largest Number in the 2D Array"+list.getLargest());
    }
    
}
