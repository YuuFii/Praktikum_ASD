public class Main {
    public static void main(String[] args) {
        int[] arr = {10, 8, 13, 15, 23};
        int[] arrSorted = {8, 10, 13, 15, 23};

        System.out.println(sequentialSearch(arr, 23));
        System.out.println();
        System.out.println(binarySearch(arrSorted, 12));
    }

    public static int sequentialSearch(int[] arr, int target){
        int n = arr.length;
        for(int i = 0; i < n; i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch (int[] arr, int target) {
        int awal = 0;
        int akhir = arr.length - 1;
        int tengah;
        while (awal <= akhir) {
            tengah = (awal + akhir) / 2;
            if (arr[tengah] == target) {
                return tengah;
            } else if (arr[tengah] > target) {
                akhir = tengah - 1;
            } else {
                awal = tengah + 1;
            }
        }
        return -1;
    }
}