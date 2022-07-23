public class MyName
{
    public static void main(String[] args)
    {
        int n=n;
        // to print rows for all the Letters
        for (int row=1;row<=n;row++)
        {

            // ********* to print columns with  $ Symbol  for Letter S  *********************** *
            for (int colmn=1;colmn<=n;colmn++ )
            {
                if ( row==1 || row==3 || row ==n ||
                        (colmn==1 && row!=4) || (colmn ==n && row!=2)
                )
                {
                    System.out.print("$");
                }
                else
                    System.out.print(" ");
            }
            System.out.print(" "); // some space before next Letter
			
			// ********* to print columns with  $ Symbol  for Letter A  *********************** *
            // to print left spaces
            for (int spaces=1;spaces<= n- row;spaces++)
            {
                System.out.print(" ");
            }
            // to print  $ Symbol
            for(int colmn=1;colmn<=row;colmn++)
            {
                if (row > 3 && colmn == 2 || row > 3 && colmn == 3 || // 2nd & 3ird columns not required for both rows
                        row == n && colmn == 4      // for nth row
                )
                    System.out.print("  ");
                else
                    System.out.print("$ ");

            }

            // to print right spaces
            for (int spaces=1;spaces<= n- row;spaces++)
            {
                System.out.print(" ");
            }
            System.out.print(" "); // some space before next Letter
			
			
			
			// ********* to print columns with  $ Symbol  for Letter F  *********************** *
            for (int colmn=1;colmn<=n;colmn++ )
            {
                if ( row == 1 || row ==3 || colmn ==1)
                    System.out.print("$ ");
                else
                    System.out.print("  ");
            }

            System.out.print(" "); // some space before next Letter
			
			
		 // *********** to print columns with  $ Symbol  for Letter V  *********************** *

            // to print left spaces
            for (int space=0;space<row;space++)
            {
                System.out.print(" ");
            }

            // to print-columns-  $ Symbol  for V
            for (int column = (n+1 - row); column >=1; column--)
            {
                if (column ==n+1 - row || column == 1)  // printing column in the 1st and last column
                    System.out.print("$ ");
                else
                    System.out.print("  ");
            }
            // to print right spaces
            for (int space=0;space<row;space++)
            {
                System.out.print(" ");
            }

            System.out.print(" "); // some space before next Letter
			
			
			// ********* to print columns with  $ Symbol  for Letter A  *********************** *
            // to print left spaces
            for (int spaces=1;spaces<= n- row;spaces++)
            {
                System.out.print(" ");
            }
            // to print  $ Symbol
            for(int colmn=1;colmn<=row;colmn++)
            {
                if (row > 3 && colmn == 2 || row > 3 && colmn == 3 || // 2nd & 3ird columns not required for both rows
                        row == n && colmn == 4      // for nth row
                )
                    System.out.print("  ");
                else
                    System.out.print("$ ");

            }

            // to print right spaces
            for (int spaces=1;spaces<= n- row;spaces++)
            {
                System.out.print(" ");
            }
            System.out.print(" "); // some space before next Letter
			
			
			
			// ********* to print columns with  $ Symbol  for Letter N  *********************** *
            for (int colmn=1;colmn<=n;colmn++)
            {
                if (colmn ==1 || colmn == row || colmn == n)
                {
                    System.out.print("$ ");
                }
                else
                    System.out.print("  ");
            }
            System.out.print(" "); // some space before next Letter
			
		
			// ********* to print a Separator Dot between name and Initial  *********************** *
            for (int column=1;column <=n;column++)
            {
                if (row == 4 && (column == 2 || column == 3 )   ||
                        row == n && (column == 2 || column == 3 )
                )
                    System.out.print("$");
                else
                    System.out.print(" ");
            }
            System.out.print("   "); // some space before next Letter

            // ********* to print columns with  $ Symbol  for Letter P  *********************** *
            for (int column=1;column <=n;column++)
            {
                if ( row==1 || row == 3 || column == 1 || (column == n && row !=4 && row != n ))
                    System.out.print("$ ");
                else
                    System.out.print("  ");
            }
			
			
            System.out.println();
        }
    }
}