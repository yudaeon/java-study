package algorithm;

import java.util.Arrays;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = {0, 1, 4, 4, 3, 0, 5, 2, 5, 1};
        int n = arr.length;

        //최대값 최소값 찾기
        int max = 5;
        int min = 0;
        int k = max - min + 1;

        //자료가 몇번 등장했는지 기록용 배열
        int[] counts = new int[k];

        //counts 배열 채우기
        for (int data : arr) {
            counts[data]++;
        }
        System.out.println(Arrays.toString(counts));

        //counts 누적합
        for (int i = 0; i < k - 1; i++) {
            //counts[i+1] = counts[i+1] + counts[i]
            counts[i + 1] += counts[i];
        }
        System.out.println(Arrays.toString(counts));

        int[] output = new int[n];
        // 뒤에서 부터 순회하여 output에 저장
        for (int i = n-1; i >= 0; i--) {
            // 현재 데이터를 인덱스로 counts배열에 데이터 값 회수
            counts[arr[i]]--;
            int position = counts[arr[i]];
            output[position] = arr[i];

        }
        System.out.println(Arrays.toString(output));
    }
}