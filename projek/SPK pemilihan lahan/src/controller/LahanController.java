/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entitas.Lahan;
import java.awt.Font;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import model.LahanModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import tablemodel.LahanTableModel;
import utility.ConnectionUtility;
import view.LahanView;

/**
 *
 * @author Fadli Hudaya
 */
public class LahanController {

    private LahanView LahanView;
    private LahanModel LahanModel;
    private Lahan dosen;

    public LahanController(LahanView dosenView, LahanModel dosenModel) {
        this.LahanView = dosenView;
        this.LahanModel = dosenModel;
    }

    public void refreshDosenTable() {
        LahanView.setDosenTableModel(new LahanTableModel());
        LahanView.getDosenTableModel().setListDosen(LahanModel.getAll());
        LahanView.getDosenTable().setModel(LahanView.getDosenTableModel());
        LahanView.getDosenTable().getTableHeader().setFont(new Font("Segoe UI", 0, 14));
        // ResizeColumnUtility.dynamicResize(dosenView.getDosenTable());
    }

    public void addValueComponent(String nidn) {
        dosen = LahanModel.getDosen(nidn);
        LahanView.getNidnField().setText(dosen.getNo());
        LahanView.getNamaField().setText(dosen.getNama());
    }

    private Lahan createDosen() {
        dosen = new Lahan(LahanView.getNidnField().getText(), LahanView.getNamaField().getText());
        return dosen;
    }

    private boolean isEmptyField() {
        boolean result = true;
        if (LahanView.getNamaField().getText().isEmpty()) {
            JOptionPane.showMessageDialog(LahanView, "Nama Masih Kosong !!!");
        } else {
            result = false;
        }
        return result;
    }

    public void saveOrNew() {
        if (!isEmptyField()) {
            if (LahanModel.insert(createDosen())) {
                refreshDosenTable();
                resetData();
                JOptionPane.showMessageDialog(LahanView, "Insert Data Dosen Sukses.");
            } else {
                JOptionPane.showMessageDialog(LahanView, "Insert Data Dosen Gagal !!!");
            }
        }
    }
    
    public String autoNumber() {
        String number = LahanModel.getNidn();
        if (number.equals("")) {
            number = "0000000001";
        } else {
            //number = number.substring(2);
            int angka = Integer.parseInt(number);
            angka++;
            if (angka < 10) {
                number = "000000000" + angka;
            } else if (angka >= 10 && angka < 100) {
                number = "00000000" + angka;
            } else if (angka >= 100 && angka < 1000) {
                number = "0000000" + angka;
            } else if (angka >= 100 && angka < 1000) {
                number = "000000" + angka;
            } else if (angka >= 100 && angka < 1000) {
                number = "00000" + angka;
            } else if (angka >= 100 && angka < 1000) {
                number = "0000" + angka;
            } else if (angka >= 100 && angka < 1000) {
                number = "000" + angka;
            } else if (angka >= 100 && angka < 1000) {
                number = "00" + angka;
            } else if (angka >= 100 && angka < 1000) {
                number = "0" + angka;
            } else {
                number = String.valueOf(angka);
            }
            if (number.length() > 10) {
                number = number.substring(number.length() - 10, number.length());
            }
            number = "" + number;
        }
        return number;
    }

    public void saveOrUpdate() {
        if (!isEmptyField()) {
            if (LahanModel.update(createDosen())) {
                refreshDosenTable();
                resetData();
                JOptionPane.showMessageDialog(LahanView, "Update Data Dosen Sukses.");
            } else {
                JOptionPane.showMessageDialog(LahanView, "Update Data Dosen Gagal !!!");
            }
        }
    }

    public void saveOrDelete(String nidn) {
        if (LahanView.getDosenTable().getSelectedRow() != -1) {
            if (JOptionPane.showConfirmDialog(LahanView, "Anda yakin ingin menghapus data ini?", "Hapus data",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                if (LahanModel.delete(nidn)) {
                    resetData();
                    JOptionPane.showMessageDialog(LahanView, "Delete Data Dosen Sukses.");
                } else {
                    JOptionPane.showMessageDialog(LahanView, "Delete Data Dosen Gagal !!!");
                }
            }
        }
    }

    public void newData() {
        if (LahanView.getBaruButton().getText().equals("Baru")) {
            LahanView.getBaruButton().setText("Batal");
            LahanView.getTambahButton().setEnabled(true);
            LahanView.getUpdateButton().setEnabled(false);
            LahanView.getHapusButton().setEnabled(false);
            LahanView.getNidnField().setEnabled(false);
            LahanView.getNidnField().setText(autoNumber());
            LahanView.getNamaField().setEnabled(true);
            LahanView.getNamaField().setText("");
        } else {
            resetData();
        }
    }

    public void resetData() {
        LahanView.getBaruButton().setText("Baru");
        LahanView.getUpdateButton().setText("Update");
        LahanView.getTambahButton().setEnabled(false);
        LahanView.getUpdateButton().setEnabled(true);
        LahanView.getHapusButton().setEnabled(true);
        LahanView.getNidnField().setEnabled(false);
        LahanView.getNidnField().setText("");
        LahanView.getNamaField().setEnabled(false);
        LahanView.getNamaField().setText("");
        refreshDosenTable();
    }

    public void updateData() {
        if (LahanView.getUpdateButton().getText().equals("Update")) {
            LahanView.getBaruButton().setText("Batal");
            LahanView.getTambahButton().setEnabled(false);
            LahanView.getUpdateButton().setText("Simpan");
            LahanView.getHapusButton().setEnabled(false);
            LahanView.getNidnField().setEnabled(true);
            LahanView.getNamaField().setEnabled(true);
        } else {
            saveOrUpdate();
        }
    }

    public void setAction() {
        LahanView.getDosenTable().getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                if (LahanView.getDosenTable().getSelectedRow() != -1) {
                    LahanView.setNidn(LahanView.getDosenTable().getValueAt(
                            LahanView.getDosenTable().getSelectedRow(), 0).toString());
                    addValueComponent(LahanView.getNidn());
                }
            }
        });
    }
    
    public void getReport() {
        InputStream stream;
        Map<String, Object> map;
        stream = getClass().getResourceAsStream("report/Laporan Dosen.jasper");
        map = new HashMap<>();
        try {
            JasperPrint jasperPrint = JasperFillManager.fillReport(stream, map, ConnectionUtility.getConnection());
            JasperViewer.viewReport(jasperPrint, false);
        } catch (JRException ex) {
            //Logger.getLogger(KonsultasiController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}