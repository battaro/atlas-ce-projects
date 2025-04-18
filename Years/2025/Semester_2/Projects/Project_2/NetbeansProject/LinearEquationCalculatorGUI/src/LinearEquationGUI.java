import com.formdev.flatlaf.FlatLightLaf;
import java.util.*;
import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.net.URI;

public class LinearEquationGUI extends javax.swing.JFrame {

    public String copyText = "";

    public LinearEquationGUI() {
        initComponents();
        //Set the Panel in the middle 
        this.setLocationRelativeTo(null);
        
        //Arrange the Panels in top of each other
        CardLayout cl = (CardLayout) mainPanel.getLayout();
        mainPanel.add(solvePanel, "solvePanel");
        mainPanel.add(intersectionPanel, "intersectionPanel");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainFrame = new javax.swing.JPanel();
        mainPanel = new javax.swing.JPanel();
        intersectionPanel = new javax.swing.JPanel();
        x1_field = new javax.swing.JTextField();
        x1_text = new javax.swing.JLabel();
        x2_field = new javax.swing.JTextField();
        x2_text = new javax.swing.JLabel();
        y1_text = new javax.swing.JLabel();
        y1_field = new javax.swing.JTextField();
        y2_field = new javax.swing.JTextField();
        y2_text = new javax.swing.JLabel();
        x3_field = new javax.swing.JTextField();
        x3_text = new javax.swing.JLabel();
        x4_field = new javax.swing.JTextField();
        x4_text = new javax.swing.JLabel();
        y3_text = new javax.swing.JLabel();
        y3_field = new javax.swing.JTextField();
        y4_field = new javax.swing.JTextField();
        y4_text = new javax.swing.JLabel();
        solveButton2 = new javax.swing.JButton();
        outputText2 = new javax.swing.JLabel();
        outputField2 = new javax.swing.JLabel();
        copyButton = new javax.swing.JButton();
        solvePanel = new javax.swing.JPanel();
        a_field = new javax.swing.JTextField();
        a_text = new javax.swing.JLabel();
        plus_text = new javax.swing.JLabel();
        b_text = new javax.swing.JLabel();
        b_field = new javax.swing.JTextField();
        equal_text = new javax.swing.JLabel();
        e_field = new javax.swing.JTextField();
        e_text = new javax.swing.JLabel();
        f_text = new javax.swing.JLabel();
        equal_text2 = new javax.swing.JLabel();
        d_field = new javax.swing.JTextField();
        d_text = new javax.swing.JLabel();
        plus_text2 = new javax.swing.JLabel();
        c_field = new javax.swing.JTextField();
        c_text = new javax.swing.JLabel();
        f_field = new javax.swing.JTextField();
        solveButton = new javax.swing.JButton();
        outputField = new javax.swing.JLabel();
        outputText = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAutoRequestFocus(false);
        setResizable(false);

        mainFrame.setBackground(new java.awt.Color(204, 204, 204));

        mainPanel.setBackground(new java.awt.Color(204, 204, 204));
        mainPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mainPanel.setLayout(new java.awt.CardLayout());

        intersectionPanel.setBackground(new java.awt.Color(204, 204, 204));

        x1_field.setText("0");

        x1_text.setText("x1");

        x2_field.setText("0");

        x2_text.setText("x2");

        y1_text.setText("y1");

        y1_field.setText("0");

        y2_field.setText("0");

        y2_text.setText("y2");

        x3_field.setText("0");

        x3_text.setText("x3");

        x4_field.setText("0");

        x4_text.setText("x4");

        y3_text.setText("y3");

        y3_field.setText("0");

        y4_field.setText("0");

        y4_text.setText("y4");

        solveButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        solveButton2.setText("Solve");
        solveButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButton2ActionPerformed(evt);
            }
        });

        outputText2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        outputText2.setText("Output:");
        outputText2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        outputField2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        outputField2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        copyButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        copyButton.setText("Copy");
        copyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout intersectionPanelLayout = new javax.swing.GroupLayout(intersectionPanel);
        intersectionPanel.setLayout(intersectionPanelLayout);
        intersectionPanelLayout.setHorizontalGroup(
            intersectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(intersectionPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(intersectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(intersectionPanelLayout.createSequentialGroup()
                        .addComponent(x1_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x1_field, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x2_field, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y1_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y1_field, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y2_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y2_field, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, intersectionPanelLayout.createSequentialGroup()
                        .addComponent(x3_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x3_field, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x4_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(x4_field, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y3_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y3_field, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(y4_text)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(y4_field, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(7, 7, 7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, intersectionPanelLayout.createSequentialGroup()
                        .addGroup(intersectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(intersectionPanelLayout.createSequentialGroup()
                                .addComponent(outputText2, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 19, Short.MAX_VALUE))
                            .addComponent(outputField2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(intersectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(solveButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(copyButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        intersectionPanelLayout.setVerticalGroup(
            intersectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(intersectionPanelLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(intersectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x1_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x1_text)
                    .addComponent(x2_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x2_text)
                    .addComponent(y1_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y1_text)
                    .addComponent(y2_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y2_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(intersectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(x3_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x3_text)
                    .addComponent(x4_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(x4_text)
                    .addComponent(y3_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y3_text)
                    .addComponent(y4_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(y4_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(intersectionPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(intersectionPanelLayout.createSequentialGroup()
                        .addComponent(outputText2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(outputField2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(intersectionPanelLayout.createSequentialGroup()
                        .addComponent(solveButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(copyButton)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        mainPanel.add(intersectionPanel, "card3");

        solvePanel.setBackground(new java.awt.Color(204, 204, 204));

        a_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        a_field.setText("0");
        a_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                a_fieldActionPerformed(evt);
            }
        });

        a_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        a_text.setText("a");

        plus_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plus_text.setText("+");

        b_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        b_text.setText("b");

        b_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        b_field.setText("0");
        b_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b_fieldActionPerformed(evt);
            }
        });

        equal_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        equal_text.setText("=");

        e_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        e_field.setText("0");
        e_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                e_fieldActionPerformed(evt);
            }
        });

        e_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        e_text.setText("e");

        f_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        f_text.setText("f");

        equal_text2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        equal_text2.setText("=");

        d_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        d_field.setText("0");
        d_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                d_fieldActionPerformed(evt);
            }
        });

        d_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        d_text.setText("d");

        plus_text2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        plus_text2.setText("+");

        c_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        c_field.setText("0");
        c_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c_fieldActionPerformed(evt);
            }
        });

        c_text.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        c_text.setText("c");

        f_field.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        f_field.setText("0");
        f_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                f_fieldActionPerformed(evt);
            }
        });

        solveButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        solveButton.setText("Solve");
        solveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                solveButtonActionPerformed(evt);
            }
        });

        outputField.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        outputField.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        outputText.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        outputText.setText("Output:");
        outputText.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout solvePanelLayout = new javax.swing.GroupLayout(solvePanel);
        solvePanel.setLayout(solvePanelLayout);
        solvePanelLayout.setHorizontalGroup(
            solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solvePanelLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(solvePanelLayout.createSequentialGroup()
                                .addComponent(c_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(c_field, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(plus_text2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(d_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(d_field, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(equal_text2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(f_text))
                            .addGroup(solvePanelLayout.createSequentialGroup()
                                .addComponent(a_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(a_field, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(plus_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(b_field, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(equal_text)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e_text)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(e_field, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(f_field, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(outputText, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(solveButton, javax.swing.GroupLayout.DEFAULT_SIZE, 93, Short.MAX_VALUE)))
                .addContainerGap())
        );
        solvePanelLayout.setVerticalGroup(
            solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(solvePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(a_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(a_text)
                    .addComponent(plus_text)
                    .addComponent(b_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b_text)
                    .addComponent(equal_text)
                    .addComponent(e_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e_text))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(c_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(c_text)
                    .addComponent(plus_text2)
                    .addComponent(d_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(d_text)
                    .addComponent(equal_text2)
                    .addComponent(f_text)
                    .addComponent(f_field, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(solvePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(solvePanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(outputText, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(outputField, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 25, Short.MAX_VALUE))
                    .addComponent(solveButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        mainPanel.add(solvePanel, "card2");

        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { 
            "Solve Linear Equation", 
            "Find Intersection" 
        }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        exitButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        exitButton.setForeground(new java.awt.Color(255, 102, 102));
        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mainFrameLayout = new javax.swing.GroupLayout(mainFrame);
        mainFrame.setLayout(mainFrameLayout);
        mainFrameLayout.setHorizontalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainFrameLayout.createSequentialGroup()
                .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(exitButton))
                    .addGroup(mainFrameLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(comboBox, 0, 342, Short.MAX_VALUE)))
                .addGap(20, 20, 20))
            .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFrameLayout.createSequentialGroup()
                    .addGap(0, 18, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 26, Short.MAX_VALUE)))
        );
        mainFrameLayout.setVerticalGroup(
            mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainFrameLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 347, Short.MAX_VALUE)
                .addComponent(exitButton)
                .addGap(23, 23, 23))
            .addGroup(mainFrameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(mainFrameLayout.createSequentialGroup()
                    .addGap(0, 144, Short.MAX_VALUE)
                    .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 112, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainFrame, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed
        
        //Switch between the panels using comboBox
        String selectedOption = comboBox.getSelectedItem().toString();
        CardLayout cl = (CardLayout) (mainPanel.getLayout());
        
        if (selectedOption.equals("Solve Linear Equation")) {
            cl.show(mainPanel, "solvePanel");
        } else if (selectedOption.equals("Find Intersection")) {
            cl.show(mainPanel, "intersectionPanel");
        }
    }//GEN-LAST:event_comboBoxActionPerformed

    private void a_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_a_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_a_fieldActionPerformed

    private void b_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_b_fieldActionPerformed

    private void d_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_d_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_d_fieldActionPerformed

    private void c_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_c_fieldActionPerformed

    private void e_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_e_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_e_fieldActionPerformed

    private void f_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_f_fieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_f_fieldActionPerformed

    private void solveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButtonActionPerformed
        outputField.setText(SetOutputForSolvingEquation());
    }//GEN-LAST:event_solveButtonActionPerformed

    private void solveButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_solveButton2ActionPerformed
        outputField2.setText(SetOutputForIntersection());
    }//GEN-LAST:event_solveButton2ActionPerformed

    private void copyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyButtonActionPerformed
        SetOutputForIntersection();
        SetDialogOutput();
    }//GEN-LAST:event_copyButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    public void SetDialogOutput() {
        
        int result = JOptionPane.showConfirmDialog(
                rootPane,
                "The equation has been copied to your clipboard.\n\n"
                + "You can paste it into the following website to visualize it clearly:\n"
                + "https://www.desmos.com/calculator\n\n"
                + "Would you like to open this link in your default browser now?",
                "Open Desmos Graphing Calculator",
                JOptionPane.YES_NO_OPTION
        );

        if (result == JOptionPane.YES_OPTION) {
            try {
                java.awt.Desktop.getDesktop().browse(new java.net.URI("https://www.desmos.com/calculator"));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        //Copy to clipboard
        StringSelection selection = new StringSelection(copyText);
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selection, null);

    }

    public String SetOutputForSolvingEquation() {
        double a, b, c, d, e, f;
        String outputText = "";

        a = Double.parseDouble(a_field.getText());
        b = Double.parseDouble(b_field.getText());
        e = Double.parseDouble(e_field.getText());
        c = Double.parseDouble(c_field.getText());
        d = Double.parseDouble(d_field.getText());
        f = Double.parseDouble(f_field.getText());

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (!equation.isSolvable()) {
            outputText = "The equation has no solution.";
        } else {
            double x = equation.getX();
            double y = equation.getY();
            outputText = String.format("x = %.2f, y = %.2f", x, y);
        }

        return outputText;
    }

    public String SetOutputForIntersection() {
        double a, b, c, d, e, f;
        double x1, x2, x3, x4;
        double y1, y2, y3, y4;
        String outputText = "";

        x1 = Double.parseDouble(x1_field.getText());
        x2 = Double.parseDouble(x2_field.getText());
        x3 = Double.parseDouble(x3_field.getText());
        x4 = Double.parseDouble(x4_field.getText());
        y1 = Double.parseDouble(y1_field.getText());
        y2 = Double.parseDouble(y2_field.getText());
        y3 = Double.parseDouble(y3_field.getText());
        y4 = Double.parseDouble(y4_field.getText());

        //Calculate the coefficients
        a = y1 - y2;
        b = -(x1 - x2);
        e = a * x1 + b * y1;

        c = y3 - y4;
        d = -(x3 - x4);
        f = c * x3 + d * y3;

        LinearEquation equation = new LinearEquation(a, b, c, d, e, f);

        if (equation.isSolvable()) {
            double intersectionX = equation.getX();
            double intersectionY = equation.getY();
            outputText = String.format("The intersection point is: (%.3f, %.3f)", intersectionX, intersectionY);
        } else {
            outputText = "The two line segments do not intersect.";
        }
        copyText = a + "x+" + b + "y=" + e + "\n" + c + "x+" + d + "y=" + f;
        return outputText;
    }

    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LinearEquationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_field;
    private javax.swing.JLabel a_text;
    private javax.swing.JTextField b_field;
    private javax.swing.JLabel b_text;
    private javax.swing.JTextField c_field;
    private javax.swing.JLabel c_text;
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JButton copyButton;
    private javax.swing.JTextField d_field;
    private javax.swing.JLabel d_text;
    private javax.swing.JTextField e_field;
    private javax.swing.JLabel e_text;
    private javax.swing.JLabel equal_text;
    private javax.swing.JLabel equal_text2;
    private javax.swing.JButton exitButton;
    private javax.swing.JTextField f_field;
    private javax.swing.JLabel f_text;
    private javax.swing.JPanel intersectionPanel;
    private javax.swing.JPanel mainFrame;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JLabel outputField;
    private javax.swing.JLabel outputField2;
    private javax.swing.JLabel outputText;
    private javax.swing.JLabel outputText2;
    private javax.swing.JLabel plus_text;
    private javax.swing.JLabel plus_text2;
    private javax.swing.JButton solveButton;
    private javax.swing.JButton solveButton2;
    private javax.swing.JPanel solvePanel;
    private javax.swing.JTextField x1_field;
    private javax.swing.JLabel x1_text;
    private javax.swing.JTextField x2_field;
    private javax.swing.JLabel x2_text;
    private javax.swing.JTextField x3_field;
    private javax.swing.JLabel x3_text;
    private javax.swing.JTextField x4_field;
    private javax.swing.JLabel x4_text;
    private javax.swing.JTextField y1_field;
    private javax.swing.JLabel y1_text;
    private javax.swing.JTextField y2_field;
    private javax.swing.JLabel y2_text;
    private javax.swing.JTextField y3_field;
    private javax.swing.JLabel y3_text;
    private javax.swing.JTextField y4_field;
    private javax.swing.JLabel y4_text;
    // End of variables declaration//GEN-END:variables
}
