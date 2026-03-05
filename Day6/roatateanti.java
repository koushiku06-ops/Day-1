public class roatateanti {
    public static void main(String[] args){
        int arr[]={1,2,3,4,5};
        int n=arr.length;
        int rotated[]=new int[n];
        int last=arr[n-1];
        for(int i=n-1;i>0;i--){
            rotated[i]=arr[i-1];
        }
        rotated[0]=last;

        for(int i=0;i<n;i++){
            System.out.print(rotated[i]+" ");
        }
    }
    
}
