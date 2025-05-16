/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appdevpracbai6;

/**
 *
 * @author Admin
 */
    import javax.swing.*;
import java.awt.event.*;

public class DoanhChucNang12GUI extends JFrame {
    private JTextField txtSoA, txtSoB, txtSoDau, txtSoCuoi;
    private JLabel lblKetQuaCong, lblKetQuaTien;
    private DoanhChucNang12 chucNang = new DoanhChucNang12();

    public DoanhChucNang12GUI() {
        setTitle("Chức năng tính toán");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);

        // Cong hai số
        JLabel lblA = new JLabel("Số A:");
        lblA.setBounds(20, 20, 50, 25);
        add(lblA);
        txtSoA = new JTextField();
        txtSoA.setBounds(70, 20, 100, 25);
        add(txtSoA);

        JLabel lblB = new JLabel("Số B:");
        lblB.setBounds(180, 20, 50, 25);
        add(lblB);
        txtSoB = new JTextField();
        txtSoB.setBounds(230, 20, 100, 25);
        add(txtSoB);

        JButton btnCong = new JButton("Cộng");
        btnCong.setBounds(140, 60, 100, 30);
        add(btnCong);

        lblKetQuaCong = new JLabel("Kết quả cộng: ");
        lblKetQuaCong.setBounds(20, 100, 300, 25);
        add(lblKetQuaCong);

        // Tính tien đien
        JLabel lblDau = new JLabel("Chỉ số đầu:");
        lblDau.setBounds(20, 140, 100, 25);
        add(lblDau);
        txtSoDau = new JTextField();
        txtSoDau.setBounds(120, 140, 100, 25);
        add(txtSoDau);

        JLabel lblCuoi = new JLabel("Chỉ số cuối:");
        lblCuoi.setBounds(20, 170, 100, 25);
        add(lblCuoi);
        txtSoCuoi = new JTextField();
        txtSoCuoi.setBounds(120, 170, 100, 25);
        add(txtSoCuoi);

        JButton btnTinhTien = new JButton("Tính tiền");
        btnTinhTien.setBounds(230, 155, 120, 30);
        add(btnTinhTien);

        lblKetQuaTien = new JLabel("Số tiền: ");
        lblKetQuaTien.setBounds(20, 210, 300, 25);
        add(lblKetQuaTien);

        // Su kien
        btnCong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int a = Integer.parseInt(txtSoA.getText());
                    int b = Integer.parseInt(txtSoB.getText());
                    int kq = chucNang.cong(a, b);
                    lblKetQuaCong.setText("Kết quả cộng: " + kq);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên.");
                }
            }
        });

        btnTinhTien.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int cuoi = Integer.parseInt(txtSoCuoi.getText());
                    int dau = Integer.parseInt(txtSoDau.getText());
                    float tien = chucNang.tinhTien(dau, cuoi);
                    lblKetQuaTien.setText("Số tiền: " + tien + " VNĐ");
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(null, "Vui lòng nhập số nguyên.");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new DoanhChucNang12GUI();
    }
}

