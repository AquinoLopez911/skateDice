package skateDice1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class hard {
	
	private first mainScreen;
	
	private int counter;
	
	public static Random rand;
	
	public static  JButton back;
	
	public static  JButton didNotLand;
	
	public   JButton didLand;
	
	static public JButton roll;
	
	 public JButton newGame;
	
	static public JPanel jp;
	
	static public JFrame hardf;
	
	static public JLabel trick;
	
	static public JLabel skate;
	

	
	 public void init() {
		 
		setCounter(0);
		 
		mainScreen = new first();
		 
		rand = new Random();
			
		didNotLand = new JButton("NO");
		
		didLand = new JButton("YES");
			
		back = new JButton("<-");
			
		roll = new JButton("Roll Dice");
		
		newGame = new JButton("New Game");
			
		jp = new JPanel();
			
		hardf = new JFrame("Hard SkateDice");
			
		trick = new JLabel();
			
		skate = new JLabel();
		
		
		
		
		
		 
		jp.setLayout(new BorderLayout());
		
		jp.add(roll, BorderLayout.NORTH);
		
		trick.setHorizontalAlignment(JLabel.CENTER);
		jp.add(trick, BorderLayout.CENTER);
		
		skate.setHorizontalAlignment(JLabel.CENTER);
		
		jp.add(skate, BorderLayout.SOUTH);
		
		jp.add(back, BorderLayout.WEST);
		
		jp.add(didNotLand, BorderLayout.EAST);
		hardf.pack();
		
		hardf.add(jp);
		
		hardf.setSize(280, 200);
		hardf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		hardf.setLocationRelativeTo(null);
		hardf.setVisible(true);
		
		letters letter = new letters();
		dice dice = new dice();
		
		roll.addActionListener(new ActionListener() { 
			@Override
			  public void actionPerformed(ActionEvent e) {
				if(back.isEnabled()) {
					back.setEnabled(false);
					jp.remove(back);
					jp.add(didLand, BorderLayout.WEST);
				}
				roll.setEnabled(false);
				didNotLand.setEnabled(true);
				didLand.setEnabled(true);
				trick.setText(dice.easyDice());
			  } 
			} );
		
		didNotLand.addActionListener(new ActionListener() { 
			@Override
			  public void actionPerformed(ActionEvent e) {
				roll.setEnabled(true);
				didNotLand.setEnabled(false);
				didLand.setEnabled(false);
				  letter.addLetters();
				  letter.checkScore();
				  if(letter.gameOver) {
					  jp.remove(roll);
					  jp.add(newGame, BorderLayout.NORTH);
					  trick.setText(counter + "points");
					  didNotLand.setEnabled(false);
					  didLand.setEnabled(false);
				   }
				  skate.setText(letter.getStr().toString());
			  } 
			} );
		
		
		didLand.addActionListener(new ActionListener() { 
			@Override
			  public void actionPerformed(ActionEvent e) {
				roll.setEnabled(true);
				didNotLand.setEnabled(false);
				didLand.setEnabled(false);
				counter++;
			  } 
			} );
		
		back.addActionListener(new ActionListener() { 
			@Override
			  public void actionPerformed(ActionEvent e) { 
			    hardf.setVisible(false);
			    mainScreen = new first();
			    mainScreen.init();
			  } 
			} );
		
		
		newGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			    hardf.setVisible(false);
			    mainScreen = new first();
			    mainScreen.init();
				
			}
			} );
	 }//end method
	 
	 public int getCounter() {
			return counter;
		}




		public void setCounter(int counter) {
			this.counter = counter;
		}
	
	

}//end class
