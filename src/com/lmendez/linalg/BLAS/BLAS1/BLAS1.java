/**
 * The BLAS1 interface defines a set of basic linear algebra subprograms (BLAS)
 * for performing operations on real vectors. These operations include vector
 * addition, scaling, copying, swapping, dot products, and other fundamental
 * computations. The interface is inspired by the BLAS standards defined in
 * several foundational papers:
 * 
 * - "Basic linear algebra subprograms for FORTRAN usage" by Lawson et al, 1979.
 * - "An extended set of FORTRAN basic linear algebra subprograms" by Dongarra
 *   et al, 1988.
 * - "A set of level 3 basic linear algebra subprograms" by Dongarra et al, 1990.
 * 
 * Note: Some BLAS-like routines (e.g., csymv, crot, csum1, icmax1) are part of
 * LAPACK rather than the classic BLAS. This interface focuses exclusively on
 * operations involving real vectors.
 * 
 * Methods:
 * - `axpy`: Computes the operation y = alpha * x + y.
 * - `scal`: Scales a vector by a scalar.
 * - `copy`: Copies the contents of one vector to another.
 * - `swap`: Swaps the contents of two vectors using XOR swap.
 * - `dot`: Computes the dot product of two vectors.
 * - `nrm2`: Computes the Euclidean norm (2-norm) of a vector.
 * - `asum`: Computes the sum of the absolute values of the elements of a vector.
 * - `iamax`: Finds the index of the element with the maximum absolute value in a vector.
 * - `rotg`: Generates a Givens rotation matrix.
 * - `rot`: Applies a Givens rotation to two vectors.
 * 
 * Exceptions:
 * - Methods that involve two vectors (e.g., `axpy`, `copy`, `swap`, `dot`) throw
 *   `IllegalArgumentException` if the vectors have different lengths.
 */
interface BLAS1 {

    /**
     * Computes y = alpha * x + y.
     * 
     * @param alpha Scalar multiplier.
     * @param x     Input vector (not modified).
     * @param y     Output vector (modified in-place).
     * @throws IllegalArgumentException if x and y have different lengths.
     */
    void axpy(double alpha, double[] x, double[] y);

    /**
     * Computes x = alpha * x.
     * 
     * @param alpha Scalar multiplier.
     * @param x     Input vector.
     */
    void scal(double alpha, double[] x);

    /**
     * Returns a copy of vector x in vector y.
     * 
     * @param x Input vector (not modified).
     * @param y Copy vector (modified in-place).
     * @throws IllegalArgumentException if x and y have different lengths.
     */
    void copy(double[] x, double[] y);

    /**
     * Swaps the vectors x and y using XOR swap.
     * 
     * @param x
     * @param y
     * @throws IllegalArgumentException if x and y have different lengths.
     */
    void swap(double[] x, double[] y);

    /**
     * Computes the dot product of two vectors.
     *
     * @param x the first vector, represented as an array of doubles
     * @param y the second vector, represented as an array of doubles
     * @return the dot product of the two vectors as a double
     * @throws IllegalArgumentException if the lengths of the two vectors are not
     *                                  equal
     */
    double dot(double[] x, double[] y);

    double nrm2(double[] x);

    double asum(double[] x);

    int iamax(double[] x);

    /**
     * @param a
     * @param b
     * @return
     */
    double[] rotg(double a, double b);

    double rot(double[] x, double[] y, double c, double s);

}