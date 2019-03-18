package javaPractiice;

public class Array {

	public static void main(String[] args) {
		
		int [] a = {5,6,8,2,4,3,6,8,9 };
		
		
		// printing the elements of array
			for(int i=0; i<a.length;i++ ) {
			System.out.println(a[i]+" ");
	}
		//Summing all the elements
		int total =0 ;
		for(int i=0;i<a.length;i++) {
			
			total+=a[i];

			
	}
		System.out.println("Sum is "+ total);
		
		//Finding the largest element
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) max=a[i];
		}
		System.out.println("Max is " + max);
}
}


