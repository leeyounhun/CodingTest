class Solution {
    public long solution(int price, int money, int count) {
        long answer = 0;
        long nPrince = price;
        long sum = 0;
        for (int i = 0; i < count; i++) {
            sum += nPrince;
            nPrince += price;
        }
        if (money - sum >= 0)
            answer = 0;
        else
            answer = Math.abs(money - sum) ;
        return answer;
    }
}