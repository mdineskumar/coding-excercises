package datastructure.greedy;

public class GasStation {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas > 0 && totalGas < totalCost) return -1;

        for (int i = 0; i < n; i++) {
            int currentGas = 0;
            int startIndex = i;
            int nextIndex = i;
            while(currentGas + gas[nextIndex] >= cost[nextIndex]) {
                currentGas = currentGas + gas[nextIndex] - cost[nextIndex];
                nextIndex = (nextIndex + 1) % n;
                if(nextIndex == startIndex){
                    return startIndex;
                }
            }

        }
        return -1;
    }

    public int canCompleteCircuitV2(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < n; i++) {
            totalGas += gas[i];
            totalCost += cost[i];
        }

        if(totalGas > 0 && totalGas < totalCost) return -1;

        int currentGas = 0, startIndex =0;
        for (int i = 0; i < n; i++) {
            currentGas += gas[i] - cost[i];

            if(currentGas < 0) {
                startIndex += 1;
                currentGas = 0;
            }
        }
        return startIndex;
    }
    public static void main(String[] args) {
        GasStation gs = new GasStation();
        System.out.println(gs.canCompleteCircuitV2(new int[]{1,2,3,4,5},new int[]{3,4,5,1,2}));
        System.out.println(gs.canCompleteCircuitV2(new int[]{2,3,4},new int[]{3,4,3}));

    }
}
