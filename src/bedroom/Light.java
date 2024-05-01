package bedroom;

import com.jogamp.opengl.GL2;

public class Light {
    public void drawLight(GL2 gl) {
        gl.glPushMatrix();
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Set color to white
        gl.glTranslatef(0.0f, 0.99f, 0.2f); // Translate to the desired position
        gl.glScalef(0.25f,0.25f,0.25f);

        // Draw the rectangular prism
        gl.glBegin(GL2.GL_QUADS);
        
        // Front face
        gl.glVertex3f(-0.7f, -0.5f, 0.5f); // Bottom-left
        gl.glVertex3f(0.5f, -0.5f, 0.5f);  // Bottom-right
        gl.glVertex3f(0.5f, 0.0f, 0.5f);   // Top-right
        gl.glVertex3f(-0.7f, 0.0f, 0.5f);  // Top-left

        // Back face
        gl.glVertex3f(-0.7f, -0.5f, -0.5f); // Bottom-left
        gl.glVertex3f(-0.7f, 0.0f, -0.5f);  // Top-left
        gl.glVertex3f(0.5f, 0.0f, -0.5f);   // Top-right
        gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom-right

        // Top face
        gl.glVertex3f(-0.7f, 0.0f, -0.5f);  // Bottom-left
        gl.glVertex3f(-0.7f, 0.0f, 0.5f);   // Top-left
        gl.glVertex3f(0.5f, 0.0f, 0.5f);    // Top-right
        gl.glVertex3f(0.5f, 0.0f, -0.5f);   // Bottom-right

        // Bottom face
        gl.glVertex3f(-0.7f, -0.5f, -0.5f); // Bottom-left
        gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom-right
        gl.glVertex3f(0.5f, -0.5f, 0.5f);   // Top-right
        gl.glVertex3f(-0.7f, -0.5f, 0.5f);  // Top-left

        // Right face
        gl.glVertex3f(0.5f, -0.5f, -0.5f);  // Bottom-left
        gl.glVertex3f(0.5f, 0.0f, -0.5f);   // Top-left
        gl.glVertex3f(0.5f, 0.0f, 0.5f);    // Top-right
        gl.glVertex3f(0.5f, -0.5f, 0.5f);   // Bottom-right

        // Left face
        gl.glVertex3f(-0.7f, -0.5f, -0.5f); // Bottom-left
        gl.glVertex3f(-0.7f, -0.5f, 0.5f);  // Bottom-right
        gl.glVertex3f(-0.7f, 0.0f, 0.5f);   // Top-right
        gl.glVertex3f(-0.7f, 0.0f, -0.5f);  // Top-left
        
        gl.glEnd();
        gl.glPopMatrix();
    }
}
