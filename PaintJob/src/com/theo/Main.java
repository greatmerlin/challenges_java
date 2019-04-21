package com.theo;

/**
 * Challenge -> Method Overloading
 * We are painters.
 * Create a program that calculates how many buckets of paint we need to buy before we go to work.
 * We have extra buckets at home.
 * We know the area that we can cover with one bucket of paint.
 *
 * Hint: Use the Method Math.ceil() to round the number of calculated buckets (double) then convert it into int
 *
 * 1 parameter: height of the wall
 * 2 parameter: width of the wall
 * 3 parameter: the area that can be covered with ONE bucket of paint
 * 4 parameter: extra buckets at home
 *
 * The Methods with more parameters, will call the Overloaded Methods with less parameters in order to avoid
 * repeating the code.
 * */

public class Main {

    public static void main(String[] args) {

        System.out.println(getBucketCount(2,4,2,1));

        System.out.println(getBucketCount(2,2,1));

        System.out.println(getBucketCount(8,4));

    }

        public static int getBucketCount(double height, double width, double areaPerBucket, int extraBuckets) {

            if(height <= 0 || width <= 0 || areaPerBucket <= 0 || extraBuckets < 0) {
                return -1;
            }
            return getBucketCount((height * width), areaPerBucket) - extraBuckets;
        }

        public static int getBucketCount(double height, double width, double areaPerBucket) {

            return getBucketCount((height * width), areaPerBucket);
        }

        public static int getBucketCount(double area, double areaPerBucket) {

            if(area <= 0 || areaPerBucket <= 0) {
                return -1;
            }
            return (int) Math.ceil(area / areaPerBucket);
        }
}
