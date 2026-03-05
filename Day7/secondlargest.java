public class secondlargest {
	public static void main(String[] args){
		int[] a={12,35,1,10,34,1};
		int max=a[0];
		for(int i=0;i<a.length;i++){
			if(a[i]>max)
				max=a[i];
		}
		int max2=-1;
		for(int i=0;i<a.length;i++){
			if(a[i]>max2 && a[i]!=max){
				max2=a[i];
			}
		}
		System.out.print(max2);
	}
}