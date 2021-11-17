public class Magic
{
  public static int[][] magicSquare(int size)
  {
    int[][] magicArray = new int[size][size];
    int row = 0;
    int col = size / 2;
    magicArray[row][col] = 1;
    
    for (int x = 2; x <= size*size; x++)
    {
      if (x % size == 1)
      {
        row++;
      }
      else
      {
        row--;
        col++;
      }
      
      if (row == size)
      {
          row = 0;
      }
      if (col == size)
      {
          col = 0;
      }
      if (row == -1)
      {
          row = size -1;
      }
      magicArray[row][col] = x;
    }
    return magicArray;
  }
  
  public static void print2D(int[][] array)
  {
    for (int r = 0; r < array.length; r++)
    {
      for (int c = 0; c < array[0].length; c++)
      {
        System.out.print(array[r][c] + " ");
      }
      System.out.println();
    }
    System.out.println();
  }
    
  public static void main(String[] args)
  {
    System.out.println("Size 5:");
    print2D(magicSquare(5));

    System.out.println("Size 11:");
    print2D(magicSquare(11));
  }
}
