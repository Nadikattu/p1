package sau;

import java.util.ArrayList;
import java.util.List;

public class Bublesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> a1=new ArrayList<>();
		a1.add(6);
		a1.add(7);
		a1.add(8);
		a1.add(2);
		a1.add(1);
	/*for(int i=(a1.size()-1);i>=0;i--)
		{
		  for(int j=1;j<=i;j++)	
		  {
			  if(a1[j-1]>a1[j])
			  {
				  int temp=a1[j-1];
				  a1[j-1]=a1[j];
				  a1[j]=temp;
			  }
		  }
				
        }*/

	


for (int size = a1.size(); size != 1; --size) {
    for (int i = 0; i < size - 1; i++) {
        int temp1 = a1.get(i + 1);
        int temp2 = a1.get(i);
        if (temp2 > temp1) {
            a1.set(i, temp1);
            a1.set(i + 1, temp2);
        }
    }
}
System.out.println("sorted array is: "+a1);
	}
}
