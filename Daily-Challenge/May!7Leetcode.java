class Solution {

    public static void canreach(int arr[], int start,
                                HashSet<Integer> set,
                                ArrayList<Integer> list,
                                boolean visited[]) {

        // out of bound
        if(start < 0 || start >= arr.length){
            return;
        }
        // already visited
        if(visited[start]){
            return;
        }
        visited[start] = true;
        // agar 0 mila
        if(set.contains(start)){
            list.add(start);
            return;
        }
        // right jump
        canreach(arr, start + arr[start], set, list, visited);
        // left jump
        canreach(arr, start - arr[start], set, list, visited);
    }

    public boolean canReach(int[] arr, int start) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] == 0){
                set.add(i);
            }
        }
        boolean visited[] = new boolean[arr.length];
        canreach(arr, start, set, list, visited);
        for(int i = 0; i < list.size(); i++){
            if(set.contains(list.get(i))){
                return true;
            }
        }
        return false;
    }
}