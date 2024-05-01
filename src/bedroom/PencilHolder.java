
package bedroom;

import com.jogamp.opengl.GL2;
import com.jogamp.opengl.glu.GLU;

public class PencilHolder {
    public void drawPencilHolder(GL2 gl,GLU glu, float translateX, float translateY, float translateZ){
        // Define pencil holder dimensions
    float baseRadius = 0.03f;
    float baseHeight = 0.05f;
    float cylinderRadius = 0.03f;
    float cylinderHeight = 0.05f;
       gl.glRotatef(-90, 0, 1, 0); 
      gl.glTranslated(translateX, translateY, translateZ);
      // Draw the base of the pencil holder
      gl.glColor3f(0.5f, 0.0f, 0.0f); // red
      gl.glPushMatrix(); // Save the current matrix
      gl.glRotated(90, 1, 0, 0); // Rotate the base 90 degrees around the x-axis
      glu.gluCylinder(glu.gluNewQuadric(), cylinderRadius, cylinderRadius, 0.03, 32, 1);
      glu.gluDisk(glu.gluNewQuadric(),0, baseRadius, 32, 1); // Draw the solid cylinder as the base
      gl.glPopMatrix(); // Restore the previous matrix

      // Draw the cylinder part of the pencil holder
      gl.glColor3f(0.9f, 0.5f, 0.6f); // pink
      gl.glPushMatrix();
      gl.glRotated(90, 1, 0, 0); // Rotate the disk 90 degrees around the x-axis
      gl.glTranslated(0, 0, -baseHeight); // Move to the top of the base
      glu.gluCylinder(glu.gluNewQuadric(), cylinderRadius, cylinderRadius, cylinderHeight, 32, 1); // Draw the side of the base
      gl.glPopMatrix();

      float pencilLength = 0.1f ; 
      // Draw the body pencil(blue)
          gl.glColor3f(0.35f, 0.5f, 0.8f); 
           gl.glRotatef(-90, 0, 1, 0); 
          gl.glPushMatrix();
          gl.glTranslated(0, baseHeight+cylinderHeight, 0); // Move to the top of the pencil holder
          gl.glRotated(78, 1, 0, 0); // Rotate the pencil 90 degrees around the x-axis
          glu.gluCylinder(glu.gluNewQuadric(), 0.005, 0.005,pencilLength, 32, 1); // Draw the pencil
          gl.glPopMatrix();

            //  sharp part of  pencil
          gl.glColor3f(0.1f, 0.1f, 0.1f); //black
         //  gl.glRotatef(-90, 0, 1, 0); 
          gl.glPushMatrix();
          gl.glTranslated(0, 0.124, -0.005); // Move to the top of the pencil
          gl.glRotated(78, 1, 0, 0); // Rotate the pencil 90 degrees around the x-axis
          glu.gluCylinder(glu.gluNewQuadric(), 0.001, 0.005, 0.025, 32, 1); // Draw the sharp part of the pencil
          gl.glPopMatrix();


        //pencil 2 (green) 
      // Draw the body pencil
          gl.glColor3f(0.35f, 0.8f, 0.5f); //green pencil
          
          gl.glPushMatrix();
          gl.glTranslated(0.01, 0, -0.02); // Move to the top of the pencil holder
          gl.glRotated(308, 1, 0, 0); // Rotate the pencil 90 degrees around the x-axis
          glu.gluCylinder(glu.gluNewQuadric(), 0.005, 0.005,pencilLength, 32, 1); // Draw the pencil
          gl.glPopMatrix();

            //  sharp part of  pencil
          gl.glColor3f(0.1f, 0.1f, 0.1f); // gray
          
          gl.glPushMatrix();
          gl.glTranslated(0.008f, 0.096, 0.056); // Move to the top of the pencil
          gl.glRotated(128, 1, 0, 0); // Rotate the pencil 90 degrees around the x-axis
          glu.gluCylinder(glu.gluNewQuadric(), 0.001, 0.005, 0.025, 32, 1); // Draw the sharp part of the pencil
          gl.glPopMatrix();
          }

}


