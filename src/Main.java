public class Main {
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.right.left = new Node(4);
        root.right.right = new Node(5);
        root.left.left = new Node(6);

        System.out.println(root.getData());
        System.out.println(root.left.getData());
        System.out.println(root.right.getData());
        System.out.println(root.right.left.getData());
        System.out.println(root.right.right.getData());
        System.out.println(root.left.left.getData());

        System.out.println("height");
        System.out.println(Tree.height(root));

        Tree.lookUp(root, 4, " ");
        Tree.reverseTree(root);

        System.out.println("reverse root");
        System.out.println(root.getData());
        System.out.println(root.left.getData());
        System.out.println(root.right.getData());
        System.out.println(root.right.right.getData());
        System.out.println(root.left.left.getData());
        System.out.println(root.left.right.getData());

        System.out.println("width");
        System.out.println(Tree.getMaxWidth(root));
        System.out.println("Number of nodes");
        System.out.println(Tree.size(root));
    }
}