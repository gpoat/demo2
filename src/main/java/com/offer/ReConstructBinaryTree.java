package com.offer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Administrator on 2019/5/13.
 */
public class ReConstructBinaryTree {

    @Test
    public void test() {
        /*int[] nums = {1,2,4,7,3,5,6,8};
        System.out.println(Arrays.toString(Arrays.copyOfRange(nums, 0, 3)));*/
    }

    /**
     * 前序 {1,2,4,7,3,5,6,8}
     * 中序 {4,7,2,1,5,3,8,6}
     * @param pre
     * @param mid
     * @return
     */
    private BinaryTreeNode reConstructBinaryTree(int[] pre, int[] mid) {
        if(pre == null || mid == null || pre.length != mid.length) {
            throw new IllegalArgumentException("长度不一样， 非法输入！");
        }
        BinaryTreeNode root = new BinaryTreeNode(pre[0]);
        for(int i = 0; i < mid.length; i++) {
            if(mid[i] == pre[0]) {
                root.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(mid, 0, i));
                root.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(mid, i + 1, mid.length));
            }
        }
        return root;
    }
}

class BinaryTreeNode {
    int val;
    BinaryTreeNode left;
    BinaryTreeNode right;
    BinaryTreeNode(int i) {
        this.val = i;
    }
}