package queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstSearch {
    public void solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int maxNodes = Integer.parseInt(reader.readLine());
        // 인접 정보 저장용
        int[][] adjMap = new int[maxNodes + 1][maxNodes + 1];

        String[] edges = reader.readLine().split(" ");
        // BFS를 할때 연결 정보를 표현하는 방식은 크게 두가지가 있는데, 아래는
        // 2차원 배열을 좌표로 구분하는 방법이다.
        for (int i = 0; i < edges.length / 2; i++) {
            int leftNode = Integer.parseInt(edges[i * 2]);
            int rightNode = Integer.parseInt(edges[i * 2 + 1]);
            adjMap[leftNode][rightNode] = 1;
            adjMap[rightNode][leftNode] = 1;
        }

        Queue<Integer> toVisit = new LinkedList<>();
        List<Integer> visitedOrder = new ArrayList<>();
        boolean[]visited = new boolean[maxNodes+1];
        // 첫방문 대상
        int next = 1;
        // 큐에 넣어둔다.
        toVisit.offer(next);
        while (!toVisit.isEmpty()){
            //다음 방문할 곳을 가져온다.
            next = toVisit.poll();
            // 이미 방문했다면 다음 방문으로
            if (visited[next]) continue;

            //방문했다 표시
            visited[next] = true;
            // 방문한 순서 기록
            visitedOrder.add(next);

            //다음 방문 대상으로 검색한다.
            for (int i = 0; i < maxNodes + 1; i++) {
                if (adjMap[next][i] == 1 && !visited[i]){
                    toVisit.offer(i);
                }
            }
        }
        // 출력
        System.out.println(visitedOrder);
    }

    //BFS
    //다음 방문 대상 기록용 Queue
    public static void main(String[] args) throws IOException {
        new BreadthFirstSearch().solution();
    }
}
