public class a22_wheelsAndVechiles {
    public static void main(String[] args) {
        int v = 200;
        int w = 540;
        int tw = 0;
        int fw = 0;
        // x=tw(2 wheeler)
        // y=fw(4 wheeler)
        // x+y=v
        // 2x+4y=w

        // x=v-y

        // 2(v-y)+4y=w
        // 2v-2y+4y=w
        // 2v+2y=w
        // 2y=w-2v
        // y=(w-2v)/2

        if (w >= 2 * v && w <= 4 * v && (w - 2 * v) % 2 == 0) {
            fw = (w - 2 * v) / 2;
            tw = v - fw;
        }
        else {
            System.out.println("Invalid input");
            return;
        }
        System.out.println("Two Wheelers: " + tw);
        System.out.println("Four Wheelers: " + fw);
    }
}
