
public class Sort {

	public static void main(String[] args) {
	 int[] a= {8,3,19,10,25,2,18,7};
	 for(int i=0; i<a.length; i++) {
			System.out.print(a[i]+" ");
		}
	 System.out.println();
	 selectionSort(a);

	}
	
	public static void selectionSort(int[]x){
		for(int j=0; j<x.length-1;j++) {
		int min= x[j];
		int minindex=j;
		for(int i=1; i<x.length; i++){
			if(x[i]<min){
				min=x[i];
				minindex = i;
			}
		}
		int temp= x[0];
		x[0] =x[minindex];
		x[minindex]= temp;
		for(int i=0; i<x.length; i++) {
			System.out.print(x[i]+" ");
		}
		System.out.println();
		}

	}
}
