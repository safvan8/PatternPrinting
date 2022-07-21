public class MyName
{
    public static void main(String[] args)
    {
        int n=5;
        // to print rows for all the Letters
        for (int row=1;row<=n;row++)
        {

            // ********* to print columns with  $ Symbol  for Letter S  *********************** *
            for (int colmn=1;colmn<=n;colmn++ )
            {
                if ( row==1 || row==3 || row ==5 ||
                        (colmn==1 && row!=4) || (colmn ==5 && row!=2)
                )
                {
                    System.out.print("$");
                }
                else
                    System.out.print(" ");
            }
            System.out.print(" "); // some space before next Letter
			
            System.out.println();
        }
    }
}