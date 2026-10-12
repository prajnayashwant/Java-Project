package program;

public class Demo2 {
public static void main(String args[]) {
	int arr[]= {10,20,30,40};
	int sum=0;
	System.out.println("Array elements:");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		sum=sum+arr[i];
	}
	double avg = (double)sum/arr.length;
	System.out.println("sum="+sum);
	System.out.println("average="+avg);
	
}
}
