package skateDice1;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class easy {
	
	private first mainScreen;
	
	private int counter;
	
	public  Random rand;
	
	public   JButton back;
	
	public   JButton didNotLand;
	
	public   JButton didLand;
	
	 public JButton roll;
	
	 public JButton newGame;
	
	 public JPanel jp;
	
	 public JFrame easyf;
	
	 public JLabel trick;
	
	 public JLabel skate;
	
	

	
	//creates a new frame for the "easy" mode
	 public void init() {
		setCounter(0);
		
		//create elements
		rand = new Random();
		
		back = new JButton("<-");
		
		didNotLand = new JButton("NO");
		
		didLand = new JButton("YES");
		
		roll = new JButton("Roll Dice");
		
		newGame = new JButton("New Game");
		
		jp = new JPanel();
		
		easyf = new JFrame("Easy SkateDice");
		
		trick = new JLabel();
		
		skate = new JLabel();
		
		
		//set layout
		jp.setLayout(new BorderLayout());
		
		jp.add(roll, BorderLayout.NORTH);
		
		trick.setHorizontalAlignment(JLabel.CENTER);
		jp.add(trick, BorderLayout.CENTER);
		
		skate.setHorizontalAlignment(JLabel.CENTER);
		
		jp.add(skate, BorderLayout.SOUTH);
		
		jp.add(back, BorderLayout.WEST);
		back.setEnabled(true);
		
		jp.add(didNotLand, BorderLayout.EAST);
		easyf.pack();
		
		easyf.add(jp);
		
		easyf.setSize(280, 200);
		easyf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		easyf.setLocationRelativeTo(null);
		easyf.setVisible(true);
		
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
				  
				//added code (test)
				  
				if(back.isEnabled()) {
					back.setEnabled(false);
					jp.remove(back);
					jp.add(didLand, BorderLayout.WEST);
				}
				
				trick.setText(dice.easyDice());
			  } 
			} );
		
		
		didLand.addActionListener(new ActionListener() { 
			@Override
			  public void actionPerformed(ActionEvent e) {
				roll.setEnabled(true);
				didNotLand.setEnabled(false);
				didLand.setEnabled(false);
				counter++;
				
				//add code to enable the yes and no button 
				//check the didNotLand Funtion
			  } 
			} );
		
		back.addActionListener(new ActionListener() { 
			@Override
			  public void actionPerformed(ActionEvent e) { 
			    easyf.setVisible(false);
			    mainScreen = new first();
			    mainScreen.init();
			  } 
			} );
		
		
		newGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
			    easyf.setVisible(false);
			    mainScreen = new first();
			    mainScreen.init();
				
			}
			
		});
		
	}




	public int getCounter() {
		return counter;
	}




	public void setCounter(int counter) {
		this.counter = counter;
	}

}
