package org.example.second;

import java.util.ArrayList;
import java.util.*;
public class Some {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        int[] values = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int[] color = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        Map<Integer,Tree> treeMap = new TreeMap<>();
        Map<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> listList = new ArrayList<>();
        Map<Integer,List<Integer>> edgesMap = new HashMap<>();

        while (n-->1){
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (edgesMap.containsKey(a)){
                edgesMap.get(a).add(b);
                edgesMap.get(a).sort(Comparator.comparingInt(Integer::intValue));
            } else {
                List<Integer> list = new ArrayList<>();
                list.add(b);
                edgesMap.put(a,list);
            }
        }

        System.out.println(edgesMap);

    }

}
