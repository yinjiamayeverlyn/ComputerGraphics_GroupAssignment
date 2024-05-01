
package bedroom;

import com.jogamp.opengl.GL2;
import static com.jogamp.opengl.GL2.*; // GL2 constants

public class Aircon {
    public void drawAircon(GL2 gl){
        //top
        gl.glColor3f(1.0f, 1.0f, 1.0f);        
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.89f, 0.95f, -1.0f);
        gl.glVertex3f(0.99f, 0.95f, -1.0f);
        gl.glVertex3f(0.99f, 0.95f, -0.6f);
        gl.glVertex3f(0.89f, 0.95f, -0.6f);
        gl.glEnd();
        
        //bottom
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.90f, 0.85f, -1.0f);
        gl.glVertex3f(0.99f, 0.85f, -1.0f);
        gl.glVertex3f(0.99f, 0.85f, -0.6f);
        gl.glVertex3f(0.90f, 0.85f, -0.6f);
        gl.glEnd();
        
        //front
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.89f, 0.95f, -1.0f);
        gl.glVertex3f(0.89f, 0.88f, -1.0f);
        gl.glVertex3f(0.89f, 0.88f, -0.6f);
        gl.glVertex3f(0.89f, 0.95f, -0.6f);
        gl.glEnd();
        
        //left
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.89f, 0.95f, -1.0f);
        gl.glVertex3f(0.99f, 0.95f, -1.0f);
        gl.glVertex3f(0.99f, 0.88f, -1.0f);
        gl.glVertex3f(0.89f, 0.88f, -1.0f);
        gl.glEnd();
        
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.89f, 0.88f, -1.0f);
        gl.glVertex3f(0.99f, 0.88f, -1.0f);
        gl.glVertex3f(0.99f, 0.85f, -1.0f);
        gl.glVertex3f(0.90f, 0.85f, -1.0f);
        gl.glEnd();
        
        //right
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.89f, 0.95f, -0.6f);
        gl.glVertex3f(0.99f, 0.95f, -0.6f);
        gl.glVertex3f(0.99f, 0.88f, -0.6f);
        gl.glVertex3f(0.89f, 0.88f, -0.6f);
        gl.glEnd();
        
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.89f, 0.88f, -0.6f);
        gl.glVertex3f(0.99f, 0.88f, -0.6f);
        gl.glVertex3f(0.99f, 0.85f, -0.6f);
        gl.glVertex3f(0.90f, 0.85f, -0.6f);
        gl.glEnd();
        
        //incline
        gl.glColor3f(0.05f, 0.05f, 0.05f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.89f, 0.88f, -1.0f);
        gl.glVertex3f(0.89f, 0.88f, -0.6f);
        gl.glVertex3f(0.90f, 0.85f, -0.6f);
        gl.glVertex3f(0.90f, 0.85f, -1.0f);
        gl.glEnd();
    }
}
