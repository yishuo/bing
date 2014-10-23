package bing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
 
public class windows extends JFrame implements ActionListener{
	JLabel titre = new JLabel("MY FAVORITE");
    JPanel panel = new JPanel();
    JTextField text = new JTextField("");
    //changer le nom de button aux sujets tendances. 
    JButton b0 = new JButton("SEARCH");
    JButton b1 = new JButton("ACTUALITE");
    JButton b2 = new JButton("ECONOMIE");
    JButton b3 = new JButton("MILITAIRE");
    JButton b4 = new JButton("SPORT");
    JButton b5 = new JButton("TECHNIQUE");
    JButton b6 = new JButton("CULTURE");
    JButton b7 = new JButton("LIFESTYLE");
    JButton b8 = new JButton("MADAME");
    JTextField text1 = new JTextField("afficher le contenu !");
 
    public windows(){
    	JFrame fenetre = new JFrame();
    	Container pane = fenetre.getContentPane();
    	
    	JPanel card0 = new JPanel();
 	    card0.add(titre);
 	    
    	JPanel card1 = new JPanel();
    	card1.setLayout(new GridLayout(1,2));
    	card1.add(text);
    	card1.add(b0);
    	
    	JPanel card2 = new JPanel();
    	card2.setLayout(new GridLayout(8,1));
		card2.add(b1);
		card2.add(b2);
		card2.add(b3);
		card2.add(b4);
		card2.add(b5);
		card2.add(b6);
		card2.add(b7);
		card2.add(b8);
		
		JPanel card3 = new JPanel();
		card3.add(card2);
		card3.add(text1);
		
		pane.setLayout(new BorderLayout());
		pane.add(titre,BorderLayout.PAGE_START);
		pane.add(card1,BorderLayout.PAGE_END);
		pane.add(card3,BorderLayout.CENTER);
        this.add(pane);
        b1.addActionListener(this);
        //ajouter le action de plus de buttons
    }

	public static void main(String[] args) {
        windows test=new windows();
        test.setSize(400,260);
        //test.setLocationRelativeTo(null);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.pack();
        test.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent a) {
    	//ajouter une action
       
    }
}