package lessonsTekWill;

import java.text.DecimalFormat;

public class FormattedFloatWith2Decimals {
    public static void main(String[] args) {
        float pi=3.1428733F;

        String formattedPi=String.format("%.02f",pi);
        //the first and modern posibiliti to formatted with limits for decimal numbers
        System.out.println("formatted float with 2 decimals "+
                formattedPi);

        DecimalFormat formatter=new DecimalFormat("#.##");  //the second and old posibiliti to formatted with limits for decimal numbers
        formattedPi=formatter.format(pi);
        System.out.println("formatted pi value with DecimalFormat: "+formattedPi);
    }

}
