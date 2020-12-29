import com.algorithms.BFS;
import com.algorithms.DFS;
import com.datastructure.TreeNode;

public class Main {

    public static void main(String args[]){
        //BFS
        System.out.println("########## BFS ##########");
        System.out.println("| Found : " + BFS.search(getTree(), "g"));

        //DFS
        System.out.println("########## DFS ##########");
        System.out.print("Preorder : ");
        DFS.traversePreorder(getTree());
        System.out.println("");
        System.out.print("Inorder : ");
        DFS.traverseInOrder(getTree());
    }


    /**
     * Create a Tree Data Structure
     *
     *          (f)
     *         /   \
     *      (d)    (k)
     *     /  \    /  \
     *   (b) (e) (g) (l)
     *   / \     /
     *(a)  (c)  (h)
     *            \
     *            (j)
     * @return
     */
    public static TreeNode getTree(){
        TreeNode j = new TreeNode("J");
        TreeNode h = new TreeNode("H", null, j);
        TreeNode g = new TreeNode("G", h, null);
        TreeNode l = new TreeNode("L");
        TreeNode k = new TreeNode("K", g, l);

        TreeNode c = new TreeNode("C");
        TreeNode a = new TreeNode("A");
        TreeNode b = new TreeNode("B", a, c);
        TreeNode e = new TreeNode("E");
        TreeNode d = new TreeNode("D", b, e);

        return new TreeNode("F", d, k);
    }

}