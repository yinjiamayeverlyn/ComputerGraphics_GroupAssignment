
package bedroom;

/**
 *
 * @author yanxi
 */
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.util.gl2.GLUT;

public class Bed {
    private GLUT glut = new GLUT();
    
    public void drawBed(GL2 gl){
    gl.glRotatef(180.0f, 0.0f, 1.0f, 0.0f);
    gl.glTranslatef(-2.15f, 0.17f, -0.9f);
    gl.glScalef(0.015f, 0.015f, 0.015f);
    
    //Mattress  
    gl.glPushMatrix();
    gl.glTranslatef(35f, -5f, 40f);
    gl.glScalef(10f, 2f, 13f);
    gl.glColor3f(1.0f, 1.0f, 0.8f);
    glut.glutSolidCube(5);
    gl.glPopMatrix();
    
    //Blanket
    gl.glPushMatrix();
    gl.glTranslatef(35f, -0.5f, 35f);
    gl.glScalef(9.0f, 0.5f, 10f);
    gl.glColor3f(0.7f, 0.8f, 0.6f);
    glut.glutSolidCube(5);
    gl.glPopMatrix();

    //Bed frame
    gl.glPushMatrix();
    gl.glTranslatef(35.0f, -15f, 40.0f);
    gl.glScalef(12.0f ,2.0f ,15.0f);
    gl.glColor3f(0.2f, 0.1f, 0.0f);
    glut.glutSolidCube(5);
    gl.glPopMatrix();

    //Back frame
    gl.glPushMatrix();
    gl.glTranslatef(35.0f, 0.0f, 75f);
    gl.glScalef(12.0f,4.0f,1.0f);
    gl.glColor3f(0.2f, 0.1f, 0.0f);
    glut.glutSolidCube(5);
    gl.glPopMatrix();
    
    // Pillow
    gl.glPushMatrix(); 
    gl.glTranslatef(35f, 1f, 66f); // Adjust position
    gl.glScalef(3.5f, 0.5f, 2f); // Scale to appropriate size
    gl.glColor3f(0.7f, 0.8f, 0.6f);
    glut.glutSolidCube(5);
    gl.glPopMatrix();
    
    }
    
}

