package GYM_Project;

import java.sql.*;
import java.util.*;
import com.sun.jdi.connect.spi.Connection;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tables extends javax.swing.JFrame {

    /**
     * Creates new form Tables
     */
    ArrayList <Coach> data=new ArrayList<>();
    ArrayList <Integer> stack=new ArrayList<>();
    private int wanted_counter=0;
    static String query;
    static ResultSet result; 
    public Tables() {
        initComponents();
        showTable();
    }
    public void showTable(){
            
        try{
                data.clear();
                Secure c1= new Secure();
                java.sql.Connection c; c =  c1.connect();
                PreparedStatement ps = c.prepareStatement("select * from coach");
                ResultSet r = ps.executeQuery();
                DefaultTableModel mod = (DefaultTableModel) list_table.getModel();
                Object [] row = new Object[9];
                while(r.next()){
                    Coach u=new Coach(r.getInt("coach_id"),r.getString("coach_firstName"),r.getString("coach_lastName")
                    ,r.getString("coach_email"),r.getString("coach_password"),r.getString("coach_address"),
                    r.getString("coach_phoneNumber"),r.getDate("coach_birthDate"),r.getDouble("coach_salary"));
                    data.add(u);
                }
                
                for(int i=0 ; i<data.size() ; i++){
                    row[0]=data.get(i).getId();
                    row[1]=data.get(i).getFirstName();
                    row[2]=data.get(i).getLastName();
                    row[3]=data.get(i).getSalary();
                    row[4]=data.get(i).getEmail();
                    row[5]=data.get(i).getPassword();
                    row[6]=data.get(i).getAddress();
                    row[7]=data.get(i).getPhoneNumber();
                    row[8]=data.get(i).getBirthDate();
                    mod.addRow(row);
                }
                //System.out.println("ok");
                
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tabs = new javax.swing.JTabbedPane();
        list = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        list_table = new javax.swing.JTable();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        del = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        delete_coach_id = new javax.swing.JTextField();
        submit_delete = new javax.swing.JButton();
        up = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        update_coach_id = new javax.swing.JTextField();
        submit_update = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        fn_up = new javax.swing.JTextField();
        ln_up = new javax.swing.JTextField();
        email_up = new javax.swing.JTextField();
        pass_up = new javax.swing.JTextField();
        add_up = new javax.swing.JTextField();
        no_up = new javax.swing.JTextField();
        bd_up = new javax.swing.JTextField();
        sal_up = new javax.swing.JTextField();
        search = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        submit_search = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        wanted_id = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        wanted_coach_table = new javax.swing.JTable();
        add = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        add_in = new javax.swing.JTextField();
        id_in = new javax.swing.JTextField();
        fn_in = new javax.swing.JTextField();
        ln_in = new javax.swing.JTextField();
        sal_in = new javax.swing.JTextField();
        pass_in = new javax.swing.JTextField();
        no_in = new javax.swing.JTextField();
        bd_in = new javax.swing.JTextField();
        email_in = new javax.swing.JTextField();
        add_final = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        list_btn = new javax.swing.JButton();
        add_btn = new javax.swing.JButton();
        del_btn = new javax.swing.JButton();
        up_btn = new javax.swing.JButton();
        s_btn = new javax.swing.JButton();
        back_btn = new javax.swing.JButton();
        back_btn1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(930, 635));
        setPreferredSize(new java.awt.Dimension(900, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        list.setBackground(new java.awt.Color(255, 255, 255));

        list_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Salary", "Email", "Password", "Address", "Number", "BirthDate"
            }
        ));
        list_table.setGridColor(new java.awt.Color(255, 255, 255));
        list_table.setSelectionBackground(new java.awt.Color(63, 114, 236));
        jScrollPane1.setViewportView(list_table);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(64, 114, 236));
        jLabel12.setText("Coaches List :");

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(64, 114, 236));
        jLabel13.setText("______________________________");

        javax.swing.GroupLayout listLayout = new javax.swing.GroupLayout(list);
        list.setLayout(listLayout);
        listLayout.setHorizontalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(listLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 675, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(198, Short.MAX_VALUE))
            .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listLayout.createSequentialGroup()
                    .addGap(26, 26, 26)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(700, Short.MAX_VALUE)))
        );
        listLayout.setVerticalGroup(
            listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, listLayout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(listLayout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(jLabel13)
                    .addContainerGap(517, Short.MAX_VALUE)))
        );

        tabs.addTab("list_tab", list);

        del.setBackground(new java.awt.Color(255, 255, 255));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(64, 114, 236));
        jLabel16.setText("Delete a Coach :");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(64, 114, 236));
        jLabel17.setText("______________________________________");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel18.setText("Wanted Coach ID :");

        delete_coach_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delete_coach_idActionPerformed(evt);
            }
        });

        submit_delete.setBackground(new java.awt.Color(63, 114, 236));
        submit_delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit_delete.setForeground(new java.awt.Color(255, 255, 255));
        submit_delete.setText("Delete Coach");
        submit_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_deleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout delLayout = new javax.swing.GroupLayout(del);
        del.setLayout(delLayout);
        delLayout.setHorizontalGroup(
            delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(delLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(delete_coach_id, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(delLayout.createSequentialGroup()
                        .addGroup(delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addComponent(submit_delete)
                        .addGap(269, 269, 269))))
        );
        delLayout.setVerticalGroup(
            delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(delLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(delLayout.createSequentialGroup()
                        .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submit_delete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(62, 62, 62)
                .addGroup(delLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(delete_coach_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(395, Short.MAX_VALUE))
        );

        tabs.addTab("del_tab", del);

        up.setBackground(new java.awt.Color(255, 255, 255));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(64, 114, 236));
        jLabel19.setText("Update a Coach :");

        jLabel20.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(64, 114, 236));
        jLabel20.setText("________________________________________");

        jLabel21.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel21.setText("Wanted Coach ID :");

        update_coach_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update_coach_idActionPerformed(evt);
            }
        });

        submit_update.setBackground(new java.awt.Color(63, 114, 236));
        submit_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit_update.setForeground(new java.awt.Color(255, 255, 255));
        submit_update.setText("Update Coach");
        submit_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_updateActionPerformed(evt);
            }
        });

        jLabel23.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel23.setText("First Name :");

        jLabel24.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel24.setText("Last Name :");

        jLabel25.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel25.setText("Email :");

        jLabel26.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel26.setText("Password :");

        jLabel27.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel27.setText("Address :");

        jLabel28.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel28.setText("Phone Number :");

        jLabel29.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel29.setText("Birth Date :");

        jLabel30.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel30.setText("Salary :");

        javax.swing.GroupLayout upLayout = new javax.swing.GroupLayout(up);
        up.setLayout(upLayout);
        upLayout.setHorizontalGroup(
            upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(upLayout.createSequentialGroup()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(update_coach_id, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(upLayout.createSequentialGroup()
                            .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sal_up))
                        .addGroup(upLayout.createSequentialGroup()
                            .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bd_up))
                        .addGroup(upLayout.createSequentialGroup()
                            .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(no_up))
                        .addGroup(upLayout.createSequentialGroup()
                            .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(add_up))
                        .addGroup(upLayout.createSequentialGroup()
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(pass_up))
                        .addGroup(upLayout.createSequentialGroup()
                            .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(email_up))
                        .addGroup(upLayout.createSequentialGroup()
                            .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ln_up))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, upLayout.createSequentialGroup()
                            .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(fn_up, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(upLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 236, Short.MAX_VALUE)
                .addComponent(submit_update)
                .addGap(266, 266, 266))
        );
        upLayout.setVerticalGroup(
            upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(upLayout.createSequentialGroup()
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submit_update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(68, 68, 68)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(update_coach_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel21))
                .addGap(47, 47, 47)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fn_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ln_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(email_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(add_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(no_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bd_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(upLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sal_up, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        tabs.addTab("up_tab", up);

        search.setBackground(new java.awt.Color(255, 255, 255));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(64, 114, 236));
        jLabel14.setText("Search for a Coach :");

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(64, 114, 236));
        jLabel15.setText("______________________________________________");

        submit_search.setBackground(new java.awt.Color(63, 114, 236));
        submit_search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        submit_search.setForeground(new java.awt.Color(255, 255, 255));
        submit_search.setText("Search");
        submit_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submit_searchActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel22.setText("Wanted Coach ID :");

        wanted_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                wanted_idActionPerformed(evt);
            }
        });

        wanted_coach_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "First Name", "Last Name", "Salary", "Email", "Password", "Address", "Number", "BirthDate"
            }
        ));
        wanted_coach_table.setGridColor(new java.awt.Color(255, 255, 255));
        wanted_coach_table.setSelectionBackground(new java.awt.Color(63, 114, 236));
        jScrollPane2.setViewportView(wanted_coach_table);

        javax.swing.GroupLayout searchLayout = new javax.swing.GroupLayout(search);
        search.setLayout(searchLayout);
        searchLayout.setHorizontalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 673, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 227, Short.MAX_VALUE))
            .addGroup(searchLayout.createSequentialGroup()
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                            .addComponent(jLabel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(241, 241, 241)
                        .addComponent(submit_search, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(searchLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wanted_id, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        searchLayout.setVerticalGroup(
            searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(searchLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(searchLayout.createSequentialGroup()
                        .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(submit_search, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(searchLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(wanted_id, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(278, Short.MAX_VALUE))
        );

        tabs.addTab("s_tab", search);

        add.setBackground(new java.awt.Color(255, 255, 255));
        add.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        add.setMinimumSize(new java.awt.Dimension(900, 600));
        add.setPreferredSize(new java.awt.Dimension(900, 600));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(64, 114, 236));
        jLabel1.setText("Add a new Coach :");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(64, 114, 236));
        jLabel2.setText("_________________________________________");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("ID :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("First Name :");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Last Name :");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel6.setText("Email :");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel7.setText("Password :");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel8.setText("Address :");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel9.setText("Phone no. :");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel10.setText("Birth Date :");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel11.setText("Salary :");

        id_in.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_inActionPerformed(evt);
            }
        });

        add_final.setBackground(new java.awt.Color(63, 114, 236));
        add_final.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        add_final.setForeground(new java.awt.Color(255, 255, 255));
        add_final.setText("Add Coach");
        add_final.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_finalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addLayout = new javax.swing.GroupLayout(add);
        add.setLayout(addLayout);
        addLayout.setHorizontalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addLayout.createSequentialGroup()
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 86, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(add_in, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(id_in, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fn_in, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ln_in, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sal_in, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pass_in, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(no_in, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bd_in, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(email_in, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(addLayout.createSequentialGroup()
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(241, 241, 241)
                        .addComponent(add_final, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(277, Short.MAX_VALUE))
        );
        addLayout.setVerticalGroup(
            addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addLayout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(addLayout.createSequentialGroup()
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addLayout.createSequentialGroup()
                                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(addLayout.createSequentialGroup()
                                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(addLayout.createSequentialGroup()
                                                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(addLayout.createSequentialGroup()
                                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(add_final, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(36, 36, 36)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(id_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(fn_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(ln_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(email_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pass_in, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addLayout.createSequentialGroup()
                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(addLayout.createSequentialGroup()
                                .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(addLayout.createSequentialGroup()
                                        .addGroup(addLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(add_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(no_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bd_in, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sal_in, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(88, Short.MAX_VALUE))
        );

        tabs.addTab("add_tab", add);

        getContentPane().add(tabs, new org.netbeans.lib.awtextra.AbsoluteConstraints(218, -40, -1, 640));

        jPanel1.setBackground(new java.awt.Color(64, 114, 236));

        list_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        list_btn.setForeground(new java.awt.Color(64, 114, 236));
        list_btn.setText("List");
        list_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                list_btnActionPerformed(evt);
            }
        });

        add_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        add_btn.setForeground(new java.awt.Color(64, 114, 236));
        add_btn.setText("Add");
        add_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_btnActionPerformed(evt);
            }
        });

        del_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        del_btn.setForeground(new java.awt.Color(64, 114, 236));
        del_btn.setText("Delete");
        del_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                del_btnActionPerformed(evt);
            }
        });

        up_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        up_btn.setForeground(new java.awt.Color(64, 114, 236));
        up_btn.setText("Update");
        up_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                up_btnActionPerformed(evt);
            }
        });

        s_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        s_btn.setForeground(new java.awt.Color(64, 114, 236));
        s_btn.setText("Search");
        s_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s_btnActionPerformed(evt);
            }
        });

        back_btn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back_btn.setForeground(new java.awt.Color(64, 114, 236));
        back_btn.setText("Log Out");

        back_btn1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        back_btn1.setForeground(new java.awt.Color(64, 114, 236));
        back_btn1.setText("Main");
        back_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(list_btn, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                    .addComponent(add_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(del_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(up_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(s_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(back_btn1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addComponent(back_btn)
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(list_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(add_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(del_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(up_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(s_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(back_btn1)
                    .addComponent(back_btn))
                .addGap(17, 17, 17))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 600));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 80, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 80, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void up_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_up_btnActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedIndex(2);
    }//GEN-LAST:event_up_btnActionPerformed

    private void s_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_s_btnActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedIndex(3);
    }//GEN-LAST:event_s_btnActionPerformed

    private void list_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_list_btnActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedIndex(0);
    }//GEN-LAST:event_list_btnActionPerformed

    private void add_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_btnActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedIndex(4);
    }//GEN-LAST:event_add_btnActionPerformed

    private void del_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_del_btnActionPerformed
        // TODO add your handling code here:
        tabs.setSelectedIndex(1);
    }//GEN-LAST:event_del_btnActionPerformed

    private void id_inActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_inActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_inActionPerformed

    private void add_finalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_finalActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==add_final){
            try{
                Secure c1= new Secure();
                java.sql.Connection c; c =  c1.connect();
                
                if(!(id_in.getText().equals("")) && !(email_in.getText().equals("")) && !(pass_in.getText().equals("")) 
                        && !(sal_in.getText().equals(""))&& !(fn_in.getText().equals(""))&& !(ln_in.getText().equals(""))
                        && !(add_in.getText().equals(""))&& !(bd_in.getText().equals(""))&& !(no_in.getText().equals("")))
                {
                    
                    query = "insert into coach values('"+id_in.getText()+"','"+fn_in.getText()+"','"+ln_in.getText()+"','"+
                    sal_in.getText()+"','"+email_in.getText()+"','"+pass_in.getText()+"','"+add_in.getText()+"','"+
                    no_in.getText()+"','"+bd_in.getText()+ "')";
                }
                else{
                    JOptionPane.showMessageDialog(this,"Missing Information");
                    return;
                }
                
                java.sql.Statement state=c.createStatement();
                try{
                state.execute( query );
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(this,"Wrong Information");
                    return;
                }
                JOptionPane.showMessageDialog(this,"Coach added");
                //System.out.println("added");
                clear_add_txt_fields();
            
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Wrong Information");
                //System.out.println(e.getMessage());
            }
            
            refresh();
        }
    }//GEN-LAST:event_add_finalActionPerformed

    private void delete_coach_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delete_coach_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delete_coach_idActionPerformed

    private void submit_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_deleteActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==submit_delete){
            try{
                Secure c1= new Secure();
                java.sql.Connection c; c =  c1.connect();
                
                query = "delete from coach where coach_id="+delete_coach_id.getText();
                java.sql.Statement state=c.createStatement();
                int coach_id_int = Integer.parseInt(delete_coach_id.getText());
                boolean found=false;
                
                for(int i=0 ; i<data.size() ; i++){
                    if(data.get(i).getId()==coach_id_int)
                        found=true;
                }
                if(found){
                    state.execute( query );
                    JOptionPane.showMessageDialog(this,"Coach Deleted");
                    delete_coach_id.setText("");
                }
                else{
                    JOptionPane.showMessageDialog(this,"Wrong ID");
                    return;
                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Wrong ID");
                //System.out.println(e.getMessage());
            }
            refresh();
        }
    }//GEN-LAST:event_submit_deleteActionPerformed

    private void update_coach_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update_coach_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_update_coach_idActionPerformed

    private void submit_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_updateActionPerformed
        // TODO add your handling code here:
        if(evt.getSource()==submit_update){
            try{
                Secure c1= new Secure();
                java.sql.Connection c; c =  c1.connect();
                java.sql.Statement state=c.createStatement();
                int coach_id_int = Integer.parseInt(update_coach_id.getText());
                boolean found_id=false;
                
                for(int i=0 ; i<data.size() ; i++){
                    if(data.get(i).getId()==coach_id_int)
                        found_id=true;
                }
                if(found_id){
                    if(!(fn_up.getText().equals("")))
                    {
                        query = "update coach set coach_firstName='"+fn_up.getText()+"' where coach_id="+update_coach_id.getText();
                        state.execute( query );
                    }
                    if(!ln_up.getText().equals(""))
                    {
                        query = "update coach set coach_lastName='"+ln_up.getText()+"' where coach_id="+update_coach_id.getText();
                        state.execute( query );
                    }
                    if(!sal_up.getText().equals(""))
                    {
                        query = "update coach set coach_salary='"+sal_up.getText()+"' where coach_id="+update_coach_id.getText();
                        state.execute( query );
                    }
                    if(!email_up.getText().equals(""))
                    {
                        query = "update coach set coach_email='"+email_up.getText()+"' where coach_id="+update_coach_id.getText();
                        state.execute( query );
                    }
                    if(!pass_up.getText().equals(""))
                    {
                        query = "update coach set coach_password='"+pass_up.getText()+"' where coach_id="+update_coach_id.getText();
                        state.execute( query );
                    }
                    if(!add_up.getText().equals(""))
                    {
                        query = "update coach set coach_address='"+add_up.getText()+"' where coach_id="+update_coach_id.getText();
                        state.execute( query );
                    }
                    if(!bd_up.getText().equals(""))
                    {
                        query = "update coach set coach_birthDate='"+bd_up.getText()+"' where coach_id="+update_coach_id.getText();
                        state.execute( query );
                    }
                    if(!no_up.getText().equals(""))
                    {
                        query = "update coach set coach_phoneNumber='"+no_up.getText()+"' where coach_id="+update_coach_id.getText();
                        state.execute( query );
                    }
                    System.out.println("done");
                    JOptionPane.showMessageDialog(this,"Coach Updated");
                    clear_update_txt_fields();
                }
                else{
                    JOptionPane.showMessageDialog(this,"Wrong ID");
                    return;
                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Wrong ID");
                System.out.println(e.getMessage());
            }
            refresh();
        }
    }//GEN-LAST:event_submit_updateActionPerformed

    private void submit_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submit_searchActionPerformed
        // TODO add your handling code here:
        DefaultTableModel w_table = (DefaultTableModel) wanted_coach_table.getModel();

        if(evt.getSource()==submit_search){
            try{
                if(wanted_counter>0)
                    w_table.removeRow(0);
                Secure c1= new Secure();
                java.sql.Connection c; c =  c1.connect();
                
                query = "delete from coach where coach_id="+wanted_id.getText();
                java.sql.Statement state=c.createStatement();
                int wanted_coach_id = Integer.parseInt(wanted_id.getText()),index=0;
                boolean found=false;
                
                for(int i=0 ; i<data.size() ; i++){
                    if(data.get(i).getId()==wanted_coach_id)
                    {
                        found=true;
                        index=i;
                        break;
                    }
                }
                if(found){
                    Object [] row = new Object[9];
                    row[0]=data.get(index).getId();
                    row[1]=data.get(index).getFirstName();
                    row[2]=data.get(index).getLastName();
                    row[3]=data.get(index).getSalary();
                    row[4]=data.get(index).getEmail();
                    row[5]=data.get(index).getPassword();
                    row[6]=data.get(index).getAddress();
                    row[7]=data.get(index).getPhoneNumber();
                    row[8]=data.get(index).getBirthDate();
                    w_table.addRow(row);
                    wanted_counter++;
                }
                else{
                    JOptionPane.showMessageDialog(this,"Wrong ID");
                    wanted_counter=0;
                    return;
                }
                
            }catch(SQLException e){
                JOptionPane.showMessageDialog(this,"Wrong ID");
                //System.out.println(e.getMessage());
            }
        }
    }//GEN-LAST:event_submit_searchActionPerformed

    private void wanted_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_wanted_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_wanted_idActionPerformed

    private void back_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn1ActionPerformed
        // TODO add your handling code here:
        
        select main=new select();
        main.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btn1ActionPerformed
    private void clear_add_txt_fields(){
        id_in.setText("");
        fn_in.setText("");
        ln_in.setText("");
        sal_in.setText("");
        email_in.setText("");
        pass_in.setText("");
        bd_in.setText("");
        no_in.setText("");
        add_in.setText("");
    }
    private void clear_update_txt_fields(){
        update_coach_id.setText("");
        fn_up.setText("");
        ln_up.setText("");
        sal_up.setText("");
        email_up.setText("");
        pass_up.setText("");
        bd_up.setText("");
        no_up.setText("");
        add_up.setText("");
    }
    private void refresh(){
        DefaultTableModel new_table = (DefaultTableModel) list_table.getModel();
        new_table.setRowCount(0);
        showTable();
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
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tables.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tables().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel add;
    private javax.swing.JButton add_btn;
    private javax.swing.JButton add_final;
    private javax.swing.JTextField add_in;
    private javax.swing.JTextField add_up;
    private javax.swing.JButton back_btn;
    private javax.swing.JButton back_btn1;
    private javax.swing.JTextField bd_in;
    private javax.swing.JTextField bd_up;
    private javax.swing.JPanel del;
    private javax.swing.JButton del_btn;
    private javax.swing.JTextField delete_coach_id;
    private javax.swing.JTextField email_in;
    private javax.swing.JTextField email_up;
    private javax.swing.JTextField fn_in;
    private javax.swing.JTextField fn_up;
    private javax.swing.JTextField id_in;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel list;
    private javax.swing.JButton list_btn;
    private javax.swing.JTable list_table;
    private javax.swing.JTextField ln_in;
    private javax.swing.JTextField ln_up;
    private javax.swing.JTextField no_in;
    private javax.swing.JTextField no_up;
    private javax.swing.JTextField pass_in;
    private javax.swing.JTextField pass_up;
    private javax.swing.JButton s_btn;
    private javax.swing.JTextField sal_in;
    private javax.swing.JTextField sal_up;
    private javax.swing.JPanel search;
    private javax.swing.JButton submit_delete;
    private javax.swing.JButton submit_search;
    private javax.swing.JButton submit_update;
    private javax.swing.JTabbedPane tabs;
    private javax.swing.JPanel up;
    private javax.swing.JButton up_btn;
    private javax.swing.JTextField update_coach_id;
    private javax.swing.JTable wanted_coach_table;
    private javax.swing.JTextField wanted_id;
    // End of variables declaration//GEN-END:variables
}
