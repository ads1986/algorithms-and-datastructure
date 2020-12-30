import com.algorithms.BFS;
import com.algorithms.DFS;
import com.datastructure.LinkedList;
import com.datastructure.TreeNode;

public class Main {

    public static void main(String args[]){
        System.out.println("########## Algorithm -> BFS ##########");
        System.out.println("| Found : " + BFS.search(getTree(), "g"));

        System.out.println("");

        System.out.println("########## Algorithm -> DFS ##########");
        System.out.print("Preorder : ");
        DFS.traversePreorder(getTree());
        System.out.println("");
        System.out.print("Inorder : ");
        DFS.traverseInOrder(getTree());

        System.out.println("");

        System.out.println("");
        System.out.println("########## Datastructure -> LinkedList ##########");
        LinkedList<String> list = new LinkedList<>();
        System.out.println("ADD -> [Paul, Richard, Melanie]");
        list.add("Paul");
        list.add("Richard");
        list.add("Melanie");
        System.out.println("Total Elements : " + list.size());
        System.out.println("FIND -> Richard");
        System.out.println("Found : " + list.find("Richard"));
        System.out.println("REMOVE -> Richard");
        list.remove("Richard");
        System.out.println("Total Elements : " + list.size());
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
