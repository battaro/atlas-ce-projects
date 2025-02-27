import java.util.*;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;

public class randomPasswordGeneratorUI extends javax.swing.JFrame {

	// public variables
	char[] capitalAlphabet = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q',
			'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };
	char[] smallAlphabet = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
			'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
	char[] digits = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
	char[] specialCharacters = { '!', '@', '#', '$', '%', '^', '&', '*' };
	boolean useSpecial, useDigits, useCapitalLetters, useSmallLetters;

	public randomPasswordGeneratorUI() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	// <editor-fold defaultstate="collapsed" desc="Generated Code">
	private void initComponents() {

		title = new javax.swing.JLabel();
		MainPanel = new javax.swing.JPanel();
		PasswordPanel = new javax.swing.JPanel();
		copyButton = new javax.swing.JButton();
		exitButton = new javax.swing.JButton();
		passwordTXT = new javax.swing.JTextField();
		generatePasswordButton = new javax.swing.JButton();
		SettingsPanel = new javax.swing.JPanel();
		lengthTitle = new javax.swing.JLabel();
		l8 = new javax.swing.JLabel();
		lengthSlider = new javax.swing.JSlider();
		lengthTXT = new javax.swing.JLabel();
		l32 = new javax.swing.JLabel();
		UppercaseBox = new javax.swing.JCheckBox();
		SymbolsBox = new javax.swing.JCheckBox();
		DigitsBox = new javax.swing.JCheckBox();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
		setAlwaysOnTop(true);
		setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
		setPreferredSize(new java.awt.Dimension(810, 340));
		setResizable(false);
		getContentPane().setLayout(null);

		title.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
		title.setText("Random Password Generator");
		getContentPane().add(title);
		title.setBounds(230, 0, 350, 60);

		MainPanel.setPreferredSize(new java.awt.Dimension(800, 300));
		MainPanel.setLayout(new java.awt.BorderLayout());

		PasswordPanel.setBackground(new java.awt.Color(220, 218, 216));
		PasswordPanel.setPreferredSize(new java.awt.Dimension(400, 300));

		copyButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		copyButton.setText("Copy");
		copyButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				copyButtonActionPerformed(evt);
			}
		});

		exitButton.setFont(new java.awt.Font("Segoe UI", 2, 18)); // NOI18N
		exitButton.setForeground(new java.awt.Color(255, 51, 51));
		exitButton.setText("Exit");
		exitButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				exitButtonActionPerformed(evt);
			}
		});

		passwordTXT.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

		generatePasswordButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		generatePasswordButton.setText("Generate Password");
		generatePasswordButton.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				generatePasswordButtonActionPerformed(evt);
			}
		});

		javax.swing.GroupLayout PasswordPanelLayout = new javax.swing.GroupLayout(PasswordPanel);
		PasswordPanel.setLayout(PasswordPanelLayout);
		PasswordPanelLayout.setHorizontalGroup(
				PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(PasswordPanelLayout.createSequentialGroup()
								.addContainerGap(19, Short.MAX_VALUE)
								.addGroup(PasswordPanelLayout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout
												.createSequentialGroup()
												.addComponent(copyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(136, 136, 136))
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PasswordPanelLayout
												.createSequentialGroup()
												.addComponent(passwordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 375,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addContainerGap())
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												PasswordPanelLayout.createSequentialGroup()
														.addComponent(generatePasswordButton,
																javax.swing.GroupLayout.PREFERRED_SIZE, 214,
																javax.swing.GroupLayout.PREFERRED_SIZE)
														.addGap(87, 87, 87))))
						.addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										PasswordPanelLayout.createSequentialGroup()
												.addContainerGap(272, Short.MAX_VALUE)
												.addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(14, 14, 14))));
		PasswordPanelLayout.setVerticalGroup(
				PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
								PasswordPanelLayout.createSequentialGroup()
										.addContainerGap(71, Short.MAX_VALUE)
										.addComponent(generatePasswordButton, javax.swing.GroupLayout.PREFERRED_SIZE,
												76, javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(passwordTXT, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(copyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(59, 59, 59))
						.addGroup(PasswordPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
										PasswordPanelLayout.createSequentialGroup()
												.addContainerGap(249, Short.MAX_VALUE)
												.addComponent(exitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addGap(5, 5, 5))));

		MainPanel.add(PasswordPanel, java.awt.BorderLayout.CENTER);

		SettingsPanel.setBackground(new java.awt.Color(231, 230, 230));
		SettingsPanel.setPreferredSize(new java.awt.Dimension(400, 300));
		SettingsPanel.setLayout(null);

		lengthTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		lengthTitle.setText("Length: ");
		SettingsPanel.add(lengthTitle);
		lengthTitle.setBounds(140, 80, 69, 25);

		l8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		l8.setText("08");
		SettingsPanel.add(l8);
		l8.setBounds(20, 110, 20, 25);

		lengthSlider.setMaximum(32);
		lengthSlider.setMinimum(8);
		lengthSlider.addChangeListener(new javax.swing.event.ChangeListener() {
			public void stateChanged(javax.swing.event.ChangeEvent evt) {
				mySliderStateChanged(evt);
			}
		});
		SettingsPanel.add(lengthSlider);
		lengthSlider.setBounds(60, 110, 290, 30);

		lengthTXT.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		lengthTXT.setText("00");
		SettingsPanel.add(lengthTXT);
		lengthTXT.setBounds(210, 80, 20, 25);

		l32.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
		l32.setText("32");
		SettingsPanel.add(l32);
		l32.setBounds(360, 110, 20, 25);

		UppercaseBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		UppercaseBox.setText("Uppercase");
		UppercaseBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				UppercaseBoxActionPerformed(evt);
			}
		});
		SettingsPanel.add(UppercaseBox);
		UppercaseBox.setBounds(150, 160, 230, 24);

		SymbolsBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		SymbolsBox.setText("Symbols");
		SymbolsBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				SymbolsBoxActionPerformed(evt);
			}
		});
		SettingsPanel.add(SymbolsBox);
		SymbolsBox.setBounds(150, 190, 230, 24);

		DigitsBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
		DigitsBox.setText("Digits");
		DigitsBox.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				DigitsBoxActionPerformed(evt);
			}
		});
		SettingsPanel.add(DigitsBox);
		DigitsBox.setBounds(150, 220, 230, 24);

		MainPanel.add(SettingsPanel, java.awt.BorderLayout.WEST);

		getContentPane().add(MainPanel);
		MainPanel.setBounds(0, 0, 800, 300);

		pack();
	}// </editor-fold>

	private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {
		System.exit(0);
	}

	private void generatePasswordButtonActionPerformed(java.awt.event.ActionEvent evt) {
		UpdatePasswod();
	}

	private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {
		String password = passwordTXT.getText();
		StringSelection selection = new StringSelection(password);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

	}

	private void mySliderStateChanged(javax.swing.event.ChangeEvent evt) {
		UpdatePasswod();
	}

	private void UppercaseBoxActionPerformed(java.awt.event.ActionEvent evt) {
		UpdatePasswod();
	}

	private void SymbolsBoxActionPerformed(java.awt.event.ActionEvent evt) {
		UpdatePasswod();
	}

	private void DigitsBoxActionPerformed(java.awt.event.ActionEvent evt) {
		UpdatePasswod();
	}

	//
	private void UpdatePasswod() {
		int length = lengthSlider.getValue();
		lengthTXT.setText(String.valueOf(length));

		useSmallLetters = true;
		useSpecial = SymbolsBox.isSelected();
		useDigits = DigitsBox.isSelected();
		useCapitalLetters = UppercaseBox.isSelected();

		passwordTXT.setText(generatePassword(length, useSpecial, useDigits, useCapitalLetters, useSmallLetters));
	}

	// Main function
	private String generatePassword(int length, boolean useSp, boolean useD, boolean useC, boolean useS) {

		char[] password = new char[length];
		Random random = new Random();

		// allowed characters array's length
		int newLength = 0;
		int forcedCount = 0;
		if (useSp) {
			password[forcedCount++] = specialCharacters[random.nextInt(specialCharacters.length)];
			newLength += specialCharacters.length;
		}
		if (useD) {
			password[forcedCount++] = digits[random.nextInt(digits.length)];
			newLength += digits.length;
		}
		if (useC) {
			password[forcedCount++] = capitalAlphabet[random.nextInt(capitalAlphabet.length)];
			newLength += capitalAlphabet.length;
		}
		if (useS) {
			password[forcedCount++] = smallAlphabet[random.nextInt(smallAlphabet.length)];
			newLength += smallAlphabet.length;
		}

		char allowedCharacters[] = new char[newLength];

		// adding the needed characters from each array as the user want
		int tracker = 0;
		if (useSp) {
			for (int i = 0; i < specialCharacters.length; i++) {
				allowedCharacters[tracker++] = specialCharacters[i];
			}
		}
		if (useD) {
			for (int i = 0; i < digits.length; i++) {
				allowedCharacters[tracker++] = digits[i];
			}
		}
		if (useC) {
			for (int i = 0; i < capitalAlphabet.length; i++) {
				allowedCharacters[tracker++] = capitalAlphabet[i];
			}
		}
		if (useS) {
			for (int i = 0; i < smallAlphabet.length; i++) {
				allowedCharacters[tracker++] = smallAlphabet[i];
			}
		}

		for (int i = forcedCount; i < length; i++) {
			password[i] = allowedCharacters[random.nextInt(allowedCharacters.length)];
		}

		// Shuffle the password
		for (int i = length - 1; i > 0; i--) {
			int j = random.nextInt(i + 1);
			char temp = password[i];
			password[i] = password[j];
			password[j] = temp;
		}

		// switch the password array to string
		String stringPassword = new String(password);
		return stringPassword;
	}

	public static void main(String args[]) {
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(randomPasswordGeneratorUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(randomPasswordGeneratorUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(randomPasswordGeneratorUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(randomPasswordGeneratorUI.class.getName())
					.log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new randomPasswordGeneratorUI().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify
	private javax.swing.JCheckBox DigitsBox;
	private javax.swing.JPanel MainPanel;
	private javax.swing.JPanel PasswordPanel;
	private javax.swing.JPanel SettingsPanel;
	private javax.swing.JCheckBox SymbolsBox;
	private javax.swing.JCheckBox UppercaseBox;
	private javax.swing.JButton copyButton;
	private javax.swing.JButton exitButton;
	private javax.swing.JButton generatePasswordButton;
	private javax.swing.JLabel l32;
	private javax.swing.JLabel l8;
	private javax.swing.JSlider lengthSlider;
	private javax.swing.JLabel lengthTXT;
	private javax.swing.JLabel lengthTitle;
	private javax.swing.JTextField passwordTXT;
	private javax.swing.JLabel title;
	// End of variables declaration
}
