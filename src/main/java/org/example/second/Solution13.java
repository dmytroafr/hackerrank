package org.example.second;

import java.util.ArrayList;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

enum Color {
    RED, GREEN
}

abstract class Tree {
    private int value;
    private Color color;
    private int depth;
    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }
    public int getValue() {
        return value;
    }
    public Color getColor() {
        return color;
    }
    public int getDepth() {
        return depth;
    }
    public abstract void accept(TreeVis visitor);

}

class TreeNode extends Tree {
    private ArrayList<Tree> children = new ArrayList<>();
    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);
        for (Tree child : children) {
            child.accept(visitor);
        }
    }
    public void addChild(Tree child) {
        children.add(child);
    }

}

class TreeLeaf extends Tree {
    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }

}

abstract class TreeVis {
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);
}

class SumInLeavesVisitor extends TreeVis {
    int result = 0;
    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    int result = 0;
    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {

        if (node.getColor().equals(Color.RED)){
            if (result==0){
                result= node.getValue();
            } else {
                result *= node.getValue();
            }
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor().equals(Color.RED)){
            if (result==0){
                result=leaf.getValue();
            } else {
                result *= leaf.getValue();
            }
        }
    }
}

class FancyVisitor extends TreeVis {

    int leafSum =0;
    int nodeSum = 0;
    public int getResult() {


        return Math.abs(nodeSum-leafSum);
    }

    public void visitNode(TreeNode node) {
        if (node.getDepth()%2==0){
            nodeSum +=node.getValue();
        }
        //implement this
    }

    public void visitLeaf(TreeLeaf leaf) {
        if (leaf.getColor().equals(Color.GREEN)){
            leafSum+=leaf.getValue();
        }
    }
}

public class Solution13 {
    public static Tree solve(){
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

        for (List<Integer> integerList : listList) {

            int first = Math.min(integerList.get(0), integerList.get(1));
            int second = Math.max(integerList.get(0), integerList.get(1));

            TreeNode treeNode = (TreeNode) treeList.get(first - 1);

            Tree node;
            if (map.get(second) > 1) {
                node = new TreeNode(values[second - 1], color[second - 1] == 0 ? Color.RED : Color.GREEN, treeNode.getDepth() + 1);
            } else {
                node = new TreeLeaf(values[second - 1], color[second - 1] == 0 ? Color.RED : Color.GREEN, treeNode.getDepth() + 1);
            }
            treeList.add(node);
            treeNode.addChild(node);

        }

        return root;
    }

    public static void main(String[] args){
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}