package BINARYTREE;
import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int value) {
        data = value;
        left = right = null;
    }
}

public class BST {
    Node root;

    // Insert node
    Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else if (data < root.data) {
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            root.right = insert(root.right, data);
        }
        return root;
    }

    // Find largest
    Node findLargest(Node root) {
        if (root == null || root.right == null)
            return root;
        return findLargest(root.right);
    }

    // Find smallest
    Node findSmallest(Node root) {
        if (root == null || root.left == null)
            return root;
        return findSmallest(root.left);
    }

    // Inorder traversal
    void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }

    // Preorder traversal
    void preorder(Node root) {
        if (root != null) {
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }
    }

    // Postorder traversal
    void postorder(Node root) {
        if (root != null) {
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }
    }

    // Delete node
    Node delete(Node root, int key) {
        if (root == null) return null;

        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            // Case 1: No right child
            if (root.right == null) {
                return root.left;
            }
            // Case 2: No left child
            else if (root.left == null) {
                return root.right;
            }
            // Case 3: Both children
            Node largest = findLargest(root.left);
            System.out.println("largest=" + largest.data);
            System.out.println(largest.data + " moved to " + root.data);
            root.data = largest.data;
            root.left = delete(root.left, largest.data);
        }
        return root;
    }

    // Search node
    boolean search(Node root, int key) {
        if (root == null) return false;
        else if (root.data == key) return true;
        else if (key < root.data) return search(root.left, key);
        else return search(root.right, key);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BST tree = new BST();
        int op, x;

        do {
            System.out.println("\n1.Insert\n2.Delete\n3.Search\n4.Find Largest\n5.Find Smallest\n6.Inorder\n7.Preorder\n8.Postorder\n0.Exit");
            System.out.print("Enter your option = ");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    System.out.print("Enter element to insert = ");
                    x = sc.nextInt();
                    tree.root = tree.insert(tree.root, x);
                    System.out.println("Element " + x + " inserted successfully");
                    break;

                case 2:
                    System.out.print("Enter element to delete = ");
                    x = sc.nextInt();
                    if (!tree.search(tree.root, x))
                        System.out.println("Element does not exist");
                    else {
                        tree.root = tree.delete(tree.root, x);
                        System.out.println("Element " + x + " deleted");
                    }
                    break;

                case 3:
                    System.out.print("Enter element to search = ");
                    x = sc.nextInt();
                    if (tree.search(tree.root, x))
                        System.out.println("Element present in the tree");
                    else
                        System.out.println("Element is not in the Tree!!");
                    break;

                case 4:
                    Node largest = tree.findLargest(tree.root);
                    if (largest != null)
                        System.out.println("Largest = " + largest.data);
                    else
                        System.out.println("Tree is empty");
                    break;

                case 5:
                    Node smallest = tree.findSmallest(tree.root);
                    if (smallest != null)
                        System.out.println("Smallest = " + smallest.data);
                    else
                        System.out.println("Tree is empty");
                    break;

                case 6:
                    tree.inorder(tree.root);
                    System.out.println();
                    break;

                case 7:
                    tree.preorder(tree.root);
                    System.out.println();
                    break;

                case 8:
                    tree.postorder(tree.root);
                    System.out.println();
                    break;

                case 0:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid option!!");
            }
        } while (op != 0);

        sc.close();
    }
}
