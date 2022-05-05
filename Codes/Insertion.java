import java.util.*;
class Insertion{
	void insertionSort(int a[]){
		int n = a.length;
		int element = a[n-1];
		
		for (int i =n-2; i>=0; i--){
			if(a[i]>element){
				a[i+1] = a[i];
				print(a);
			}else{
				a[i+1] =  element;
				print(a);
				break;
			}
			
			if(a[i+1] > element && i==0){
				a[i] = element;
				print(a);
			}
			
		}
	}
	
	void print(int []a){
		for(int i :a){
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		Insertion is = new Insertion();
		System.out.println("Size of Array : ");
		int size = sc.nextInt();
		
		int [] arr1 = new int [size];
		
		System.out.println("Array Elements : ");
		
		for(int i=0; i<size; i++){
			arr1[i] = sc.nextInt();
		}
		
		is.insertionSort(arr1);
		
	}
}