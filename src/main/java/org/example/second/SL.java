package org.example.second;

import java.util.*;
import java.util.stream.Stream;

public class SL {
    public static void main(String[] args) {
        TreeNode root;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        int[] values = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        int[] color = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();

        List<Tree> treeList = new ArrayList<>();
        Map<Integer,Integer> map = new HashMap<>();
        List<List<Integer>> listList = new ArrayList<>();
        while (n-->1){
            List<Integer> inter = new ArrayList<>();
            inter.add(sc.nextInt());
            inter.add(sc.nextInt());
            listList.add(inter);
        }
        for (int i = 1; i <= listList.size(); i++) {
            int first = listList.get(i-1).get(0);
            int second = listList.get(i-1).get(1);

            if (map.containsKey(first)){
                map.put(first, map.get(first)+1);
            }else {
                map.put(first,1);
            }
            if (map.containsKey(second)){
                map.put(second, map.get(second)+1);
            }else {
                map.put(second,1);
            }
        }
        root = new TreeNode(values[0],color[0]==0?Color.RED:Color.GREEN,0 );
        treeList.add(root);

        for (int i = 0; i < listList.size(); i++) {

            int first = Math.min(listList.get(i).get(0),listList.get(i).get(1));
            int second = Math.max(listList.get(i).get(0),listList.get(i).get(1));

            TreeNode treeNode = (TreeNode) treeList.get(first-1);

            Tree node;
            if (map.get(second)>1){
                node = new TreeNode(values[second-1],color[second-1]==0?Color.RED:Color.GREEN,treeNode.getDepth()+1 );
            } else {
                node = new TreeLeaf(values[second-1],color[second-1]==0?Color.RED:Color.GREEN,treeNode.getDepth()+1);
            }
            treeList.add(node);
            treeNode.addChild(node);

        }

        System.out.println(map);
        System.out.println(root);
    }
}
