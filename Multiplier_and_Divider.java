
package multiplier_and_divider;

import java.math.BigDecimal;

public class Multiplier_and_Divider {

    public static void main(String[] args) {

    Divider Divide = new Divider();
    Divide.BigDdivide = BigDecimal.ZERO;
    Multipler Multi = new Multipler();
    DividerAdapter DivAdapter = new DividerAdapter();
    Multi.BigDMulti=DivAdapter.BigDecimal_Multiply(Divide);
    System.out.println("Multipler is "+Multi.BigDMulti+ "/nDivider is "+Divide.BigDdivide);
    
    }
    
}
