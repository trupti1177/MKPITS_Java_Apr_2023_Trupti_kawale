public class SelectionSort {

    public static void main(String[] args) {

        int arr[] ={12,11,10,8,5};

        for (int i = 0; i < arr.length-1; i++) {

            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]>arr[j]){

                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }

            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
