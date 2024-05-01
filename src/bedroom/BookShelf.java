
package bedroom;

import com.jogamp.opengl.GL2;
import static com.jogamp.opengl.GL2.*;
import com.jogamp.opengl.util.gl2.GLUT;


    public class BookShelf {
    private GLUT glut = new GLUT();
    public void drawBookShelf(GL2 gl) {
            gl.glTranslatef(-0.05f,0.01f,-0.2f);
            //*****************BOTTOM LAYER 

            // Bottom face of the drawer

            gl.glColor3f(0.8f, 0.7f, 0.7f);
            gl.glBegin(GL_QUADS);
            gl.glVertex3f(-1.1f, 0f, 0f); // bottom left 
            gl.glVertex3f(-0.85f, 0f, 0f); // bottom right
            gl.glVertex3f(-0.85f, 0f, 0.25f); // top right
            gl.glVertex3f(-1.1f, 0f, 0.25f); // top left
            gl.glEnd();

            // Top face of the drawer
            gl.glBegin(GL_QUADS);
            gl.glVertex3f(-1.1f, 0.2f, 0f); // bottom left y=
            gl.glVertex3f(-0.85f, 0.2f, 0f); // bottom right
            gl.glVertex3f(-0.85f, 0.2f, 0.25f); // top right
            gl.glVertex3f(-1.1f, 0.2f, 0.25f); // top left
            gl.glEnd();

            // Front face of the drawer
            gl.glBegin(GL_QUADS);
            gl.glVertex3f(-1.1f, 0f, 0.25f); // bottom left
            gl.glVertex3f(-0.85f, 0f, 0.25f); // bottom right
            gl.glVertex3f(-0.85f, 0.2f, 0.25f); // top right
            gl.glVertex3f(-1.1f, 0.2f, 0.25f); // top left
            gl.glEnd();
      
            // Left side face of the drawer
            gl.glBegin(GL_QUADS);
            gl.glVertex3f(-1.1f, 0f, 0f); 
            gl.glVertex3f(-1.1f, 0f, 0.25f);
            gl.glVertex3f(-1.1f, 0.2f, 0.25f);
            gl.glVertex3f(-1.1f, 0.2f,0f); 
            gl.glEnd();

                   // right side face of the drawer
            gl.glBegin(GL_QUADS);
            gl.glVertex3f(-0.85f, 0f, 0f); 
            gl.glVertex3f(-0.85f, 0f, 0.25f);
            gl.glVertex3f(-0.85f, 0.2f, 0.25f);
            gl.glVertex3f(-0.85f, 0.2f,0f); 
            gl.glEnd();

            // Back face of the drawer
            gl.glBegin(GL_QUADS);

            gl.glVertex3f(-1.1f, 0f, 0f); // bottom left
            gl.glVertex3f(-0.85f, 0f, 0f); // bottom right
            gl.glVertex3f(-0.85f, 0.2f, 0f); // top right
            gl.glVertex3f(-1.1f, 0.2f, 0f); // top left
            gl.glEnd();
            
            //drawer ( blue)
            // Front face of the drawer
            gl.glBegin(GL_QUADS);
            gl.glColor3f(0.4f, 0.4f, 0.6f); 
            gl.glVertex3f(-1.08f, 0.02f, 0.26f); // bottom left
            gl.glVertex3f(-0.87f, 0.02f, 0.26f); // bottom right
            gl.glVertex3f(-0.87f, 0.08f, 0.26f); // top right
            gl.glVertex3f(-1.08f, 0.08f, 0.26f); // top left
            gl.glEnd();

            // Draw the handle (sphere)
            gl.glColor3f(0.7f, 0.6f, 0.6f); // Light gray color for the handle
            gl.glTranslatef(-0.98f, 0.05f, 0.26f); // Position the handle in front of the drawer
            glut.glutSolidSphere(0.015f, 30, 30); // Draw a solid sphere as the handle

    // Second drawer (red)
    // Front face of the drawer
    gl.glPushMatrix();
    gl.glTranslatef(0.98f, 0.03f, -0.24f);
    gl.glBegin(GL_QUADS);
    gl.glColor3f(0.6f, 0.4f, 0.4f); // Red color for the second drawer
    gl.glVertex3f(-1.08f, 0.02f, 0.26f - 0.02f); // bottom left
    gl.glVertex3f(-0.87f, 0.02f, 0.26f - 0.02f); // bottom right
    gl.glVertex3f(-0.87f, 0.08f, 0.26f - 0.02f); // top right
    gl.glVertex3f(-1.08f, 0.08f, 0.26f - 0.02f); // top left
    gl.glEnd();

    // Draw the handle (sphere) for the second drawer
    gl.glColor3f(0.7f, 0.6f, 0.6f); // Light gray color for the handle
    gl.glTranslatef(-0.98f, 0.05f, 0.26f - 0.02f); // Position the handle for the second drawer
    glut.glutSolidSphere(0.015f, 30, 30); // Draw a solid sphere as the handle for the second drawer


        //***************** 2nd & 3rd layers 
        // Draw the board (surface) at the top of the bookshelf

     //   (middle)

     // Middle layer
    gl.glPushMatrix();
    gl.glTranslatef(0.98f, 0.25f, -0.24f); // Translate to the middle layer position
    // Draw the board for the middle layer
    drawBoard(gl);
    gl.glPopMatrix();

    // Top layer (higher position)
    gl.glPushMatrix();
    gl.glTranslatef(0.98f, 0.55f, -0.24f); // Translate to the higher position
    // Draw the board for the top layer
    drawBoard(gl);
    gl.glPopMatrix();

    //----draw LEGS

    // Draw the lower legs
    gl.glPushMatrix();
    drawLeg(gl, -0.1f, -0.07f, -0.24f,0.1f); // Bottom left leg
    drawLeg(gl, 0.11f, -0.07f, -0.24f,0.1f);  // Bottom right leg
    drawLeg(gl, -0.1f, -0.07f, -0.04f,0.1f);  // Top left leg
    drawLeg(gl, 0.11f, -0.07f, -0.04f,0.1f);   // Top right leg
    gl.glPopMatrix();

    //middle legs
    gl.glPushMatrix();
    drawLeg(gl, -0.1f, 0.1f, -0.22f,0.46f); // Bottom left leg
    drawLeg(gl, 0.1f, 0.1f, -0.22f,0.46f);  // Bottom right leg
    drawLeg(gl, -0.1f, 0.1f, -0.04f,0.46f);  // Top left leg
    drawLeg(gl, 0.1f, 0.1f, -0.04f,0.46f);   // Top right leg
    gl.glPopMatrix();

    //upper leg 
    gl.glPushMatrix();
    drawLeg(gl, -0.1f, 0.44f, -0.22f,0.26f); // Bottom left leg
    drawLeg(gl, 0.1f, 0.44f, -0.22f,0.26f);  // Bottom right leg
    drawLeg(gl, -0.1f, 0.44f, -0.03f,0.26f);  // Top left leg
    drawLeg(gl, 0.1f, 0.44f, -0.03f,0.26f);   // Top right leg
    gl.glPopMatrix();

    }

    private void drawBoard(GL2 gl) {
    gl.glColor3f(0.8f, 0.7f, 0.7f); 
    gl.glBegin(GL_QUADS);
    gl.glVertex3f(-1.1f, 0f, 0f); // bottom left
    gl.glVertex3f(-0.85f, 0f, 0f); // bottom right
    gl.glVertex3f(-0.85f, 0.03f, 0f); // top right
    gl.glVertex3f(-1.1f, 0.03f, 0f); // top left
    gl.glEnd();

    // Top face of the drawer
    gl.glBegin(GL_QUADS);
    gl.glVertex3f(-1.1f, 0.03f, 0f); // bottom left
    gl.glVertex3f(-0.85f, 0.03f, 0f); // bottom right
    gl.glVertex3f(-0.85f, 0.03f, 0.25f); // top right
    gl.glVertex3f(-1.1f, 0.03f, 0.25f); // top left
    gl.glEnd();

    // Front face of the drawer
    gl.glBegin(GL_QUADS);
    gl.glVertex3f(-1.1f, 0f, 0.25f); // bottom left
    gl.glVertex3f(-0.85f, 0f, 0.25f); // bottom right
    gl.glVertex3f(-0.85f, 0.03f, 0.25f); // top right
    gl.glVertex3f(-1.1f,0.03f, 0.25f); // top left
    gl.glEnd();

    // Left side face of the drawer
    gl.glBegin(GL_QUADS);
    gl.glVertex3f(-1.1f, 0f, 0f);
    gl.glVertex3f(-1.1f, 0f, 0.25f);
    gl.glVertex3f(-1.1f,0.03f, 0.25f);
    gl.glVertex3f(-1.1f, 0.03f,0f); 
    gl.glEnd();

    // Right side face of the drawer
    gl.glBegin(GL_QUADS);
    gl.glVertex3f(-0.85f, 0f, 0f); 
    gl.glVertex3f(-0.85f, 0f, 0.25f);
    gl.glVertex3f(-0.85f, 0.03f, 0.25f);
    gl.glVertex3f(-0.85f, 0.03f,0f); 
    gl.glEnd();

    // Back face of the drawer
    gl.glBegin(GL_QUADS);
    gl.glVertex3f(-1.1f, 0f, 0f); // bottom left
    gl.glVertex3f(-0.85f, 0f, 0f); // bottom right
    gl.glVertex3f(-0.85f, 0.03f, 0f); // top right
    gl.glVertex3f(-1.1f,0.03f, 0f); // top left
    gl.glEnd();
    gl.glPopMatrix();

    }

    private void drawLeg(GL2 gl, float x, float y, float z,float length) {
        gl.glColor3f(0.5f, 0.5f, 0.5f); 
        gl.glPushMatrix();
        gl.glTranslatef(x, y, z); // Position the leg
        gl.glScalef(0.04f, length, 0.04f); // Scale the leg to desired dimensions
        glut.glutSolidCube(1.0f); // Draw the leg as a cube
        gl.glPopMatrix();
    }
}





