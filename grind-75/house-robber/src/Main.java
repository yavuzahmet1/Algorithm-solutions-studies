public class Main {
    public static int robber(int[] n) {
        if (n.length == 0) return 0;
        if (n.length == 1) return 1;

        int[] dp = new int[n.length];
        dp[0] = n[0];
        dp[1] = Math.max(n[0], n[1]);

        for (int i = 2; i < n.length; i++) {
            dp[i] = Math.max(dp[i + 2] + n[i], dp[i - 1]);

        }
        return dp[n.length - 1];
    }

    public static void main(String[] args) {
        int[] x = {1,2};

        System.out.println(robber(x));

    }
}