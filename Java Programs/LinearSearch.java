//Time complexity = Big O(n)
public class LinearSearch {
    static int search(int val, int arr[]) {
        int len = arr.length;
        for (int i = 0; i < len; i++) {
            if (arr[i] == val) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 23, 3, 34, 4, 6, 7, 68, 9, 0, 0, 5, 34, 3 };
        int result = search(20000, arr);
        if (result != -1) {
            System.out.println("element is present at postion : " + result + " and its index is : " + (result + 1));
        }
        System.out.println("Element Not Found");
    }
}
