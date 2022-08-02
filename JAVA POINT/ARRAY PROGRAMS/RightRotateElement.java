public class RightRotateElement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7};
        System.out.print("Befor Right Rotate : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

        int temp = arr[arr.length - 1];
        // System.out.println(temp);
        for(int i=arr.length-1;i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
        System.out.println();
        System.out.print("After Right Rotate : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
}
