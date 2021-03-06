import com.algorithms.BFS;
import com.algorithms.DFS;
import com.datastructure.Heap;
import com.datastructure.graph.Graph;
import com.datastructure.LinkedList;
import com.datastructure.Tree;
import com.datastructure.trie.Trie;

public class Main {

    public static void main(String args[]){
        System.out.println("########## Algorithm -> BFS ##########");
        System.out.println("| Found : " + BFS.search(createTree(), "g"));

        System.out.println("");

        System.out.println("########## Algorithm -> DFS ##########");
        System.out.print("Preorder : ");
        DFS.traversePreorder(createTree());
        System.out.println("");
        System.out.print("Inorder : ");
        DFS.traverseInOrder(createTree());

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

        System.out.println("########## Datastructure -> Graph ##########");
        Graph graph = createGraph();

        System.out.println("########## Datastructure -> Trie ##########");
        Trie trie = new Trie();
        System.out.println("Insert -> cars");
        trie.insert("cars");
        System.out.println("Search -> cars: " + trie.search("cars"));
        System.out.println("Search -> car: " + trie.search("car"));

        System.out.println("");

        System.out.println("########## Datastructure -> Heaps ##########");

        System.out.println("");

        int maxArr[] = {43,19,35,12,4,2,20,6};
        Heap maxHeap = new Heap(maxArr);
        System.out.println("[Max Heap]");
        System.out.println("Current -> " + maxHeap + " -> (Is Valid ? " + (maxHeap.isValidMaxHeap() ? "Yes" : "No") + ")");
        System.out.println("Inserting element -> 50");
        maxHeap.insert(50);
        System.out.println("Current -> " + maxHeap + " -> (Is Valid ? " + (maxHeap.isValidMaxHeap() ? "Yes" : "No") + ")");
        System.out.println("Removing element -> 50");
        maxHeap.remove(50);
        System.out.println("Current -> " + maxHeap + " -> (Is Valid ? " + (maxHeap.isValidMaxHeap() ? "Yes" : "No") + ")");

        System.out.println("");

        int minArr[] = {5,12,20,25,13};
        Heap minHeap = new Heap(minArr);
        System.out.println("[Min Heap]");
        System.out.println("Current -> " + minHeap + " -> (Is Valid ? " + (minHeap.isValidMinHeap() ? "Yes" : "No") + ")");
        System.out.println("Inserting element -> 1");
        minHeap.insert(1);
        System.out.println("Current -> " + minHeap + " -> (Is Valid ? " + (minHeap.isValidMinHeap() ? "Yes" : "No") + ")");
        System.out.println("Removing element -> 1");
        minHeap.remove(1);
        System.out.println("Current -> " + minHeap + " -> (Is Valid ? " + (minHeap.isValidMinHeap() ? "Yes" : "No") + ")");

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
    public static Tree createTree(){
        Tree j = new Tree("J");
        Tree h = new Tree("H", null, j);
        Tree g = new Tree("G", h, null);
        Tree l = new Tree("L");
        Tree k = new Tree("K", g, l);

        Tree c = new Tree("C");
        Tree a = new Tree("A");
        Tree b = new Tree("B", a, c);
        Tree e = new Tree("E");
        Tree d = new Tree("D", b, e);

        return new Tree("F", d, k);
    }

    /**
     * Create a Graph Data Structure
     *
     *          (0)
     *         /   \
     *      (4)----(1)
     *       \  /  /
     *      (3)---(2)
     *
     * @return
     */
    public static Graph createGraph(){
        Graph graph = new Graph();

        graph.addEdge("0", "1");
        graph.addEdge("1", "2");
        graph.addEdge("2", "3");
        graph.addEdge("3", "4");
        graph.addEdge("0", "4");
        graph.addEdge("1", "4");
        graph.addEdge("1", "3");

        return graph;
    }

}
