class Solution {
    public int solution(String dirs) {
        int answer = 0;
        int[] moveX = {1, 0, -1, 0};
        int[] moveY = {0, 1, 0, -1};
        boolean[][][] visited = new boolean[11][11][4];
        int x = 5;
        int y = 5;
        for (int i = 0; i < dirs.length(); i++) {
            char temp = dirs.charAt(i);
            int move = 0;
            if (temp == 'U')
                move = 1;
            else if (temp == 'D')
                move = 3;
            else if (temp == 'R')
                move = 0;
            else
                move = 2;
            int nextX = x + moveX[move];
            int nextY = y + moveY[move];
            if (nextX < 0 || nextY < 0 || nextX > 10 || nextY > 10)
                continue;
            if (!visited[nextX][nextY][move]) {
                visited[nextX][nextY][move] = true;
                visited[x][y][(move + 2) % 4] = true;
                answer++;
            }
            x = nextX;
            y = nextY;
        }
        return answer;
    }
}