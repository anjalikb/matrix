import java.util.*;
class matrix_array2
{
  public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  int [][] a=new int [4][3];
 
   int i,j;
  System.out.println("ENTER THE ELEMENT IN ARRAY");
  for(i=0;i<4;i++)
  {
    for(j=0;j<3;j++)
    a[i][j]=sc.nextInt();
}
  System.out.println("DATA TYPE = ");
   for(i=0;i<4;i++)
  {
    for(j=0;j<3;j++)
    System.out.println(a[i][j]+" ");
}
   System.out.println("MATRIX  = ");
   for(i=0;i<4;i++)
  {
    for(j=0;j<3;j++)
    System.out.print(a[i][j]+" ");

   System.out.println();
}
}
}