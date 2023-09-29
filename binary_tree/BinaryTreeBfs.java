package binary_tree;

import java.util.*;

/**
 * @author : leo220yuyaodog
 * @date : 2023-09-27 14:25
 */
public class BinaryTreeBfs {

    public static List<Integer> levelOrder(TreeNode root) {
        // 初始化队列
        Queue<TreeNode> queue = new LinkedList<>();
        List<Integer> res = new ArrayList<>();
        // 将根节点入队
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode node = queue.poll();
            res.add(node.val);
            // 将队列中的元素出队加入结果集，并奖不为空的左右节点加入队列
            if(node.left!= null){
                queue.offer(node.left);
            }
            if(node.right!= null){
                queue.offer(node.right);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        /* 初始化二叉树 */
        // 这里借助了一个从数组直接生成二叉树的函数
        TreeNode root = TreeNode.listToTree(Arrays.asList(1, 2, 3, 4, 5, 6, 7));
        System.out.println("\n初始化二叉树\n");

        /* 层序遍历 */
        List<Integer> list = levelOrder(root);
        System.out.println("\n层序遍历的节点打印序列 = " + list);
    }
}
