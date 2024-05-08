package bedroom;

import com.jogamp.opengl.GL2;

public class Fan {
    private float rotationAngle = 0.0f;

    public void drawFan(GL2 gl) {
        gl.glPushMatrix();
        //define translation value to position the fan
        float translationX = 0.0f;
        float translationY = 1.23f;
        float translationZ = -0.8f;
        
        //apply translation to position the fan
        gl.glTranslatef(translationX, translationY, translationZ);
        
        //scale down the size of the fan
        gl.glScalef(0.25f,0.25f,0.25f);
        
        // Draw the main body of the fan (Cube)
        gl.glPushMatrix(); // Push the current matrix onto the stack to save its state
        gl.glColor3f(1.0f, 1.0f, 1.0f); // Set color to white
        gl.glScalef(1, 1.2f, 1); // Scale the main body
        gl.glScalef(0.5f, 0.4f, 0.5f); // Scale the main body
        gl.glTranslatef(0, -2.0f, 0); // Translate the main body
        gl.glScalef(1.0f, 0.7f, 1.0f); // Scale the main body
        gl.glTranslatef(0, -0.5f, 0); // Translate the main body
        glutSolidCube(gl, 1); // Draw the main body of the fan
        gl.glPopMatrix(); // Pop the matrix stack to revert to the previous state

        
        //draw the rotating blandes of the fan
        gl.glPushMatrix();
        gl.glRotatef(rotationAngle, 0.0f, 1.0f, 0.0f);

        gl.glPushMatrix();
        gl.glTranslatef(0, -1.05f, 0);
        gl.glScalef(0.15f, .15f, .15f);
        gl.glTranslatef(0.0f, -2.2f, 0.0f);
        gl.glBegin(GL2.GL_QUAD_STRIP);
        for (int j = 0; j <= 360; j += DEF_D) {
            gl.glColor3f(0.3f, 0.2f, 0.0f);
            gl.glVertex3f(cos(j), +1, sin(j));
            gl.glColor3f(0.6f, 0.3f, 0.0f);
            gl.glVertex3f(cos(j), -1, sin(j));
        }
        gl.glEnd();
        gl.glPopMatrix();

        //SolidTorus
        gl.glPushMatrix();
        gl.glColor3f(.3f, .3f, .3f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glTranslatef(0, 0, 1.55f);
        gl.glScalef(.25f, .25f, .25f);
        glutSolidTorus(gl, .1f, .72f, 25, 25);
        gl.glPopMatrix();

        gl.glPushMatrix();

        //first blandes
        gl.glPushMatrix();
        gl.glColor3f(0.0f, 0.0f, 0.4f);
        gl.glTranslatef(-1, -1.55f, 0);
        gl.glScalef(2.5f, .1f, .75f);
        glutSolidCube(gl, .5f);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(0, -1.55f, 0);
        gl.glScalef(0.05f, .11f, .05f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glTranslatef(0, 0, -5);
        gl.glScalef(1, 1, 2.4f);
        gl.glBegin(GL2.GL_QUAD_STRIP);
        for (int j = 0; j <= 360; j += DEF_D) {
            gl.glColor3f(.3f, .3f, .3f);
            gl.glVertex3f(cos(j), +1, sin(j));
            gl.glColor3f(.7f, .7f, .7f);
            gl.glVertex3f(cos(j), -1, sin(j));
        }
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPopMatrix();

        //second blandes
        gl.glPushMatrix();
        gl.glRotatef(90, 0, 1, 0);
        gl.glPushMatrix();
        gl.glColor3f(0.0f, 0.0f, 0.4f);
        gl.glTranslatef(-1, -1.55f, 0);
        gl.glScalef(2.5f, .1f, .75f);
        glutSolidCube(gl, .5f);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(0, -1.55f, 0);
        gl.glScalef(0.05f, .11f, .05f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glTranslatef(0, 0, -5);
        gl.glScalef(1, 1, 2.4f);
        gl.glBegin(GL2.GL_QUAD_STRIP);
        for (int j = 0; j <= 360; j += DEF_D) {
            gl.glColor3f(.3f, .3f, .3f);
            gl.glVertex3f(cos(j), +1, sin(j));
            gl.glColor3f(.7f, .7f, .7f);
            gl.glVertex3f(cos(j), -1, sin(j));
        }
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPopMatrix();

        //Draw blade 3
        gl.glPushMatrix();
        gl.glRotatef(180, 0, 1, 0);

        gl.glPushMatrix();
        gl.glColor3f(0.0f, 0.0f, 0.4f);
        gl.glTranslatef(-1, -1.55f, 0);
        gl.glScalef(2.5f, .1f, .75f);
        glutSolidCube(gl, .5f);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(0, -1.55f, 0);
        gl.glScalef(0.05f, .11f, .05f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glTranslatef(0, 0, -5);
        gl.glScalef(1, 1, 2.4f);
        gl.glBegin(GL2.GL_QUAD_STRIP);
        for (int j = 0; j <= 360; j += DEF_D) {
            gl.glColor3f(.3f, .3f, .3f);
            gl.glVertex3f(cos(j), +1, sin(j));
            gl.glColor3f(.7f, .7f, .7f);
            gl.glVertex3f(cos(j), -1, sin(j));
        }
        gl.glEnd();
        gl.glPopMatrix();

        gl.glPopMatrix();
        
        //forth blandes 
        gl.glPushMatrix();
        gl.glRotatef(270, 0, 1, 0);
        gl.glPushMatrix();
        gl.glColor3f(0.0f, 0.0f, 0.4f);
        gl.glTranslatef(-1, -1.55f, 0);
        gl.glScalef(2.5f, .1f, .75f);
        glutSolidCube(gl, .5f);
        gl.glPopMatrix();

        gl.glPushMatrix();
        gl.glTranslatef(0, -1.55f, 0);
        gl.glScalef(0.05f, .11f, .05f);
        gl.glRotatef(90, 1, 0, 0);
        gl.glRotatef(90, 0, 1, 0);
        gl.glTranslatef(0, 0, -5);
        gl.glScalef(1, 1, 2.4f);
        gl.glBegin(GL2.GL_QUAD_STRIP);
        for (int j = 0; j <= 360; j += DEF_D) {
            gl.glColor3f(.3f, .3f, .3f);
            gl.glVertex3f(cos(j), +1, sin(j));
            gl.glColor3f(.7f, .7f, .7f);
            gl.glVertex3f(cos(j), -1, sin(j));
        }
        gl.glEnd();
        gl.glPopMatrix();
        gl.glPopMatrix();

        gl.glPopMatrix();
        gl.glPopMatrix(); 
    }

    public void rotateFan() {
        rotationAngle += 1.5f;
    }

    // Constants and utility methods go here

    private static final float DEF_D = 1.0f;

    private static float cos(float angle) {
        return (float) Math.cos(Math.toRadians(angle));
    }

    private static float sin(float angle) {
        return (float) Math.sin(Math.toRadians(angle));
    }

    private static void glutSolidCube(GL2 gl, float size) {
        float halfSize = size * 0.5f;

        gl.glEnableClientState(GL2.GL_VERTEX_ARRAY);
        gl.glEnableClientState(GL2.GL_NORMAL_ARRAY);

        gl.glBegin(GL2.GL_QUADS);
        // Front face
        gl.glNormal3f(0, 0, 1);
        gl.glVertex3f(-halfSize, -halfSize, halfSize);
        gl.glVertex3f(halfSize, -halfSize, halfSize);
        gl.glVertex3f(halfSize, halfSize, halfSize);
        gl.glVertex3f(-halfSize, halfSize, halfSize);
        // Back face
        gl.glNormal3f(0, 0, -1);
        gl.glVertex3f(-halfSize, -halfSize, -halfSize);
        gl.glVertex3f(-halfSize, halfSize, -halfSize);
        gl.glVertex3f(halfSize, halfSize, -halfSize);
        gl.glVertex3f(halfSize, -halfSize, -halfSize);
        // Top face
        gl.glNormal3f(0, 1, 0);
        gl.glVertex3f(-halfSize, halfSize, -halfSize);
        gl.glVertex3f(-halfSize, halfSize, halfSize);
        gl.glVertex3f(halfSize, halfSize, halfSize);
        gl.glVertex3f(halfSize, halfSize, -halfSize);
        // Bottom face
        gl.glNormal3f(0, -1, 0);
        gl.glVertex3f(-halfSize, -halfSize, -halfSize);
        gl.glVertex3f(halfSize, -halfSize, -halfSize);
        gl.glVertex3f(halfSize, -halfSize, halfSize);
        gl.glVertex3f(-halfSize, -halfSize, halfSize);
        // Right face
        gl.glNormal3f(1, 0, 0);
        gl.glVertex3f(halfSize, -halfSize, -halfSize);
        gl.glVertex3f(halfSize, halfSize, -halfSize);
        gl.glVertex3f(halfSize, halfSize, halfSize);
        gl.glVertex3f(halfSize, -halfSize, halfSize);
        // Left face
        gl.glNormal3f(-1, 0, 0);
        gl.glVertex3f(-halfSize, -halfSize, -halfSize);
        gl.glVertex3f(-halfSize, -halfSize, halfSize);
        gl.glVertex3f(-halfSize, halfSize, halfSize);
        gl.glVertex3f(-halfSize, halfSize, -halfSize);
        gl.glEnd();

        gl.glDisableClientState(GL2.GL_VERTEX_ARRAY);
        gl.glDisableClientState(GL2.GL_NORMAL_ARRAY);
    }


    private static void glutSolidTorus(GL2 gl, float innerRadius, float outerRadius, int sides, int rings) {
        float thetaMajor, thetaMinor;
        float[] vertex = new float[3];

        for (int i = 0; i < rings; i++) {
            thetaMajor = i * 2.0f * (float) Math.PI / rings;
            gl.glBegin(GL2.GL_QUAD_STRIP);
            for (int j = 0; j <= sides; j++) {
                thetaMinor = j * 2.0f * (float) Math.PI / sides;
                vertex[0] = (float) Math.cos(thetaMajor) * (outerRadius + innerRadius * (float) Math.cos(thetaMinor));
                vertex[1] = (float) Math.sin(thetaMajor) * (outerRadius + innerRadius * (float) Math.cos(thetaMinor));
                vertex[2] = innerRadius * (float) Math.sin(thetaMinor);
                gl.glVertex3fv(vertex, 0);
            }
            gl.glEnd();
        }
    }
}
