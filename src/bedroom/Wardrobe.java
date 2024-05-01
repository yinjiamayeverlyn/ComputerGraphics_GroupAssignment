
package bedroom;
/**
 *
 * @author yanxi
 */

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.util.gl2.GLUT;
import static com.jogamp.opengl.GL2ES3.GL_QUADS;

public class Wardrobe {
    private GLUT glut = new GLUT();
    
    public void drawWardrobe(GL2 gl){
        gl.glPushMatrix();

        gl.glRotatef(90.0f, 0.0f, 1.0f, 0.0f);
        gl.glTranslatef(-0.7f, -0.07f, 1.38f);
        
        float wardrobe_width = 0.9f;
        float wardrobe_height = 1.4f;
        float wardrobe_depth = 0.4f;
        float door_width = wardrobe_width / 2.0f;
        float door_height = wardrobe_height;
        float drawer_height = 0.1f;
        float handle_radius = 0.05f;
        
        // Draw the main wardrobe body
        gl.glColor3f(0.2f, 0.1f, 0.0f);
        gl.glBegin(GL_QUADS);
        // Front face
        gl.glVertex3f(0, 0, 0);
        gl.glVertex3f(wardrobe_width, 0, 0);
        gl.glVertex3f(wardrobe_width, wardrobe_height, 0);
        gl.glVertex3f(0, wardrobe_height, 0);

        // Back face
        gl.glVertex3f(0, 0, wardrobe_depth);
        gl.glVertex3f(wardrobe_width, 0, wardrobe_depth);
        gl.glVertex3f(wardrobe_width, wardrobe_height, wardrobe_depth);
        gl.glVertex3f(0, wardrobe_height, wardrobe_depth);

        // Top face
        gl.glVertex3f(0, wardrobe_height, 0);
        gl.glVertex3f(wardrobe_width, wardrobe_height, 0);
        gl.glVertex3f(wardrobe_width, wardrobe_height, wardrobe_depth);
        gl.glVertex3f(0, wardrobe_height, wardrobe_depth);

        // Bottom face
        gl.glVertex3f(0, 0, 0);
        gl.glVertex3f(wardrobe_width, 0, 0);
        gl.glVertex3f(wardrobe_width, 0, wardrobe_depth);
        gl.glVertex3f(0, 0, wardrobe_depth);

        // Left side face
        gl.glVertex3f(0, 0, 0);
        gl.glVertex3f(0, 0, wardrobe_depth);
        gl.glVertex3f(0, wardrobe_height, wardrobe_depth);
        gl.glVertex3f(0, wardrobe_height, 0);

        // Right side face
        gl.glVertex3f(wardrobe_width, 0, 0);
        gl.glVertex3f(wardrobe_width, 0, wardrobe_depth);
        gl.glVertex3f(wardrobe_width, wardrobe_height, wardrobe_depth);
        gl.glVertex3f(wardrobe_width, wardrobe_height, 0);
        gl.glEnd();

        // Draw the doors
        gl.glBegin(GL_QUADS);
        gl.glColor3f(0.5f, 0.3f, 0.0f); // Light brown color
        
        // Left door
        gl.glVertex3f(0.0f + 0.02f, 0.0f + 0.3f, -0.001f); //bottom left
        gl.glVertex3f(door_width - 0.01f, 0.0f + 0.3f, -0.001f); //bottom right
        gl.glVertex3f(door_width - 0.01f, door_height, -0.001f); //top right
        gl.glVertex3f(0.0f + 0.02f, door_height, -0.001f); //top left

        // Right door
        gl.glVertex3f(wardrobe_width - door_width + 0.01f, 0 + 0.3f, -0.001f); //bottom right
        gl.glVertex3f(wardrobe_width - 0.02f, 0 + 0.3f, -0.001f); //bottom left
        gl.glVertex3f(wardrobe_width - 0.02f, wardrobe_height, -0.001f); //top right
        gl.glVertex3f(wardrobe_width - door_width + 0.01f, wardrobe_height, -0.001f); //top left
        gl.glEnd();
        
        // Draw handles for the doors
        gl.glColor3f(0.2f, 0.1f, 0.0f);
        
        // Left door handle
        gl.glPushMatrix();
        gl.glTranslatef(handle_radius + 0.3f, (wardrobe_height + 0.3f) / 2.0f, 0.0f); // Adjust position
        glut.glutSolidSphere(handle_radius, 30, 30); // Draw sphere handle
        gl.glPopMatrix();

        // Right door handle
        gl.glPushMatrix();
        gl.glTranslatef(wardrobe_width - handle_radius - 0.3f, (wardrobe_height + 0.3f) / 2.0f, 0.0f); // Adjust position
        glut.glutSolidSphere(handle_radius, 30, 30); // Draw sphere handle
        gl.glPopMatrix();

        // Draw the drawer below
        gl.glBegin(GL_QUADS);
        gl.glColor3f(0.5f, 0.3f, 0.0f);
        gl.glVertex3f(0 + 0.02f, 0 + 0.02f, -drawer_height + 0.099f); //bottom left
        gl.glVertex3f(wardrobe_width -0.02f, 0 + 0.02f, -drawer_height + 0.099f); //bottom right
        gl.glVertex3f(wardrobe_width -0.02f, 0.3f -0.02f, -drawer_height + 0.099f); //top right
        gl.glVertex3f(0 + 0.02f, 0.3f - 0.02f, -drawer_height + 0.099f); //top left
        gl.glEnd();
        
        // Draw handle for the drawer
        gl.glColor3f(0.2f, 0.1f, 0.0f);
        gl.glPushMatrix();
        gl.glTranslatef(0.45f, 0.15f, -0.02f); // Adjust position
        gl.glRotatef(90, 1, 0, 0); // Rotate handle to be vertical
        gl.glScalef(0.2f, 0.05f, 0.05f); // Scale to appropriate size
        glut.glutSolidCube(1.0f); // Draw cube handle
        gl.glPopMatrix();
        gl.glPopMatrix();
    }
    
}
