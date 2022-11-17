/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package custodio;

import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class voids {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] again = {0, 0, 3};
        float[] z = {0};

        String[] choose = {" "};
        String[] options = {"Get The Area Of A Cirle", "Get The Volume Of A Cone", "Get Surface Area OF A Pyramid", "Get The Volume OF A Pyramid", "Prime Number Checker"};

        do {
            again[2] = 3;
            again[1] = JOptionPane.showOptionDialog(null, "What do you want to do?", "choose peasant", JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
            switch (again[1]) {
                //Area of Circle

                case 0:
                    do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Area_Circle());
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another process?");
                    } while (again[0] == 1);
                    break;
                //Volume of Cone
                case 1:
                    do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Volume_Cone());
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another process?");
                    } while (again[0] == 1);
                    break;
                //Surface Are of Pyramid
                case 2:
                    do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Surface_Area());
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another process?");
                    } while (again[0] == 1);
                    break;
                case 3:
                    do {
                        again[2] = 2;
                        JOptionPane.showMessageDialog(null, Volume_area_Pyramid());
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another process?");
                    } while (again[0] == 1);
                    break;
                case 4:
                    do {
                        again[2] = 2;
                        z[0] = Prime_Number_Checker();
                        if (z[0] == 2) {
                            JOptionPane.showMessageDialog(null, "the number is a prime number!");
                        } else {
                            JOptionPane.showMessageDialog(null, "unfortunately the number is not a prime number");
                        }
                        again[0] = JOptionPane.showConfirmDialog(null, "Do you want to choose another process?");
                    } while (again[0] == 1);
            }
            //para ma break if e x
            if (again[2] == 3) {
                break;
            }

        } while (again[0] == 0);

    }

    static double Area_Circle() {
        String c = JOptionPane.showInputDialog(null, "input radius");
        double radius = Double.parseDouble(c);
        double answer = Math.PI * Math.pow(radius, 2);
        return answer;
    }

    static double Volume_Cone() {
        //arrays
        double[] values = {0.33333, Math.PI, 0, 0, 0};
        String[] input = {"", ""};

        //computations
        input[0] = JOptionPane.showInputDialog("input radius");
        values[3] = Double.parseDouble(input[0]);

        input[1] = JOptionPane.showInputDialog("input height");
        values[4] = Double.parseDouble(input[1]);

        values[2] = ((values[0] * values[1]) * (Math.pow(values[3], 2) * values[4]));
        return values[2];
    }

    static float Surface_Area() {
        float[] values = {12, 0, 0, 0, 0};
        String[] input = {"", "", ""};
        //perimeter
        input[0] = JOptionPane.showInputDialog("input Perimeter of the Base: ");
        values[1] = Float.parseFloat(input[0]);
        //Base
        input[1] = JOptionPane.showInputDialog("input The Area Of The Base: ");
        values[2] = Float.parseFloat(input[1]);
        //Slant Height
        input[2] = JOptionPane.showInputDialog("input The Slant Height: ");
        values[3] = Float.parseFloat(input[2]);

        values[4] = ((values[0] * (values[1] * values[3])) + values[2]);
        return values[4];
    }

    static float Volume_area_Pyramid() {
        float[] values = {0.33333f, 0, 0, 0};
        String[] input = {"", ""};
        //base
        input[0] = JOptionPane.showInputDialog("Input Base:");
        values[1] = Float.parseFloat(input[0]);
        //height
        input[1] = JOptionPane.showInputDialog("Input Height:");
        values[2] = Float.parseFloat(input[1]);

        values[3] = (values[0] * values[1] * values[2]);

        return values[3];
    }

    static float Prime_Number_Checker() {
        //arrays
        String[] input = {"", ""};
        float[] values = {0, 0, 0};

        input[0] = JOptionPane.showInputDialog("Input a number");
        values[0] = Float.parseFloat(input[0]);
        //loops
        for (int i = 1; i <= values[0]; i++) {
            float y = values[0] / i;
            //conditions
            if (values[0] % i == 0) {
                values[1] = values[1] + 1;
            }
        }
        return values[1];

    }
}
