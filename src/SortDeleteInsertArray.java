import java.util.Scanner;

public class SortDeleteInsertArray {
    // Function to remove the element
    public static int[] removeTheElement(int[] arr, int index) {

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (arr == null
                || index < 0
                || index >= arr.length) {

            return arr;
        }

        // Create another array of size one less
        int[] anotherArray = new int[arr.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < arr.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = arr[i];
        }

        // return the resultant array
        return anotherArray;
    }
    //Delete an element in C++
//    cin >> k;
//	for (int i = k; i < n; i++){
//        a[i] = a[i+1];
//    }
//    n--;

    // Function to insert x in arr at position pos
    public static int[] insertX(int n, int arr[], int x, int pos) {
        int i;
        // create a new array of size n+1
        int newArr[] = new int[n + 1];

        // insert the elements from
        // the old array into the new array
        // insert all elements till pos
        // then insert x at pos
        // then insert rest of the elements
        for (i = 0; i < n + 1; i++) {
            if (i < pos - 1)
                newArr[i] = arr[i];
            else if (i == pos - 1)
                newArr[i] = x;
            else
                newArr[i] = arr[i - 1];
        }
        return newArr;
    }
    //Insert an element in C++
//    cin >> k >> x;
//	for (int i = n; i >= k+1; i--){
//        a[i] = a[i-1];
//    }
//    a[k] = x;
//    n++;

    public static void sortASC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void sortDESC(int [] arr) {
        int temp = arr[0];
        for (int i = 0 ; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }
    public static void show(int [] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int posIn;//position insert
        int vaIn;//value element insert
        int posDel;//position element delete

        int arr[] = {1, 2, 8, 4, 9, 6, 7, 5, 3};
        System.out.println("Before sort");
        show(arr);

        int plusArray[] = {1, 2, 8, 4, 9, 6, 7, 5, 3};
        int n = arr.length;

        sortASC(arr);
        System.out.println("");
        System.out.println("Sort ASC ");
        show(arr);
        sortDESC(arr);
        System.out.println("");
        System.out.println("Sort DESC ");
        show(arr);

        System.out.println("");
        System.out.println("Add and delete the element with the given array");
        show(plusArray);

        System.out.println("");
        System.out.println("Enter position you want to insert value: ");
        posIn = sc.nextInt();
        System.out.println("");
        System.out.println("Enter value you want to insert: ");
        vaIn = sc.nextInt();
        plusArray = insertX(n, plusArray, vaIn, posIn);
        System.out.println("");
        System.out.println("After insert "+ vaIn +" at " + posIn);
        show(plusArray);

        System.out.println("");
        System.out.println("Enter position you want to delete: ");
        posDel = sc.nextInt();
        // Remove the element
        plusArray = removeTheElement(plusArray, posDel);
        System.out.println("");
        System.out.println("After delete element at position: " + posDel);
        show(plusArray);
    }
}
