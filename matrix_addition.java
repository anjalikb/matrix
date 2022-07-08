import java.util.*;
class matrix_addition
   {

       public static void main(String args[])
       {
            
        Scanner sc = new Scanner(System.in);
         int i , j;
        int [][]  a = new int [3][3];
        int [][]  b = new int [3][3];
         int [][]  c = new int [3][3];
        
      
        System.out.println("ENTER THE ELEMETS IN ARRAY");
           for(i=0; i<3; i++)
             {
              for(j=0; j<3; j++)
                a[i][j]=sc.nextInt();
             }



          System.out.println("enter element for second matrix");

           for(i=0; i<3; i++)
             {
              for(j=0; j<3; j++)
                b[i][j]=sc.nextInt();
             }

           for(i=0; i<3; i++)
             {
              for(j=0; j<3; j++)
                c[i][j]=a[i][j]+b[i][j];
             }
          
           System.out.println(" Matrix 1 Form=");     
        for(i=0; i<3; i++)
               {
              for(j=0; j<3; j++)
                System.out.print(a[i][j]+" ");
                  System.out.println();
              }

           System.out.println(" Matrix 2 Form=");     
           for(i=0; i<3; i++)
             {
              for(j=0; j<3; j++)
                System.out.print(b[i][j]+" ");

                 System.out.println();
              
            }
              
              System.out.println(" addition of matrix=");     
           for(i=0; i<3; i++)
             {
              for(j=0; j<3; j++)
                System.out.print(c[i][j]+" ");

                 System.out.println();
              
            }
}
}
  