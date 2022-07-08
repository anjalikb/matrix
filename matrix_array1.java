import java.util.*;
class matrix_array1
   {

       public static void main(String args[])
       {
            
        Scanner sc = new Scanner(System.in);

        int [][]  a = new int [3][3];


          int i , j;
        System.out.println("ENTER THE ELEMETS IN ARRAY");
           for(i=0; i<3; i++)
             {
              for(j=0; j<3; j++)
                a[i][j]=sc.nextInt();
             }
          
          System.out.println("Data are=");     
        for(i=0; i<2; i++)
             {
              for(j=0; j<3; j++)
                System.out.println(a[i][j]+" ");
             }

           System.out.println("Printing In Matrix Form=");     
        for(i=0; i<3; i++)
             {
              for(j=0; j<3; j++)
                System.out.print(a[i][j]+" ");

            System.out.println();
             }

        }

}
  