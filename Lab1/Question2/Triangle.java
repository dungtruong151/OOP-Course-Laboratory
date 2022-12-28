public class Triangle {
    public int size1;
    public int size2;
    public int size3;

    public Triangle (int size1, int size2,int size3) {
        this.size1 = size1;
        this.size2 = size2;
        this.size3 = size3;
    }

    public String verify() {
        if (size1+size2>size3 && size1+size3>size2 && size2+size3>size1) {
            if (size1==size2 && size2==size3) {
                return "Equilateral\n";
            }
            else if (size1==size2 || size2==size3 || size1==size3) {
                return "Isosceles\n";
            }
            else {
                return "Scalene\n";
            }
        }
        else {
            return "Not Triangle\n";
        }
    }
}
