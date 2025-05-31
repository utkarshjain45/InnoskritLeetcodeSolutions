import java.util.*;

public class prblm2225 {

        public static List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> map = new HashMap<>();
        for (var e : matches) {
            map.putIfAbsent(e[0], 0);
            map.merge(e[1], 1, Integer::sum);
        }
        System.out.println(map);
        List<List<Integer>> ans = List.of(new ArrayList<>(), new ArrayList<>());
        for (var e : map.entrySet()) {
            if (e.getValue() < 2) {
                ans.get(e.getValue()).add(e.getKey());
            }
        }
        Collections.sort(ans.get(0));
        Collections.sort(ans.get(1));
        return ans;
    }

    public static void main(String[] args) {
        int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
        List<List<Integer>> list = new ArrayList<>();
        list = findWinners(matches);
        for (List<Integer> game : list) {
            System.out.println(game);
        }
    }
}
// import java.util.*;

// public class prblm2225 {
    
//     public static List<List<Integer>> findWinners(int[][] matches) {
//         Map<Integer,Integer> winMap = new HashMap<>();
//         Map<Integer,Integer> loseMap = new HashMap<>();
//         for(int i = 0; i < matches.length; i++){
//             winMap.put(matches[i][0], winMap.getOrDefault(matches[i][0], 0) + 1);
//             loseMap.put(matches[i][1], loseMap.getOrDefault(matches[i][1], 0) + 1);
//         }

//         System.out.println(winMap);
//         System.out.println(loseMap);

//         List<Integer> winner = new ArrayList<>(); 
//         List<Integer> loser = new ArrayList<>(); 
//         List<List<Integer>> winOrLose = new ArrayList<>(); 

//         for(int i = 0; i < matches.length; i++){
//             for (int j = 0; j < matches[i].length; j++) {
//                 if (winMap.containsKey(matches[i][j]) && !loseMap.containsKey(matches[i][j]) && !winner.contains(matches[i][j])) {
//                     winner.add(matches[i][j]);
//                 }
//                 else if (loseMap.containsKey(matches[i][j]) && !loser.contains(matches[i][j])) {
//                     if (loseMap.get(matches[i][j]) == 1) {
//                         loser.add(matches[i][j]);
//                     }
//                 }
//             }
//         }
//         Collections.sort(winner);
//         Collections.sort(loser);
//         winOrLose.add(winner);
//         winOrLose.add(loser);
//         return winOrLose;
//     }

//     public static void main(String[] args) {
//         int[][] matches = {{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}};
//         List<List<Integer>> list = new ArrayList<>();
//         list = findWinners(matches);
//         for (List<Integer> game : list) {
//             System.out.println(game);
//         }
//     }
// }
