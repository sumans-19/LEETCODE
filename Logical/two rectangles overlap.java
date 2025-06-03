package Logical;

public class overlapofrectangle {
    
    static class Point {
        int x, y;
        
        Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    // Returns true if two rectangles (l1, r1) and (l2, r2) overlap
    static boolean doOverlap(Point l1, Point r1, Point l2, Point r2) {
        // If one rectangle is to the left of the other
        if (l1.x > r2.x || l2.x > r1.x)
            return false;

        // If one rectangle is above the other
        if (r1.y > l2.y || r2.y > l1.y)
            return false;

        return true;
    }

    public static void main(String[] args) {
        Point l1 = new Point(0, 10);
        Point r1 = new Point(10, 0);
        Point l2 = new Point(5, 5);
        Point r2 = new Point(15, 0);

        if (doOverlap(l1, r1, l2, r2))
            System.out.println("Rectangles Overlap");
        else
            System.out.println("Rectangles Don't Overlap");
    }
}
