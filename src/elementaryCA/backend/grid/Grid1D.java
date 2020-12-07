package elementaryCA.backend.grid;

import elementaryCA.backend.cell.Cell;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Rectangle;

import java.util.List;

public class Grid1D {
    // Used by JavaFX to display the visualization
    private final GridPane GRID_PANE;
    // 8 bit string representing the behavior of the CA
    private final String BEHAVIOR;
    // Width/height of cell
    private final double CELL_SIZE;

    // Current generation of cells
    private List<Cell> currentGen;
    // Current generation (row) being shown to the screen
    private int currentGenIndex;

    public Grid1D(GridPane gridPane,
                  String behavior,
                  List<Cell> currentGen,
                  double cellSize) {
        this.GRID_PANE = gridPane;
        this.BEHAVIOR = behavior;
        this.currentGen = currentGen;
        this.CELL_SIZE = cellSize;
        this.currentGenIndex = 0;
        // Show the initial generation to the screen
        show();
    }

    /**
     * TODO: Fill in the logic below
     * I would suggest starting off by hard coding one of the rules,
     * such as rule 30, then generalize from there.
     * This function evolves the current generation to the next generation
     * using the current rule set given by the behavior string.
     */
    private void evolve() {

    }

    /**
     * This function shows the current generation to the JavaFX window
     */
    private void show() {
        int colIndex = 0;
        // Create new rectangles to show for the current generation
        for (Cell cell : currentGen) {
            // Create a rectangle to represent the cell
            Rectangle rect = new Rectangle(CELL_SIZE, CELL_SIZE, cell.getColor());
            // Add it to the JavaFX graph
            GRID_PANE.add(rect, colIndex, currentGenIndex);
            // Tell it where to show it on the screen
            //GridPane.setConstraints(rect, );
            // Go to the next cell
            colIndex++;
        }
        currentGenIndex++;
    }

    /**
     * This function advances the state of the class to the next generation.
     * It then shows this new generation to the Java FX window.
     */
    public void nextGeneration() {
        evolve();
        show();
    }
}
