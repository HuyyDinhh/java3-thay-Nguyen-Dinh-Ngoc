/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package bai3;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.border.MatteBorder;

/**
 *
 * @author dinhh
 */
public class LoginForm extends javax.swing.JFrame {

    private MatteBorder redBorder = new MatteBorder(1, 1, 1, 1, Color.RED);
    private MatteBorder grayBorder = new MatteBorder(1, 1, 1, 1, Color.GRAY);
    private UserRepository userRepository = UserRepository.getInstance();

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.txtUsername.requestFocus();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tpAuth = new javax.swing.JTabbedPane();
        pRegis = new javax.swing.JPanel();
        lblUsernameSU = new javax.swing.JLabel();
        lblPasswordSU = new javax.swing.JLabel();
        lblConfirmSU = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        txtConfirm = new javax.swing.JPasswordField();
        btnSignUp = new javax.swing.JButton();
        btnCancelSignUp = new javax.swing.JButton();
        pLogin = new javax.swing.JPanel();
        lblUsernameLG = new javax.swing.JLabel();
        lblPasswordLG = new javax.swing.JLabel();
        txtUsernameLogin = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();
        txtPasswordLogin = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblUsernameSU.setText("Username");

        lblPasswordSU.setText("Password");

        lblConfirmSU.setText("Confirm");

        txtUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameKeyPressed(evt);
            }
        });

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        txtPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPasswordKeyPressed(evt);
            }
        });

        txtConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtConfirmActionPerformed(evt);
            }
        });
        txtConfirm.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtConfirmKeyPressed(evt);
            }
        });

        btnSignUp.setText("Signup");
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });

        btnCancelSignUp.setText("Cancel");
        btnCancelSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelSignUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pRegisLayout = new javax.swing.GroupLayout(pRegis);
        pRegis.setLayout(pRegisLayout);
        pRegisLayout.setHorizontalGroup(
            pRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pRegisLayout.createSequentialGroup()
                        .addGroup(pRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblUsernameSU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPasswordSU, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(pRegisLayout.createSequentialGroup()
                        .addComponent(lblConfirmSU, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(9, 9, 9)))
                .addGroup(pRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pRegisLayout.createSequentialGroup()
                        .addComponent(btnSignUp)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnCancelSignUp))
                    .addComponent(txtConfirm, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(txtUsername)
                    .addComponent(txtPassword))
                .addGap(12, 12, 12))
        );
        pRegisLayout.setVerticalGroup(
            pRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pRegisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsernameSU)
                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPasswordSU)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblConfirmSU))
                .addGap(18, 18, 18)
                .addGroup(pRegisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSignUp)
                    .addComponent(btnCancelSignUp))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        tpAuth.addTab("Signup", pRegis);

        lblUsernameLG.setText("Username");

        lblPasswordLG.setText("Password");

        txtUsernameLogin.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsernameLoginKeyPressed(evt);
            }
        });

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pLoginLayout = new javax.swing.GroupLayout(pLogin);
        pLogin.setLayout(pLoginLayout);
        pLoginLayout.setHorizontalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLogin, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pLoginLayout.createSequentialGroup()
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblPasswordLG, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsernameLG, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtUsernameLogin)
                            .addComponent(txtPasswordLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pLoginLayout.setVerticalGroup(
            pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pLoginLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblUsernameLG)
                    .addGroup(pLoginLayout.createSequentialGroup()
                        .addComponent(txtUsernameLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPasswordLG)
                            .addComponent(txtPasswordLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLogin)
                .addContainerGap())
        );

        tpAuth.addTab("Login", pLogin);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(tpAuth)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(tpAuth)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelSignUpActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnCancelSignUpActionPerformed

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
        if (this.checkInputEmptyRegister()) {
            if (!userRepository.checkConflig(this.txtUsername.getText())) {
                if (!this.txtPassword.getText().equalsIgnoreCase(txtConfirm.getText())) {
                    this.showError("Password và confirm password phải giống nhau");
                } else {
                    this.userRepository.add(this.newUser());
                    this.showSuccess("Đăng kí thành công");
                    tpAuth.setSelectedIndex(1);
                    resetForm();
                }
            } else {
                this.showError("Username đã tồn tại vui lòng chọn username khác");
                this.txtUsername.setBorder(redBorder);
            }
        }
    }//GEN-LAST:event_btnSignUpActionPerformed

    private void resetForm() {
        this.txtUsername.setText("");
        this.txtPassword.setText("");
        this.txtConfirm.setText("");

        this.txtUsername.setBorder(grayBorder);
        this.txtPassword.setBorder(grayBorder);
        this.txtConfirm.setBorder(grayBorder);

        this.txtUsernameLogin.setText("");
        this.txtPasswordLogin.setText("");

        this.txtUsernameLogin.setBorder(grayBorder);
        this.txtPasswordLogin.setBorder(grayBorder);
    }

    private void txtUsernameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameKeyPressed
        // TODO add your handling code here:
        this.txtUsername.setBorder(grayBorder);
    }//GEN-LAST:event_txtUsernameKeyPressed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed
    public User newUser() {
        return new User(txtUsername.getText(), txtPassword.getText());
    }
    private void txtConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtConfirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtConfirmActionPerformed


    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        // TODO add your handling code here:
        if (this.checkInputEmptyLogin() && userRepository.checkUser(new User(this.txtUsernameLogin.getText(), this.txtPasswordLogin.getText()))) {
            this.showSuccess("Đăng nhập thành công");
            resetForm();
            txtUsernameLogin.requestFocus();
        } else {
            this.showError("Tài khoản hoặc mật khẩu không chính xác");
        }
    }//GEN-LAST:event_btnLoginActionPerformed

    private void txtPasswordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPasswordKeyPressed
        // TODO add your handling code here:
        txtPassword.setBorder(grayBorder);
    }//GEN-LAST:event_txtPasswordKeyPressed

    private void txtConfirmKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtConfirmKeyPressed
        // TODO add your handling code here:  
        txtConfirm.setBorder(grayBorder);
    }//GEN-LAST:event_txtConfirmKeyPressed

    private void txtUsernameLoginKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsernameLoginKeyPressed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtUsernameLoginKeyPressed

    private void showSuccess(String message) {
        JOptionPane.showMessageDialog(this, message, "Thông báo", JOptionPane.INFORMATION_MESSAGE);
    }

    private void showError(String message) {
        JOptionPane.showMessageDialog(this, message, "Thông báo", JOptionPane.ERROR_MESSAGE);
    }

    public boolean checkInputEmptyRegister() {
        StringBuilder st = new StringBuilder();
        if (this.txtUsername.getText().isEmpty()) {
            this.txtUsername.setBorder(redBorder);
            st.append("Không được bỏ trống username\n");
        }
        if (this.txtPassword.getText().isEmpty()) {
            this.txtPassword.setBorder(redBorder);
            st.append("Không được bỏ trống password\n");
        }
        if (this.txtConfirm.getText().isEmpty()) {
            this.txtConfirm.setBorder(redBorder);
            st.append("Không được bỏ trống confirm\n");
        }
        if (st.isEmpty()) {
            return true;
        } else {
            this.showError(st.toString());
            return false;
        }

    }

    public boolean checkInputEmptyLogin() {
        StringBuilder st = new StringBuilder();
        if (this.txtUsernameLogin.getText().isEmpty()) {
            this.txtUsernameLogin.setBorder(redBorder);
            st.append("Không được bỏ trống username\n");
        }
        if (this.txtPasswordLogin.getText().isEmpty()) {
            this.txtPasswordLogin.setBorder(redBorder);
            st.append("Không được bỏ trống password\n");
        }
        if (st.isEmpty()) {
            return true;
        } else {
            this.showError(st.toString());
            return false;
        }

    }

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelSignUp;
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnSignUp;
    private javax.swing.JLabel lblConfirmSU;
    private javax.swing.JLabel lblPasswordLG;
    private javax.swing.JLabel lblPasswordSU;
    private javax.swing.JLabel lblUsernameLG;
    private javax.swing.JLabel lblUsernameSU;
    private javax.swing.JPanel pLogin;
    private javax.swing.JPanel pRegis;
    private javax.swing.JTabbedPane tpAuth;
    private javax.swing.JPasswordField txtConfirm;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JPasswordField txtPasswordLogin;
    private javax.swing.JTextField txtUsername;
    private javax.swing.JTextField txtUsernameLogin;
    // End of variables declaration//GEN-END:variables
}
