package codeWars.Easy;

public class TheHighesProfitWins {
    class MinMax {
        public static int[] minMax(int[] arr) {
            int min = arr[0];
            int max = arr[0];
            for(int i = 0; i < arr.length; i++){
                if(arr[i] < min)
                    min = arr[i];
                if(arr[i] > max)
                    max = arr[i];
            }
            return new int[] {min, max};
        }
    }
}
