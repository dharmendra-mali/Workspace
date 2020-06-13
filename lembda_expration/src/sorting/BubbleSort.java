package sorting;

public class BubbleSort {
	
	
	public static int [] bubbleSort(int [] sample){
		
		for(int i=0;i<sample.length-1;i++){
			
			boolean flag=false;
			for(int j=0;j<sample.length-1-i;j++){
				int x;
				if(sample[j]>sample[j+1]){
					x=sample[j];
					sample[j]=sample[j+1];
					sample[j+1]=x;
					flag=true;
				}
				
				
			}
			if(flag==false){
				break;
			}
		}
		
		
		
		return sample;
	}
	
	public static void main(String[] args) {
		
		int [] sample={9,3,1,7};
		
		
		//sample=bubbleSort(sample);
		
		sample=InsertionSort.insertionSort(sample);
		
		for (int i : sample) {
			System.out.print(i+" ");
		}
		
	}

}
