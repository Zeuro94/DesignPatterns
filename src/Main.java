import statePattern.BrushTool;
import statePattern.Canvas;
import statePattern.SelectionTool;

public class Main {
    public static void main(String[] args) {
        var canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();

        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();

        var brushtool = new BrushTool();
        brushtool.mouseDown();
        brushtool.mouseUp();
    }
}