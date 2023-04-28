public class Reverse_Array {
    static void reverse(int arr[], int n)
    {
        int b[]= new int[n];
        int j=n;
        for(int i=0;i<n;i++)
        {
            b[j-1]=arr[i];
            j=j-1;
        }
        for(int k=0;k<n;k++)

        {
            System.out.print("Reverse array is :" +b[k]);
        }
    }
    public static void main(String[] args) {
        
    int arr[]={12,23,42,44,24,4};

    reverse(arr,arr.length);

}
}