class Solution {
    List<List<Integer>> result = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtrack(candidates, target, 0, new ArrayList<>());
        return result;
    }

    void backtrack(int[] c, int target, int start, List<Integer> path) {
        if (target == 0) {
            result.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < c.length; i++) {
            if (c[i] > target) continue;

            path.add(c[i]);
            backtrack(c, target - c[i], i, path);
            path.remove(path.size() - 1);
        }
    }
}