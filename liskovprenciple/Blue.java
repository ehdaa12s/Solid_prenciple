/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package liskovprenciple;

/**
 *
 * @author ehdaaabdallah
 */
public class Blue extends Color {

    @Override
    public void getColor() {
        super.getColor( );
        System.out.print(" blue");
    }
    
}
