
package bedroom;

import com.jogamp.opengl.GL2;

public class Computer{
    
  public void drawComputer(GL2 gl,float translateX, float translateY, float translateZ){
    float compWidth = 0.26f ; // Adjust the width of the computer
    float compHeight = 0.015f; // Keep the height minimal
    float compDepth = 0.15f ; // Adjust the depth of the computer
    float rotationAngle = 20.0f;

    // Computer keyboard
    gl.glColor3f(0.1f, 0.1f, 0.1f); // Black color for computer keyboard
    gl.glPushMatrix();
    gl.glTranslatef(translateX , translateY , translateZ ); // Adjust position on the desk
    gl.glScalef(compWidth, compHeight , compDepth); // Scale computer size
    drawChairCube(gl);
    gl.glPopMatrix();

    // Calculate the position of the screen relative to the keyboard
    float screenTranslateX = translateX;
    float screenTranslateY = translateY + compHeight * 4.7f; // Adjust this value based on the desired height
    float screenTranslateZ = translateZ + compDepth /1.8f; // Position screen 

    // Draw computer screen
    gl.glColor3f(0.15f, 0.15f, 0.15f); // color for screen
    gl.glPushMatrix();
    gl.glTranslatef(screenTranslateX, screenTranslateY, screenTranslateZ); // Position the screen above the computer keyboard
    gl.glRotatef(rotationAngle, 1.0f, 0.0f, 0.0f); // Rotate around the y-axis
    gl.glScalef(compWidth, compHeight * 9.5f,  compDepth / 10); // Scale screen size
    drawChairCube(gl);
    gl.glPopMatrix();
    
     // Draw the white screen
    gl.glColor3f(1.0f, 1.0f, 1.0f); // White color for screen
    gl.glPushMatrix();
    gl.glTranslatef(screenTranslateX, screenTranslateY, screenTranslateZ-0.008f); // Position the screen above the computer keyboard
    gl.glRotatef(rotationAngle, 1.0f, 0.0f, 0.0f); // Rotate around the y-axis
    gl.glScalef(compWidth - 0.05f, compHeight * 9.45f - 0.05f, 0.01f); // Scale screen size slightly smaller
    drawChairCube(gl);
    gl.glPopMatrix();
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
