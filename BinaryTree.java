public class BinaryTree {
  private char info;
  private BinaryTree left;  //default value = null
  private BinaryTree right;   // --> private BinaryTree link = null;

  public BinaryTree(char value, BinaryTree left, BinaryTree right) {
    info = value;
    this.left = left;
    this.right = right;
  }

  public char getInfo(){ return info; }

  public BinaryTree getLeft(){ return left; }

  public BinaryTree getRight(){ return right; }

  public void setLeafs(BinaryTree left, BinaryTree right){
    this.left = left;
    this.right = right; 
  }

  public void setRight(BinaryTree right){
    this.right = right;
  }

  public void setLeft(BinaryTree left){
    this.left = left;
  }

  public void inorder(){

    System.out.print("(");

    if(this.left != null)
      this.left.inorder();

    System.out.print(" " + this.info + " ");

    if(this.right != null)
      this.right.inorder();

    System.out.print(")");
  }

  public void insertSort(char value) {
    if (value < this.getInfo()) {
      if (this.left != null) {
        this.left.insertSort(value);
      } else {
        this.left = new BinaryTree(value, null, null);
      }
    } else if (value > this.getInfo()) {
      if (this.right != null) {
        this.right.insertSort(value);
      } else {
        this.right =  new BinaryTree(value, null, null);;
      }
    }
  }

  void mirrorTree () {

    if (left != null) {
      left.mirrorTree();
  }

  if (right != null) {
      right.mirrorTree();
  }

  BinaryTree swap = this.right;

  this.right = this.left;
  this.left = swap;

  }

}
