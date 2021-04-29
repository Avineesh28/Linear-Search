
//Implementation of a Linear Search using Arrays
#include <stdio.h>
int main()
{
	int n,s;//Variablesd for size of array and search element
	printf("Enter the number of elements in the array\n");
	scanf("%d",&n);
	int a[n];
	printf("Enter the array elements\n");
	int i;
	for(i=0;i<n;i++)
		scanf("%d",&a[i]);//Inputting the Array
	printf("Enter the value to be searched\n");
		scanf("%d",&s);//Value to be Searched
	int c=-1;//default assumption element not present
	for(i=0;i<n;i++)
	{
		if(a[i]==s)
		{
			c=i;
			printf("The value %d is present at the position %d in the array\n",s,(c+1));
			//for multiple instances in the array
		}
	}
	if(c==-1)
		printf("Element not found\n");
	printf("\n=>The Array-:\n");//Printing the array for reference
	for(i=0;i<n;i++)
		printf("\t%d",a[i]);
	return 1;
}

