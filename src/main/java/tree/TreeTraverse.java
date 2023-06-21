package tree;

import com.sun.source.tree.Tree;

public class TreeTraverse {
    private int nodes;
    private int[] arr; //이진트리를 표현하기 위한 배열

    // { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11}
    public void setArr(int[] arr ){
        this.arr = arr;
        this.nodes = arr.length;

    }
    //완전 이진트리 전위 순회 V -> L -> R
    //preorder(): System.out.println(V) -> preorder(L) -> preorder(R)
    public void traversPreorder(int node){
        if (node < this.nodes && arr[node] != 0)  {
            System.out.print(arr[node] + ", "); //방문한다.
            this.traversPreorder(node * 2); //왼쪽 자식(i * 2)을 루트로 다시 preorder 호출
            this.traversPreorder(node * 2 + 1); //오른쪽 자식(i * 2 + 1)을 루트로 다시 preorder 호출

        }
    }
    //완전 이진트리 중위 순회 L -> V -> R
    //inorder(): preorder(L) ->  System.out.println(V) -> preorder(R)
    public void traversInorder(int node){
        if (node < this.nodes && arr[node] != 0)  {
            this.traversInorder(node * 2); //왼쪽 자식(i * 2)을 루트로 다시 preorder 호출
            System.out.print(arr[node] + ", "); //나 방문
            this.traversInorder(node * 2 + 1); //오른쪽 자식(i * 2 + 1)을 루트로 다시 preorder 호출
        }
    }
    //완전 이진트리 후위 순회 L -> R ->  V
    //inorder(): preorder(L) ->  preorder(R) -> System.out.println(V)
    public void traversPostorder(int node){
        if (node < this.nodes && arr[node] != 0)  {
            this.traversPostorder(node * 2); //왼쪽 자식(i * 2)을 루트로 다시 preorder 호출
            this.traversPostorder(node * 2 + 1); //오른쪽 자식(i * 2 + 1)을 루트로 다시 preorder 호출
            System.out.print(arr[node] + ", "); //나 방문
        }
    }

    public static void main(String[] args) {
        TreeTraverse tree = new TreeTraverse();
        tree.setArr(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12});
        //전위순회
        tree.traversPreorder(1); // 처음 방문점은 root node
        System.out.println();
        //중위 순회
        tree.traversInorder(1);
        System.out.println();
        //후위 순회
        tree.traversPostorder(1);
        System.out.println();
    }
}
