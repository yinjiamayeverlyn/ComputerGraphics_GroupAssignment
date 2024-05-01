
package bedroom;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import com.jogamp.opengl.GL2;
import com.jogamp.opengl.GLAutoDrawable;
import com.jogamp.opengl.GLEventListener;
import com.jogamp.opengl.awt.GLCanvas;
import com.jogamp.opengl.glu.GLU;
import com.jogamp.opengl.util.FPSAnimator;
import static com.jogamp.opengl.GL.*;  // GL constants
import static com.jogamp.opengl.GL2.*; // GL2 constants

@SuppressWarnings("serial")
public class Bedroom extends GLCanvas implements GLEventListener, KeyListener, MouseListener, MouseMotionListener{
        //Define constants for the top-level container
        private static String TITLE = "Bedroom";
        private static final int CANVAS_WIDTH = 1000;  // width of the drawable
        private static final int CANVAS_HEIGHT = 800; // height of the drawable
        private static final int FPS = 60; // animator's target frames per second

        private Lamp lamp;
        private Window window;
        private Aircon aircon;
        private Fan fan;
        private Light light;
        private Mirror mirror;
        private Table table;
        private Chair chair;
        private PottedPlant pottedPlant;
        private PencilHolder pencilHolder;
        private Computer computer;
        private Drawer drawer;
        private Carpet carpet;
        private Wardrobe wardrobe;
        private BookShelf bookShelf;
        private Books books;
        private Bed bed;
        private Tshirt tshirt;
        private Luggage luggage;
       
        private static final float MOVE_SPEED = 0.1f;
        private static final float ROTATE_SPEED = 0.5f;
        private static final float MOUSE_SENSITIVITY = 0.1f;

        private int lastMouseX, lastMouseY;

       /** The entry main() method to setup the top-level container and animator */
    public static void main(String[] args) {
      // Run the GUI codes in the event-dispatching thread for thread safety
      SwingUtilities.invokeLater(new Runnable() {
         @Override
         public void run() {
            // Create the OpenGL rendering canvas
            GLCanvas canvas = new Bedroom();
            canvas.setPreferredSize(new Dimension(CANVAS_WIDTH, CANVAS_HEIGHT));

            // Create a animator that drives canvas' display() at the specified FPS. 
            final FPSAnimator animator = new FPSAnimator(canvas, FPS, true);
            
            // Create the top-level container
            final JFrame frame = new JFrame(); // Swing's JFrame or AWT's Frame
            frame.getContentPane().add(canvas);
            frame.addWindowListener(new WindowAdapter() {
               @Override 
               public void windowClosing(WindowEvent e) {
                  // Use a dedicate thread to run the stop() to ensure that the
                  // animator stops before program exits.
                  new Thread() {
                     @Override 
                     public void run() {
                        if (animator.isStarted()) animator.stop();
                        System.exit(0);
                     }
                  }.start();
               }
            });
            frame.setTitle(TITLE);
            frame.pack();
            frame.setVisible(true);
            animator.start(); // start the animation loop
            canvas.requestFocusInWindow();
         }
      });
   }
      
   private GLU glu;  // for the GL Utility
   
    private float cameraX = 0;
    private float cameraY = 0;
    private float cameraZ = 3;
    private float cameraYaw = 0;
    private float cameraPitch = 0;
   
   public Bedroom (){
        lamp = new Lamp();
        window = new Window();
        aircon = new Aircon();
        fan = new Fan();
        light = new Light();
        mirror = new Mirror();
        table = new Table();
        chair = new Chair();
        pottedPlant = new PottedPlant();
        pencilHolder = new PencilHolder();
        computer = new Computer();
        drawer = new Drawer();
        carpet = new Carpet();
        wardrobe = new Wardrobe();
        bookShelf = new BookShelf();
        books = new Books();
        bed = new Bed();
        tshirt = new Tshirt();
        luggage = new Luggage();
        
        this.addGLEventListener(this);
        this.addKeyListener(this);
        this.addMouseListener(this);
        this.addMouseMotionListener(this);
   }
    @Override
    public void init(GLAutoDrawable drawable) {
    GL2 gl = drawable.getGL().getGL2();      // get the OpenGL graphics context
      glu = new GLU();                         // get GL Utilities
      gl.glClearColor(0.0f, 0.0f, 0.0f, 0.0f); // set background (clear) color
      gl.glClearDepth(1.0f);      // set clear depth value to farthest
      gl.glEnable(GL_DEPTH_TEST); // enables depth testing
      gl.glDepthFunc(GL_LEQUAL);  // the type of depth test to do
      gl.glHint(GL_PERSPECTIVE_CORRECTION_HINT, GL_NICEST); // best perspective correction
      gl.glShadeModel(GL_SMOOTH); // blends colors nicely, and smoothes out lighting    
    }

    @Override
    public void dispose(GLAutoDrawable drawable) {
    }

    @Override
    public void display(GLAutoDrawable drawable) {
        GL2 gl = drawable.getGL().getGL2(); // get the OpenGL 2 graphics context
        gl.glClear(GL_COLOR_BUFFER_BIT|GL_DEPTH_BUFFER_BIT);  // clear color and depth buffers
        gl.glLoadIdentity();    // reset the model-view matrix
        gl.glTranslatef(-cameraX, -cameraY, -cameraZ);
        gl.glRotatef(-cameraPitch, 1, 0, 0);
        gl.glRotatef(-cameraYaw, 0, 1, 0);

        //Draw the walls of the room
        
        //Back wall
        gl.glColor3f(0.588f, 0.294f, 0.0f);  
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-1.0f,-1.0f,-2.0f);
        gl.glVertex3f(1.0f,-1.0f,-2.0f);
        gl.glVertex3f(1.0f,1.0f,-2.0f);
        gl.glVertex3f(-1.0f,1.0f,-2.0f);  
        gl.glEnd();
        
        gl.glColor3f(0.9294f, 0.9216f, 0.8353f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.99f,-0.99f,-1.99f);
        gl.glVertex3f(0.99f,-0.99f,-1.99f);
        gl.glVertex3f(0.99f,0.99f,-1.99f);
        gl.glVertex3f(-0.99f,0.99f,-1.99f);  
        gl.glEnd();
        
        // Front wall 
        gl.glColor3f(0.588f, 0.294f, 0.0f);  
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-1.0f, -1.0f, 1.0f);
        gl.glVertex3f(1.0f, -1.0f, 1.0f);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);
        gl.glEnd();
        
        gl.glColor3f(0.9294f, 0.9216f, 0.8353f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.99f, -0.99f, 0.99f);
        gl.glVertex3f(0.99f, -0.99f, 0.99f);
        gl.glVertex3f(0.99f, 0.99f, 0.99f);
        gl.glVertex3f(-0.99f, 0.99f, 0.99f);
        gl.glEnd();
        
        // Left wall
        gl.glColor3f(0.588f, 0.294f, 0.0f);  
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-1.0f, -1.0f, -2.0f);
        gl.glVertex3f(-1.0f, -1.0f, 1.0f);
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-1.0f, 1.0f, -2.0f);
        gl.glEnd();
        
        gl.glColor3f(1.0f, 0.851f, 0.702f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.99f, -0.99f, -1.99f);
        gl.glVertex3f(-0.99f, -0.99f, 0.99f);
        gl.glVertex3f(-0.99f, 0.99f, 0.99f);
        gl.glVertex3f(-0.99f, 0.99f, -1.99f);
        gl.glEnd();
        
        // Right wall
        gl.glColor3f(0.588f, 0.294f, 0.0f);  
        gl.glBegin(GL2.GL_POLYGON);
        gl.glVertex3f(1.0f, -1.0f, -2.0f);
        gl.glVertex3f(1.0f, -1.0f, 0.5f);  
        gl.glVertex3f(1.0f, 1.0f, 0.5f);    
        gl.glVertex3f(1.0f, 1.0f, -2.0f);   
        gl.glEnd();
          
        gl.glBegin(GL2.GL_POLYGON);
        gl.glVertex3f(1.0f, 1.0f, 0.5f);    
        gl.glVertex3f(1.0f, 1.0f, 0.9f); 
        gl.glVertex3f(1.0f, 0.5f, 0.9f);
        gl.glVertex3f(1.0f, 0.5f, 0.5f);  
        gl.glEnd();

        gl.glBegin(GL2.GL_POLYGON);   
        gl.glVertex3f(1.0f, 1.0f, 0.9f); 
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(1.0f, -1.0f, 1.0f);  
        gl.glVertex3f(1.0f, -1.0f, 0.9f); 
        gl.glEnd();
        
        //inside right wall
        gl.glColor3f(1.0f, 0.851f, 0.702f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.99f, 0.99f, -1.99f);
        gl.glVertex3f(0.99f, -0.99f, -1.99f);
        gl.glVertex3f(0.99f, -0.99f, 0.5f);
        gl.glVertex3f(0.99f, 0.99f, 0.5f);
        gl.glEnd();
        
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.99f, 0.99f, 0.5f);    
        gl.glVertex3f(0.99f, 0.99f, 0.9f); 
        gl.glVertex3f(0.99f, 0.5f, 0.9f);
        gl.glVertex3f(0.99f, 0.5f, 0.5f);  
        gl.glEnd();
        
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(0.99f, 0.99f, 0.9f); 
        gl.glVertex3f(0.99f, 0.99f, 0.99f);
        gl.glVertex3f(0.99f, -0.99f, 0.99f);  
        gl.glVertex3f(0.99f, -0.99f, 0.9f);   
        gl.glEnd();
        
        // Top wall
        gl.glColor3f(0.588f, 0.294f, 0.0f);        
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-1.0f, 1.0f, -2.0f);
        gl.glVertex3f(1.0f, 1.0f, -2.0f);
        gl.glVertex3f(1.0f, 1.0f, 1.0f);
        gl.glVertex3f(-1.0f, 1.0f, 1.0f);
        gl.glEnd();

        gl.glColor3f(0.95f, 0.95f, 0.95f);
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.99f, 0.99f, -1.99f);
        gl.glVertex3f(0.99f, 0.99f, -1.99f);
        gl.glVertex3f(0.99f, 0.99f, 0.99f);
        gl.glVertex3f(-0.99f, 0.99f, 0.99f);
        gl.glEnd();
        
        // Bottom 
        gl.glColor3f(0.588f, 0.294f, 0.0f); 
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-1.0f, -1.0f, -2.0f);
        gl.glVertex3f(1.0f, -1.0f, -2.0f);
        gl.glVertex3f(1.0f, -1.0f, 1.0f);
        gl.glVertex3f(-1.0f, -1.0f, 1.0f);
        gl.glEnd();
        
        gl.glColor3f(0.9f, 0.9f, 0.9f); 
        gl.glBegin(GL_QUADS);
        gl.glVertex3f(-0.99f, -0.99f, -1.99f);
        gl.glVertex3f(0.99f, -0.99f, -1.99f);
        gl.glVertex3f(0.99f, -0.99f, 0.99f);
        gl.glVertex3f(-0.99f, -0.99f, 0.99f);
        gl.glEnd();

        aircon.drawAircon(gl);        
        fan.drawFan(gl);
        fan.rotateFan();      
        light.drawLight(gl);        
        lamp.draw(gl);
        window.drawWindow(gl);
        mirror.drawMirror(gl);
        carpet.drawCarpet(gl);
        luggage.drawLuggage(gl);
        table.drawTable(gl, 0.3f, -0.69f, 0.79f);
        chair.drawChair(gl, 0.3f, -0.64f, 0.4f);
        computer.drawComputer(gl, 0.3f, -0.57f, 0.7f);
        pottedPlant.drawPottedPlant(gl,glu,0.9f,-0.51f,-0.1f);
        pencilHolder.drawPencilHolder(gl,glu,-0.4f,-0.036f,0.1f);       
        drawer.drawDrawer(gl);      
        wardrobe.drawWardrobe(gl);       
        bookShelf.drawBookShelf(gl);
        books.drawBooks(gl);
        bed.drawBed(gl);
        tshirt.drawTshirt(gl);
    }

    @Override
    public void reshape(GLAutoDrawable drawable, int x, int y, int width, int height) {
    GL2 gl = drawable.getGL().getGL2();  // get the OpenGL 2 graphics context

      if (height == 0) height = 1;   // prevent divide by zero
      float aspect = (float)width / height;

      // Set the view port (display area) to cover the entire window
      gl.glViewport(0, 0, width, height);

      // Setup perspective projection, with aspect ratio matches viewport
      gl.glMatrixMode(GL_PROJECTION);  // choose projection matrix
      gl.glLoadIdentity();             // reset projection matrix
      glu.gluPerspective(80.0, aspect, 0.1, 100.0); // fovy, aspect, zNear, zFar

      // Enable the model-view transform
      gl.glMatrixMode(GL_MODELVIEW);
      gl.glLoadIdentity(); // reset 
     
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()) {
                    case KeyEvent.VK_W:
                        moveForward();
                        break;
                    case KeyEvent.VK_S:
                        moveBackward();
                        break;
                    case KeyEvent.VK_A:
                        strafeLeft();
                        break;
                    case KeyEvent.VK_D:
                        strafeRight();
                        break;
                    case KeyEvent.VK_Q:
                        rotateLeft();
                        break;
                    case KeyEvent.VK_E:
                        rotateRight();
                        break;
                }    
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        requestFocus();
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
    }

    @Override
    public void mouseExited(MouseEvent e) {
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        int dx = e.getX() - lastMouseX;
        int dy = e.getY() - lastMouseY;

        lastMouseX = e.getX();
        lastMouseY = e.getY();

        cameraYaw -= dx * MOUSE_SENSITIVITY;
        cameraPitch -= dy * MOUSE_SENSITIVITY;

        // Clamp pitch to avoid flipping upside down
        cameraPitch = Math.max(-90, Math.min(90, cameraPitch));
    }

    @Override
    public void mouseMoved(MouseEvent e) {
            // Store the current mouse position for the next frame
            lastMouseX = e.getX();
            lastMouseY = e.getY();
    }

    private void moveForward() {
        float deltaX = MOVE_SPEED * (float) Math.sin(Math.toRadians(cameraYaw));
        float deltaZ = MOVE_SPEED * (float) Math.cos(Math.toRadians(cameraYaw));
        cameraX += deltaX;
        cameraZ -= deltaZ;    
    }

    private void moveBackward() {
        float deltaX = MOVE_SPEED * (float) Math.sin(Math.toRadians(cameraYaw));
        float deltaZ = MOVE_SPEED * (float) Math.cos(Math.toRadians(cameraYaw));
        cameraX -= deltaX;
        cameraZ += deltaZ;    
    }

    private void strafeLeft() {
        float deltaX = MOVE_SPEED * (float) Math.cos(Math.toRadians(cameraYaw));
        float deltaZ = MOVE_SPEED * (float) Math.sin(Math.toRadians(cameraYaw));
        cameraX -= deltaX;
        cameraZ -= deltaZ;    
    }

    private void strafeRight() {
        float deltaX = MOVE_SPEED * (float) Math.cos(Math.toRadians(cameraYaw));
        float deltaZ = MOVE_SPEED * (float) Math.sin(Math.toRadians(cameraYaw));
        cameraX += deltaX;
        cameraZ += deltaZ;    
    }

    private void rotateLeft() {
        cameraYaw += ROTATE_SPEED;    
    }

    private void rotateRight() {
        cameraYaw -= ROTATE_SPEED;    
    }
    
    
    
}
