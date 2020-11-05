public class Q1{
	public static void main(String[] args){
		int  [] a = {1,2,3,4,3,2,1};
		int n =a.length;
		int R=7;
		int [] aux = new int[n];
		int [] count = new int[R+1];

		for(int i = 0;i<n;i++){
			count[a[i] +1]++;
		}
			for(int r = 0;r<R;r++){
				count[r+1]+=count[r];
			}

		for(int i = 0;i<n;i++){
			aux[count[a[i]]++] = a[i];
		}	
		for(int i=0;i<n;i++){
			a[i]=aux[i];
		}
		for(int i = 0;i<n;i++){
			System.out.print(" "+ a[i]);
		}
		System.out.print(" ");
		
	}
}