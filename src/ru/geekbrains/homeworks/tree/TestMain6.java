package ru.geekbrains.homeworks.tree;

import javax.imageio.plugins.jpeg.JPEGImageReadParam;
import java.util.Random;

public class TestMain6 {

    private static int treeNum = 20;
    private static int LEVEL = 6;

    public static void main(String[] args) {

        int sumBalancedTree = 0;

        for (int i = 0; i<treeNum; i++) {
            Tree<Integer> tree = new TreeImpl<>(LEVEL);
            putNumInTree(tree);
            tree.display();
            System.out.println(tree.isBalanced());
            if (tree.isBalanced()) {
                sumBalancedTree++;
            }
        }
        System.out.println(sumBalancedTree);
        double noBalancedTree = (double)(treeNum - sumBalancedTree);
        double per = noBalancedTree/treeNum*100;
        System.out.println("Несбалансированных деревьев " + per + " процентов!");

    }

    public static int generateValue() {
        Random random = new Random();
        int value = -100 + random.nextInt(100 - (-100) +1);
        return value;
    }

    public static void putNumInTree(Tree tree) {
        boolean flag = true;
        while (flag) {
            flag = tree.add(generateValue());
        }
    }


}
