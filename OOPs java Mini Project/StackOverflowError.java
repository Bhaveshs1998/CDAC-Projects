class StackOverflowError{
	int fact(int n){
		if(n == 100){
			return 1;
		}else{
			return n*fact(n-1);
		}
	}
	public static void main(String args[]){
		fact(10);
	}
}