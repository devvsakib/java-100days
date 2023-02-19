package com.shape;

public class Square extends Shape {
    Square(int dim1, int dim2) {
        super(dim1, dim2);
    }

    public double area() {
        return 4 * Math.PI * (this.dim2 + this.dim1);
    }
}
