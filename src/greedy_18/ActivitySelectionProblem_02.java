package greedy_18;

import java.util.ArrayList;
import java.util.Arrays;

class Pair {
    int x, y;

    public Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return "{" + x + ", " + y + "}";
    }
}

public class ActivitySelectionProblem_02 {

    // time complexity: O(nlogn)
    public static ArrayList<Pair> maxActivity(Pair[] activity) {
        ArrayList<Pair> arrList = new ArrayList<>();

        // Arrays.sort(activity, new Comparator<Pair>() {
        //     @Override
        //     public int compare(Pair p1, Pair p2) {
        //         return p1.y - p2.y;
        //     }
        // });

        Arrays.sort(activity, (p1, p2) -> p1.y - p2.y);

        int i = 0;
        arrList.add(new Pair(activity[i].x, activity[i].y));

        for (int j = 1; j < activity.length; j++) {
            if (activity[j].x >= activity[i].y) {
                arrList.add(new Pair(activity[j].x, activity[j].y));
                i = j;
            }
        }

        return arrList;
    }


    public static void main(String[] args) {
        Pair[] activity = {new Pair(3, 8),
                new Pair(2, 4),
                new Pair(1, 3),
                new Pair(10, 11)};

        System.out.println(maxActivity(activity));
        System.out.println(maxActivity(activity).size());

    }
}
