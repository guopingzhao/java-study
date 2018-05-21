package top.zgpv_04;

public class ListTool {
    public static String bubble(byte[] bytes) {
        byte[] narr = bytes.clone();

        for(int i = 0; i < narr.length; i++) {
            for(int j = 1; j < narr.length - i; j++) {
                if (narr[j - 1] > narr[j]) {
                    byte temp = narr[j - 1];
                    narr[j - 1] = narr[j];
                    narr[j] = temp;
                }
            }
        }
        return new String(narr);
    }

    public static int[] bubble(int[] arr) {
        int[] narr = arr.clone();

        for(int i = 0; i < narr.length; i++) {
            for(int j = 1; j < narr.length - i; j++) {
                if (narr[j - 1] > narr[j]) {
                    int temp = narr[j - 1];
                    narr[j - 1] = narr[j];
                    narr[j] = temp;
                }
            }
        }

        return narr;
    }

    public static int[] choice(int[] arr) {
        int[] narr = arr.clone();
        for(int i = 0; i < narr.length; i++) {
            for(int j = i + 1; j < narr.length; j++) {
                if (narr[i] > narr[j]) {
                    int temp = narr[i];
                    narr[i] = narr[j];
                    narr[j] = temp;
                }
            }
        }

        return narr;
    }
    public static int twoPoint(int[] arr, int value) {
        int min = 0;
        int max = arr.length;


        while (min <= max) {
            int mid = Math.round((min + max) / 2);

            if (arr[mid] == value) return mid;
            if (arr[mid] > value) {
                max = mid - 1;
                mid = Math.round((min + max) / 2);
            } else if(arr[mid] > value) {
                min = mid + 1;
                mid = Math.round((min + max) / 2);
            }
        }
        return -1;
    }

    public static int baseSearch(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
}
