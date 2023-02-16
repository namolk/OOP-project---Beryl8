public class Tree {
    private int height;

    public Tree(int height) {
        this.height = height;
    }

    public void printTree() {
        int Asterisks = 1;
        for (int i = 0; i < height - 1; i++) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < Asterisks; j++) {
                System.out.print("*");
            }
            System.out.println();
            Asterisks += 2;
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < height - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < height - 2; j++) {
                System.out.print(" ");
            }
            System.out.println("***");
        }
    }
}