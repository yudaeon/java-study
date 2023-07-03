package boj;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

//토마토 7569
public class Main {
    private final int[] dx = {-1, 1, 0, 0, 0, 0};
    private final int[] dy = {0, 0, -1, 1, 0, 0};
    private final int[] dh = {0, 0, 0, 0, -1, 1};
    private int x;
    private int y;
    private int h;

    public int solution() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer infoParser = new StringTokenizer(reader.readLine());
        x = Integer.parseInt(infoParser.nextToken());
        y = Integer.parseInt(infoParser.nextToken());
        h = Integer.parseInt(infoParser.nextToken());
        int[][][] tomatoRack = new int[h][y][x];

        Queue<int[]> toVisit = new LinkedList<>();


        for (int i = 0; i < h; i++) {
            for (int j = 0; j < y; j++) {
                StringTokenizer tomatoStore = new StringTokenizer(reader.readLine());
                for (int k = 0; k < x; k++) {
                    int tomato = Integer.parseInt(tomatoStore.nextToken());
                    // 입력을 받으면서 이미 익은 토마토를 첫 방문대상으로 기록합니다.
                    if(tomato == 1) {
                        toVisit.add(new int[]{i, j, k, 0});
                    }
                    tomatoRack[i][j][k] = tomato;
                }
            }
        }

        int days = 0;
        while (!toVisit.isEmpty()) {
            int [] tomato = toVisit.poll();

            // 이번 토마토가 익은 시간이 현재 기록된 걸린시간보다 길 경우 갱신합니다.
            if (days != tomato[3]) days = tomato[3];

            // 상하좌우 + 위 아래까지 체크합니다.
            for (int i = 0; i < 6; i++) {
                int nextH = tomato[0] + dh[i];
                int nextY = tomato[1] + dy[i];
                int nextX = tomato[2] + dx[i];
                // 영역을 벗어나지 않으면서 익지 않은 토마토들을 방문대상으로 기록합니다.
                if (
                        checkBounds(nextX, nextY, nextH)
                                && tomatoRack[nextH][nextY][nextX] == 0
                ) {
                    // 이중으로 방문하지 않기 위해 방문 표시를 합니다.
                    tomatoRack[nextH][nextY][nextX] = 1;
                    // 이 토마토는 내일 익습니다.
                    toVisit.offer(new int[]{nextH, nextY, nextX, tomato[3] + 1});
                }
            }
        }

        for (int i = 0; i < this.h; i++) {
            for (int j = 0; j < this.y; j++) {
                for (int k = 0; k < this.x; k++) {
                    // 하나라도 익지 않은 토마토가 있다면 -1
                    if (tomatoRack[i][j][k] == 0) return -1;
                }
            }
        }
        // 아니라면 여태 소요 시간
        return days;
    }

    private boolean checkBounds(int x, int y, int h) {
        return
                -1 < x && x < this.x
                        && -1 < y && y < this.y
                        && -1 < h && h < this.h;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(new Main().solution());
    }
}