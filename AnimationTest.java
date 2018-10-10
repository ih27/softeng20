public class AnimationTest {  
  public static void main(String[] args) { 
    
    // Enable drawing memory buffer
    StdDraw.enableDoubleBuffering();
    
    StdDraw.setXscale(0, 5);
    StdDraw.setYscale(0, 5);
    
    for (int i = 0; i < 4; i++) {
      // Step 1: clear
      StdDraw.clear();
      
      // Step 2: calculate
      int x = i;
      int y = i;
      
      // Step 3: draw
      StdDraw.circle(x, y, .5);
      
      // Step 4: show and pause
      StdDraw.show();
      StdDraw.pause(1000);      
    }  
}