public class LightBoard
{
 private boolean[][] lights;

 public LightBoard(int numRows, int numCols)
 { 
    lights = new boolean[numRows][numCols];
    for (int r = 0; r < lights.length; r++)
        for (int c = 0; c < lights[0].length; c++)
            if (Math.random() < 0.4) lights[r][c] = true;
 }
public boolean evaluateLight(int row, int col)
{
    boolean light = lights[row][col];
    int colLights = 0;
    for(int r = 0; r < lights.length; r++)
        if(lights[r][col]) 
            colLights++;
            if (light && colLights%2 == 0)
                return false;
                if(!light && colLights%3==0)
                    return true;
    return light;
}   
 
 public double test()
 {
    double on = 0;
    for (boolean[]row:lights)
        for(boolean b:row )
            if (b) on++;
    return on/(lights.length*lights[0].length);
    
 }
 public void setLights(boolean[][] arr)
 {
    lights = arr;
 }
} 

