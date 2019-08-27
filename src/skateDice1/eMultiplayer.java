package skateDice1;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class eMultiplayer {
	
	private Player player1;
	
	private Player player2;
	
	private first mainScreen;
	
	private int playerTurn;
	
	
	private  Random rand;
	
	private   JButton back;
	
	private   JButton didNotLand;
	
	private   JButton didLand;
	
	private JButton roll;
	
	private JButton newGame;
	
	private JPanel jp;
	
	private JFrame multiplayerf;
	
	private JLabel trick;
	
	private JLabel p1;
	
	private JLabel p2;
	
	private JLabel p1Skate;
	
	private JLabel p2Skate;
	
	
	 void init() {
		 
		 player1 = new Player();
		 
		 player2 = new Player();
		 
		 playerTurn = 1;
		
		rand = new Random();
		
		back = new JButton("<-");
		
		didNotLand = new JButton("NO");
		
		didLand = new JButton("YES");
		
		roll = new JButton("Roll Dice");
		roll.setPreferredSize(new Dimension(200, 50));
		
		newGame = new JButton("New Game");
		
		jp = new JPanel();
		
		multiplayerf = new JFrame("Easy SkateDice");
		
		trick = new JLabel();
		
		p1 = new JLabel("player1");
		
		p2 = new JLabel("player2");
		
		p1Skate = new JLabel();
		
		p2Skate = new JLabel();
		
		GridBagLayout gbl = new GridBagLayout();
		
		
		
		jp.setLayout(gbl);
		GridBagConstraints gbc = new GridBagConstraints();
		
		
		
	    gbc.gridx = 0;
	    gbc.gridy = 0;
		jp.add(back,gbc);
		
		 gbc.gridx = 2;
		 gbc.gridy = 0;	
		 jp.add(roll,gbc);
		 
		 gbc.gridx = 1;
		 gbc.gridy = 1;	
		 jp.add(p1 ,gbc);
		 
		 gbc.gridx = 3;
		 gbc.gridy = 1;	
		 jp.add(p2 ,gbc);
		 
		 gbc.gridx = 2;
		 gbc.gridy = 3;	
		 jp.add(trick, gbc);
		 
		 gbc.gridx = 1;
		 gbc.gridy = 2;	
		 jp.add(p1Skate ,gbc);
		 
		 gbc.gridx = 3;
		 gbc.gridy = 2;	
		 jp.add(p2Skate ,gbc);
		 
		 gbc.gridx = 0;
		 gbc.gridy = 3;	
		 jp.add(didLand ,gbc);
		 
		 gbc.gridx = 4;
		 gbc.gridy = 3;	
		 jp.add(didNotLand ,gbc);
		 
		 
		
		multiplayerf.add(jp);
		
		multiplayerf.setSize(320, 180);
		multiplayerf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		multiplayerf.setLocationRelativeTo(null);
		multiplayerf.setVisible(true);
		
		
		dice dice = new dice();
		
		roll.addActionListener(new ActionListener() { 
			@Override
			  public void actionPerformed(ActionEvent e) {
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
				
				if(playerTurn == 1) {
				  player1.getLetters().addLetters();
				  player1.getLetters().checkScore();
				  playerTurn++;
				  if(player1.getLetters().gameOver) {
					  didNotLand.setEnabled(false);
					  didLand.setEnabled(false);
					  jp.remove(roll);
					  gbc.gridx = 2;
					  gbc.gridy = 0;	
					  jp.add(newGame,gbc);
				   }
				  p1Skate.setText(player1.getLetters().getStr().toString());
				}
				else {
					player2.getLetters().addLetters();
					player2.getLetters().checkScore();
					playerTurn--;
					  if(player2.getLetters().gameOver) {
						  didNotLand.setEnabled(false);
						  didLand.setEnabled(false);
						  jp.remove(roll);
						  gbc.gridx = 2;
						  gbc.gridy = 0;	
						  jp.add(newGame,gbc);
					   }
					  p2Skate.setText(player2.getLetters().getStr().toString());
					
				}
			  }
				
			} );
		
		
		didLand.addActionListener(new ActionListener() { 
			@Override
			  public void actionPerformed(ActionEvent e) {
				roll.setEnabled(true);
				didNotLand.setEnabled(false);
				didLand.setEnabled(false);
				
				if(playerTurn == 1) {
					playerTurn++;
				}
				else {
					playerTurn--;
				}
			  } 
			} );
		
		
		
		back.addActionListener(new ActionListener() { 
			@Override
			  public void actionPerformed(ActionEvent e) { 
				multiplayerf.setVisible(false);
			    mainScreen = new first();
			    mainScreen.init();
			  } 
			} );
		
		
		newGame.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				multiplayerf.setVisible(false);
			    mainScreen = new first();
			    mainScreen.init();
				
			}
			
		});


			
		
	}

}
