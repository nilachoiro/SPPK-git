/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AnalisaController;
import javax.swing.JTable;
import model.KriteriaLahanModel;
import tablemodel.DataAwalTableModel;

/**
 *
 * @author Fadli Hudaya
 */
public class AnalisaView extends javax.swing.JInternalFrame {

    /**
     * Creates new form AnalisaView
     */
    public AnalisaView() {
        initComponents();
        kriteriaDosenModel = new KriteriaLahanModel();
        analisaController = new AnalisaController(this, kriteriaDosenModel);
        analisaController.refreshTable();
        analisaController.getMatriksKeputusan();
        analisaController.getMatrikNormalisasi();
        analisaController.getSolusiIdeal();
        analisaController.getHasil();
        setLocation((1366 / 2) - (getWidth() / 2), (768 / 2) - (getHeight() / 2));
    }

    public JTable getmKeputusanTable() {
        return mKeputusanTable;
    }
    
    public JTable getDataAwalTable() {
        return dataAwalTable;
    }

    public DataAwalTableModel getDataAwalTableModel() {
        return dataAwalTableModel;
    }

    public void setDataAwalTableModel(DataAwalTableModel dataAwalTableModel) {
        this.dataAwalTableModel = dataAwalTableModel;
    }

    public JTable getmNormalisasiTable() {
        return mNormalisasiTable;
    }

    public JTable getSINegatifTable() {
        return SINegatifTable;
    }

    public JTable getSIPositifTable() {
        return SIPositifTable;
    }
    public JTable getjarakpositif() {
        return jarakpositif;
    }
    public JTable getjaraknegatif() {
        return jaraknegatif;
    }

    public JTable getHasilAnalisaTable() {
        return hasilAnalisaTable;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        dataAwalTable = new javax.swing.JTable();
        jScrollPane6 = new javax.swing.JScrollPane();
        hasilAnalisaTable = new javax.swing.JTable();
        jToolBar1 = new javax.swing.JToolBar();
        hapusButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        mKeputusanTable = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        mNormalisasiTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        SIPositifTable = new javax.swing.JTable();
        jScrollPane5 = new javax.swing.JScrollPane();
        SINegatifTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jarakpositif = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jaraknegatif = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        dataAwalTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        dataAwalTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        dataAwalTable.setRowHeight(22);
        jScrollPane1.setViewportView(dataAwalTable);

        setClosable(true);
        setIconifiable(true);

        hasilAnalisaTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        hasilAnalisaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        hasilAnalisaTable.setRowHeight(22);
        jScrollPane6.setViewportView(hasilAnalisaTable);

        jToolBar1.setFloatable(false);

        hapusButton.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        hapusButton.setText("Tampilkan Laporan");
        hapusButton.setFocusable(false);
        hapusButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        hapusButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        hapusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hapusButtonActionPerformed(evt);
            }
        });
        jToolBar1.add(hapusButton);

        mKeputusanTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mKeputusanTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mKeputusanTable.setRowHeight(22);
        jScrollPane2.setViewportView(mKeputusanTable);

        mNormalisasiTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        mNormalisasiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        mNormalisasiTable.setRowHeight(22);
        jScrollPane3.setViewportView(mNormalisasiTable);

        SIPositifTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SIPositifTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        SIPositifTable.setRowHeight(22);
        jScrollPane4.setViewportView(SIPositifTable);

        SINegatifTable.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        SINegatifTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        SINegatifTable.setRowHeight(22);
        jScrollPane5.setViewportView(SINegatifTable);

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel1.setText("1. Matriks Keputusan");

        jLabel2.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel2.setText("2. Matriks Ternormalisasi Terbobot");

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel3.setText("3. Solusi Ideal Positif");

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel4.setText("Solusi Ideal Negatif");

        jLabel5.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        jLabel5.setText("5. Perankingan");

        jarakpositif.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane7.setViewportView(jarakpositif);

        jLabel6.setText("4. jarak ideal positif");

        jaraknegatif.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane8.setViewportView(jaraknegatif);

        jLabel7.setText("jarak ideal negatif");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel4)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                            .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 902, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 397, Short.MAX_VALUE)))
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 448, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 19, Short.MAX_VALUE)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane2, jScrollPane3, jScrollPane4, jScrollPane5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane8, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                    .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hapusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hapusButtonActionPerformed
        analisaController.saveHasil();
    }//GEN-LAST:event_hapusButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable SINegatifTable;
    private javax.swing.JTable SIPositifTable;
    private javax.swing.JTable dataAwalTable;
    private javax.swing.JButton hapusButton;
    private javax.swing.JTable hasilAnalisaTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTable jaraknegatif;
    private javax.swing.JTable jarakpositif;
    private javax.swing.JTable mKeputusanTable;
    private javax.swing.JTable mNormalisasiTable;
    // End of variables declaration//GEN-END:variables
    private KriteriaLahanModel kriteriaDosenModel;
    private DataAwalTableModel dataAwalTableModel;
    private AnalisaController analisaController;
    
}
