/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package gui;

import eu.diversify.ffbpg.BPGraph;
import eu.diversify.ffbpg.collections.SortedIntegerCollection;
import eu.diversify.ffbpg.random.BinomialIntegerGenerator;
import eu.diversify.ffbpg.random.GaussianIntegerGenerator;
import eu.diversify.ffbpg.random.IntegerGenerator;
import eu.diversify.ffbpg.random.IntegerSetGenerator;
import eu.diversify.ffbpg.random.NegExpIntegerSetGenerator;
import eu.diversify.ffbpg.random.PoissonIntegerGenerator;
import eu.diversify.ffbpg.random.UniformIntegerGenerator;
import eu.diversify.ffbpg.random.UniformIntegerSetGenerator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.ProgressMonitor;

/**
 *
 * @author ffl
 */
public class MainFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupAppSize = new javax.swing.ButtonGroup();
        buttonGroupSrvDist = new javax.swing.ButtonGroup();
        buttonGroupInitial = new javax.swing.ButtonGroup();
        buttonGroupLinking = new javax.swing.ButtonGroup();
        buttonGroupExtinction = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jRadioButtonSrvUniform = new javax.swing.JRadioButton();
        jRadioButtonSrvExp = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldSrvLambda = new javax.swing.JTextField();
        jRadioButtonSrvComb = new javax.swing.JRadioButton();
        jTextFieldSrvURate = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jRadioButtonAppUniform = new javax.swing.JRadioButton();
        jRadioButtonAppPoisson = new javax.swing.JRadioButton();
        jRadioButtonAppNormal = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldAppLambda = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldAppMean = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldAppVar = new javax.swing.JTextField();
        jRadioButtonAppBinomial = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldAppN = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextFieldAppP = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jTextFieldSimNApp = new javax.swing.JTextField();
        jTextFieldSimNSrv = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jRadioButtonIniti1 = new javax.swing.JRadioButton();
        jPanel5 = new javax.swing.JPanel();
        jRadioButtonLinkSL = new javax.swing.JRadioButton();
        jRadioButtonLinkAL = new javax.swing.JRadioButton();
        jRadioButtonLinkAAllL = new javax.swing.JRadioButton();
        jCheckBoxNeighbourhood = new javax.swing.JCheckBox();
        jTextFieldNeighbourhood = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jTextFieldNGraphs = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonBPGView = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Diversify Bi-Partite Graph Generator");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Services usage distribution"));

        buttonGroupSrvDist.add(jRadioButtonSrvUniform);
        jRadioButtonSrvUniform.setText("Uniform");

        buttonGroupSrvDist.add(jRadioButtonSrvExp);
        jRadioButtonSrvExp.setSelected(true);
        jRadioButtonSrvExp.setText("Exponetial");

        jLabel1.setText("lambda=");

        jTextFieldSrvLambda.setText("0.01");
        jTextFieldSrvLambda.setPreferredSize(new java.awt.Dimension(60, 20));
        jTextFieldSrvLambda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldSrvLambdaActionPerformed(evt);
            }
        });

        buttonGroupSrvDist.add(jRadioButtonSrvComb);
        jRadioButtonSrvComb.setText("Combined");

        jTextFieldSrvURate.setText("1.0");
        jTextFieldSrvURate.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel4.setText("%");

        jLabel3.setText("uniform rate=");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonSrvUniform)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonSrvComb)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSrvURate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButtonSrvExp)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldSrvLambda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addContainerGap(113, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonSrvUniform)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSrvExp)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldSrvLambda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonSrvComb)
                    .addComponent(jTextFieldSrvURate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Application size distribution"));

        buttonGroupAppSize.add(jRadioButtonAppUniform);
        jRadioButtonAppUniform.setText("Uniform");
        jRadioButtonAppUniform.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAppUniformActionPerformed(evt);
            }
        });

        buttonGroupAppSize.add(jRadioButtonAppPoisson);
        jRadioButtonAppPoisson.setSelected(true);
        jRadioButtonAppPoisson.setText("Poisson");

        buttonGroupAppSize.add(jRadioButtonAppNormal);
        jRadioButtonAppNormal.setText("Normal");

        jLabel2.setText("lambda=");

        jTextFieldAppLambda.setText("8.0");
        jTextFieldAppLambda.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel5.setText("mean=");

        jTextFieldAppMean.setText("8.0");
        jTextFieldAppMean.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel6.setText("variance=");

        jTextFieldAppVar.setText("3.0");
        jTextFieldAppVar.setPreferredSize(new java.awt.Dimension(60, 20));

        buttonGroupAppSize.add(jRadioButtonAppBinomial);
        jRadioButtonAppBinomial.setText("Binomial");
        jRadioButtonAppBinomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonAppBinomialActionPerformed(evt);
            }
        });

        jLabel7.setText("n=");

        jTextFieldAppN.setText("1");
        jTextFieldAppN.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel8.setText("p=");

        jTextFieldAppP.setText("1.0");
        jTextFieldAppP.setPreferredSize(new java.awt.Dimension(60, 20));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButtonAppUniform)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButtonAppBinomial)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAppN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButtonAppNormal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAppMean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButtonAppPoisson)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAppLambda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAppVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextFieldAppP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(8, Short.MAX_VALUE)
                .addComponent(jRadioButtonAppUniform)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButtonAppPoisson)
                    .addComponent(jLabel2)
                    .addComponent(jTextFieldAppLambda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldAppMean, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTextFieldAppVar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButtonAppNormal))
                .addGap(4, 4, 4)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldAppN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel8)
                        .addComponent(jTextFieldAppP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButtonAppBinomial))
                .addContainerGap())
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("General simulation parameters"));

        jLabel9.setText("Number of applications");

        jTextFieldSimNApp.setText("100");
        jTextFieldSimNApp.setPreferredSize(new java.awt.Dimension(60, 20));

        jTextFieldSimNSrv.setText("200");
        jTextFieldSimNSrv.setPreferredSize(new java.awt.Dimension(60, 20));

        jLabel10.setText("Number of services");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSimNApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldSimNSrv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextFieldSimNApp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldSimNSrv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Initial bi-partite graph"));

        buttonGroupInitial.add(jRadioButtonIniti1);
        jRadioButtonIniti1.setSelected(true);
        jRadioButtonIniti1.setText("One platform / application - Exact services match");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonIniti1)
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonIniti1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder("Applications \"linking startegy\""));

        buttonGroupLinking.add(jRadioButtonLinkSL);
        jRadioButtonLinkSL.setText("Link to a single platform");

        buttonGroupLinking.add(jRadioButtonLinkAL);
        jRadioButtonLinkAL.setSelected(true);
        jRadioButtonLinkAL.setText("Link to platforms offering at least one service");
        jRadioButtonLinkAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonLinkALActionPerformed(evt);
            }
        });

        buttonGroupLinking.add(jRadioButtonLinkAAllL);
        jRadioButtonLinkAAllL.setText("Link to platforms offering all services");

        jCheckBoxNeighbourhood.setText("Restrict Neighbourhood to ");

        jTextFieldNeighbourhood.setText("50");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jCheckBoxNeighbourhood)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextFieldNeighbourhood))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButtonLinkSL)
                            .addComponent(jRadioButtonLinkAL)
                            .addComponent(jRadioButtonLinkAAllL))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jRadioButtonLinkSL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonLinkAL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButtonLinkAAllL)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBoxNeighbourhood)
                    .addComponent(jTextFieldNeighbourhood, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel7.setBorder(javax.swing.BorderFactory.createTitledBorder("Bipartite graph generator"));

        jLabel12.setText("Number of graphs");

        jTextFieldNGraphs.setText("25");
        jTextFieldNGraphs.setPreferredSize(new java.awt.Dimension(60, 20));

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(bpgraphtable);
        jScrollPane2.setViewportView(jTable1);

        jScrollPane1.setViewportView(jScrollPane2);

        jButtonBPGView.setText("Explore...");
        jButtonBPGView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBPGViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldNGraphs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBPGView)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jTextFieldNGraphs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButtonBPGView))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 417, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButtonAppUniformActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAppUniformActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAppUniformActionPerformed

    private void jRadioButtonAppBinomialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonAppBinomialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonAppBinomialActionPerformed

  // protected BPGraphListModel bpgraphlist = new BPGraphListModel();
   protected BPGraphTableModel bpgraphtable = new BPGraphTableModel();
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
      //  bpgraphlist.clear();
        bpgraphtable.clear();
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(200);
        int n_run = Integer.parseInt(jTextFieldNGraphs.getText());
        
        final ProgressMonitor progressMonitor = new ProgressMonitor(this,
                                      "Generating Bi-Partite Graphs",
                                      "", 0, n_run);
       
        progressMonitor.setMillisToPopup(500);
        
        Thread queryThread = new Thread() {
      public void run() {
        int n_run = Integer.parseInt(jTextFieldNGraphs.getText());
               
        int n_app = Integer.parseInt(jTextFieldSimNApp.getText());
        int n_srv = Integer.parseInt(jTextFieldSimNSrv.getText());
        
        IntegerGenerator app_size_generator = null;
        if (jRadioButtonAppUniform.isSelected()) {
            app_size_generator = new UniformIntegerGenerator();
        }
        else if (jRadioButtonAppNormal.isSelected()) {
            app_size_generator = new GaussianIntegerGenerator(Double.parseDouble(jTextFieldAppMean.getText()), Double.parseDouble(jTextFieldAppVar.getText()));
        }
        else if (jRadioButtonAppPoisson.isSelected()) {
            app_size_generator = new PoissonIntegerGenerator(Double.parseDouble(jTextFieldAppLambda.getText()));
        }
        else if (jRadioButtonAppBinomial.isSelected()) {
            app_size_generator = new BinomialIntegerGenerator(Integer.parseInt(jTextFieldAppN.getText()), Double.parseDouble(jTextFieldAppP.getText()));
        }
        
        IntegerSetGenerator service_sets_generator = null;
        if (jRadioButtonSrvUniform.isSelected()) {
            service_sets_generator = new UniformIntegerSetGenerator();
        }
        else if (jRadioButtonSrvExp.isSelected()) {
            service_sets_generator = new NegExpIntegerSetGenerator(Double.parseDouble(jTextFieldSrvLambda.getText()), 0);
        }
        else if (jRadioButtonSrvComb.isSelected()) {
            service_sets_generator = new NegExpIntegerSetGenerator(Double.parseDouble(jTextFieldSrvLambda.getText()), Double.parseDouble(jTextFieldSrvURate.getText()));
        }
        
        BPGraph g;
        
        for(int i=0; i<n_run; i++) {
            System.out.println("Run #" + i);
            final int progress = i+1;
            java.awt.EventQueue.invokeLater(new Runnable() {    
                public void run() {
                   progressMonitor.setProgress(progress);
               }
                });
           
            g = new BPGraph(n_srv);
            SortedIntegerCollection[] ssets = g.getRandomGenerator().createRandomServiceSets(g.getServices(), n_app, app_size_generator, service_sets_generator);
            g.createGraphWithOnePlatformPerApplicationAndSingleLink(ssets);
            
            int neighbourhood = g.getPlatforms().size();
            if (jCheckBoxNeighbourhood.isSelected())
                neighbourhood = Integer.parseInt(jTextFieldNeighbourhood.getText());
            if (jRadioButtonLinkAL.isSelected()) {
                g.addLinksFromApplicationsToPlatformsProvidingAtLeastOneSrv(neighbourhood);
            }
            else if (jRadioButtonLinkAAllL.isSelected()) {
               g.addLinksFromApplicationsToPlatformsProvidingAllSrv(neighbourhood);
            }
           // bpgraphlist.add(g);
            bpgraphtable.add(g);
        }
      }
      
    };
    queryThread.start();
        
        
        
        
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButtonBPGViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBPGViewActionPerformed
        
        if (bpgraphtable.getData().size() == 0) return;
        int row = jTable1.getSelectedRow();
        if (row < 0) row = 0;
        BPGraphFrame f = new BPGraphFrame();
        f.setVisible(true);
        f.setBPGraphCollection((List<BPGraph>)bpgraphtable.getData().clone(), row);
        
     
    }//GEN-LAST:event_jButtonBPGViewActionPerformed

    private void jTextFieldSrvLambdaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldSrvLambdaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldSrvLambdaActionPerformed

    private void jRadioButtonLinkALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonLinkALActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButtonLinkALActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        /*
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
*/
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroupAppSize;
    private javax.swing.ButtonGroup buttonGroupExtinction;
    private javax.swing.ButtonGroup buttonGroupInitial;
    private javax.swing.ButtonGroup buttonGroupLinking;
    private javax.swing.ButtonGroup buttonGroupSrvDist;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonBPGView;
    private javax.swing.JCheckBox jCheckBoxNeighbourhood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JRadioButton jRadioButtonAppBinomial;
    private javax.swing.JRadioButton jRadioButtonAppNormal;
    private javax.swing.JRadioButton jRadioButtonAppPoisson;
    private javax.swing.JRadioButton jRadioButtonAppUniform;
    private javax.swing.JRadioButton jRadioButtonIniti1;
    private javax.swing.JRadioButton jRadioButtonLinkAAllL;
    private javax.swing.JRadioButton jRadioButtonLinkAL;
    private javax.swing.JRadioButton jRadioButtonLinkSL;
    private javax.swing.JRadioButton jRadioButtonSrvComb;
    private javax.swing.JRadioButton jRadioButtonSrvExp;
    private javax.swing.JRadioButton jRadioButtonSrvUniform;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextFieldAppLambda;
    private javax.swing.JTextField jTextFieldAppMean;
    private javax.swing.JTextField jTextFieldAppN;
    private javax.swing.JTextField jTextFieldAppP;
    private javax.swing.JTextField jTextFieldAppVar;
    private javax.swing.JTextField jTextFieldNGraphs;
    private javax.swing.JTextField jTextFieldNeighbourhood;
    private javax.swing.JTextField jTextFieldSimNApp;
    private javax.swing.JTextField jTextFieldSimNSrv;
    private javax.swing.JTextField jTextFieldSrvLambda;
    private javax.swing.JTextField jTextFieldSrvURate;
    // End of variables declaration//GEN-END:variables
}
