package com.home_Work_Lesson_6_EX6.vector;

import java.util.Random;

public class Vector {

    private final long x;
    private final long y;
    private final long z;


    public Vector(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }


    public Vector (long x, long y, long z){
        this.x = x;
        this.y = y;
        this.z = z;
    }


    public double vectorLength(long x, long y, long z){
        return Math.sqrt(x*x + y*y + z*z);
    }


    public static long vectorsScalarProduct(Vector vector1, Vector vector2){
        return vector1.x * vector2.x + vector1.y * vector2.y + vector1.z * vector2.z;
    }


    public static Vector vectorsProduct(Vector vector1, Vector vector2){
        return new Vector(vector1.y * vector2.z - vector1.z * vector2.y,
                vector1.z * vector2.x - vector1.x * vector2.z,
                vector1.x * vector2.y - vector1.y * vector2.x);
    }


    public static Vector sumVectors(Vector vector1, Vector vector2){
        return new Vector(vector1.x + vector2.x, vector1.y + vector2.y, vector1.z + vector2.z);
    }
    public static Vector differenceVectors(Vector vector1, Vector vector2){
        return new Vector(vector1.x - vector2.x, vector1.y - vector2.y, vector1.z - vector2.z);
    }

    public static Vector[] randomVectors(int n){
        Vector[] vectors = new Vector[n];
        Random random = new Random();
        for (int i = 0; i < vectors.length; i++) {
            vectors[i] = new Vector(random.nextInt(1000), random.nextInt(1000),random.nextInt(1000));
        }
        return vectors;
    }


    @Override
    public String toString() {
        return "Vector{" +     "x=" + x + ", y=" + y + ", z=" + z + '}' + ", length= " + vectorLength(x,y,z);
    }
}
