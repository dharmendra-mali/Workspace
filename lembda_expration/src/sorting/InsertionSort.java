package sorting;

public class InsertionSort {

	public static int [] insertionSort(int [] sample){
		
		for(int i=1;i<sample.length;i++){
			
			int j=i-1;
			int x=sample[i];
			while(j>-1&&sample[j]>x){
				
				sample[j+1]=sample[j];
				j--;
			}
			
			sample[j+1]=x;
		}
		
		
		
		return sample;
	}
	
	
	
}
