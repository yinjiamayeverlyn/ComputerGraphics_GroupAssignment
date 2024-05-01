
package bedroom;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;
        
public class PottedPlant {
    public void drawPottedPlant(GL2 gl,GLU glu, float translateX, float translateY, float translateZ){
        // Define pot dimensions
    float potRadius = 0.04f;
    float potHeight = 0.075f;
    float plantHeight = 0.1f;

    gl.glRotatef(-90, 0, 1, 0); 
    // Move the entire potted plant according to the translateX, translateY, and translateZ parameters
    gl.glTranslated(translateX, translateY, translateZ);

    // Draw the pot
    gl.glColor3f(0.95f, 0.5f, 0.1f); // brown
    gl.glPushMatrix();
    gl.glRotated(90, 1, 0, 0); // Rotate the pot 90 degrees around the x-axis
    glu.gluCylinder(glu.gluNewQuadric(), potRadius, potRadius, potHeight, 32, 1);
    glu.gluDisk(glu.gluNewQuadric(), 0, potRadius, 32, 1); // Draw the bottom disk of the pot
    gl.glPopMatrix();

    //leaf
   // Define parameters for the leaves
    float leafAngles[] = {-40,-60,-90,-120,-140}; // Angles for the leaves
    int numLeaves = leafAngles.length; // Number of leaves

    for (int leafIndex = 0; leafIndex < numLeaves; leafIndex++) {
        float angle = leafAngles[leafIndex];
        gl.glColor3f(0f, 0.5f, 0f);
        gl.glPushMatrix();
        gl.glTranslated(0, -0.01, 0); // Move to the top of the pot
        gl.glRotated(angle, 1, 0, 0); // Rotate the leaf
        gl.glBegin(GL2.GL_TRIANGLE_FAN); // Begin drawing triangle fan
        gl.glVertex3f(0, 0, plantHeight); // Center of the oval
        float radiusX = 0.04f; // X radius of the oval
        float radiusY = 0.02f; // Y radius of the oval
        int numSegments = 32; // Number of segments to approximate the oval
        for (int i = 0; i <= numSegments; i++) {
            double angleRad = 2 * Math.PI * i / numSegments;
            float x = (float) (radiusX * Math.cos(angleRad));
            float y = (float) (radiusY * Math.sin(angleRad));
            gl.glVertex3f(x, y, 0);
        }
        gl.glEnd(); // End drawing triangle fan
        gl.glPopMatrix();
        }
    }

}

