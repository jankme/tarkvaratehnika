package ee.ut.math.tvt.averagejoes;

import java.awt.*;
import javax.swing.*;

public class IntroUI  {

	
	public void panel() {
		JFrame raam = new JFrame("POS"); // raami loomine
	    raam.setSize(600, 400); //
	    raam.setLocation(100, 100); //

	    Container sisu = raam.getContentPane(); // konteineri loomine
	    sisu.setLayout(new FlowLayout(FlowLayout.LEFT)); // paigutushalduri kasutamine

	    JLabel name1 = new JLabel("<html>Team Name: Average Joes <br>Team leader: Stenno Sirdla <br>Team email: email@email.ee <br>Team members: Stenno Sirdla, Joanna Niklus, Jan Kaljumäe, Tanel Aamer</html>");    
	    sisu.add(name1);
	    ImageIcon image = new ImageIcon("average.jpg");
	    JLabel imageLabel = new JLabel(image);
	    sisu.add(imageLabel);

	    raam.setVisible(true); 
	
	}

}
