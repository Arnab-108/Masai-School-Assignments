import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        Set<Integer> sums = new HashSet<>();
        sums.add(0);
        for (int coin : coins) {
            Set<Integer> newSums = new HashSet<>(sums);
            for (int sum : sums) {
                newSums.add(sum + coin);
            }
            sums.addAll(newSums);
        }
        List<Integer> sortedSums = new ArrayList<>(sums);
        Collections.sort(sortedSums);
        sortedSums.remove(0);
        System.out.println(sortedSums.size());
        for (int sum : sortedSums) {
            System.out.print(sum + " ");
        }
    }
}
