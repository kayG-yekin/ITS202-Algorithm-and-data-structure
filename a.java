public class a{
	static int[] array1;
	public static int[] resize(int length){
		int[] temp = new int[length];
		for(int i=0;i<array1.length;i++){
			temp[i]= array1[1];
		}
		temp[length - 1]=4;
		array1= temp;
		return array1;
	}
	public static void main(String[]args){
		array1= new int[3];
		array1[0]=1;
		array1[1]=2;
		array1[2]=3;
		int[] newarray1 = resize(4);
		for(int i=0;i<newarray1.length;i++){
			System.out.println(newarray1[i]);
		}
	}
}