//package org.example.second;
//
//import java.util.ArrayList;
//import java.util.*;
//
//enum Color {
//    RED, GREEN
//}
//
//abstract class Tree {
//    private int value;
//    private Color color;
//    private int depth;
//    public Tree(int value, Color color, int depth) {
//        this.value = value;
//        this.color = color;
//        this.depth = depth;
//    }
//    public int getValue() {
//        return value;
//    }
//    public Color getColor() {
//        return color;
//    }
//    public int getDepth() {
//        return depth;
//    }
//    public abstract void accept(TreeVis visitor);
//}
//
//class TreeNode extends Tree {
//    private ArrayList<Tree> children = new ArrayList<>();
//    public TreeNode(int value, Color color, int depth) {
//        super(value, color, depth);
//    }
//
//    public void accept(TreeVis visitor) {
//        visitor.visitNode(this);
//        for (Tree child : children) {
//            child.accept(visitor);
//        }
//    }
//    public void addChild(Tree child) {
//        children.add(child);
//    }
//}
//
//class TreeLeaf extends Tree {
//    public TreeLeaf(int value, Color color, int depth) {
//        super(value, color, depth);
//    }
//
//    public void accept(TreeVis visitor) {
//        visitor.visitLeaf(this);
//    }
//
//}
//
//abstract class TreeVis {
//    public abstract int getResult();
//    public abstract void visitNode(TreeNode node);
//    public abstract void visitLeaf(TreeLeaf leaf);
//}
//
//class SumInLeavesVisitor extends TreeVis {
//    int result = 0;
//    public int getResult() {
//        return result;
//    }
//
//    public void visitNode(TreeNode node) {
//        //implement this
//    }
//
//    public void visitLeaf(TreeLeaf leaf) {
//        result += leaf.getValue();
//    }
//}
//
//class ProductOfRedNodesVisitor extends TreeVis {
//    long result = 1L;
//    public int getResult() {
//        return (int) result;
//    }
//
//    public void visitNode(TreeNode node) {
//
//        if (node.getColor().equals(Color.RED)){
//            result = result*node.getValue() % 1000000007;
//        }
//    }
//
//    public void visitLeaf(TreeLeaf leaf) {
//        if (leaf.getColor().equals(Color.RED)){
//            result = result*leaf.getValue() % 1000000007;
//        }
//    }
//}
//
//class FancyVisitor extends TreeVis {
//
//    int leafSum =0;
//    int nodeSum = 0;
//    public int getResult() {
//
//
//        return Math.abs(nodeSum-leafSum);
//    }
//
//    public void visitNode(TreeNode node) {
//        if (node.getDepth()%2==0){
//            nodeSum +=node.getValue();
//        }
//        //implement this
//    }
//
//    public void visitLeaf(TreeLeaf leaf) {
//        if (leaf.getColor().equals(Color.GREEN)){
//            leafSum+=leaf.getValue();
//        }
//    }
//}
//
//public class Solution14 {
//    public static Tree solve(){
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        sc.nextLine();
//        int[] values = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
//        int[] color = Arrays.stream(sc.nextLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
//
//        Map<Integer,Tree> treeMap = new TreeMap<>();
//        Map<Integer,Integer> map = new HashMap<>();
//        Map<Integer,List<Integer>> edgesMap = new HashMap<>();
//
//        while (n-->1){
//            int a = sc.nextInt();
//            int b = sc.nextInt();
//
//            if (edgesMap.containsKey(a)){
//                edgesMap.get(a).add(b);
//                edgesMap.get(a).sort(Integer::compareTo);
//            } else {
//                List<Integer> list = new ArrayList<>();
//                list.add(b);
//                edgesMap.put(a,list);
//            }
//
//
//            if (map.containsKey(a)){
//                map.put(a, map.get(a)+1);
//            }else {
//                map.put(a,1);
//            }
//
//            if (map.containsKey(b)){
//                map.put(b, map.get(b)+1);
//            }else {
//                map.put(b,1);
//            }
//        }
//
//        treeMap.put(1,new TreeNode(values[0],color[0] == 0 ? Color.RED : Color.GREEN,0 ));
//
//        for (Map.Entry<Integer, List<Integer>> entry : edgesMap.entrySet()) {
//
//            int first = entry.getKey();
//
//            for (int i = 0; i < entry.getValue().size(); i++) {
//
//                int ft = first;
//                int second = entry.getValue().get(i);
//
//                if (treeMap.containsKey(ft) && treeMap.containsKey(second)) {
//                    continue;
//                } else if (!treeMap.containsKey(ft) && !treeMap.containsKey(second)){
//
//                    for (int j = 0; j < edgesMap.get(ft).size() ; j++) {
//                        int found = edgesMap.get(ft).get(j);
//                        if (treeMap.containsKey(found)){
//                            second = ft;
//                            ft = found;
//                            i--;
//                            break;
//                        }
//                    }
//                    if (!treeMap.containsKey(ft) && !treeMap.containsKey(second)){
//
//                        for (int j = 0; j < edgesMap.get(ft+1).size() ; j++) {
//                            int found = edgesMap.get(ft+1).get(j);
//                            if (treeMap.containsKey(found)){
//                                second = ft+1;
//                                ft = found;
//                                i--;
//                                break;
//                            }
//                        }
//                    }
//                }
//
//                if (!treeMap.containsKey(ft)) {
//                    int temp = ft;
//                    ft = second;
//                    second = temp;
//                }
//
//                Tree firstNode = treeMap.get(ft);
//
//
//                if (map.get(second)>1) {
//                    treeMap.put(second, new TreeNode(values[second - 1], color[second - 1] == 0 ? Color.RED : Color.GREEN, firstNode.getDepth() + 1));
//                } else {
//                    treeMap.put(second, new TreeLeaf(values[second - 1], color[second - 1] == 0 ? Color.RED : Color.GREEN, firstNode.getDepth() + 1));
//                }
//
//                Tree secondNode = treeMap.get(second);
//                TreeNode node = (TreeNode) firstNode;
//                node.addChild(secondNode);
//
//
//            }
//        }
//        return treeMap.get(1);
//    }
//
//    public static void main(String[] args){
//        Tree root = solve();
//        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
//        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
//        FancyVisitor vis3 = new FancyVisitor();
//
//        root.accept(vis1);
//        root.accept(vis2);
//        root.accept(vis3);
//
//        int res1 = vis1.getResult();
//        int res2 = vis2.getResult();
//        int res3 = vis3.getResult();
//
//        System.out.println(res1);
//        System.out.println(res2);
//        System.out.println(res3);
//
//        System.out.println(root);
//
//
//    }
//}