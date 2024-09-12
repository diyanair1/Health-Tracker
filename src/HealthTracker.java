/**
 * Personal Health Tracking program
 * 
 * modified     20230822
 * date         20230821
 * @filename    HealthTracker.java
 * @author      dnair
 * @version     1.0
 * @see         https://tdsb.elearningontario.ca/content/enforced/23454724-EL_CS_ICS3UE-973555_998940_2223/ICS3UU05/ICS3UU05A01/_content.html?ou=23454724&d2l_body_type=3
 */

public class HealthTracker extends javax.swing.JFrame {

    public HealthTracker() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

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
        txtstep2 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtstepgoal = new javax.swing.JTextField();
        txtstep3 = new javax.swing.JTextField();
        txtstep4 = new javax.swing.JTextField();
        txtstep6 = new javax.swing.JTextField();
        txtstep7 = new javax.swing.JTextField();
        txtstep5 = new javax.swing.JTextField();
        txtsleep1 = new javax.swing.JTextField();
        txtsleep2 = new javax.swing.JTextField();
        txtsleep3 = new javax.swing.JTextField();
        txtsleep4 = new javax.swing.JTextField();
        txtsleep5 = new javax.swing.JTextField();
        txtsleep6 = new javax.swing.JTextField();
        txtsleep7 = new javax.swing.JTextField();
        txtwater1 = new javax.swing.JTextField();
        txtwater2 = new javax.swing.JTextField();
        txtwater3 = new javax.swing.JTextField();
        txtwater4 = new javax.swing.JTextField();
        txtwater5 = new javax.swing.JTextField();
        txtwater6 = new javax.swing.JTextField();
        txtwater7 = new javax.swing.JTextField();
        txtstep1 = new javax.swing.JTextField();
        txtwatergoal = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        lblstepaverage = new javax.swing.JLabel();
        lblsleepaverage = new javax.swing.JLabel();
        lblwateraverage = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        lbldaysmetstep = new javax.swing.JLabel();
        lbldaysmetsleep = new javax.swing.JLabel();
        lbldaysmetwater = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        lblmaxsteps = new javax.swing.JLabel();
        btnTrack = new javax.swing.JButton();
        txtsleepgoal = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel1.setText("Health Tracker");

        jLabel2.setText("Monday");

        jLabel3.setText("Saturday");

        jLabel4.setText("Tuesday");

        jLabel5.setText("Thursday");

        jLabel6.setText("Wednesday");

        jLabel7.setText("Friday");

        jLabel8.setText("Sunday");

        jLabel9.setText("Hours of Sleep: ");

        jLabel10.setText("Steps taken:");

        jLabel11.setText("Water Intake (in litres):");

        txtstep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstep2ActionPerformed(evt);
            }
        });

        jLabel12.setText("Daily step goal:");

        jLabel13.setText("Daily water intake goal (in litres) :");

        txtstepgoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstepgoalActionPerformed(evt);
            }
        });

        txtstep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstep3ActionPerformed(evt);
            }
        });

        txtstep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstep4ActionPerformed(evt);
            }
        });

        txtstep6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstep6ActionPerformed(evt);
            }
        });

        txtstep7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstep7ActionPerformed(evt);
            }
        });

        txtstep5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstep5ActionPerformed(evt);
            }
        });

        txtsleep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsleep1ActionPerformed(evt);
            }
        });

        txtsleep2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsleep2ActionPerformed(evt);
            }
        });

        txtsleep3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsleep3ActionPerformed(evt);
            }
        });

        txtsleep4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsleep4ActionPerformed(evt);
            }
        });

        txtsleep5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsleep5ActionPerformed(evt);
            }
        });

        txtsleep6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsleep6ActionPerformed(evt);
            }
        });

        txtsleep7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsleep7ActionPerformed(evt);
            }
        });

        txtwater1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwater1ActionPerformed(evt);
            }
        });

        txtwater2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwater2ActionPerformed(evt);
            }
        });

        txtwater3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwater3ActionPerformed(evt);
            }
        });

        txtwater4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwater4ActionPerformed(evt);
            }
        });

        txtwater5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwater5ActionPerformed(evt);
            }
        });

        txtwater6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwater6ActionPerformed(evt);
            }
        });

        txtwater7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwater7ActionPerformed(evt);
            }
        });

        txtstep1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstep1ActionPerformed(evt);
            }
        });

        txtwatergoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtwatergoalActionPerformed(evt);
            }
        });

        jLabel14.setForeground(new java.awt.Color(0, 102, 102));
        jLabel14.setText("Average hours of sleep:");

        jLabel15.setForeground(new java.awt.Color(0, 102, 102));
        jLabel15.setText("Average water intake:");

        jLabel16.setForeground(new java.awt.Color(0, 102, 102));
        jLabel16.setText("Average steps taken:");

        lblstepaverage.setForeground(new java.awt.Color(0, 102, 102));
        lblstepaverage.setText("...");

        lblsleepaverage.setForeground(new java.awt.Color(0, 102, 102));
        lblsleepaverage.setText("...");

        lblwateraverage.setForeground(new java.awt.Color(0, 102, 102));
        lblwateraverage.setText("...");

        jLabel20.setForeground(new java.awt.Color(0, 102, 102));
        jLabel20.setText("Days met sleep goal:");

        jLabel21.setForeground(new java.awt.Color(0, 102, 102));
        jLabel21.setText("Days met water goal:");

        jLabel22.setForeground(new java.awt.Color(0, 102, 102));
        jLabel22.setText("Days met step goal:");

        lbldaysmetstep.setForeground(new java.awt.Color(0, 102, 102));
        lbldaysmetstep.setText("...");

        lbldaysmetsleep.setForeground(new java.awt.Color(0, 102, 102));
        lbldaysmetsleep.setText("...");

        lbldaysmetwater.setForeground(new java.awt.Color(0, 102, 102));
        lbldaysmetwater.setText("...");

        jLabel26.setForeground(new java.awt.Color(0, 102, 102));
        jLabel26.setText("Max steps taken:");

        lblmaxsteps.setForeground(new java.awt.Color(0, 102, 102));
        lblmaxsteps.setText("...");

        btnTrack.setText("Track");
        btnTrack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrackActionPerformed(evt);
            }
        });

        txtsleepgoal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtsleepgoalActionPerformed(evt);
            }
        });

        jLabel17.setText("Daily sleep goal (in hours) :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel8)
                                            .addComponent(jLabel3))
                                        .addGap(46, 46, 46))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtstep2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtstep3)
                                    .addComponent(txtstep4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtstep6, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtstep7, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtstep5, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtstep1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel9))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(90, 90, 90)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtsleep1, javax.swing.GroupLayout.DEFAULT_SIZE, 74, Short.MAX_VALUE)
                                            .addComponent(txtsleep2)
                                            .addComponent(txtsleep3)
                                            .addComponent(txtsleep4)
                                            .addComponent(txtsleep5)
                                            .addComponent(txtsleep6)
                                            .addComponent(txtsleep7))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(79, 79, 79)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtwater1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                                            .addComponent(txtwater7, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtwater6, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtwater5, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtwater4, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtwater3, javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtwater2, javax.swing.GroupLayout.Alignment.LEADING)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(55, 55, 55)
                                        .addComponent(jLabel11))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(177, 177, 177)
                                        .addComponent(btnTrack, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel26, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblstepaverage, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                                            .addComponent(lblsleepaverage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblwateraverage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblmaxsteps, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGap(61, 61, 61)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel21)
                                            .addComponent(jLabel20)
                                            .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addGap(29, 29, 29)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lbldaysmetstep, javax.swing.GroupLayout.DEFAULT_SIZE, 79, Short.MAX_VALUE)
                                            .addComponent(lbldaysmetsleep, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lbldaysmetwater, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel12)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtstepgoal))
                                    .addComponent(jLabel13))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(65, 65, 65)
                                        .addComponent(jLabel17)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtsleepgoal, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtwatergoal, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtstepgoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(txtsleepgoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtwatergoal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtstep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(txtstep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtstep3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtstep4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtstep5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtstep6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtstep7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtsleep1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtsleep2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtsleep3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(txtsleep4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtsleep5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(txtwater1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)
                                .addComponent(txtwater2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(txtwater3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22)
                                .addComponent(txtwater4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(txtwater5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtwater6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtwater7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtsleep6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(23, 23, 23)
                                .addComponent(txtsleep7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnTrack)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(lblstepaverage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(lblsleepaverage))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(lblwateraverage)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel22)
                            .addComponent(lbldaysmetstep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(lbldaysmetsleep))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21)
                            .addComponent(lbldaysmetwater))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblmaxsteps)
                    .addComponent(jLabel26))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtstep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstep2ActionPerformed

    private void txtstepgoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstepgoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstepgoalActionPerformed

    private void txtstep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstep3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstep3ActionPerformed

    private void txtstep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstep4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstep4ActionPerformed

    private void txtstep6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstep6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstep6ActionPerformed

    private void txtstep7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstep7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstep7ActionPerformed

    private void txtstep5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstep5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstep5ActionPerformed

    private void txtsleep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsleep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsleep1ActionPerformed

    private void txtsleep2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsleep2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsleep2ActionPerformed

    private void txtsleep3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsleep3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsleep3ActionPerformed

    private void txtsleep4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsleep4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsleep4ActionPerformed

    private void txtsleep5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsleep5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsleep5ActionPerformed

    private void txtsleep6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsleep6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsleep6ActionPerformed

    private void txtsleep7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsleep7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsleep7ActionPerformed

    private void txtwater1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwater1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwater1ActionPerformed

    private void txtwater2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwater2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwater2ActionPerformed

    private void txtwater3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwater3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwater3ActionPerformed

    private void txtwater4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwater4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwater4ActionPerformed

    private void txtwater5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwater5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwater5ActionPerformed

    private void txtwater6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwater6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwater6ActionPerformed

    private void txtwater7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwater7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwater7ActionPerformed

    private void txtstep1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstep1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstep1ActionPerformed

    private void txtwatergoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtwatergoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtwatergoalActionPerformed

    
    public static int findstepAverage (int[] step, final int NUM_DAYS)
    {
        int sumSteps = 0;
        
        for (int i = 0; i < NUM_DAYS; i++)
        {
            sumSteps = sumSteps + step[i];
        }
        
        int averageSteps = sumSteps / NUM_DAYS;
        
        return averageSteps;
    }
         
    public static int findsleepAverage (int[] sleep, final int NUM_DAYS)
    {
        int sumSleep = 0;
        
        for (int i = 0; i < NUM_DAYS; i++)
        {
            sumSleep = sumSleep + sleep[i];
        }
        
        int averageSleep = sumSleep / NUM_DAYS;
        
        return averageSleep;
    }
    
    public static int findwaterAverage (int[] water, final int NUM_DAYS)
    {
        int sumWater = 0;
        
        for (int i = 0; i < NUM_DAYS; i++)
        {
            sumWater = sumWater + water[i];
        }
        
        int averageWater = sumWater / NUM_DAYS;
        
        return averageWater;
    }
    
    public static int calcMaxSteps(int[] step, final int NUM_DAYS)
    {
        // Calculating max steps taken
        int maxSteps = Integer.MIN_VALUE;

        // iterating over array and updating maxSteps
        for (int i = 0; i < NUM_DAYS; ++i) 
        {
            maxSteps = Math.max(maxSteps, step[i]);
        }
        
        return maxSteps;
    }
    
    // Overriding Integer.parseInt method to handle non-numeric input
    private int parseInt (String input)
    {
        try
        {
            return Integer.parseInt(input.trim());
        }
        catch (Exception ex)
        {
            return 0;
        }
    }
    
    private void btnTrackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrackActionPerformed
        
        final int NUM_DAYS = 7;
        int maxStepsTaken;
        
        int[] step = new int [NUM_DAYS];
        int[] sleep = new int [NUM_DAYS];
        int[] water = new int [NUM_DAYS];
        
        int targetSteps = parseInt(txtstepgoal.getText());    
        int targetSleep = parseInt(txtsleepgoal.getText());
        int targetWater = parseInt(txtwatergoal.getText());
        
        
        int daysMetStepGoal = 0;
        int daysMetSleepGoal = 0;
        int daysMetWaterGoal = 0;
        
        step[0] = parseInt(txtstep1.getText());
        step[1] = parseInt(txtstep2.getText());
        step[2] = parseInt(txtstep3.getText());
        step[3] = parseInt(txtstep4.getText());
        step[4] = parseInt(txtstep5.getText());
        step[5] = parseInt(txtstep6.getText());
        step[6] = parseInt(txtstep7.getText());
        
        // call the findstepAverage subroutine
        int stepAverage = findstepAverage(step, NUM_DAYS);
        lblstepaverage.setText(String.valueOf(stepAverage + " steps"));
        
        sleep[0] = parseInt(txtsleep1.getText());
        sleep[1] = parseInt(txtsleep2.getText());
        sleep[2] = parseInt(txtsleep3.getText());
        sleep[3] = parseInt(txtsleep4.getText());
        sleep[4] = parseInt(txtsleep5.getText());
        sleep[5] = parseInt(txtsleep6.getText());
        sleep[6] = parseInt(txtsleep7.getText());
        
        // call the findsleepAverage subroutine
        int sleepAverage = findsleepAverage(sleep, NUM_DAYS);
        lblsleepaverage.setText(String.valueOf(sleepAverage + " hours"));
        
        water[0] = parseInt(txtwater1.getText());
        water[1] = parseInt(txtwater2.getText());
        water[2] = parseInt(txtwater3.getText());
        water[3] = parseInt(txtwater4.getText());
        water[4] = parseInt(txtwater5.getText());
        water[5] = parseInt(txtwater6.getText());
        water[6] = parseInt(txtwater7.getText());
        
        // call the findsleepAverage subroutine
        int waterAverage = findwaterAverage(water, NUM_DAYS);
        lblwateraverage.setText(String.valueOf(waterAverage + " litres"));
        
        // Calculating for Days Met Goals
        for (int i = 0; i < NUM_DAYS; i++) {
            if (step[i] >= targetSteps) {
                daysMetStepGoal = daysMetStepGoal + 1;
            }
            if (sleep[i] >= targetSleep) {
                daysMetSleepGoal = daysMetSleepGoal + 1;
            }
            if (water[i] >= targetWater) {
                daysMetWaterGoal = daysMetWaterGoal + 1;
            }
        }

        lbldaysmetstep.setText(String.valueOf(daysMetStepGoal + " day/s"));
        lbldaysmetsleep.setText(String.valueOf(daysMetSleepGoal + " day/s"));
        lbldaysmetwater.setText(String.valueOf(daysMetWaterGoal + " day/s"));

        // call the calcMaxSteps subroutine
        maxStepsTaken = calcMaxSteps(step, NUM_DAYS);
        lblmaxsteps.setText(String.valueOf(maxStepsTaken + " steps"));

        
        
    }//GEN-LAST:event_btnTrackActionPerformed

    private void txtsleepgoalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsleepgoalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsleepgoalActionPerformed

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
            java.util.logging.Logger.getLogger(HealthTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HealthTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HealthTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HealthTracker.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HealthTracker().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTrack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel lbldaysmetsleep;
    private javax.swing.JLabel lbldaysmetstep;
    private javax.swing.JLabel lbldaysmetwater;
    private javax.swing.JLabel lblmaxsteps;
    private javax.swing.JLabel lblsleepaverage;
    private javax.swing.JLabel lblstepaverage;
    private javax.swing.JLabel lblwateraverage;
    private javax.swing.JTextField txtsleep1;
    private javax.swing.JTextField txtsleep2;
    private javax.swing.JTextField txtsleep3;
    private javax.swing.JTextField txtsleep4;
    private javax.swing.JTextField txtsleep5;
    private javax.swing.JTextField txtsleep6;
    private javax.swing.JTextField txtsleep7;
    private javax.swing.JTextField txtsleepgoal;
    private javax.swing.JTextField txtstep1;
    private javax.swing.JTextField txtstep2;
    private javax.swing.JTextField txtstep3;
    private javax.swing.JTextField txtstep4;
    private javax.swing.JTextField txtstep5;
    private javax.swing.JTextField txtstep6;
    private javax.swing.JTextField txtstep7;
    private javax.swing.JTextField txtstepgoal;
    private javax.swing.JTextField txtwater1;
    private javax.swing.JTextField txtwater2;
    private javax.swing.JTextField txtwater3;
    private javax.swing.JTextField txtwater4;
    private javax.swing.JTextField txtwater5;
    private javax.swing.JTextField txtwater6;
    private javax.swing.JTextField txtwater7;
    private javax.swing.JTextField txtwatergoal;
    // End of variables declaration//GEN-END:variables
}
