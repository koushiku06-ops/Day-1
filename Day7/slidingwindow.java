public class slidingwindow {
	public static void main(String[] args){
		int a[]={1,2,3,4,5,6,7,8,9,10,5,10};
		int n=a.length;
		int w=4;
		int cur=0;
		int max=0;
		for( int i=0;i<w;i++){
			cur=cur+a[i];
			
	}
	System.out.println(cur);
	max=cur;
	for(int i=1;i<n-w;i++){
		cur=cur-a[i-1]+a[i+w-1];
		System.out.println(cur);
		if(cur>max)max=cur;
		}
		System.out.print(max);
	}
}
