package com.qatester.gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.FlowLayout;
import javax.swing.JToolBar;
import javax.swing.JRadioButton;
import javax.swing.JLabel;
import javax.swing.JFormattedTextField;
import javax.swing.JMenu;
import javax.swing.JToggleButton;
import javax.swing.JProgressBar;
import javax.swing.SwingConstants;
import javax.swing.JEditorPane;
import javax.swing.JSplitPane;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Button;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Choice;
import javax.swing.JMenuBar;
import javax.swing.JComboBox;

public class programGui extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					programGui frame = new programGui();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public programGui() {
		initComponents();
		createEvents();

		setTitle("QA TEST");
		setSize(800, 700);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);

		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));

		JButton btnNewButton = new JButton("Open Test Recorder");

		JPanel panel_1 = new JPanel();
		panel_1.setBorder(new BevelBorder(BevelBorder.LOWERED, Color.DARK_GRAY, null, null, null));

		JButton btnNewButton_1_1 = new JButton("export test results");

		JLabel lblNewLabel_1 = new JLabel("List of Test results");
		GroupLayout gl_panel_1 = new GroupLayout(panel_1);
		gl_panel_1.setHorizontalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addGap(0, 242, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap(113, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_1).addContainerGap())
				.addGroup(gl_panel_1.createSequentialGroup().addGap(74).addComponent(lblNewLabel_1).addContainerGap(82,
						Short.MAX_VALUE)));
		gl_panel_1.setVerticalGroup(gl_panel_1.createParallelGroup(Alignment.TRAILING).addGap(0, 455, Short.MAX_VALUE)
				.addGroup(gl_panel_1.createSequentialGroup().addContainerGap().addComponent(lblNewLabel_1)
						.addPreferredGap(ComponentPlacement.RELATED, 396, Short.MAX_VALUE)
						.addComponent(btnNewButton_1_1).addContainerGap()));
		panel_1.setLayout(gl_panel_1);

		JLabel lblNewLabel_2 = new JLabel("QA UI TEST");
		// Combobox that contains the list of the software to test
		JComboBox comboBox = new JComboBox();
		// add button to add a software to the list
		JButton btnNewButton_2 = new JButton("+");
		// label for combobox :
		JLabel lblNewLabel_3 = new JLabel("Select the software for testing :");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(362)
					.addComponent(lblNewLabel_2)
					.addContainerGap(356, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(19)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addContainerGap())
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, 193, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(panel, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
							.addComponent(btnNewButton)
							.addGap(52)
							.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 242, GroupLayout.PREFERRED_SIZE)
							.addGap(27))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addComponent(lblNewLabel_2)
					.addGap(25)
					.addComponent(lblNewLabel_3)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(panel_1, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 455, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton))
					.addContainerGap(98, Short.MAX_VALUE))
		);

		JButton btnNewButton_1 = new JButton("run selected tests");

		JLabel lblNewLabel = new JLabel("List of Test cases ");
		GroupLayout gl_panel = new GroupLayout(panel);
		gl_panel.setHorizontalGroup(gl_panel.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING,
						gl_panel.createSequentialGroup().addContainerGap(113, Short.MAX_VALUE)
								.addComponent(btnNewButton_1).addContainerGap())
				.addGroup(gl_panel.createSequentialGroup().addGap(74).addComponent(lblNewLabel).addContainerGap(122,
						Short.MAX_VALUE)));
		gl_panel.setVerticalGroup(gl_panel.createParallelGroup(Alignment.LEADING).addGroup(Alignment.TRAILING,
				gl_panel.createSequentialGroup().addContainerGap().addComponent(lblNewLabel)
						.addPreferredGap(ComponentPlacement.RELATED, 396, Short.MAX_VALUE).addComponent(btnNewButton_1)
						.addContainerGap()));
		panel.setLayout(gl_panel);
		contentPane.setLayout(gl_contentPane);

//		contentPane.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
	}

	private void createEvents() {
	}

	private void initComponents() {
	}
}
