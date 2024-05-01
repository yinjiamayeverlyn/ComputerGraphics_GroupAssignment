
package bedroom;

/**
 *
 * @author yanxi
 */

import com.jogamp.opengl.GL2;
import static com.jogamp.opengl.GL2.*;
import com.jogamp.opengl.util.gl2.GLUT;
import static com.jogamp.opengl.GL2ES3.GL_QUADS;

public class Tshirt {
    private GLUT glut = new GLUT();
    
    public void drawTshirt(GL2 gl){
        //Draw tshirt
        gl.glScalef(6.0f, 6.0f, 6.0f);
        gl.glTranslatef(7.0f, -0.8f, 5.0f);
        gl.glRotatef(90.0f, 1.0f, 0.0f, 0.0f); 
        gl.glRotatef(45.0f, 0.0f, 0.0f, 1.0f); 
        
        // Body of the T-shirt
        gl.glPushMatrix();
        gl.glColor3f(0.5f, 0.0f, 0.5f); 
        gl.glTranslatef(0.0f, 0.0f, -1.0f); // Adjust position
        gl.glScalef(2.0f, 3.0f, 0.1f); // Adjust dimensions
        glut.glutSolidCube(1.0f);
        gl.glPopMatrix();

        // Collar/neck part of the T-shirt (2D semi-circle)
        gl.glPushMatrix();
        gl.glColor3f(0.9f, 0.8f, 0.9f);
        gl.glTranslatef(0.0f, 1.4f, -1.05f); // Adjust position to the bottom
        gl.glScalef(0.6f, 0.4f, 0f); // Adjust dimensions
        gl.glBegin(GL2.GL_POLYGON); // Begin drawing a polygon
        for (int i = 0; i <= 180; i++) { // Loop to draw semi-circle
            double angle = Math.PI * i / 180;
            double x = Math.cos(angle);
            double y = -Math.sin(angle); // Flip the sign of y-coordinate
            gl.glVertex2d(x, y); // Define vertices of the semi-circle
        }
        gl.glEnd(); // End drawing the polygon
        gl.glPopMatrix();

        // Left sleeve of the T-shirt
        gl.glPushMatrix();
        gl.glColor3f(0.5f, 0.0f, 0.5f); 
        gl.glTranslatef(-1.11f, 0.78f, -1.0f); // Adjust position
        gl.glRotatef(-45.0f, 0.0f, 0.0f, 1.0f); // Rotate by 45 degrees around the x-axis
        gl.glScalef(0.85f, 1.2f, 0.1f); // Adjust dimensions
        glut.glutSolidCube(1.0f); 
        gl.glPopMatrix();

        // Right sleeve of the T-shirt
        gl.glPushMatrix();
        gl.glColor3f(0.5f, 0.0f, 0.5f);
        gl.glTranslatef(1.11f, 0.78f, -1.0f); // Adjust position
        gl.glRotatef(45.0f, 0.0f, 0.0f, 1.0f); // Rotate by 45 degrees around the x-axis
        gl.glScalef(0.85f, 1.2f, 0.1f); // Adjust dimensions
        glut.glutSolidCube(1.0f);
        gl.glPopMatrix();
    }
}

