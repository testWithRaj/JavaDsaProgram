package Day_5_Array;

public class FrequencyOfAllElements {

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 2, 4, 2, 5};

        // Outer loop picks each element
        for(int i = 0; i < arr.length; i++) {

            // To check if element already counted
            boolean isVisited = false;
            
            for(int j = 0; j < i; j++) {
                if(arr[i] == arr[j]) {
                    isVisited = true;
                    break;
                }
            }

            // If element already counted, skip it
            if(isVisited) {
                continue;
            }

            // Count frequency
            int count = 0;
            for(int k = 0; k < arr.length; k++) {
                if(arr[i] == arr[k]) {
                    count++;
                }
            }

            System.out.println("Element " + arr[i] + " occurs " + count + " times");
        }
    }
}
