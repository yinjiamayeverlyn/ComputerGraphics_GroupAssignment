
package bedroom;

import static com.jogamp.opengl.GL.GL_TRIANGLE_FAN;
import static com.jogamp.opengl.GL2ES3.GL_QUADS;
import com.jogamp.opengl.GL2;

public class Luggage {

    public void drawLuggage(GL2 gl) {
        gl.glPushMatrix();

        //behind
        gl.glColor3f(0.0f, 0.3f, 0.4f); 
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.10f, -0.94f, -1.90f);
        gl.glVertex3f(0.40f, -0.94f, -1.90f);
        gl.glVertex3f(0.40f, -0.40f, -1.90f);
        gl.glVertex3f(0.10f, -0.40f, -1.90f);
        gl.glEnd();

        //front
        gl.glColor3f(0.0f, 0.3f, 0.4f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.10f, -0.94f, -1.70f);
        gl.glVertex3f(0.40f, -0.94f, -1.70f);
        gl.glVertex3f(0.40f, -0.40f, -1.70f);
        gl.glVertex3f(0.10f, -0.40f, -1.70f);
        gl.glEnd();
        
        //front
        gl.glColor3f(1.0f, 0.5f, 0.5f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.20f, -0.80f, -1.69f);
        gl.glVertex3f(0.30f, -0.80f, -1.69f);
        gl.glVertex3f(0.30f, -0.60f, -1.69f);
        gl.glVertex3f(0.20f, -0.60f, -1.69f);
        gl.glEnd();
        
        //top
        gl.glColor3f(0.0f, 0.3f, 0.4f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.10f, -0.40f, -1.70f);
        gl.glVertex3f(0.40f, -0.40f, -1.70f);
        gl.glVertex3f(0.40f, -0.40f, -1.90f);
        gl.glVertex3f(0.10f, -0.40f, -1.90f);
        gl.glEnd();
        // handle top
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.20f, -0.20f, -1.80f);
        gl.glVertex3f(0.30f, -0.20f, -1.80f);
        gl.glVertex3f(0.30f, -0.20f, -1.85f);
        gl.glVertex3f(0.20f, -0.20f, -1.85f);
        gl.glEnd();

        // handle bottom
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.20f, -0.22f, -1.80f);
        gl.glVertex3f(0.30f, -0.22f, -1.80f);
        gl.glVertex3f(0.30f, -0.22f, -1.85f);
        gl.glVertex3f(0.20f, -0.22f, -1.85f);
        gl.glEnd();

        // handle front
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.20f, -0.20f, -1.80f);
        gl.glVertex3f(0.30f, -0.20f, -1.80f);
        gl.glVertex3f(0.30f, -0.22f, -1.80f);
        gl.glVertex3f(0.20f, -0.22f, -1.80f);
        gl.glEnd();

        // handle behind
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.20f, -0.20f, -1.85f);
        gl.glVertex3f(0.30f, -0.20f, -1.85f);
        gl.glVertex3f(0.30f, -0.22f, -1.85f);
        gl.glVertex3f(0.20f, -0.22f, -1.85f);
        gl.glEnd();

        // handle left
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.20f, -0.20f, -1.85f);
        gl.glVertex3f(0.20f, -0.20f, -1.80f);
        gl.glVertex3f(0.20f, -0.22f, -1.80f);
        gl.glVertex3f(0.20f, -0.22f, -1.85f);
        gl.glEnd();

        // handle right
        gl.glColor3f(0.0f, 0.0f, 0.0f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.30f, -0.20f, -1.85f);
        gl.glVertex3f(0.30f, -0.20f, -1.80f);
        gl.glVertex3f(0.30f, -0.22f, -1.80f);
        gl.glVertex3f(0.30f, -0.22f, -1.85f);
        gl.glEnd();

        // support left
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.20f, -0.40f, -1.80f);
        gl.glVertex3f(0.20f, -0.40f, -1.85f);
        gl.glVertex3f(0.20f, -0.22f, -1.85f);
        gl.glVertex3f(0.20f, -0.22f, -1.80f);
        gl.glEnd();
        
        // support right
        gl.glColor3f(0.7f, 0.7f, 0.7f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.30f, -0.40f, -1.80f);
        gl.glVertex3f(0.30f, -0.40f, -1.85f);
        gl.glVertex3f(0.30f, -0.22f, -1.85f);
        gl.glVertex3f(0.30f, -0.22f, -1.80f);
        gl.glEnd();
        
        //down
        gl.glColor3f(0.0f, 0.3f, 0.4f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.10f, -0.94f, -1.70f);
        gl.glVertex3f(0.40f, -0.94f, -1.70f);
        gl.glVertex3f(0.40f, -0.94f, -1.90f);
        gl.glVertex3f(0.10f, -0.94f, -1.90f);
        gl.glEnd();

        // Circles under each corner
        float radius = 0.05f;
        int numSegments = 50;
        float centerX[] = {0.15f, 0.35f, 0.15f, 0.35f};
        float centerZ[] = {-1.75f, -1.75f, -1.85f, -1.85f};

        gl.glColor3f(0.0f, 0.0f, 0.0f);
        for (int i = 0; i < 4; i++) {
            float theta = 0;
            float angleIncrement = (float) (2.0 * Math.PI / numSegments);

            gl.glBegin(GL_TRIANGLE_FAN);
            gl.glVertex3f(centerX[i], -0.94f, centerZ[i]); // Center of the circle
            for (int j = 0; j <= numSegments; j++) {
                float x = (float) (centerX[i] + radius * Math.cos(theta));
                float y = -0.94f + radius * (float) Math.sin(theta); // Adjust y-coordinate
                gl.glVertex3f(x, y, centerZ[i]);
                theta += angleIncrement;
            }
            gl.glEnd();
        }

        //left
        gl.glColor3f(0.0f, 0.3f, 0.4f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.10f, -0.94f, -1.70f);
        gl.glVertex3f(0.10f, -0.94f, -1.90f);
        gl.glVertex3f(0.10f, -0.40f, -1.90f);
        gl.glVertex3f(0.10f, -0.40f, -1.70f);
        gl.glEnd();
        //right
         gl.glColor3f(0.0f, 0.3f, 0.4f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.40f, -0.94f, -1.70f);
        gl.glVertex3f(0.40f, -0.94f, -1.90f);
        gl.glVertex3f(0.40f, -0.40f, -1.90f);
        gl.glVertex3f(0.40f, -0.40f, -1.70f);
        gl.glEnd();
        gl.glPopMatrix();

    }
}
