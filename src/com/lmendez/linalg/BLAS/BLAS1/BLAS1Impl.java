public class BLAS1Impl implements BLAS1 {
    @Override
    public void axpy(double alpha, double[] x, double[] y) throws IllegalArgumentException {
        if (y.length == x.length) {
            for (int i = 0; i < y.length; i++) {
                y[i] = y[i] + alpha * x[i];
            }
        }
        else {
            throw new IllegalArgumentException("Vectors x and y must have the same length.");
        }
    };

    @Override
    public void scal(double alpha, double[] x) {
        for (int i = 0; i < x.length; i++) {
            x[i] = alpha * x[i];
        }
    };

    @Override
    public void copy(double[] x, double[] y) {

    }

    @Override
    public void swap(double[] x, double[] y) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public double dot(double[] x, double[] y) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public double nrm2(double[] x) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public double asum(double[] x) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public int iamax(double[] x) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public double[] rotg(double a, double b) {
        throw new UnsupportedOperationException("Method not implemented");
    }

    @Override
    public double rot(double[] x, double[] y, double c, double s) {
        throw new UnsupportedOperationException("Method not implemented");
    }

};