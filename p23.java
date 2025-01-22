public class p23{
    static void printsubset(int arr[],int n){
        int st=0;int end=n-1;
        
        for( st=0;st<n;st++){
            for( end=st;end<n;end++){
                for( int i=st;i<=end;i++){
                    System.out.print(arr[i]);
                }
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }
    public static void main(String args[]){
        int arr[]={6,8,5,4,3,2};
        int n=arr.length;
        printsubset(arr,n);
        
    }
}