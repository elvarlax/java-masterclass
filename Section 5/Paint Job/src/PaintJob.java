public class PaintJob {
    public static int getBucketCount(double width, double height, double areaPerBucket, int extraBuckets) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0 || extraBuckets < 0.0) return -1;
        double wallArea = width * height;
        double extra = areaPerBucket * extraBuckets;
        wallArea -= extra;
        double buckets = wallArea / areaPerBucket;
        if (wallArea % areaPerBucket != 0) buckets++;
        return (int) buckets;
    }

    public static int getBucketCount(double width, double height, double areaPerBucket) {
        if (width <= 0.0 || height <= 0.0 || areaPerBucket <= 0.0) return -1;
        double wallArea = width * height;
        double buckets = wallArea / areaPerBucket;
        if (wallArea % areaPerBucket != 0) buckets++;
        return (int) buckets;
    }

    public static int getBucketCount(double area, double areaPerBucket) {
        if (area <= 0.0 || areaPerBucket <= 0.0) return -1;
        double buckets = area / areaPerBucket;
        if (area % areaPerBucket != 0) buckets++;
        return (int) buckets;
    }

    public static void main(String[] args) {
        System.out.println(getBucketCount(-3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(3.4, 2.1, 1.5, 2));
        System.out.println(getBucketCount(2.75, 3.25, 2.5, 1));
        System.out.println(getBucketCount(0.0, 2.1, 1.5, 7));
        System.out.println(getBucketCount(0.75, 0.75, 0.5, 0));
        System.out.println(getBucketCount(1.4, 2.1, 1.5, -4));
        System.out.println();
        System.out.println(getBucketCount(-3.4, 2.1, 1.5));
        System.out.println(getBucketCount(3.4, 2.1, 1.5));
        System.out.println(getBucketCount(7.25, 4.3, 2.35));
        System.out.println();
        System.out.println(getBucketCount(3.4, 1.5));
        System.out.println(getBucketCount(6.26, 2.2));
        System.out.println(getBucketCount(3.26, 0.75));
    }
}
