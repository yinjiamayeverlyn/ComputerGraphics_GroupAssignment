
package bedroom;

import com.jogamp.opengl.GL2;

public class Lamp {
    public void draw(GL2 gl) {
        gl.glPushMatrix();
        
        // Translate to position the lamp in the scene
        gl.glTranslatef(-0.90f, -0.8f, -0.2f); // 
        gl.glScalef(0.5f,0.5f,0.5f);

        // Draw lamp base
        gl.glColor3f(0.5f, 0.5f, 0.5f); // Gray color
        drawCube(gl, 0.13f, 0.05f, 0.13f); // Base cube
        
        // Draw lamp stand
        gl.glTranslatef(0.0f, 0.06f, 0.0f); // Move up from the base
        gl.glColor3f(0.7f, 0.7f, 0.7f); // Light gray color
        drawCube(gl, 0.05f, 0.1f, 0.05f); // Stand cube
        
        // Draw lamp 
        gl.glTranslatef(0.0f, 0.1f, 0.0f); // Move up from the stand
        gl.glColor3f(1.f, 1.0f, 1.0f); 
        drawCube(gl, 0.1f, 0.15f, 0.1f); 
        gl.glPopMatrix();
    }
    
    // Utility method to draw a cube
    private void drawCube(GL2 gl, float width, float height, float depth) {
        float halfWidth = width / 2;
        float halfHeight = height / 2;
        float halfDepth = depth / 2;
        
        // Front face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-halfWidth, -halfHeight, halfDepth);
        gl.glVertex3f(halfWidth, -halfHeight, halfDepth);
        gl.glVertex3f(halfWidth, halfHeight, halfDepth);
        gl.glVertex3f(-halfWidth, halfHeight, halfDepth);
        gl.glEnd();

        // Back face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-halfWidth, -halfHeight, -halfDepth);
        gl.glVertex3f(-halfWidth, halfHeight, -halfDepth);
        gl.glVertex3f(halfWidth, halfHeight, -halfDepth);
        gl.glVertex3f(halfWidth, -halfHeight, -halfDepth);
        gl.glEnd();

        // Top face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-halfWidth, halfHeight, -halfDepth);
        gl.glVertex3f(-halfWidth, halfHeight, halfDepth);
        gl.glVertex3f(halfWidth, halfHeight, halfDepth);
        gl.glVertex3f(halfWidth, halfHeight, -halfDepth);
        gl.glEnd();

        // Bottom face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-halfWidth, -halfHeight, -halfDepth);
        gl.glVertex3f(halfWidth, -halfHeight, -halfDepth);
        gl.glVertex3f(halfWidth, -halfHeight, halfDepth);
        gl.glVertex3f(-halfWidth, -halfHeight, halfDepth);
        gl.glEnd();

        // Left face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(-halfWidth, -halfHeight, -halfDepth);
        gl.glVertex3f(-halfWidth, -halfHeight, halfDepth);
        gl.glVertex3f(-halfWidth, halfHeight, halfDepth);
        gl.glVertex3f(-halfWidth, halfHeight, -halfDepth);
        gl.glEnd();

        // Right face
        gl.glBegin(GL2.GL_QUADS);
        gl.glVertex3f(halfWidth, -halfHeight, -halfDepth);
        gl.glVertex3f(halfWidth, halfHeight, -halfDepth);
        gl.glVertex3f(halfWidth, halfHeight, halfDepth);
        gl.glVertex3f(halfWidth, -halfHeight, halfDepth);
        gl.glEnd();
    }
    
}
