public class Five {
    public static void main(String[] args) {
        Box x = new Box(10);
        Box y = new Box(20);
        swapBoxes(x, y);
        System.out.println(x.value + " " + y.value);
    }

    static class Box {
        int value;

        Box(int value) {
            this.value = value;
        }
    }

    static void swapBoxes(Box x, Box y) {
        int temp = x.value;
        x.value = y.value;
        y.value = temp;
          
    }
}
