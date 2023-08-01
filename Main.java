package sample;
import java.util.*;

public class Mains {

	public static void main(String[] args) {
		
		int a[]= {0};
		int b[]=new int[a.length];
		int k=0;
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
			{
				
				b[k]=a[i];
				k++;
			}
		}
		
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				
				b[k]=a[i];
				k++;
			}
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}
