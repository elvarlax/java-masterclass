public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        } else {
            int sum = bigCount * 5 + smallCount;
            if (sum == goal) {
                return true;
            } else if (sum > goal) {
                if (smallCount > goal) {
                    return true;
                } else {
                    for (int i = 0; i <= bigCount; i++) {
                        for (int j = 0; j <= smallCount; j++) {
                            if (i * 5 + j == goal) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(canPack(2, 1, 5));
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
    }
}
