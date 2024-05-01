
package bedroom;

import com.jogamp.opengl.GL2;

public class Chair {
    
    public void drawChair(GL2 gl, float translateX, float translateY, float translateZ){
        // Define chair dimensions
    float width = 0.25f; // Adjust width as needed
    float height = 0.3f; // Adjust height as needed
    float depth = 0.28f; // Adjust depth as needed

    float legWidth = 0.04f;
    float legHeight = 0.2f;
    
    // Draw chair backrest
    gl.glColor3f(0.2f, 0.1f, 0.0f); // Gray color for backrest
    gl.glPushMatrix();
    gl.glTranslatef(translateX, translateY + legHeight -0.15f, translateZ-0.11f ); // Position the backrest
    gl.glScalef(width, height, 0.065f); // Draw the backrest
    drawChairCube(gl);
    gl.glPopMatrix();

    // Draw chair seat
    gl.glColor3f(0.2f, 0.1f, 0.0f); // Gray color for seat
    gl.glPushMatrix();
    gl.glTranslatef(translateX,  translateY -0.25f+ legHeight -0.1f , translateZ); // Position the seat
    gl.glScalef(width, 0.1f, depth); // Draw the seat
    drawChairCube(gl);
    gl.glPopMatrix();
    
    // Draw chair legs
   
    gl.glColor3f(0.2f, 0.1f, 0.0f); // Gray color for legs
    for (float x : new float[]{-width / 2.0f + legWidth / 2.0f, width / 2.0f - legWidth / 2.0f}) {
        for (float z : new float[]{-depth / 2.0f + legWidth / 2.0f, depth / 2.0f - legWidth / 2.0f}) {
            gl.glPushMatrix();
            gl.glTranslatef(translateX + x, translateY - 0.25f , translateZ + z); // Position the legs
            gl.glScalef(legWidth, legHeight, legWidth); // Draw the legs
            drawChairCube(gl);
            gl.glPopMatrix();
        }
    }
    }

    private void drawChairCube(GL2 gl) {
// Front face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-0.5f, -0.5f, 0.5f);
        gl.glVertex3f(0.5f, -0.5f, 0.5f);
        gl.glVertex3f(0.5f, 0.5f, 0.5f);
        gl.glVertex3f(-0.5f, 0.5f, 0.5f);
        gl.glEnd();

        // Back face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-0.5f, -0.5f, -0.5f);
        gl.glVertex3f(-0.5f, 0.5f, -0.5f);
        gl.glVertex3f(0.5f, 0.5f, -0.5f);
        gl.glVertex3f(0.5f, -0.5f, -0.5f);
        gl.glEnd();

        // Top face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-0.5f, 0.5f, -0.5f);
        gl.glVertex3f(-0.5f, 0.5f, 0.5f);
        gl.glVertex3f(0.5f, 0.5f, 0.5f);
        gl.glVertex3f(0.5f, 0.5f, -0.5f);
        gl.glEnd();

        // Bottom face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-0.5f, -0.5f, -0.5f);
        gl.glVertex3f(0.5f, -0.5f, -0.5f);
        gl.glVertex3f(0.5f, -0.5f, 0.5f);
        gl.glVertex3f(-0.5f, -0.5f, 0.5f);
        gl.glEnd();

        // Right face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(0.5f, -0.5f, -0.5f);
        gl.glVertex3f(0.5f, 0.5f, -0.5f);
        gl.glVertex3f(0.5f, 0.5f, 0.5f);
        gl.glVertex3f(0.5f, -0.5f, 0.5f);
        gl.glEnd();

        // Left face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-0.5f, -0.5f, -0.5f);
        gl.glVertex3f(-0.5f, -0.5f, 0.5f);
        gl.glVertex3f(-0.5f, 0.5f, 0.5f);
        gl.glVertex3f(-0.5f, 0.5f, -0.5f);
        gl.glEnd();

    }
}
