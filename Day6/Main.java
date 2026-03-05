import java.util.*;
class twononorep {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,2,1};
        int n=arr.length;
        int res=0;
        for(int i=0;i<n;i++){
            res= res^arr[i];
        }
        System.out.println(res);
        int rmd=res & -res;
        System.out.println(rmd);
        int num1=0,num2=0;
        for(int i=0;i<n;i++){
            if((arr[i]& rmd)==1){
                num1=num1^arr[i];
            }
            else{
                num2=num2^arr[i];
            }
        }
        System.out.println(num1+" "+num2);
    }
}



