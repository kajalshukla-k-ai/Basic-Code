package pattern.programs;

public class PascalNumericTriangle {
    public static void main(String[] args) {
        int i,j,row=5;
        for ( i = 0; i < row; i++) {
            int number=1;
                System.out.printf("%" +(row-i)*2+ "s", "");
            for ( j = 0; j <=i; j++) {
                System.out.printf("%4d",number);
            number=number*(i-j)/(j+1);
            }
                System.out.println();
                
            }
        }
    }
    

