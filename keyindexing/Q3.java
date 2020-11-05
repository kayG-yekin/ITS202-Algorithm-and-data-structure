import java.util.*;
public class Q3{
	public static void search(int []a){
		int found=0;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the number you want to search from 1-10: ");
		int search = obj.nextInt();

		for(int i = 0; i<a.length;i++){
			if(search == a[i]){
				found = 1;
				break;
			}
			else{
				found = 0;
				
			}
		}
		if(found == 1){
			System.out.println("The element you were searching is found!!");
		}
		else{
			System.out.println("The element is not Found");
		}

	}
	
	public static void main(String[] args){
		Q3 obj = new Q3();
		int []a= {1,2,3,4,5,6,7,8,9,10};
		obj.search(a);
 	}		
}