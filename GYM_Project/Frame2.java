
package GYM_Project;

public class Frame2 extends javax.swing.JFrame {

    private static int id,memberId;
    public Frame2(int id,int memberId) {
        this.id=id;
        this.memberId=memberId;
        initComponents();
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        message = new javax.swing.JButton();
        plan = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        message.setBackground(new java.awt.Color(62, 114, 236));
        message.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        message.setForeground(new java.awt.Color(255, 255, 255));
        message.setText("Message");
        message.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        message.setFocusPainted(false);
        message.setFocusable(false);
        message.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        message.setRequestFocusEnabled(false);
        message.setRolloverEnabled(false);
        message.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                messageActionPerformed(evt);
            }
        });

        plan.setBackground(new java.awt.Color(62, 114, 236));
        plan.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        plan.setForeground(new java.awt.Color(255, 255, 255));
        plan.setText("Plan");
        plan.setBorderPainted(false);
        plan.setFocusPainted(false);
        plan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                planMouseClicked(evt);
            }
        });
        plan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                planActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(plan, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(message, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(plan, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void messageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_messageActionPerformed
        if(evt.getSource()==message)
        {
            Frame3 f3=new Frame3(id,memberId);
            f3.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_messageActionPerformed

    private void planMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_planMouseClicked
        
    }//GEN-LAST:event_planMouseClicked

    private void planActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_planActionPerformed
        if(evt.getSource()==plan)
        {
        WORKOUT w=new WORKOUT(id,memberId);
        w.setVisible(true);
        this.dispose();
        }
    }//GEN-LAST:event_planActionPerformed

   
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Frame2(id,memberId).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton message;
    private javax.swing.JButton plan;
    // End of variables declaration//GEN-END:variables
}
