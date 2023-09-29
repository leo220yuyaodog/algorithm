package graph;

import java.util.ArrayList;
import java.util.List;

/**
 * @author : leo220yuyaodog
 * @date : 2023-09-27 15:09
 */
public class GraphAdjacentMatrix<E> {
    List<E> vertexList;
    List<List<Integer>> edgeMatrix;

    public GraphAdjacentMatrix(E[] vertexList, E[][] edges) {
        this.vertexList = new ArrayList<>();
        this.edgeMatrix = new ArrayList<>();

        for (E vertex : vertexList) {
            addVertex(vertex);
        }

        for (E[] e : edges) {
            addEdge(e[0], e[1]);
        }
    }

    public int size() {
        return vertexList.size();
    }

    public void addVertex(E vertex) {
        // 先给边矩阵添加一行
        int n = size();
        List<Integer> newRow = new ArrayList<>(n);
        for (int j = 0; j < n; j++) {
            newRow.add(0);
        }
        edgeMatrix.add(newRow);

        // 把顶点加入邻接矩阵的顶点列表
        vertexList.add(vertex);

        // 给每一行添加一个元素
        for (List<Integer> row : edgeMatrix) {
            row.add(0);
        }
    }

    public void addEdge(E i, E j) {
        // 找到 i 和 j 的索引
        int iIndex = vertexList.indexOf(i);
        int jIndex = vertexList.indexOf(j);

        // 判断是否越界
        if (iIndex < 0 || jIndex < 0 || iIndex >= edgeMatrix.size() || jIndex >= edgeMatrix.size()) {
            throw new IndexOutOfBoundsException();
        }

        edgeMatrix.get(iIndex).set(jIndex, 1);
        edgeMatrix.get(jIndex).set(iIndex, 1);
    }

    public static void main(String[] args) {
        Integer[] vertexes = {1, 2, 3, 4, 5};
        Integer[][] edges = {{1, 2}, {1, 3}, {2, 4}, {3, 4}, {4, 5}};
        GraphAdjacentMatrix<Integer> graph = new GraphAdjacentMatrix<>(vertexes, edges);
        System.out.println(graph.edgeMatrix);
    }
}
