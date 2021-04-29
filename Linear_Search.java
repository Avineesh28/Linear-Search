import java.util.*;
public class Linear_Search
{
    int size;
    int a[];
    Linear_Search(int n)
    {
        size=n;
        a=new int[n];
    }
    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<size;i++)
            a[i]=sc.nextInt();
    }
    void search(int n)
    {
        int flag=0;
        for(int i=0;i<size;i++)
        {
            if(a[i]==n)
            {
                System.out.println("Found at "+(i+1));
                flag++;
            }
        }
        if(flag==0)
            System.out.println("Not Found");
    }
    void display()
    {
        System.out.println("\f");
        System.out.println(Arrays.toString(a));
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        Linear_Search obj=new Linear_Search(sc.nextInt());
        obj.input();
        System.out.println("Enter Element");
        int c=sc.nextInt();
        obj.display();
        obj.search(c);
    }
}
