package skateDice1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class first {
	
	easy easyGame;
	hard hardGame;
	
	eMultiplayer multiplay;
	
	 public JButton s;								//physical buttons on GUI
	 public JButton h;
	 public JButton m;
	
	 public JPanel jp;
	
	 public JFrame mainf;
	
	
	  public void init() {
		  
		easyGame = new easy();
		
		hardGame = new hard();
		
		multiplay = new eMultiplayer();
		
		
		s = new JButton("Easy");
		h = new JButton("Hard");
		m = new JButton("Multiplayer");
		
		jp = new JPanel();
		
		mainf = new JFrame("SkateDice");
		
		
		jp.add(s);
		jp.add(h);
		jp.add(m);
		
		mainf.add(jp);
		
		mainf.setSize(220, 200);
		mainf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainf.setLocationRelativeTo(null);
		mainf.setVisible(true);
		
		s.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    mainf.setVisible(false);
			    easyGame.init();
			  } 
			} );
		
		
		h.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    mainf.setVisible(false);
			    hardGame.init();
			  } 
			} );
		
		
		//method for multiplayer button
		m.addActionListener(new ActionListener() { 
			  public void actionPerformed(ActionEvent e) { 
			    mainf.setVisible(false);
			    multiplay.init();
			  } 
			} );
		
		
	}//end init
	
	
	

}//end class
