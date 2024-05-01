
package bedroom;

import com.jogamp.opengl.GL2;
import static com.jogamp.opengl.GL2.*;
import com.jogamp.opengl.util.gl2.GLUT;
/**
 *
 * @author yanxi
 */
public class Drawer {
    private GLUT glut = new GLUT();

    public void drawDrawer(GL2 gl){
        // Draw the bedside drawer
        gl.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
        gl.glTranslatef(0.8f, 0.18f, 1.81f);
        gl.glColor3f(0.5f, 0.3f, 0.0f); // Dark brown color
        
        
        // Bottom face of the drawer
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.2f, -0.61f, -2.0f); // bottom left
        gl.glVertex3f(0.0f, -0.61f, -2.0f); // bottom right
        gl.glVertex3f(0.0f, -0.61f, -1.8f); // top right
        gl.glVertex3f(-0.2f, -0.61f, -1.8f); // top left
        gl.glEnd();
        
        // Top face of the drawer
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.2f, -0.45f, -2.0f); // bottom left
        gl.glVertex3f(0.0f, -0.45f, -2.0f); // bottom right
        gl.glVertex3f(0.0f, -0.45f, -1.8f); // top right
        gl.glVertex3f(-0.2f, -0.45f, -1.8f); // top left
        gl.glEnd();
        
        // Front face of the drawer
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.2f, -0.61f, -1.8f); // bottom left
        gl.glVertex3f(0.0f, -0.61f, -1.8f); // bottom right
        gl.glVertex3f(0.0f, -0.45f, -1.8f); // top right
        gl.glVertex3f(-0.2f, -0.45f, -1.8f); // top left
        gl.glEnd();
        
        // Left side face of the drawer
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.2f, -0.61f, -1.8f); // bottom left
        gl.glVertex3f(-0.2f, -0.61f, -2.0f); // bottom right
        gl.glVertex3f(-0.2f, -0.45f, -2.0f); // top right
        gl.glVertex3f(-0.2f, -0.45f, -1.8f); // top left
        gl.glEnd();
        
        // Back face of the drawer
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.2f, -0.61f, -2.0f); // bottom left
        gl.glVertex3f(0.0f, -0.61f, -2.0f); // bottom right
        gl.glVertex3f(0.0f, -0.45f, -2.0f); // top right
        gl.glVertex3f(-0.2f, -0.45f, -2.0f); // top left
        gl.glEnd();

        // Right side face of the drawer
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.0f, -0.61f, -1.8f); // bottom left
        gl.glVertex3f(0.0f, -0.61f, -2.0f); // bottom right
        gl.glVertex3f(0.0f, -0.45f, -2.0f); // top right
        gl.glVertex3f(0.0f, -0.45f, -1.8f); // top left
        gl.glEnd();
        
        // Drawer
        gl.glColor3f(0.6f, 0.4f, 0.2f); // Lighter brown color
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.18f, -0.59f, -1.799f); // bottom left
        gl.glVertex3f(-0.02f, -0.59f, -1.799f); // bottom right
        gl.glVertex3f(-0.02f, -0.48f, -1.799f); // top right
        gl.glVertex3f(-0.18f, -0.48f, -1.799f); // top left
        gl.glEnd();
        
        // Draw the handle (sphere)
        gl.glColor3f(0.5f, 0.3f, 0.0f); // Light gray color for the handle
        gl.glTranslatef(-0.1f, -0.56f, -1.8f); // Position the handle in front of the drawer
        glut.glutSolidSphere(0.015f, 30, 30); // Draw a solid sphere as the handle
        
        // Draw the legs
        gl.glColor3f(0.6f, 0.4f, 0.2f);// Light brown color for the legs

        // Front left leg
        gl.glPushMatrix();
        gl.glTranslatef(-0.08f, -0.06f, -0.02f); // Move to the position of the leg
        gl.glScalef(0.04f, 0.02f, 0.04f); // Scale to appropriate size
        glut.glutSolidCube(1.0f); // Draw the leg
        gl.glPopMatrix();

        // Front right leg
        gl.glPushMatrix();
        gl.glTranslatef(0.08f, -0.06f, -0.02f); // Move to the position of the leg
        gl.glScalef(0.04f, 0.02f, 0.04f); // Scale to appropriate size
        glut.glutSolidCube(1.0f); // Draw the leg
        gl.glPopMatrix();

        // Back left leg
        gl.glPushMatrix();
        gl.glTranslatef(-0.08f, -0.06f, -0.18f); // Move to the position of the leg
        gl.glScalef(0.04f, 0.02f, 0.04f); // Scale to appropriate size
        glut.glutSolidCube(1.0f); // Draw the leg
        gl.glPopMatrix();

        // Back right leg
        gl.glPushMatrix();
        gl.glTranslatef(0.08f, -0.06f, -0.18f); // Move to the position of the leg
        gl.glScalef(0.04f, 0.02f, 0.04f); // Scale to appropriate size
        glut.glutSolidCube(1.0f); // Draw the leg
        gl.glPopMatrix();
   
    }
     
     
}
