class TwoStackdemo{
	int a[];
	int size;
	int top1, top2;
	
	TwoStackdemo(int n1){
		
		size = n1;
		a = new int[n1];
		top1 = n1/2 +1;
		top2 = n1/2;
	}
	
	void push1(int value){
		if(top1 > 0){
			top1--;
			a[top1] = value;
		}else{
			System.out.println("Stack 1 overflow");
		}
		return;
	}
	
	void push2(int value){
		if(top2 < size-1){
			top2++;
			a[top2] = value;
		}else{
			 System.out.println("Stack 2 overflow");
		}
		return;
	}
	
	int pop1(){
		if(top1 <= size/2){
			int x = a[top1];
			top1++;
			return x;
		}else{
			System.out.println("Stack 1 underflow");
			System.exit(1);
		}
		return 0;
	}
	
	int pop2(){
		if(top2 >= size / 2 + 1){
			int x = a[top2];
			top2--;
			return x;
		}else{
			System.out.println("Stack 2 underflow");
			System.exit(1);
		}
		return 1;
	}
}
	
	
class TwoStack{
	public static void main(String args[]){
		TwoStackdemo tsd = new TwoStackdemo(10);
		tsd.push1(5); 
		tsd.push2(10); 
		tsd.push2(15); 
		tsd.push1(11); 
		tsd.push2(7); 
		tsd.push2(40);
		
		
		System.out.println("Popped element from stack1 is "+tsd.pop1());
		System.out.println("Popped element from stack2 is "+tsd.pop2());
		
	}
	
}
	

