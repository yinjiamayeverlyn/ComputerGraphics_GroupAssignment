
package bedroom;

import com.jogamp.opengl.GL2;

public class Table {

    public void drawTable(GL2 gl,float translateX, float translateY, float translateZ){
    // Define desk dimensions
    
     gl.glRotatef(-90, 0, 1, 0); 
    float width = 0.5f; // Adjust width as needed
    float height = 0.1f; // Thin surface for the desk
    float depth = 0.4f; // Adjust depth as needed

    // Draw desk surface
    gl.glColor3f(0.6f, 0.4f, 0.2f); // Brown color for desk
    gl.glPushMatrix();
    gl.glTranslatef(translateX, translateY + height / 2.0f,  translateZ); // Move to the top of the desk
    gl.glScalef(width, height, depth); // Draw the desk surface
    drawChairCube(gl);
    gl.glPopMatrix();

    //  surface table cover 
    gl.glColor3f(0.5f, 0.3f, 0.0f); // Dark gray color for clothes
    gl.glPushMatrix();
    gl.glTranslatef(translateX, translateY + height + 0.01f * 0.75f, translateZ); // Move to the top of the clothes
    gl.glScalef(width, height / 8.0f, depth ); // Draw the clothes
    drawChairCube(gl);
    gl.glPopMatrix();
    
    // Draw desk legs with a new color
    gl.glColor3f(0.5f, 0.3f, 0.0f); //color for desk legs
    // Draw desk legs
    float legWidth = 0.05f;
    float legHeight = height * 3.0f; // Make the legs taller
    float legDepth = 0.05f;
    for (float x : new float[]{-width / 2.0f + legWidth / 2.0f, width / 2.0f - legWidth / 2.0f}) {
        for (float z : new float[]{-depth / 2.0f + legDepth / 2.0f, depth / 2.0f - legDepth / 2.0f}) {
            gl.glPushMatrix();
            gl.glTranslatef(translateX + x, translateY - height * 1.5f, translateZ + z); // Adjust the height of the legs
            gl.glScalef(legWidth, legHeight, legDepth);
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
