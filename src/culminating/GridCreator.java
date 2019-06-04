
import java.awt.*;
import java.awt.GridLayout;
import javafx.scene.control.Cell;
import javax.swing.JPanel;

public class GridCreator extends JPanel{
    
    //indicate whos turn it is
    private char whosTurn = 'X';
    
    
    //create grid
    private Cell[][] grid = new Cell[3][3];
    

    public GridCreator(){
    
        JPanel panel = new JPanel(new GridLayout(3,3,0,0));
        for(int i = 0; i<3; i++)
            for(int j  = 0; j <3; j++)
                panel.add(grid[i][j] = new Cell());
            
        panel.setBorder(new LineBorder(Color.red, 1))
}
}