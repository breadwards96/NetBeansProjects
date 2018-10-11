package project1;

import java.util.ArrayList;

public class MyVector {

    /**
     * @Fields
     *
     */
    private final ArrayList<Double> vectorArray;

    /**
     * Constructor for MyVector object
     *
     * @param initValues
     */
    public MyVector(double[] initValues) {

        vectorArray = new ArrayList<>();

        for (int i = 0; i < initValues.length; i++) {
            vectorArray.add(initValues[i]);
        }
    }

    /**
     * Copy constructor
     *
     * @param vector
     */
    public MyVector(MyVector vector) {

        vectorArray = new ArrayList<>();

        for (int i = 0; i < vector.size(); i++) {
            vectorArray.add(vector.getPos(i));

        }
    }

    /**
     * Addition method
     *
     * @param vector
     * @return MyVector
     */
    public MyVector plus(MyVector vector) {

        if (this.size() == vector.size()) {
        } else {

            System.out.println("the arrays entered are not the same size");
            return null;
        }

        double[] newVector = new double[this.size()];

        for (int i = 0; i < this.size(); i++) {
            newVector[i] = this.getPos(i) + vector.getPos(i);
        }

        return new MyVector(newVector);

    }

    /**
     * Subtraction method
     *
     * @param vector
     * @return MyVector
     */
    public MyVector minus(MyVector vector) {

        if (this.size() == vector.size()) {
        } else {
            System.out.println("the arrays entered are not the same size");
            return null;
        }

        double[] newVector = new double[this.getVectorArray().size()];

        for (int i = 0; i < this.getVectorArray().size(); i++) {
            newVector[i] = this.getPos(i) - vector.getPos(i);
        }

        return new MyVector(newVector);

    }

    /**
     * scale method to multiply each vector position by a number
     *
     * @param factor
     * @return MyVector
     */
    public MyVector scale(int factor) {

        double[] newVector = new double[this.size()];

        for (int i = 0; i < this.size(); i++) {

            newVector[i] = this.getPos(i) * factor;

        }

        return new MyVector(newVector);
    }

    /**
     * Dot product method for multiplying two arrays
     *
     * @param vector
     * @return MyVector
     */
    public MyVector dotProd(MyVector vector) {

        if (this.size() == vector.size()) {
        } else {

            System.out.println("the arrays entered are not the same size");
            return null;
        }

        double[] newVector = new double[this.getVectorArray().size()];

        for (int i = 0; i < this.getVectorArray().size(); i++) {
            newVector[i] = this.getPos(i) * vector.getPos(i);
        }

        return new MyVector(newVector);
    }

    /**
     * absolute value method
     *
     * @return
     */
    public MyVector abs() {

        double[] newVector = new double[this.getVectorArray().size()];

        for (int i = 0; i < this.getVectorArray().size(); i++) {
            newVector[i] = Math.abs(this.getPos(i));
        }

        return new MyVector(newVector);
    }

    /**
     * @return the vectorArray
     */
    public ArrayList<Double> getVectorArray() {

        ArrayList x = vectorArray;
        return x;
    }

    public double getPos(int position) {

        return this.getVectorArray().get(position);
    }

    public int size() {

        return this.getVectorArray().size();
    }

    public boolean equals(MyVector vector) {

        if (this.size() == vector.size()) {
        } else {

            System.out.println("the arrays entered are not the same size");
            return false;
        }

        double[] newVector = new double[this.getVectorArray().size()];

        for (int i = 0; i < this.getVectorArray().size(); i++) {
            if (this.getPos(i) != vector.getPos(i)) {
                return false;
            }
        }

        return true;
    }

    @Override
    public String toString() {

        for (int i = 0; i < this.size(); i++) {

            System.out.print(this.getPos(i) + ", ");

        }
        return "";
    }

}
