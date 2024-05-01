
package bedroom;

import com.jogamp.opengl.GL2;
import static com.jogamp.opengl.GL2.*; // GL2 constants

public class Window {
    public void drawWindow(GL2 gl) {
       gl.glPushMatrix();
       gl.glScalef(1.25f,1.25f,1.25f);

       gl.glTranslatef(-0.1f, -0.4f, -0.2f);

        //window
       gl.glColor3f(0.529f, 0.808f, 0.922f); // Light blue color
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(0.4f, 0.2f, 0.95f); // Adjust position and size as needed
       gl.glVertex3f(0.2f, 0.2f, 0.95f);
       gl.glVertex3f(0.2f, 0.7f, 0.95f);
       gl.glVertex3f(0.4f, 0.7f, 0.95f);
       gl.glEnd();
       
       gl.glColor3f(0.529f, 0.808f, 0.922f); // Light blue color
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(0.15f, 0.2f, 0.95f); // Adjust position and size as needed
       gl.glVertex3f(-0.05f, 0.2f, 0.95f);
       gl.glVertex3f(-0.05f, 0.7f, 0.95f);
       gl.glVertex3f(0.15f, 0.7f, 0.95f);
       gl.glEnd();
       
       //window border middle
       gl.glColor3f(0.0f, 0.0f, 0.0f); 
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(0.2f, 0.2f, 0.95f); 
       gl.glVertex3f(0.15f, 0.2f, 0.95f);
       gl.glVertex3f(0.15f, 0.7f, 0.95f);
       gl.glVertex3f(0.2f, 0.7f, 0.95f);
       gl.glEnd();
       
       //window border upward
        gl.glColor3f(0.0f, 0.0f, 0.0f); 
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(0.45f, 0.75f, 0.95f); 
       gl.glVertex3f(-0.1f, 0.75f, 0.95f);
       gl.glVertex3f(-0.1f, 0.7f, 0.95f);
       gl.glVertex3f(0.45f, 0.7f, 0.95f);
       gl.glEnd();
       
       gl.glColor3f(0.0f, 0.0f, 0.0f); 
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(0.45f, 0.75f, 0.95f); 
       gl.glVertex3f(-0.1f, 0.75f, 0.95f);
       gl.glVertex3f(-0.1f, 0.75f, 1.0f);
       gl.glVertex3f(0.45f, 0.75f, 1.0f);
       gl.glEnd(); 
       
       //window border downward
       gl.glColor3f(0.0f, 0.0f, 0.0f); 
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(0.45f, 0.15f, 0.95f); 
       gl.glVertex3f(-0.1f, 0.15f, 0.95f);
       gl.glVertex3f(-0.1f, 0.2f, 0.95f);
       gl.glVertex3f(0.45f, 0.2f, 0.95f);
       gl.glEnd();
       
        gl.glColor3f(0.0f, 0.0f, 0.0f); 
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(0.45f, 0.15f, 0.95f); 
       gl.glVertex3f(-0.1f, 0.15f, 0.95f);
       gl.glVertex3f(-0.1f,  0.15f, 1.0f);
       gl.glVertex3f(0.45f, 0.15f, 1.0f);
       gl.glEnd(); 
       
             //window border left
//       gl.glColor3f(0.0f, 0.0f, 0.0f); 
//       gl.glBegin(GL_QUADS);
//       gl.glVertex3f(0.45f, 0.75f, 0.95f); 
//       gl.glVertex3f(-0.1f, 0.75f, 0.95f);
//       gl.glVertex3f(-0.1f, 0.15f, 0.95f);
//       gl.glVertex3f(0.45f, 0.15f, 0.95f);
//       gl.glEnd();
//       
       
       gl.glColor3f(0.0f, 0.0f, 0.0f); 
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(0.4f, 0.2f, 0.95f); 
       gl.glVertex3f(0.45f, 0.2f, 0.95f);
       gl.glVertex3f(0.45f, 0.7f, 0.95f);
       gl.glVertex3f(0.4f, 0.7f, 0.95f);
       gl.glEnd();
       
       gl.glColor3f(0.0f, 0.0f, 0.0f); 
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(0.45f, 0.15f, 0.95f); 
       gl.glVertex3f(0.45f, 0.15f, 1.0f);
       gl.glVertex3f(0.45f, 0.75f, 1.0f);
       gl.glVertex3f(0.45f, 0.75f, 0.95f);
       gl.glEnd();
       
       //window border right
       gl.glColor3f(0.0f, 0.0f, 0.0f); 
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(-0.05f, 0.2f, 0.95f); 
       gl.glVertex3f(-0.1f, 0.2f, 0.95f);
       gl.glVertex3f(-0.1f, 0.7f, 0.95f);
       gl.glVertex3f(-0.05f, 0.7f, 0.95f);
       gl.glEnd();
       
       gl.glColor3f(0.0f, 0.0f, 0.0f); 
       gl.glBegin(GL_QUADS);
       gl.glVertex3f(-0.1f, 0.15f, 0.95f); 
       gl.glVertex3f(-0.1f, 0.15f, 1.0f);
       gl.glVertex3f(-0.1f, 0.75f, 1.0f);
       gl.glVertex3f(-0.1f, 0.75f, 0.95f);
       gl.glEnd();
       gl.glPopMatrix();
    }
}
