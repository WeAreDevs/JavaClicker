package com.wearedevs.someclicker.gui;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.wearedevs.someclicker.Main;
import com.wearedevs.someclicker.handlers.ShopHandler;

/**
 * The Main Panel Showing the Main Stuff
 */
public class MainPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	public JLabel labelClicks;
	public JButton toggleReactor;
	
	public MainPanel() {
		setLayout(null);
		setBounds(Main.panelSize);
		
		labelClicks = new JLabel("Clicks: 0");
		labelClicks.setFont(new Font("Tahoma", Font.BOLD, 25));
		labelClicks.setBounds(12, 13, 377, 34);
		add(labelClicks);
		
		JButton clicker = new JButton("Click Me!");
		clicker.setFont(new Font("Tahoma", Font.BOLD, 20));
		clicker.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Main.click();	
			}
		});
		clicker.setBounds(12, 58, 610, 100);
		add(clicker);
		
		JButton caseButton = new JButton("Cases");
		caseButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		caseButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CasePanel.updateLayout();
				Main.main.setContentPane(Main.casePanel);
			}
		});
		caseButton.setBounds(12, 350, 608, 40);
		add(caseButton);
		
		JButton shopButton = new JButton("The Shop");
		shopButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		shopButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShopHandler.updateLayout();
				Main.main.setContentPane(Main.shopPanel);
			}
		});
		shopButton.setBounds(12, 398, 270, 40);
		add(shopButton);
		
		JButton infoButton = new JButton("?");
		infoButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		infoButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShopHandler.updateLayout();
				Main.main.setContentPane(Main.infoPanel);
			}
		});
		infoButton.setBounds(290, 398, 53, 40);
		add(infoButton);
		
		JButton optionButton = new JButton("Options");
		optionButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		optionButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShopHandler.updateLayout();
				Main.main.setContentPane(Main.optionsPanel);
				
				OptionsPanel.refreshSoundChoice();
			}
		});
		optionButton.setBounds(350, 398, 270, 40);
		add(optionButton);
		
		JButton extrasButton = new JButton("Extras");
		extrasButton.setFont(new Font("Tahoma", Font.BOLD, 17));
		extrasButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ShopHandler.updateLayout();
				Main.main.setContentPane(Main.extrasPanel);
			}
		});
		extrasButton.setBounds(350, 300, 270, 40);
		add(extrasButton);
		
//		JButton devButton = new JButton("Dev Button");
//		devButton.setFont(new Font("Tahoma", Font.BOLD, 17));
//		devButton.addActionListener(new ActionListener() {
//			public void actionPerformed(ActionEvent e) {
//				//Dev Code
//			}
//		});
//		devButton.setBounds(350, 170, 270, 40);
//		add(devButton);
	}	
}
