public class week3_q5 {
    public static void main(String[] args) {

        int x1 = 0, y1 = 0, width1 = 5, height1 = 5;
        int x2 = 3, y2 = 3, width2 = 5, height2 = 5;

        int left = Math.max(x1, x2);
        int top = Math.max(y1, y2);
        int right = Math.min(x1 + width1, x2 + width2);
        int bottom = Math.min(y1 + height1, y2 + height2);

        if (left < right && top < bottom) {
            int width = right - left;
            int height = bottom - top;

            System.out.println("Intersection: (" +
                    left + ", " + top + ", " +
                    width + ", " + height + ")");

        } 
        else {

            System.out.println("No Intersection");

        }

    }
}
