/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai2;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.border.LineBorder;
import models.Student;
import services.UserService;

/**
 *
 * @author huyyd
 */
public class UserManagement extends javax.swing.JFrame {

    private final LineBorder grayBorder = new LineBorder(Color.GRAY, 1);
    private final LineBorder redBorder = new LineBorder(Color.RED, 1);
    ArrayList<Student> list = new ArrayList<>();
    UserService userService = UserService.getInstance();
    int currentIndex = -1;
    boolean watching = false;

    /**
     * Creates new form QLUser
     */
    public UserManagement() {
        initComponents();
        this.updateList();
        this.setLocationRelativeTo(null);
        this.btnView.setVisible(false);
        this.txtFullname.requestFocus();
    }

    private void updateList() {
        list = userService.findAll();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtFullname = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        rdoMale = new javax.swing.JRadioButton();
        rdoFemale = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        btnFirst = new javax.swing.JButton();
        btnLast = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();
        btnPrevious = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        btnAdd = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-management-30.png"))); // NOI18N
        jLabel1.setText("Quản Lý Users");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-id-24.png"))); // NOI18N
        jLabel2.setText("Mã SV");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-name-24.png"))); // NOI18N
        jLabel3.setText("Họ tên");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-email-24.png"))); // NOI18N
        jLabel4.setText("Email");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-phone-24.png"))); // NOI18N
        jLabel5.setText("Số ĐT");

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-sex-24.png"))); // NOI18N
        jLabel6.setText("Giới tính");

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-address-24.png"))); // NOI18N
        jLabel7.setText("Địa chỉ");

        txtId.setEditable(false);
        txtId.setText("Id sẽ tự sinh");
        txtId.setEnabled(false);
        txtId.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIdKeyTyped(evt);
            }
        });

        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });
        txtFullname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtFullnameKeyTyped(evt);
            }
        });

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });
        txtEmail.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtEmailKeyTyped(evt);
            }
        });

        txtPhone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPhoneKeyTyped(evt);
            }
        });

        buttonGroup1.add(rdoMale);
        rdoMale.setSelected(true);
        rdoMale.setText("Nam");

        buttonGroup1.add(rdoFemale);
        rdoFemale.setText("Nữ");
        rdoFemale.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdoFemaleActionPerformed(evt);
            }
        });

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        txtAddress.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAddressKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(txtAddress);

        btnFirst.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-previous-30.png"))); // NOI18N
        btnFirst.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFirstActionPerformed(evt);
            }
        });

        btnLast.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-last-30.png"))); // NOI18N
        btnLast.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLastActionPerformed(evt);
            }
        });

        btnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-next-30.png"))); // NOI18N
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        btnPrevious.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-previous-30 (1).png"))); // NOI18N
        btnPrevious.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPreviousActionPerformed(evt);
            }
        });

        btnView.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-eye-30.png"))); // NOI18N
        btnView.setText("Watching");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-add-24.png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-delete-24.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reset-24.png"))); // NOI18N
        jButton1.setText("Reset");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-update-24.png"))); // NOI18N
        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnFind.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-find-24.png"))); // NOI18N
        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnFind)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnPrevious)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnFirst)
                        .addGap(18, 18, 18)
                        .addComponent(btnLast)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnNext))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdoMale, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(rdoFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 228, Short.MAX_VALUE)
                                            .addComponent(txtFullname, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtPhone)
                                            .addComponent(txtId))
                                        .addGap(16, 16, 16)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnView, javax.swing.GroupLayout.Alignment.TRAILING))))))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnView))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(rdoMale)
                            .addComponent(rdoFemale))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFirst)
                    .addComponent(btnPrevious)
                    .addComponent(btnLast)
                    .addComponent(btnNext))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private Student newStudent() {
        return new Student(this.txtFullname.getText(), this.txtEmail.getText(), this.rdoMale.isSelected(), this.txtPhone.getText(), this.txtAddress.getText());
    }

    private void showError(String mess) {
        JOptionPane.showMessageDialog(this, mess, "Error", JOptionPane.ERROR_MESSAGE);
    }

    private void showSuccess(String mess) {
        JOptionPane.showMessageDialog(this, mess, "Success", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showWarning(String message) {
        JOptionPane.showMessageDialog(this, message, "Warning", JOptionPane.WARNING_MESSAGE);
    }

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void rdoFemaleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdoFemaleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdoFemaleActionPerformed

    private void btnPreviousActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPreviousActionPerformed
        // TODO add your handling code here:
        if (!list.isEmpty()) {
            if (currentIndex == -1) {
                currentIndex = 0;
                display(currentIndex);
            } else if (this.currentIndex > 0) {
                display(--this.currentIndex);
            }
        } else {
            this.showSuccess("Danh sách hiện đang trống vui lòng nhập dữ liệu!");
        }
    }//GEN-LAST:event_btnPreviousActionPerformed

    private boolean inputIsNotEmpty() {
        StringBuilder st = new StringBuilder();

        if (this.txtAddress.getText().isEmpty()) {
            st.append("\nAddress không được bỏ trống");
            this.txtAddress.requestFocus();
            this.txtAddress.setBorder(redBorder);
        }
        if (this.txtPhone.getText().isEmpty()) {
            st.append("\nPhone không được bỏ trống");
            this.txtPhone.requestFocus();
            this.txtPhone.setBorder(redBorder);
        }

        if (this.txtEmail.getText().isEmpty()) {
            st.append("\nEmail không được bỏ trống");
            this.txtEmail.requestFocus();
            this.txtEmail.setBorder(redBorder);
        }

        if (this.txtFullname.getText().isEmpty()) {
            st.append("Fullname không được bỏ trống");
            this.txtFullname.requestFocus();
            this.txtFullname.setBorder(redBorder);

        }

        if (!st.isEmpty()) {
            this.showWarning(st.toString());
            return false;
        } else {
            return true;
        }

    }
    private void btnFirstActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFirstActionPerformed
        // TODO add your handling code here:

        if (!list.isEmpty()) {
            display(this.currentIndex = 0);
        } else {
            this.showSuccess("Danh sách hiện đang trống vui lòng nhập dữ liệu!");
        }
    }//GEN-LAST:event_btnFirstActionPerformed

    private void btnLastActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLastActionPerformed
        // TODO add your handling code here:
        if (!list.isEmpty()) {
            display((this.currentIndex = list.size() - 1));
        } else {
            this.showSuccess("Danh sách hiện đang trống vui lòng nhập dữ liệu!");
        }
    }//GEN-LAST:event_btnLastActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:

        if (!list.isEmpty()) {
            if (currentIndex == -1) {
                currentIndex = 0;
                display(currentIndex);
            } else if (this.currentIndex < list.size() - 1) {
                display(++this.currentIndex);
            }

        } else {
            this.showSuccess("Danh sách hiện đang trống vui lòng nhập dữ liệu!");
        }

    }//GEN-LAST:event_btnNextActionPerformed

    private void txtIdKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIdKeyTyped
        // TODO add your handling code here:
        this.txtId.setBorder(grayBorder);
    }//GEN-LAST:event_txtIdKeyTyped

    private void txtFullnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtFullnameKeyTyped
        // TODO add your handling code here:
        this.txtFullname.setBorder(grayBorder);
    }//GEN-LAST:event_txtFullnameKeyTyped

    private void txtEmailKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEmailKeyTyped
        // TODO add your handling code here:
        this.txtEmail.setBorder(grayBorder);
    }//GEN-LAST:event_txtEmailKeyTyped

    private void txtPhoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPhoneKeyTyped
        // TODO add your handling code here:
        this.txtPhone.setBorder(grayBorder);
        if (!Character.isDigit(evt.getKeyChar()) || this.txtPhone.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPhoneKeyTyped

    private void txtAddressKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAddressKeyTyped
        // TODO add your handling code here:
        this.txtAddress.setBorder(grayBorder);
    }//GEN-LAST:event_txtAddressKeyTyped

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        if (!watching) {
            if (this.inputIsNotEmpty() && validateInput()) {
                try {
                    this.userService.add(this.newStudent());
                    this.showSuccess("Thêm sinh viên thành công!");
                    this.updateList();
                    this.resetForm();

                } catch (SQLException ex) {
                    this.showWarning(ex.getMessage());
                }
            }
        } else {
            this.showSuccess("Hiện đang xem sinh viên nên không thể add vui lòng reset hoặc là hủy chế độ xem");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private boolean confirm(String message, String id) {
        int confirm = JOptionPane.showConfirmDialog(this, "Bạn có chắc muốn " + (message.isEmpty() ? "thêm " : message + " nhân viên có id ") + id + " không ?", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        return confirm == 0;
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Mời bạn nhập vào id nhân viên muốn xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        if (input == null) {
            return;
        }
        if (input.isEmpty()) {
            this.showSuccess("Vui lòng nhập vào id trước khi xóa");
            return;
        }
        int id;
        try {
            id = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            this.showWarning("Id phải là một số!");
            return;
        }

        if (this.userService.findById(id) == null) {
            this.showWarning("Không tìm thấy nhân viên có ID: " + id);
        } else if (confirm("xóa", String.valueOf(id))) {
            if (String.valueOf(id).equals(this.txtId.getText()) && this.watching) {
                if (JOptionPane.showConfirmDialog(this, "Hiện tại bạn đang xem sinh viên có id: " + id + " bạn có chắc muốn xóa nhân viên này hay không!", "Thông báo", JOptionPane.INFORMATION_MESSAGE) != 0) {
                    return;
                } else {
                    this.resetForm();
                    this.btnView.setVisible(this.watching = false);
                }

            }
            try {
                if (this.userService.delete(id)) {
                    this.currentIndex = -1;
                    this.showSuccess("Xóa thành công sinh viên");
                    this.updateList();
                } else {
                    this.showSuccess("Xóa thất bại sinh viên");
                }

            } catch (SQLException ex) {
                this.showWarning(ex.getMessage());
            }

        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private boolean isValidEmail(String email) {
        Pattern pattern = Pattern.compile("^[A-Za-z0-9+_.-]+@(.+)$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    private boolean isValidPhoneNumber(String phoneNumber) {
        Pattern pattern = Pattern.compile("0[0-9]{9,10}");
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public boolean validateInput() {
        StringBuilder sb = new StringBuilder();
        if (!isValidPhoneNumber(this.txtPhone.getText())) {
            sb.append("Số điện thoại phải đúng định dạng số điện thoại Việt Nam!");
            this.txtPhone.requestFocus();
            this.txtPhone.setBorder(redBorder);
        }

        if (!isValidEmail(this.txtEmail.getText())) {
            this.txtEmail.setBorder(redBorder);
            this.txtEmail.requestFocus();
            sb.append("Email phải đúng định dạng\n");
        }

        if (!sb.isEmpty()) {
            this.showWarning(sb.toString());
            return false;
        }
        return true;
    }


    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        if (this.watching) {
            if (this.btnUpdate.getText().equals("Update")) {
                this.txtFullname.requestFocus();
                this.btnUpdate.setText("Save");
                this.setEnabledForm(true);
                this.txtId.setEnabled(false);
            } else {
                try {
                    if (inputIsNotEmpty() && validateInput()) {
                        Student st = this.newStudent();
                        st.setId(Integer.parseInt(this.txtId.getText()));
                        Student student = this.userService.update(st);
                        if (student == null) {
                            this.showWarning("Update user failed");
                        } else {
                            this.fillForm(student);
                            this.showSuccess("Update user successfully");
                            this.btnUpdate.setText("Update");
                            this.updateList();
                        }
                    }
                } catch (SQLException ex) {
                    this.showWarning(ex.getMessage());
                }
            }
        } else {
            this.showWarning("Bạn phải tìm thấy sinh viên trước khi update");
        }

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void setEnabledForm(boolean want) {
        this.txtId.setEnabled(false);
        this.txtFullname.setEnabled(want);
        this.txtAddress.setEnabled(want);
        this.txtEmail.setEnabled(want);
        this.rdoFemale.setEnabled(want);
        this.rdoMale.setEnabled(want);
        this.txtPhone.setEnabled(want);
    }
    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        // TODO add your handling code here:
        String input = JOptionPane.showInputDialog(this, "Mời bạn nhập vào id nhân viên muốn xóa!", "Thông báo", JOptionPane.INFORMATION_MESSAGE);
        if (input == null) {
            return;
        }
        if (input.isEmpty()) {
            this.showSuccess("Vui lòng nhập vào id trước khi xóa");
            return;
        }

        int id = 0;
        try {
            id = Integer.parseInt(input);
        } catch (NumberFormatException ex) {
            this.showWarning("Id phải là một số!");
            return;
        }
        Student st = this.userService.findById(id);
        if (st == null) {
            this.showWarning("Không tìm thấy nhân viên có ID: " + id);
        } else {
            fillForm(st);
            this.setEnabledForm(false);
            this.btnView.setVisible(this.watching = true);
            this.showSuccess("Đã tìm thấy sinh viên");
        }
    }//GEN-LAST:event_btnFindActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        this.btnView.setVisible(this.watching = false);
        this.reset();
    }//GEN-LAST:event_btnViewActionPerformed
    public void reset() {
        this.txtFullname.requestFocus();
        this.currentIndex = -1;
        this.resetForm();
        this.btnView.setVisible(watching = false);
        this.btnUpdate.setText("Update");
        this.txtId.setText("Id sẽ tự sinh");
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        reset();

    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UserManagement.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UserManagement().setVisible(true);
            }
        });
    }

    public void display(int i) {
        Student sv = list.get(i);
        fillForm(sv);
    }

    public void fillForm(Student sv) {
        this.setEnabledForm(false);
        this.btnView.setVisible(watching = true);
        this.txtId.setEnabled(false);
        this.txtAddress.setText(sv.getAddress());
        this.txtEmail.setText(sv.getEmail());
        this.txtFullname.setText(sv.getName());
        this.txtId.setText(String.valueOf(sv.getId()));
        this.txtPhone.setText(sv.getPhone());

        if (!sv.isSex()) {
            rdoFemale.setSelected(true);;
        } else {
            rdoMale.setSelected(true);
        }
    }

    public void resetForm() {
        this.txtFullname.requestFocus();
        this.txtId.setText("Id sẽ tự sinh");
        this.txtEmail.setText("");
        this.txtFullname.setText("");
        this.txtAddress.setText("");
        this.txtPhone.setText("");
        this.rdoMale.setSelected(true);

        this.txtId.setBorder(grayBorder);
        this.txtEmail.setBorder(grayBorder);
        this.txtEmail.setBorder(grayBorder);
        this.txtAddress.setBorder(grayBorder);
        this.txtPhone.setBorder(grayBorder);

        this.setEnabledForm(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnFirst;
    private javax.swing.JButton btnLast;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnPrevious;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnView;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdoFemale;
    private javax.swing.JRadioButton rdoMale;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables
}