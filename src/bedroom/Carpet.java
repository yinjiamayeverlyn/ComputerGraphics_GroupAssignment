
package bedroom;

import com.jogamp.opengl.GL2;
import static com.jogamp.opengl.GL2.*; // GL2 constants

public class Carpet {

    public void drawCarpet(GL2 gl) {

        gl.glColor3f(0.8f, 0.8f, 0.7f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.1f, -0.98f, 0.0f);
        gl.glVertex3f(0.7f, -0.98f, 0.0f);
        gl.glVertex3f(0.7f, -0.98f, 0.9f);
        gl.glVertex3f(0.1f, -0.98f, 0.9f);
        gl.glEnd();

        gl.glColor3f(0.6f, 0.6f, 0.5f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.7f, -0.98f, 0.0f);
        gl.glVertex3f(0.7f, -0.99f, 0.0f);
        gl.glVertex3f(0.7f, -0.99f, 0.9f);
        gl.glVertex3f(0.7f, -0.98f, 0.9f);
        gl.glEnd();

        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.1f, -0.98f, 0.0f);
        gl.glVertex3f(0.1f, -0.99f, 0.0f);
        gl.glVertex3f(0.1f, -0.99f, 0.9f);
        gl.glVertex3f(0.1f, -0.98f, 0.9f);
        gl.glEnd();

        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.1f, -0.98f, 0.9f);
        gl.glVertex3f(0.1f, -0.99f, 0.9f);
        gl.glVertex3f(0.7f, -0.99f, 0.9f);
        gl.glVertex3f(0.7f, -0.98f, 0.9f);
        gl.glEnd();

        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.1f, -0.98f, 0.0f);
        gl.glVertex3f(0.1f, -0.99f, 0.0f);
        gl.glVertex3f(0.7f, -0.99f, 0.0f);
        gl.glVertex3f(0.7f, -0.98f, 0.0f);
        gl.glEnd();
    }

}

