import java.util.ArrayList;
import java.util.Arrays;

class oddEvenPos {
    public static void main(String[] args) {
        int arr[] = { 2, -1, -3, 3, 4, 1 ,-9,-8,-7};
        int n = arr.length;
        ArrayList<Integer> arrr = new ArrayList<>(Arrays.asList(2, -1, -3, 3, 4, 1,-9,-8,-7,-9,-9,-9));

        // pos=[2,3,4,1]
        // neg=[-1,-3]
        // [2,-1,3,-3]
        ArrayList<Integer> ans = Rearr(arrr, n);
        System.out.println(ans);
    }

    public static ArrayList<Integer> Rearr(ArrayList<Integer> arr, int n) {
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();

        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 0) {
                pos.add(arr.get(i));
            } else {
                neg.add(arr.get(i));
            }
        }
        if (pos.size() > neg.size()) {
            for (int i = 0; i < neg.size(); i++) {
                arr.set(2 * i, pos.get(i));
                arr.set((2 * i) + 1, neg.get(i));
            }
            int idx = neg.size() * 2;
            for (int i = neg.size(); i < pos.size(); i++) {
                arr.set(idx, pos.get(i));
                idx++;
            }
        } else {
            for (int i = 0; i < pos.size(); i++) {
                arr.set(2 * i, pos.get(i));
                arr.set((2 * i) + 1, neg.get(i));
            }
            int idx = pos.size() * 2;
            for (int i = pos.size(); i < neg.size(); i++) {
                arr.set(idx, neg.get(i));
                idx++;
            }
            ;
        }
        return arr;

    }
}
