/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package openclosed;

/**
 *
 * @author ehdaaabdallah
 */
public class Circle  implements Shape {

    double raduis;

    public Circle(double raduis) {
        this.raduis = raduis;
    }
    
    @Override
    public double calaculateArea() {
        return( Math.PI*raduis* raduis);
    }
    
}
