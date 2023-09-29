package binary_tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author : leo220yuyaodog
 * @date : 2023-09-27 14:47
 */
public class BinaryTreeDfs {
    static List<Integer> list = new ArrayList<>();

    public static void preOrder(TreeNode root){
        if(root == null){
            return;
        }
        list.add(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }

    /* 中序遍历 */
    static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        // 访问优先级：左子树 -> 根节点 -> 右子树
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
    }

    /* 后序遍历 */
    static void postOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        // 访问优先级：左子树 -> 右子树 -> 根节点
        postOrder(root.left);
        postOrder(root.right);
        list.add(root.val);
    }

    public static void main(String[] args) {
        /* 初始化二叉树 */
        // 这里借助了一个从数组直接生成二叉树的函数
        TreeNode root = TreeNode.listToTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println("\n初始化二叉树\n");

        /* 前序遍历 */
        list.clear();
        preOrder(root);
        System.out.println("\n前序遍历的节点打印序列 = " + list);

        /* 中序遍历 */
        list.clear();
        inOrder(root);
        System.out.println("\n中序遍历的节点打印序列 = " + list);

        /* 后序遍历 */
        list.clear();
        postOrder(root);
        System.out.println("\n后序遍历的节点打印序列 = " + list);
    }
}
