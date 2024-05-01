
package bedroom;

import com.jogamp.opengl.GL2;
import static com.jogamp.opengl.GL2.*;

public class Books {

    public void drawBooks(GL2 gl) {
    // Draw the first book
        gl.glPushMatrix();
        gl.glRotatef(45.0f, 0.0f, 1.0f, 0.0f); 
        gl.glTranslatef(-0.9f, -0.39f, -1.1f); // Translate to the first book's position
        Book(gl); // Draw the book
        gl.glPopMatrix(); // Restore the original transformation matrix
        
        // Draw the second book
        gl.glPushMatrix();
        gl.glTranslatef(-0.96f, -0.355f,-1.1f); // Translate to the first book's position
        Book(gl); // Draw the book
        gl.glPopMatrix(); // Restore the original transformation matrix
      }
    public void Book(GL2 gl) {
        // Apply rotation
        gl.glTranslatef(1.0f, 1f, 1.0f);
        gl.glRotatef(90, 1.0f, 0f, 0.0f);

        // Draw the book cover
        gl.glColor3f(0.2f, 0.2f, 0.2f); // Brown color for the cover
        gl.glBegin(GL_QUADS);
        
        // back cover
        gl.glVertex3f(-0.06f, -0.085f, 0.02f); // Bottom-left
        gl.glVertex3f(-0.06f, 0.086f, 0.02f);  // Top-left
        gl.glVertex3f(0.06f, 0.086f, 0.02f);   // Top-right
        gl.glVertex3f(0.06f, -0.085f, 0.02f);  // Bottom-right
        
        // front  cover
        gl.glVertex3f(-0.06f, -0.085f, -0.02f); // Bottom-left
        gl.glVertex3f(-0.06f, 0.086f, -0.02f);  // Top-left
        gl.glVertex3f(0.06f, 0.086f, -0.02f);   // Top-right
        gl.glVertex3f(0.06f, -0.085f, -0.02f);  // Bottom-right
        gl.glEnd();

        // Draw the solid part of the book (inner part)
        gl.glColor3f(1.0f, 1.0f, 1.0f); // White color for the inner part
      
        // Draw a cube representing the inner part of the book
        gl.glPushMatrix(); // Save the current matrix
        gl.glTranslatef(0.0f, 0.0f, 0.0f); // Translate to the center of the book
        drawCube(gl, 0.05f, 0.08f, 0.015f); 
        gl.glPopMatrix(); // Restore the saved matrix

        // Draw the book spine
        gl.glColor3f(0.2f, 0.2f, 0.2f); // Dark gray color for the spine
        // Spine
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.055f, -0.085f, -0.02f); // Bottom-left
        gl.glVertex3f(-0.055f, 0.085f, -0.02f);  // Top-left
        gl.glVertex3f(-0.055f, 0.085f, 0.02f);   // Top-right
        gl.glVertex3f(-0.055f, -0.085f, 0.02f);  // Bottom-right
        gl.glEnd();
    }


    // Helper method to draw a cube
    private void drawCube(GL2 gl, float width, float height, float depth) {
        // Front face
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-width , -height, depth );
        gl.glVertex3f(width , -height, depth );
        gl.glVertex3f(width , height , depth );
        gl.glVertex3f(-width , height , depth );
        gl.glEnd();

        // Back face
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-width , -height , -depth );
        gl.glVertex3f(width , -height , -depth );
        gl.glVertex3f(width , height , -depth );
        gl.glVertex3f(-width , height , -depth );
        gl.glEnd();

        // Left face
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-width , -height , -depth );
        gl.glVertex3f(-width , -height , depth );
        gl.glVertex3f(-width, height , depth );
        gl.glVertex3f(-width , height , -depth );
        gl.glEnd();

        // Right face
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(width , -height , -depth );
        gl.glVertex3f(width , -height , depth );
        gl.glVertex3f(width , height , depth );
        gl.glVertex3f(width , height, -depth);
        gl.glEnd();

        // Top face
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-width , height , -depth );
        gl.glVertex3f(width , height , -depth);
        gl.glVertex3f(width , height , depth );
        gl.glVertex3f(-width , height , depth);
        gl.glEnd();

        // Bottom face
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-width , -height , -depth );
        gl.glVertex3f(width , -height , -depth );
        gl.glVertex3f(width , -height , depth );
        gl.glVertex3f(-width , -height , depth );
        gl.glEnd();
    }
}