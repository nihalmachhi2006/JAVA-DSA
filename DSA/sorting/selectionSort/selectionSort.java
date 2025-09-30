public class selectionSort{
        public static void printarray(int arr[]) {
            for(int i=0; i<arr.length;i++){
                System.out.println(arr[i] + "  ");
            }
            System.out.println();
        }
    
    public static void main(String[] args) {
        int arr[] = {7,8,53,1,2,9};

        for(int i = 0; i <arr.length-1; i++){
            int smallest = i;
            for(int j = i+1; j<arr.length;j++){
                if(arr[smallest] > arr[j]){
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printarray(arr);
    }
}