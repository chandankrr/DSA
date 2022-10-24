package greedy_18;

import java.util.ArrayList;

class Job {
    char id;
    int deadline, profit;

    public Job(char id, int deadline, int profit) {
        this.id = id;
        this.deadline = deadline;
        this.profit = profit;
    }
}

public class JobSequencingProblem_04 {

    public static char[] jobScheduling(ArrayList<Job> arrList, int time) {
        int n = arrList.size();

        arrList.sort((a, b) -> b.profit - a.profit);

        boolean[] result = new boolean[time];
        char[] job = new char[time];

        for (int i = 0; i < n; i++) {
            for (int j = Math.min(time - 1, arrList.get(i).deadline - 1); j >= 0; j--) {
                if (!result[j]) {
                    result[j] = true;
                    job[j] = arrList.get(i).id;
                    break;
                }
            }
        }

        return job;
    }

    public static void main(String[] args) {
        ArrayList<Job> arrList = new ArrayList<>();

        arrList.add(new Job('a', 2, 100));
        arrList.add(new Job('b', 1, 19));
        arrList.add(new Job('c', 2, 27));
        arrList.add(new Job('d', 1, 25));
        arrList.add(new Job('e', 3, 15));

        int time = 3;

        char[] jobs = jobScheduling(arrList, time);

        for(char ch : jobs) {
            System.out.print(ch + " ");
        }
    }
}
