import java.util.*;
public class GFG
{
   
 
static void leftRotate(int arr[], int d, int n)
{
int i, j;
if(d == 0 || d == n)
	return;
i = d;
j = n - d;
while (i != j)
{
	if(i < j) /*A is shorter*/
	{
	if(i==d){
	    	swap(arr,0, d+j-i, i);
	}
	else
	swap(arr,j, d+j-i, i);
	j -= i;
	}
	else /*B is shorter*/
	{
	if(i==d)
	swap(arr, d-i, d, j);
	else
	swap(arr, j, d, j);
	i -= j;
	}
	// printArray(arr, 7);
}
/*Finally, block swap A and B*/
swap(arr, d-i, d, i);
}

/*UTILITY FUNCTIONS*/
/* function to print an array */
public static void printArray(int arr[], int size)
{
    int i;
    for(i = 0; i < size; i++)
        System.out.print(arr[i] + " ");
    System.out.println();
}
 
/*This function swaps d elements
starting at index fi with d elements
starting at index si */
public static void swap(int arr[], int fi,
                        int si, int d)
{
    int i, temp;
    for(i = 0; i < d; i++)
    {
        temp = arr[fi + i];
        arr[fi + i] = arr[si + i];
        arr[si + i] = temp;
    }
}
 
// Driver Code
public static void main (String[] args)
{
    int arr[] = {1, 2, 3, 4, 5, 6, 7,8,9,10,11,12};
    leftRotate(arr, 3, 12);
    printArray(arr, 12);    
}
}