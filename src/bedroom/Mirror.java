package bedroom;

import com.jogamp.opengl.GL2;
import static com.jogamp.opengl.GL2.*; // GL2 constants

public class Mirror {
    public void drawMirror(GL2 gl) {
    // Light green color
    float redComponent = 0.8f;   // Red component
    float greenComponent = 1.0f; // Green component
    float blueComponent = 0.8f;  // Blue component

    // Set the new color
    gl.glColor3f(redComponent, greenComponent, blueComponent);


           //gl.glColor3f(0.529f, 0.808f, 0.922f); // Light blue color
           gl.glBegin(GL_QUADS);
           gl.glVertex3f(0.9f, -0.97f, -1.85f); // Adjust position and size as needed
           gl.glVertex3f(0.7f, -0.97f, -1.85f);
           gl.glVertex3f(0.7f, 0.0f, -1.98f);
           gl.glVertex3f(0.9f, 0.0f,-1.98f);
           gl.glEnd();

           gl.glColor3f(0.0f, 0.0f, 0.0f); 
           gl.glBegin(GL_QUADS);
           gl.glVertex3f(0.92f, -0.99f, -1.85f); 
           gl.glVertex3f(0.68f, -0.99f, -1.85f);
           gl.glVertex3f(0.68f, -0.97f, -1.98f);
           gl.glVertex3f(0.92f, -0.97f,-1.98f);
           gl.glEnd(); 

           gl.glColor3f(0.0f, 0.0f, 0.0f); 
           gl.glBegin(GL_QUADS);
           gl.glVertex3f(0.92f, -0.99f, -1.85f); 
           gl.glVertex3f(0.9f, -0.99f, -1.85f);
           gl.glVertex3f(0.9f, 0.0f, -1.98f);
           gl.glVertex3f(0.92f, 0.0f,-1.98f);
           gl.glEnd(); 

           gl.glColor3f(0.0f, 0.0f, 0.0f); 
           gl.glBegin(GL_QUADS);
           gl.glVertex3f(0.7f, -0.99f, -1.85f); 
           gl.glVertex3f(0.68f, -0.99f, -1.85f);
           gl.glVertex3f(0.68f, 0.0f, -1.98f);
           gl.glVertex3f(0.7f, 0.0f,-1.98f);
           gl.glEnd(); 

           gl.glColor3f(0.0f, 0.0f, 0.0f); 
           gl.glBegin(GL_QUADS);
           gl.glVertex3f(0.92f, 0.0f, -1.98f); 
           gl.glVertex3f(0.68f, 0.0f, -1.98f);
           gl.glVertex3f(0.68f, 0.02f, -1.98f);
           gl.glVertex3f(0.92f, 0.02f,-1.98f);
           gl.glEnd();
        }
    }

