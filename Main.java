public class Main {
  public static void main(String[] args) {

    BinaryTree tree = new BinaryTree('d', null, null);
  
    tree.insertSort('a');
    tree.insertSort('b');
    tree.insertSort('c');
    tree.insertSort('e');
    tree.insertSort('f');
    tree.insertSort('g');
    tree.insertSort('h');
  
    System.out.println("\n\n" + "Original tree: \n");
    tree.inorder();
  
    System.out.println("\n\n" + "Tree after being mirrored: \n");
    tree.mirrorTree();
    tree.inorder();


  }
}