public class Square {

    int side = 5;

    public int calculateArea() {
        return side * side; 
    }

    public int calculatePrerimeter() {
        return side * 4 
    }

    public void draw() {
        if(highResulutionMonitor) {
            // Render high resolution image of a square
        } else {
            // Render a normal image of a square
        }
    }

    public void rotate(int degree) {
        // Rotate the image of the square clockwiste to
        // The required degree and re-render 
    }

}

public class Square {
    
    int side = 5;

    public int calculateArea() {
        return side * side; 
    }

    public int calculatePrerimeter() {
        return side * 4 
    }
    
}
// Responsibility: Measurements of squares

public class SquareUI {
    
    public void draw() {
        if(highResulutionMonitor) {
            // Render high resolution image of a square
        } else {
            // Render a normal image of a square
        }
    }

    public void rotate(int degree) {
        // Rotate the image of the square clockwiste to
        // The required degree and re-render 
    }

}
//Responsibility: Rendering images of squares 