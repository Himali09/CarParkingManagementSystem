package car_parking_management_system;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.table.DefaultTableModel;

public class main_frame extends JFrame {

  public main_frame() {
    initComponents();

    reg_panel.setVisible(false);
    side_panel2.setVisible(false);
    welcome_panel.setVisible(false);
    book_panel.setVisible(false);
    show_book.setVisible(false);
    Aboutus_panel.setVisible(false);
    rates_panel.setVisible(false);

//       2d matrix for slots availability initialization
    for (int i = 0; i < 7; i++) {
      for (int j = 0; j < 9; j++) {
        flag[i][j] = 0;
      }
    }

  }
//  Declaration of Local Variables to store the data.
  String name;
  String emailadd;
  String address;
  String phone;
  String pwd;
  String date;
  String time;
  String carNo;
  int slotNo;
  int timeSlotIndex;
  int[][] flag = new int[7][9];

  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    JOptionPane = new javax.swing.JOptionPane();
    slot_buttongroup = new javax.swing.ButtonGroup();
    jPanel3 = new javax.swing.JPanel();
    side_panel_main = new javax.swing.JPanel();
    side_panel1 = new javax.swing.JPanel();
    about_us = new javax.swing.JButton();
    home = new javax.swing.JButton();
    exit = new javax.swing.JButton();
    side_panel2 = new javax.swing.JPanel();
    home1 = new javax.swing.JButton();
    book_park = new javax.swing.JButton();
    view_book = new javax.swing.JButton();
    logout = new javax.swing.JButton();
    rates_btn = new javax.swing.JButton();
    jPanel2 = new javax.swing.JPanel();
    login_panel = new javax.swing.JPanel();
    email = new javax.swing.JLabel();
    login_phone_textfield = new javax.swing.JTextField();
    pwd1 = new javax.swing.JLabel();
    login_pwd_textfield = new javax.swing.JPasswordField();
    login = new javax.swing.JButton();
    register = new javax.swing.JButton();
    jPanel5 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    Aboutus_panel = new javax.swing.JPanel();
    Back_aboutus = new javax.swing.JButton();
    jLabel16 = new javax.swing.JLabel();
    jScrollPane2 = new javax.swing.JScrollPane();
    jTextPane1 = new javax.swing.JTextPane();
    reg_panel = new javax.swing.JPanel();
    jPanel4 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    reg_form_panel = new javax.swing.JPanel();
    jLabel3 = new javax.swing.JLabel();
    jLabel5 = new javax.swing.JLabel();
    jLabel6 = new javax.swing.JLabel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    name_textfield = new javax.swing.JTextField();
    email_textfield = new javax.swing.JTextField();
    phone_textfield = new javax.swing.JTextField();
    address_textfield = new javax.swing.JTextField();
    reg_pwd = new javax.swing.JPasswordField();
    reg_back_btn = new javax.swing.JButton();
    confirm_btn = new javax.swing.JButton();
    welcome_panel = new javax.swing.JPanel();
    welcome_label = new javax.swing.JLabel();
    book_panel = new javax.swing.JPanel();
    book_parking_panel = new javax.swing.JPanel();
    jLabel11 = new javax.swing.JLabel();
    carNo_textfield = new javax.swing.JTextField();
    jLabel12 = new javax.swing.JLabel();
    jLabel14 = new javax.swing.JLabel();
    date_textfield = new javax.swing.JTextField();
    slot_select = new javax.swing.JButton();
    book_back = new javax.swing.JButton();
    time_combobox = new javax.swing.JComboBox<>();
    jPanel6 = new javax.swing.JPanel();
    jLabel10 = new javax.swing.JLabel();
    slot_panel = new javax.swing.JPanel();
    jLabel15 = new javax.swing.JLabel();
    slotCar_textfield = new javax.swing.JTextField();
    jLabel17 = new javax.swing.JLabel();
    jLabel18 = new javax.swing.JLabel();
    slotTime_textfield = new javax.swing.JTextField();
    slotDate_textfield = new javax.swing.JTextField();
    confirm_slot = new javax.swing.JButton();
    slot_back = new javax.swing.JButton();
    slot_select_panel = new javax.swing.JPanel();
    slot1_button = new javax.swing.JToggleButton();
    slot2_button = new javax.swing.JToggleButton();
    slot3_button = new javax.swing.JToggleButton();
    slot4_button = new javax.swing.JToggleButton();
    slot5_button = new javax.swing.JToggleButton();
    slot6_button = new javax.swing.JToggleButton();
    slot7_button = new javax.swing.JToggleButton();
    slot8_button = new javax.swing.JToggleButton();
    slot9_button = new javax.swing.JToggleButton();
    cancel_button = new javax.swing.JToggleButton();
    jLabel19 = new javax.swing.JLabel();
    jLabel20 = new javax.swing.JLabel();
    slotNo_textfield = new javax.swing.JTextField();
    price_textfield = new javax.swing.JTextField();
    jPanel7 = new javax.swing.JPanel();
    jLabel13 = new javax.swing.JLabel();
    show_book = new javax.swing.JPanel();
    jScrollPane1 = new javax.swing.JScrollPane();
    book_table = new javax.swing.JTable();
    show_book_back = new javax.swing.JButton();
    jPanel8 = new javax.swing.JPanel();
    jLabel9 = new javax.swing.JLabel();
    rates_panel = new javax.swing.JPanel();
    jScrollPane3 = new javax.swing.JScrollPane();
    rates_table = new javax.swing.JTable();
    rates_back = new javax.swing.JButton();
    jPanel9 = new javax.swing.JPanel();
    jLabel22 = new javax.swing.JLabel();
    jPanel1 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel21 = new javax.swing.JLabel();

    JOptionPane.setToolTipText("");
    JOptionPane.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    JOptionPane.setName(""); // NOI18N

    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    setTitle("CAR PARKING MANAGEMENT SYSTEM\n");
    setBackground(new java.awt.Color(204, 255, 255));
    setBounds(new java.awt.Rectangle(50, 50, 0, 0));
    setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    setLocation(new java.awt.Point(100, 60));
    setResizable(false);
    getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jPanel3.setBackground(new java.awt.Color(255, 240, 108));

    side_panel_main.setBackground(new java.awt.Color(255, 255, 51));
    side_panel_main.setLayout(new javax.swing.OverlayLayout(side_panel_main));

    side_panel1.setBackground(new java.awt.Color(25, 14, 90));
    side_panel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

    about_us.setBackground(new java.awt.Color(255, 255, 255));
    about_us.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    about_us.setForeground(new java.awt.Color(15, 4, 76));
    about_us.setText("ABOUT US");
    about_us.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    about_us.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    about_us.setMaximumSize(new java.awt.Dimension(170, 40));
    about_us.setMinimumSize(new java.awt.Dimension(176, 40));
    about_us.setPreferredSize(new java.awt.Dimension(176, 40));
    about_us.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        about_usActionPerformed(evt);
      }
    });

    home.setBackground(new java.awt.Color(255, 255, 255));
    home.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    home.setForeground(new java.awt.Color(15, 4, 76));
    home.setText("HOME");
    home.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    home.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    home.setMaximumSize(new java.awt.Dimension(176, 40));
    home.setMinimumSize(new java.awt.Dimension(176, 40));
    home.setName("home"); // NOI18N
    home.setPreferredSize(new java.awt.Dimension(176, 40));
    home.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        homeActionPerformed(evt);
      }
    });

    exit.setBackground(new java.awt.Color(255, 0, 0));
    exit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    exit.setForeground(new java.awt.Color(255, 255, 255));
    exit.setText("EXIT");
    exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    exit.setPreferredSize(new java.awt.Dimension(176, 40));
    exit.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        exitActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout side_panel1Layout = new javax.swing.GroupLayout(side_panel1);
    side_panel1.setLayout(side_panel1Layout);
    side_panel1Layout.setHorizontalGroup(
      side_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(side_panel1Layout.createSequentialGroup()
        .addGap(26, 26, 26)
        .addGroup(side_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(about_us, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(50, 50, 50))
    );
    side_panel1Layout.setVerticalGroup(
      side_panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(side_panel1Layout.createSequentialGroup()
        .addGap(158, 158, 158)
        .addComponent(home, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(85, 85, 85)
        .addComponent(about_us, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(85, 85, 85)
        .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(152, Short.MAX_VALUE))
    );

    side_panel_main.add(side_panel1);

    side_panel2.setBackground(new java.awt.Color(25, 14, 90));

    home1.setBackground(new java.awt.Color(255, 255, 255));
    home1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    home1.setForeground(new java.awt.Color(25, 14, 90));
    home1.setText("HOME");
    home1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    home1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    home1.setPreferredSize(new java.awt.Dimension(61, 44));
    home1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        home1ActionPerformed(evt);
      }
    });

    book_park.setBackground(new java.awt.Color(255, 255, 255));
    book_park.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    book_park.setForeground(new java.awt.Color(25, 14, 90));
    book_park.setText("BOOK YOUR PARKING");
    book_park.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    book_park.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    book_park.setPreferredSize(new java.awt.Dimension(61, 44));
    book_park.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        book_parkActionPerformed(evt);
      }
    });

    view_book.setBackground(new java.awt.Color(255, 255, 255));
    view_book.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    view_book.setForeground(new java.awt.Color(25, 14, 90));
    view_book.setText("YOUR BOOKINGS");
    view_book.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    view_book.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    view_book.setPreferredSize(new java.awt.Dimension(61, 44));
    view_book.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        view_bookActionPerformed(evt);
      }
    });

    logout.setBackground(new java.awt.Color(255, 0, 0));
    logout.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    logout.setForeground(new java.awt.Color(255, 255, 255));
    logout.setText("LOG OUT");
    logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    logout.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    logout.setPreferredSize(new java.awt.Dimension(61, 44));
    logout.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        logoutActionPerformed(evt);
      }
    });

    rates_btn.setBackground(new java.awt.Color(255, 255, 255));
    rates_btn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    rates_btn.setForeground(new java.awt.Color(25, 14, 90));
    rates_btn.setText("RATES");
    rates_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    rates_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    rates_btn.setPreferredSize(new java.awt.Dimension(61, 44));
    rates_btn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rates_btnActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout side_panel2Layout = new javax.swing.GroupLayout(side_panel2);
    side_panel2.setLayout(side_panel2Layout);
    side_panel2Layout.setHorizontalGroup(
      side_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(side_panel2Layout.createSequentialGroup()
        .addGap(15, 15, 15)
        .addGroup(side_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(book_park, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
          .addComponent(view_book, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(home1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(rates_btn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addContainerGap(12, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, side_panel2Layout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    side_panel2Layout.setVerticalGroup(
      side_panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(side_panel2Layout.createSequentialGroup()
        .addGap(70, 70, 70)
        .addComponent(home1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(60, 60, 60)
        .addComponent(book_park, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(60, 60, 60)
        .addComponent(view_book, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(60, 60, 60)
        .addComponent(rates_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
        .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(70, 70, 70))
    );

    side_panel_main.add(side_panel2);

    jPanel2.setBackground(new java.awt.Color(255, 240, 108));
    jPanel2.setLayout(new javax.swing.OverlayLayout(jPanel2));

    login_panel.setBackground(new java.awt.Color(255, 240, 108));
    login_panel.setDoubleBuffered(false);
    login_panel.setPreferredSize(new java.awt.Dimension(710, 465));
    login_panel.setRequestFocusEnabled(false);

    email.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
    email.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    email.setText("PHONE NO");
    email.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    email.setMaximumSize(new java.awt.Dimension(180, 30));
    email.setMinimumSize(new java.awt.Dimension(135, 30));
    email.setPreferredSize(new java.awt.Dimension(155, 30));

    login_phone_textfield.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    login_phone_textfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    login_phone_textfield.setPreferredSize(new java.awt.Dimension(300, 35));

    pwd1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
    pwd1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    pwd1.setText("PASSWORD");
    pwd1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    pwd1.setMaximumSize(new java.awt.Dimension(300, 30));
    pwd1.setMinimumSize(new java.awt.Dimension(280, 30));
    pwd1.setPreferredSize(new java.awt.Dimension(155, 30));

    login_pwd_textfield.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    login_pwd_textfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    login_pwd_textfield.setMinimumSize(new java.awt.Dimension(300, 30));
    login_pwd_textfield.setNextFocusableComponent(login);
    login_pwd_textfield.setPreferredSize(new java.awt.Dimension(300, 35));
    login_pwd_textfield.setVerifyInputWhenFocusTarget(false);

    login.setBackground(new java.awt.Color(0, 255, 0));
    login.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
    login.setText("LOGIN");
    login.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    login.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    login.setMaximumSize(new java.awt.Dimension(100, 40));
    login.setMinimumSize(new java.awt.Dimension(100, 40));
    login.setName("login"); // NOI18N
    login.setPreferredSize(new java.awt.Dimension(100, 40));
    login.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        loginActionPerformed(evt);
      }
    });

    register.setBackground(new java.awt.Color(204, 0, 0));
    register.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
    register.setText("REGISTER");
    register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    register.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    register.setMaximumSize(new java.awt.Dimension(100, 40));
    register.setMinimumSize(new java.awt.Dimension(100, 40));
    register.setName("register"); // NOI18N
    register.setPreferredSize(new java.awt.Dimension(100, 40));
    register.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        registerMouseClicked(evt);
      }
    });
    register.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        registerActionPerformed(evt);
      }
    });

    jPanel5.setBackground(new java.awt.Color(255, 0, 0));

    jLabel4.setBackground(new java.awt.Color(255, 0, 0));
    jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(255, 240, 108));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setText("USER LOGIN");
    jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel4.setMaximumSize(new java.awt.Dimension(400, 31));
    jLabel4.setMinimumSize(new java.awt.Dimension(400, 31));
    jLabel4.setPreferredSize(new java.awt.Dimension(400, 31));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel5Layout.setVerticalGroup(
      jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel5Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    javax.swing.GroupLayout login_panelLayout = new javax.swing.GroupLayout(login_panel);
    login_panel.setLayout(login_panelLayout);
    login_panelLayout.setHorizontalGroup(
      login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
        .addGap(220, 250, Short.MAX_VALUE)
        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(233, 233, 233))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, login_panelLayout.createSequentialGroup()
            .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(230, 230, 230))))
      .addGroup(login_panelLayout.createSequentialGroup()
        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(login_panelLayout.createSequentialGroup()
            .addGap(68, 68, 68)
            .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addGroup(login_panelLayout.createSequentialGroup()
                .addComponent(pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(login_pwd_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
              .addGroup(login_panelLayout.createSequentialGroup()
                .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(login_phone_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
          .addGroup(login_panelLayout.createSequentialGroup()
            .addGap(335, 335, 335)
            .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addGap(0, 0, Short.MAX_VALUE))
    );
    login_panelLayout.setVerticalGroup(
      login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(login_panelLayout.createSequentialGroup()
        .addGap(58, 58, 58)
        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(63, 63, 63)
        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(login_phone_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(31, 31, 31)
        .addGroup(login_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(login_pwd_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(pwd1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
        .addComponent(login, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(27, 27, 27)
        .addComponent(register, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(51, 51, 51))
    );

    jPanel2.add(login_panel);

    Aboutus_panel.setPreferredSize(new java.awt.Dimension(750, 500));
    Aboutus_panel.setLayout(null);

    Back_aboutus.setBackground(new java.awt.Color(255, 255, 102));
    Back_aboutus.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    Back_aboutus.setText("Back");
    Back_aboutus.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    Back_aboutus.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    Back_aboutus.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        Back_aboutusActionPerformed(evt);
      }
    });
    Aboutus_panel.add(Back_aboutus);
    Back_aboutus.setBounds(320, 420, 100, 30);

    jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel16.setText("ABOUT US");
    jLabel16.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    Aboutus_panel.add(jLabel16);
    jLabel16.setBounds(260, 0, 180, 30);

    jScrollPane2.setBorder(null);
    jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
    jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
    jScrollPane2.setAutoscrolls(true);
    jScrollPane2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    jScrollPane2.setHorizontalScrollBar(null);
    jScrollPane2.setPreferredSize(new java.awt.Dimension(750, 500));

    jTextPane1.setEditable(false);
    jTextPane1.setBackground(new java.awt.Color(255, 153, 153));
    jTextPane1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    jTextPane1.setText("\n\nKnowing that finding a parking spot, especially in malls and airports, in these heavily crowded cities is very difficult. So as the students of Apsit we have come up with this solution by creating a online management system which will help you to find your preferred parking spot in advance and book it as per your requirement.Pay for it in advance and you don’t have to waste your time in the long queues.\n\nHow to book your parking spot:\n\n1 Log in to your application, if you are new user register yourself by clicking on Register.\n2 Once you log in, click on Book your Parking \n3 Enter the details and clickon select slot\n4 Look for your parking spot as per availability and preferred payment mode\n5 Click on next\n6 Confirm your details on the confirmation page, if any changes you can go back, by clicking on back button\n7 Once all the details are correct click on confirm\n8 Make the payment and you are ready to go\n9 You can look at your booking in my bookings.\n\n");
    jScrollPane2.setViewportView(jTextPane1);

    Aboutus_panel.add(jScrollPane2);
    jScrollPane2.setBounds(0, 0, 710, 460);

    jPanel2.add(Aboutus_panel);

    reg_panel.setBackground(new java.awt.Color(255, 240, 108));

    jPanel4.setBackground(new java.awt.Color(255, 0, 0));

    jLabel1.setBackground(new java.awt.Color(255, 0, 0));
    jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 240, 108));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("REGISTRATION FORM");
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel1.setMaximumSize(new java.awt.Dimension(202, 30));
    jLabel1.setMinimumSize(new java.awt.Dimension(202, 30));
    jLabel1.setPreferredSize(new java.awt.Dimension(202, 30));

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel4Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel4Layout.setVerticalGroup(
      jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    reg_form_panel.setBackground(new java.awt.Color(153, 255, 153));
    reg_form_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
    reg_form_panel.setMaximumSize(new java.awt.Dimension(600, 500));
    reg_form_panel.setMinimumSize(new java.awt.Dimension(500, 400));

    jLabel3.setBackground(new java.awt.Color(204, 255, 255));
    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("NAME :");
    jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel3.setPreferredSize(new java.awt.Dimension(100, 30));

    jLabel5.setBackground(new java.awt.Color(204, 255, 255));
    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("EMAIL ID:");
    jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel5.setPreferredSize(new java.awt.Dimension(100, 30));

    jLabel6.setBackground(new java.awt.Color(204, 255, 255));
    jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel6.setText("PHONE NO :");
    jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel6.setPreferredSize(new java.awt.Dimension(100, 30));

    jLabel7.setBackground(new java.awt.Color(204, 255, 255));
    jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7.setText("ADDRESS :");
    jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel7.setPreferredSize(new java.awt.Dimension(100, 30));

    jLabel8.setBackground(new java.awt.Color(204, 255, 255));
    jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel8.setText("PASSWORD :");
    jLabel8.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel8.setPreferredSize(new java.awt.Dimension(100, 30));

    name_textfield.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    name_textfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    name_textfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    name_textfield.setPreferredSize(new java.awt.Dimension(220, 30));

    email_textfield.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    email_textfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    email_textfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    email_textfield.setPreferredSize(new java.awt.Dimension(220, 30));

    phone_textfield.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    phone_textfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    phone_textfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    phone_textfield.setPreferredSize(new java.awt.Dimension(220, 30));
    phone_textfield.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        phone_textfieldActionPerformed(evt);
      }
    });

    address_textfield.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    address_textfield.setHorizontalAlignment(javax.swing.JTextField.LEFT);
    address_textfield.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    address_textfield.setPreferredSize(new java.awt.Dimension(220, 30));
    address_textfield.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        address_textfieldActionPerformed(evt);
      }
    });

    reg_pwd.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
    reg_pwd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
    reg_pwd.setPreferredSize(new java.awt.Dimension(220, 30));

    reg_back_btn.setBackground(new java.awt.Color(255, 51, 51));
    reg_back_btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    reg_back_btn.setText("BACK");
    reg_back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    reg_back_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    reg_back_btn.setPreferredSize(new java.awt.Dimension(105, 31));
    reg_back_btn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        reg_back_btnActionPerformed(evt);
      }
    });

    confirm_btn.setBackground(new java.awt.Color(113, 196, 220));
    confirm_btn.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    confirm_btn.setText("CONFIRM");
    confirm_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
    confirm_btn.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    confirm_btn.setPreferredSize(new java.awt.Dimension(105, 31));
    confirm_btn.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        confirm_btnActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout reg_form_panelLayout = new javax.swing.GroupLayout(reg_form_panel);
    reg_form_panel.setLayout(reg_form_panelLayout);
    reg_form_panelLayout.setHorizontalGroup(
      reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(reg_form_panelLayout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, reg_form_panelLayout.createSequentialGroup()
              .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(reg_form_panelLayout.createSequentialGroup()
              .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(email_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(reg_form_panelLayout.createSequentialGroup()
              .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
              .addComponent(phone_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGroup(reg_form_panelLayout.createSequentialGroup()
            .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
              .addComponent(reg_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(address_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addGroup(reg_form_panelLayout.createSequentialGroup()
                .addComponent(reg_back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(confirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
        .addContainerGap(100, Short.MAX_VALUE))
    );
    reg_form_panelLayout.setVerticalGroup(
      reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(reg_form_panelLayout.createSequentialGroup()
        .addGap(18, 18, 18)
        .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(name_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
        .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(email_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(phone_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(address_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(reg_pwd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(43, 43, 43)
        .addGroup(reg_form_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(reg_back_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(confirm_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout reg_panelLayout = new javax.swing.GroupLayout(reg_panel);
    reg_panel.setLayout(reg_panelLayout);
    reg_panelLayout.setHorizontalGroup(
      reg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(reg_panelLayout.createSequentialGroup()
        .addGroup(reg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(reg_panelLayout.createSequentialGroup()
            .addGap(242, 242, 242)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(reg_panelLayout.createSequentialGroup()
            .addGap(109, 109, 109)
            .addComponent(reg_form_panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        .addGap(97, 97, 97))
    );
    reg_panelLayout.setVerticalGroup(
      reg_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(reg_panelLayout.createSequentialGroup()
        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
        .addComponent(reg_form_panel, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(26, 26, 26))
    );

    jPanel2.add(reg_panel);

    welcome_panel.setBackground(new java.awt.Color(255, 240, 108));

    welcome_label.setBackground(new java.awt.Color(204, 255, 255));
    welcome_label.setFont(new java.awt.Font("Lucida Sans", 1, 36)); // NOI18N
    welcome_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    welcome_label.setText("WELCOME USER!!!");
    welcome_label.setFocusable(false);
    welcome_label.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    welcome_label.setPreferredSize(new java.awt.Dimension(635, 150));

    javax.swing.GroupLayout welcome_panelLayout = new javax.swing.GroupLayout(welcome_panel);
    welcome_panel.setLayout(welcome_panelLayout);
    welcome_panelLayout.setHorizontalGroup(
      welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(welcome_panelLayout.createSequentialGroup()
        .addGap(50, 50, 50)
        .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(14, Short.MAX_VALUE))
    );
    welcome_panelLayout.setVerticalGroup(
      welcome_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(welcome_panelLayout.createSequentialGroup()
        .addGap(130, 130, 130)
        .addComponent(welcome_label, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap(221, Short.MAX_VALUE))
    );

    jPanel2.add(welcome_panel);

    book_panel.setBackground(new java.awt.Color(204, 255, 255));
    book_panel.setPreferredSize(new java.awt.Dimension(700, 500));
    book_panel.setLayout(new javax.swing.OverlayLayout(book_panel));

    book_parking_panel.setBackground(new java.awt.Color(255, 240, 108));
    book_parking_panel.setPreferredSize(new java.awt.Dimension(600, 500));

    jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
    jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel11.setText("DATE:");
    jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jLabel11.setPreferredSize(new java.awt.Dimension(100, 30));

    carNo_textfield.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    carNo_textfield.setPreferredSize(new java.awt.Dimension(100, 30));

    jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
    jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel12.setText("TIME SLOT");
    jLabel12.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jLabel12.setPreferredSize(new java.awt.Dimension(100, 30));

    jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
    jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel14.setText("CAR NO.:");
    jLabel14.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jLabel14.setPreferredSize(new java.awt.Dimension(100, 30));

    date_textfield.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    date_textfield.setPreferredSize(new java.awt.Dimension(100, 30));

    slot_select.setBackground(new java.awt.Color(23, 185, 53));
    slot_select.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    slot_select.setText("SELECT SLOT");
    slot_select.setPreferredSize(new java.awt.Dimension(130, 30));
    slot_select.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot_selectActionPerformed(evt);
      }
    });

    book_back.setBackground(new java.awt.Color(23, 185, 53));
    book_back.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    book_back.setText("BACK");
    book_back.setPreferredSize(new java.awt.Dimension(130, 30));
    book_back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        book_backActionPerformed(evt);
      }
    });

    time_combobox.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    time_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-select-", "09:00-11:00", "11:00-13:00", "13:00-15:00", "15:00-17:00", "17:00-19:00", "19:00-21:00", "21:00-23:00" }));
    time_combobox.setPreferredSize(new java.awt.Dimension(100, 30));

    jPanel6.setBackground(new java.awt.Color(255, 0, 0));
    jPanel6.setForeground(new java.awt.Color(255, 240, 108));

    jLabel10.setBackground(new java.awt.Color(255, 204, 0));
    jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(255, 240, 108));
    jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel10.setText("BOOK YOUR PARKING");
    jLabel10.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel10.setPreferredSize(new java.awt.Dimension(195, 40));

    javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
    jPanel6.setLayout(jPanel6Layout);
    jPanel6Layout.setHorizontalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel6Layout.setVerticalGroup(
      jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel6Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );

    javax.swing.GroupLayout book_parking_panelLayout = new javax.swing.GroupLayout(book_parking_panel);
    book_parking_panel.setLayout(book_parking_panelLayout);
    book_parking_panelLayout.setHorizontalGroup(
      book_parking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(book_parking_panelLayout.createSequentialGroup()
        .addGroup(book_parking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(book_parking_panelLayout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addGroup(book_parking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(18, 18, 18)
            .addGroup(book_parking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
              .addComponent(date_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
              .addComponent(time_combobox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
              .addComponent(carNo_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
          .addGroup(book_parking_panelLayout.createSequentialGroup()
            .addGap(95, 95, 95)
            .addComponent(book_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(54, 54, 54)
            .addComponent(slot_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(book_parking_panelLayout.createSequentialGroup()
            .addGap(217, 217, 217)
            .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(213, Short.MAX_VALUE))
    );
    book_parking_panelLayout.setVerticalGroup(
      book_parking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(book_parking_panelLayout.createSequentialGroup()
        .addGap(30, 30, 30)
        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(40, 40, 40)
        .addGroup(book_parking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(date_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(40, 40, 40)
        .addGroup(book_parking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(time_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(40, 40, 40)
        .addGroup(book_parking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(carNo_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(73, 73, 73)
        .addGroup(book_parking_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(book_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(slot_select, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addContainerGap(36, Short.MAX_VALUE))
    );

    book_panel.add(book_parking_panel);

    slot_panel.setBackground(new java.awt.Color(255, 240, 108));
    slot_panel.setPreferredSize(new java.awt.Dimension(600, 500));
    slot_panel.addFocusListener(new java.awt.event.FocusAdapter() {
      public void focusGained(java.awt.event.FocusEvent evt) {
        slot_panelFocusGained(evt);
      }
    });

    jLabel15.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel15.setText("DATE:");
    jLabel15.setPreferredSize(new java.awt.Dimension(100, 30));

    slotCar_textfield.setEditable(false);
    slotCar_textfield.setBackground(new java.awt.Color(255, 255, 255));
    slotCar_textfield.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    slotCar_textfield.setPreferredSize(new java.awt.Dimension(100, 30));

    jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel17.setText("TIME SLOT");
    jLabel17.setPreferredSize(new java.awt.Dimension(100, 30));

    jLabel18.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel18.setText("CAR NO.:");
    jLabel18.setPreferredSize(new java.awt.Dimension(100, 30));

    slotTime_textfield.setEditable(false);
    slotTime_textfield.setBackground(new java.awt.Color(255, 255, 255));
    slotTime_textfield.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    slotTime_textfield.setPreferredSize(new java.awt.Dimension(100, 30));

    slotDate_textfield.setEditable(false);
    slotDate_textfield.setBackground(new java.awt.Color(255, 255, 255));
    slotDate_textfield.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    slotDate_textfield.setPreferredSize(new java.awt.Dimension(100, 30));

    confirm_slot.setBackground(new java.awt.Color(23, 185, 53));
    confirm_slot.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    confirm_slot.setText("CONFIRM");
    confirm_slot.setPreferredSize(new java.awt.Dimension(130, 30));
    confirm_slot.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        confirm_slotActionPerformed(evt);
      }
    });

    slot_back.setBackground(new java.awt.Color(23, 185, 53));
    slot_back.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    slot_back.setText("BACK");
    slot_back.setPreferredSize(new java.awt.Dimension(130, 30));
    slot_back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot_backActionPerformed(evt);
      }
    });

    slot_select_panel.setBackground(new java.awt.Color(153, 255, 153));
    slot_select_panel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    slot_buttongroup.add(slot1_button);
    slot1_button.setText("A1");
    slot1_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot1_buttonActionPerformed(evt);
      }
    });

    slot_buttongroup.add(slot2_button);
    slot2_button.setText("A2");
    slot2_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot2_buttonActionPerformed(evt);
      }
    });

    slot_buttongroup.add(slot3_button);
    slot3_button.setText("A3");
    slot3_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot3_buttonActionPerformed(evt);
      }
    });

    slot_buttongroup.add(slot4_button);
    slot4_button.setText("A4");
    slot4_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot4_buttonActionPerformed(evt);
      }
    });

    slot_buttongroup.add(slot5_button);
    slot5_button.setText("A5");
    slot5_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot5_buttonActionPerformed(evt);
      }
    });

    slot_buttongroup.add(slot6_button);
    slot6_button.setText("A6");
    slot6_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot6_buttonActionPerformed(evt);
      }
    });

    slot_buttongroup.add(slot7_button);
    slot7_button.setText("A7");
    slot7_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot7_buttonActionPerformed(evt);
      }
    });

    slot_buttongroup.add(slot8_button);
    slot8_button.setText("A8");
    slot8_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot8_buttonActionPerformed(evt);
      }
    });

    slot_buttongroup.add(slot9_button);
    slot9_button.setText("A9");
    slot9_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        slot9_buttonActionPerformed(evt);
      }
    });

    slot_buttongroup.add(cancel_button);
    cancel_button.setText("Cancel");
    cancel_button.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        cancel_buttonActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout slot_select_panelLayout = new javax.swing.GroupLayout(slot_select_panel);
    slot_select_panel.setLayout(slot_select_panelLayout);
    slot_select_panelLayout.setHorizontalGroup(
      slot_select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(slot_select_panelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(slot_select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(slot1_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(slot2_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(slot3_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGap(39, 39, 39)
        .addGroup(slot_select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(slot4_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(slot5_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(slot6_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
        .addGroup(slot_select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(slot7_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(slot8_button, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(slot9_button, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(20, 20, 20))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, slot_select_panelLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addComponent(cancel_button, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(60, 60, 60))
    );
    slot_select_panelLayout.setVerticalGroup(
      slot_select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(slot_select_panelLayout.createSequentialGroup()
        .addContainerGap()
        .addGroup(slot_select_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(slot_select_panelLayout.createSequentialGroup()
            .addComponent(slot7_button)
            .addGap(31, 31, 31)
            .addComponent(slot8_button)
            .addGap(31, 31, 31)
            .addComponent(slot9_button))
          .addGroup(slot_select_panelLayout.createSequentialGroup()
            .addComponent(slot4_button)
            .addGap(31, 31, 31)
            .addComponent(slot5_button)
            .addGap(31, 31, 31)
            .addComponent(slot6_button))
          .addGroup(slot_select_panelLayout.createSequentialGroup()
            .addComponent(slot1_button)
            .addGap(31, 31, 31)
            .addComponent(slot2_button)
            .addGap(31, 31, 31)
            .addComponent(slot3_button)))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
        .addComponent(cancel_button)
        .addContainerGap())
    );

    jLabel19.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel19.setText("SLOT NO");
    jLabel19.setPreferredSize(new java.awt.Dimension(100, 30));

    jLabel20.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel20.setText("PRICE:");
    jLabel20.setPreferredSize(new java.awt.Dimension(100, 30));

    slotNo_textfield.setEditable(false);
    slotNo_textfield.setBackground(new java.awt.Color(255, 255, 255));
    slotNo_textfield.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    slotNo_textfield.setPreferredSize(new java.awt.Dimension(100, 30));

    price_textfield.setEditable(false);
    price_textfield.setBackground(new java.awt.Color(255, 255, 255));
    price_textfield.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    price_textfield.setPreferredSize(new java.awt.Dimension(100, 30));
    price_textfield.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        price_textfieldActionPerformed(evt);
      }
    });

    jPanel7.setBackground(new java.awt.Color(255, 0, 0));

    jLabel13.setBackground(new java.awt.Color(255, 204, 0));
    jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
    jLabel13.setForeground(new java.awt.Color(255, 240, 108));
    jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel13.setText("BOOK YOUR PARKING");
    jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel13.setPreferredSize(new java.awt.Dimension(195, 40));

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel7Layout.setVerticalGroup(
      jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel7Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
        .addContainerGap())
    );

    javax.swing.GroupLayout slot_panelLayout = new javax.swing.GroupLayout(slot_panel);
    slot_panel.setLayout(slot_panelLayout);
    slot_panelLayout.setHorizontalGroup(
      slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(slot_panelLayout.createSequentialGroup()
        .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(slot_panelLayout.createSequentialGroup()
            .addGap(153, 153, 153)
            .addComponent(slot_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(72, 72, 72)
            .addComponent(confirm_slot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
          .addGroup(slot_panelLayout.createSequentialGroup()
            .addGap(191, 191, 191)
            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
      .addGroup(slot_panelLayout.createSequentialGroup()
        .addGap(0, 0, Short.MAX_VALUE)
        .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(18, 18, 18)
        .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
          .addComponent(slotCar_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(slotDate_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(slotTime_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(slotNo_textfield, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
          .addComponent(price_textfield, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(80, 80, 80)
        .addComponent(slot_select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(25, 25, 25))
    );
    slot_panelLayout.setVerticalGroup(
      slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(slot_panelLayout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(64, 64, 64)
        .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(slot_panelLayout.createSequentialGroup()
            .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(slotDate_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(slotTime_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(slotCar_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(slotNo_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(6, 6, 6)
            .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
              .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
              .addComponent(price_textfield, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addComponent(slot_select_panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
        .addGroup(slot_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
          .addComponent(slot_back, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addComponent(confirm_slot, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        .addGap(41, 41, 41))
    );

    book_panel.add(slot_panel);

    jPanel2.add(book_panel);

    show_book.setBackground(new java.awt.Color(255, 240, 108));

    book_table.setAutoCreateRowSorter(false);
    book_table.setBackground(new java.awt.Color(249, 168, 90));
    book_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    book_table.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
    book_table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {

      },
      new String [] {
        "CAR NO", "USER NAME", "DATE", "TIME SLOT", "SLOT NO", "COST"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    book_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    book_table.setColumnSelectionAllowed(true);
    book_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    book_table.setEditingColumn(0);
    book_table.setEditingRow(0);
    book_table.setGridColor(new java.awt.Color(0, 0, 0));
    book_table.setIntercellSpacing(new java.awt.Dimension(2, 5));
    book_table.setPreferredSize(new java.awt.Dimension(700, 500));
    book_table.setRowHeight(25);
    book_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    book_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    book_table.setShowGrid(true);
    book_table.getTableHeader().setReorderingAllowed(false);
    jScrollPane1.setViewportView(book_table);
    book_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (book_table.getColumnModel().getColumnCount() > 0) {
      book_table.getColumnModel().getColumn(0).setResizable(false);
      book_table.getColumnModel().getColumn(0).setPreferredWidth(200);
      book_table.getColumnModel().getColumn(1).setResizable(false);
      book_table.getColumnModel().getColumn(1).setPreferredWidth(100);
      book_table.getColumnModel().getColumn(2).setResizable(false);
      book_table.getColumnModel().getColumn(2).setPreferredWidth(80);
      book_table.getColumnModel().getColumn(3).setPreferredWidth(80);
      book_table.getColumnModel().getColumn(3).setHeaderValue("TIME SLOT");
      book_table.getColumnModel().getColumn(4).setPreferredWidth(50);
      book_table.getColumnModel().getColumn(4).setHeaderValue("SLOT NO");
      book_table.getColumnModel().getColumn(5).setPreferredWidth(50);
      book_table.getColumnModel().getColumn(5).setHeaderValue("COST");
    }
    book_table.getAccessibleContext().setAccessibleName("");

    show_book_back.setBackground(new java.awt.Color(23, 185, 53));
    show_book_back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    show_book_back.setText("Back");
    show_book_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    show_book_back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        show_book_backActionPerformed(evt);
      }
    });

    jPanel8.setBackground(new java.awt.Color(255, 0, 0));

    jLabel9.setBackground(new java.awt.Color(255, 255, 255));
    jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(255, 240, 108));
    jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel9.setText("YOUR BOOKINGS");
    jLabel9.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel9.setMaximumSize(new java.awt.Dimension(220, 80));
    jLabel9.setMinimumSize(new java.awt.Dimension(215, 65));
    jLabel9.setPreferredSize(new java.awt.Dimension(215, 65));

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
      jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel8Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addContainerGap())
    );
    jPanel8Layout.setVerticalGroup(
      jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel8Layout.createSequentialGroup()
        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout show_bookLayout = new javax.swing.GroupLayout(show_book);
    show_book.setLayout(show_bookLayout);
    show_bookLayout.setHorizontalGroup(
      show_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(show_bookLayout.createSequentialGroup()
        .addGap(238, 238, 238)
        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, show_bookLayout.createSequentialGroup()
        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addGroup(show_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, show_bookLayout.createSequentialGroup()
            .addComponent(show_book_back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(295, 295, 295))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, show_bookLayout.createSequentialGroup()
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 682, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(25, 25, 25))))
    );
    show_bookLayout.setVerticalGroup(
      show_bookLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, show_bookLayout.createSequentialGroup()
        .addContainerGap(74, Short.MAX_VALUE)
        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(47, 47, 47)
        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(39, 39, 39)
        .addComponent(show_book_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(66, 66, 66))
    );

    jPanel2.add(show_book);

    rates_panel.setBackground(new java.awt.Color(255, 240, 108));

    rates_table.setAutoCreateRowSorter(false);
    rates_table.setBackground(new java.awt.Color(249, 168, 90));
    rates_table.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
    rates_table.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
    rates_table.setModel(new javax.swing.table.DefaultTableModel(
      new Object [][] {
        {"4- WHEELER", "A1, A4, A7", "100", "2 Hrs"},
        {"2-WHEELER", "A2, A5, A8", "50", "2 Hrs "},
        {"PREMIUM 4- WHEELER", "A3, A6, A9", "150", "2 Hrs"}
      },
      new String [] {
        "VEHICAL TYPE", "SLOTS", "PRICE", "TIME"
      }
    ) {
      Class[] types = new Class [] {
        java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
      };
      boolean[] canEdit = new boolean [] {
        false, false, false, false
      };

      public Class getColumnClass(int columnIndex) {
        return types [columnIndex];
      }

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit [columnIndex];
      }
    });
    rates_table.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
    rates_table.setColumnSelectionAllowed(true);
    rates_table.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
    rates_table.setEditingColumn(0);
    rates_table.setEditingRow(0);
    rates_table.setGridColor(new java.awt.Color(0, 0, 0));
    rates_table.setPreferredSize(new java.awt.Dimension(700, 500));
    rates_table.setRowHeight(40);
    rates_table.setRowMargin(10);
    rates_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    rates_table.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    rates_table.setShowGrid(true);
    rates_table.getTableHeader().setReorderingAllowed(false);
    jScrollPane3.setViewportView(rates_table);
    rates_table.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
    if (rates_table.getColumnModel().getColumnCount() > 0) {
      rates_table.getColumnModel().getColumn(0).setResizable(false);
      rates_table.getColumnModel().getColumn(0).setPreferredWidth(200);
      rates_table.getColumnModel().getColumn(1).setResizable(false);
      rates_table.getColumnModel().getColumn(1).setPreferredWidth(100);
      rates_table.getColumnModel().getColumn(2).setResizable(false);
      rates_table.getColumnModel().getColumn(2).setPreferredWidth(80);
      rates_table.getColumnModel().getColumn(3).setResizable(false);
    }

    rates_back.setBackground(new java.awt.Color(23, 185, 53));
    rates_back.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    rates_back.setText("Back");
    rates_back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    rates_back.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        rates_backActionPerformed(evt);
      }
    });

    jPanel9.setBackground(new java.awt.Color(255, 0, 0));

    jLabel22.setBackground(new java.awt.Color(255, 255, 255));
    jLabel22.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
    jLabel22.setForeground(new java.awt.Color(255, 240, 108));
    jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel22.setText("RATES");
    jLabel22.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel22.setMaximumSize(new java.awt.Dimension(220, 80));
    jLabel22.setMinimumSize(new java.awt.Dimension(215, 65));
    jLabel22.setPreferredSize(new java.awt.Dimension(215, 65));

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
      jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
    );
    jPanel9Layout.setVerticalGroup(
      jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addComponent(jLabel22, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    javax.swing.GroupLayout rates_panelLayout = new javax.swing.GroupLayout(rates_panel);
    rates_panel.setLayout(rates_panelLayout);
    rates_panelLayout.setHorizontalGroup(
      rates_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rates_panelLayout.createSequentialGroup()
        .addContainerGap(134, Short.MAX_VALUE)
        .addGroup(rates_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rates_panelLayout.createSequentialGroup()
            .addComponent(rates_back, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(284, 284, 284))
          .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rates_panelLayout.createSequentialGroup()
            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(113, 113, 113))))
      .addGroup(rates_panelLayout.createSequentialGroup()
        .addGap(262, 262, 262)
        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 0, Short.MAX_VALUE))
    );
    rates_panelLayout.setVerticalGroup(
      rates_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, rates_panelLayout.createSequentialGroup()
        .addContainerGap(43, Short.MAX_VALUE)
        .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(55, 55, 55)
        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(52, 52, 52)
        .addComponent(rates_back, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(44, 44, 44))
    );

    jPanel2.add(rates_panel);

    jPanel1.setBackground(new java.awt.Color(255, 240, 108));
    jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

    jLabel2.setFont(new java.awt.Font("Rockwell", 1, 24)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("CAR PARKING BOOKING SYSTEM");
    jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel2.setMaximumSize(new java.awt.Dimension(400, 31));
    jLabel2.setMinimumSize(new java.awt.Dimension(400, 31));
    jLabel2.setPreferredSize(new java.awt.Dimension(400, 31));
    jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 11, 470, 100));

    jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/car_parking_management_system/logo1.png"))); // NOI18N
    jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 170, 110));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
        .addGap(0, 254, Short.MAX_VALUE)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 696, javax.swing.GroupLayout.PREFERRED_SIZE))
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addComponent(side_panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(5, 5, 5)
          .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 693, javax.swing.GroupLayout.PREFERRED_SIZE)
          .addGap(0, 0, Short.MAX_VALUE)))
    );
    jPanel3Layout.setVerticalGroup(
      jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(jPanel3Layout.createSequentialGroup()
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        .addGap(0, 480, Short.MAX_VALUE))
      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
          .addGap(0, 0, Short.MAX_VALUE)
          .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(side_panel_main, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel3Layout.createSequentialGroup()
              .addGap(126, 126, 126)
              .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)))
          .addGap(0, 0, Short.MAX_VALUE)))
    );

    getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 580));

    pack();
  }// </editor-fold>//GEN-END:initComponents

    private void loginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginActionPerformed
//        login validation after registration
      char[] input = login_pwd_textfield.getPassword();
      String str = String.copyValueOf(input);
      if (login_phone_textfield.getText().equals(phone) && str.equals(pwd) && (!(login_phone_textfield.getText().equals("") && str.equals("")))) {
        Aboutus_panel.setVisible(false);
        welcome_panel.setVisible(true);
        login_panel.setVisible(false);
        reg_panel.setVisible(false);
        side_panel1.setVisible(false);
        book_panel.setVisible(false);
        side_panel2.setVisible(true);
        login_phone_textfield.setText("");
        login_pwd_textfield.setText("");

        welcome_label.setText("Welcome " + name + " !!!");

      } else {
        JOptionPane.showMessageDialog(this, "Invalid Credentials");
        login_phone_textfield.setText("");
        login_pwd_textfield.setText("");

      }
    }//GEN-LAST:event_loginActionPerformed

    private void registerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registerMouseClicked

    }//GEN-LAST:event_registerMouseClicked

    private void registerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registerActionPerformed
//      Code for Register button on main page.
      reg_panel.setVisible(true);
      side_panel1.setVisible(true);
      side_panel2.setVisible(false);
      welcome_panel.setVisible(false);
      book_panel.setVisible(false);
      show_book.setVisible(false);
      Aboutus_panel.setVisible(false);
      login_panel.setVisible(false);
      rates_panel.setVisible(false);
      login_phone_textfield.setText("");
      login_pwd_textfield.setText("");

    }//GEN-LAST:event_registerActionPerformed

    private void about_usActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_about_usActionPerformed
//      Code for About us button on side panel.
      reg_panel.setVisible(false);
      side_panel1.setVisible(true);
      side_panel2.setVisible(false);
      welcome_panel.setVisible(false);
      book_panel.setVisible(false);
      show_book.setVisible(false);
      Aboutus_panel.setVisible(true);
      login_panel.setVisible(false);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_about_usActionPerformed

    private void homeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeActionPerformed
//      Code for Home button on side panel.
      login_panel.setVisible(true);
      side_panel1.setVisible(true);
      reg_panel.setVisible(false);
      side_panel2.setVisible(false);
      welcome_panel.setVisible(false);
      book_panel.setVisible(false);
      show_book.setVisible(false);
      Aboutus_panel.setVisible(false);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_homeActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
//      Code for Exit button.
      System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void reg_back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reg_back_btnActionPerformed
//      Code for back button on the registration panel.        
      login_panel.setVisible(true);
      side_panel1.setVisible(true);
      Aboutus_panel.setVisible(false);
      reg_panel.setVisible(false);
      side_panel2.setVisible(false);
      welcome_panel.setVisible(false);
      show_book.setVisible(false);
      book_panel.setVisible(false);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_reg_back_btnActionPerformed

    private void confirm_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_btnActionPerformed
//      Code for confirm button on the registration button.
      name = name_textfield.getText();
      emailadd = email_textfield.getText();
      address = address_textfield.getText();
      phone = phone_textfield.getText();
      char[] input = reg_pwd.getPassword();
      pwd = String.copyValueOf(input);

//        regstration validation
      if (!(name.length() <= 0 || emailadd.length() <= 0 || address.length() <= 0 || phone.length() <= 0 || reg_pwd.getPassword().length == 0)) {
        if (name.matches("^[A-Za-z]+[ ]+[A-Za-z]*$")) {
          if (emailadd.matches("^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$")) {
            if ((phone.length() == 10) && (phone.matches("^[0-9]*$"))) {
              if (pwd.length() >= 5) {
                JOptionPane.showMessageDialog(this, "Registration Successfull,Kindly Login!!");
                login_panel.setVisible(true);
                reg_panel.setVisible(false);
                name_textfield.setText("");
                email_textfield.setText("");
                address_textfield.setText("");
                phone_textfield.setText("");
                reg_pwd.setText("");
              } else {
                JOptionPane.showMessageDialog(this, "Password should contain minimum 5 characters.");
                reg_pwd.setText("");
              }
            } else {
              JOptionPane.showMessageDialog(this, "Enter Valid Phone Number");
              phone_textfield.setText("");
            }
          } else {
            JOptionPane.showMessageDialog(this, "Enter a valid email");
            email_textfield.setText("");
          }
        } else {
          JOptionPane.showMessageDialog(this, "Enter a valid Name.");
          name_textfield.setText("");
        }
      } else {
        JOptionPane.showMessageDialog(this, "Enter All valid Details");
      }
    }//GEN-LAST:event_confirm_btnActionPerformed

    private void phone_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phone_textfieldActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_phone_textfieldActionPerformed

    private void address_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_address_textfieldActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_address_textfieldActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
//      Code for Log out button.
      side_panel1.setVisible(true);
      login_panel.setVisible(true);
      side_panel2.setVisible(false);
      reg_panel.setVisible(false);
      welcome_panel.setVisible(false);
      book_panel.setVisible(false);
      show_book.setVisible(false);
      Aboutus_panel.setVisible(false);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_logoutActionPerformed

    private void home1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_home1ActionPerformed
//      Code for home button on side panel 2.     
      book_panel.setVisible(false);
      side_panel2.setVisible(true);
      welcome_panel.setVisible(true);
      login_panel.setVisible(false);
      reg_panel.setVisible(false);
      side_panel1.setVisible(false);
      show_book.setVisible(false);
      Aboutus_panel.setVisible(false);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_home1ActionPerformed

    private void book_parkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_parkActionPerformed
//      Code for book your parking button.        
      book_panel.setVisible(true);
      side_panel2.setVisible(true);
      welcome_panel.setVisible(false);
      login_panel.setVisible(false);
      reg_panel.setVisible(false);
      side_panel1.setVisible(false);
      show_book.setVisible(false);
      Aboutus_panel.setVisible(false);
      slot_panel.setVisible(false);
      book_parking_panel.setVisible(true);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_book_parkActionPerformed

    private void view_bookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_view_bookActionPerformed
//      Code for Your bookings button.        
      show_book.setVisible(true);
      book_panel.setVisible(false);
      side_panel2.setVisible(true);
      welcome_panel.setVisible(false);
      login_panel.setVisible(false);
      reg_panel.setVisible(false);
      side_panel1.setVisible(false);
      Aboutus_panel.setVisible(false);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_view_bookActionPerformed

    private void Back_aboutusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Back_aboutusActionPerformed
//      Code for back button on about us panel.
      login_panel.setVisible(true);
      side_panel1.setVisible(true);
      Aboutus_panel.setVisible(false);
      reg_panel.setVisible(false);
      side_panel2.setVisible(false);
      welcome_panel.setVisible(false);
      show_book.setVisible(false);
      book_panel.setVisible(false);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_Back_aboutusActionPerformed

    private void book_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_book_backActionPerformed
//      Code for back button on book your parking panel.
      login_panel.setVisible(false);
      side_panel1.setVisible(false);
      Aboutus_panel.setVisible(false);
      reg_panel.setVisible(false);
      side_panel2.setVisible(true);
      welcome_panel.setVisible(true);
      show_book.setVisible(false);
      book_panel.setVisible(false);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_book_backActionPerformed

    private void show_book_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_show_book_backActionPerformed
//      Code for back button on View booking panel.
      login_panel.setVisible(false);
      side_panel1.setVisible(false);
      Aboutus_panel.setVisible(false);
      reg_panel.setVisible(false);
      side_panel2.setVisible(true);
      welcome_panel.setVisible(true);
      show_book.setVisible(false);
      book_panel.setVisible(false);
      slot_panel.setVisible(false);
      book_parking_panel.setVisible(false);
      rates_panel.setVisible(false);
    }//GEN-LAST:event_show_book_backActionPerformed

    private void slot_selectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot_selectActionPerformed
//      Code for select slot button.
      date = date_textfield.getText();
      time = String.valueOf(time_combobox.getSelectedItem());
      timeSlotIndex = time_combobox.getSelectedIndex();

      carNo = carNo_textfield.getText().toUpperCase();
//      Date and Car no validations.
      if (date.length() == 0 || time.equals("-select-") || carNo.length() == 0) {
        JOptionPane.showMessageDialog(this, "Enter all the Details.");
      }
      if (carNo.matches("^[A-Z]{2}[ -][0-9]{1,2}(?: [A-Z])?(?: [A-Z]*)? [0-9]{4}$")) {
        if (date.matches("^(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{2}$")) {

          login_panel.setVisible(false);
          side_panel1.setVisible(false);
          Aboutus_panel.setVisible(false);
          reg_panel.setVisible(false);

          side_panel2.setVisible(true);
          welcome_panel.setVisible(false);
          show_book.setVisible(false);

          slot_panel.setVisible(true);
          book_panel.setVisible(true);

          book_parking_panel.setVisible(false);

          slotCar_textfield.setText(carNo);
          slotTime_textfield.setText(time);
          slotDate_textfield.setText(date);

//              to colour the slot if it is booked
          if (flag[timeSlotIndex - 1][0] == 1) {
            slot1_button.setBackground(Color.red);
          }
          if (flag[timeSlotIndex - 1][1] == 1) {
            slot2_button.setBackground(Color.red);
          }
          if (flag[timeSlotIndex - 1][2] == 1) {
            slot3_button.setBackground(Color.red);
          }
          if (flag[timeSlotIndex - 1][3] == 1) {
            slot4_button.setBackground(Color.red);
          }
          if (flag[timeSlotIndex - 1][4] == 1) {
            slot5_button.setBackground(Color.red);
          }
          if (flag[timeSlotIndex - 1][5] == 1) {
            slot6_button.setBackground(Color.red);
          }
          if (flag[timeSlotIndex - 1][6] == 1) {
            slot7_button.setBackground(Color.red);
          }
          if (flag[timeSlotIndex - 1][7] == 1) {
            slot8_button.setBackground(Color.red);
          }
          if (flag[timeSlotIndex - 1][8] == 1) {
            slot9_button.setBackground(Color.red);
          }
        } else {
          JOptionPane.showMessageDialog(this, "Enter Proper Date.");
          date_textfield.setText("");
        }
      } else {
        JOptionPane.showMessageDialog(this, "Enter Proper Car No.");
        slotCar_textfield.setText("");
      }
    }//GEN-LAST:event_slot_selectActionPerformed

    private void confirm_slotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirm_slotActionPerformed
//      Code for confirm button on select slot panel.

//      To  validate if the slot and the payment is selected.
      if (slot_buttongroup.getSelection() != null) {
//            
//              checks if the slot is empty
        if (flag[timeSlotIndex - 1][slotNo - 1] != 1) {

          flag[timeSlotIndex - 1][slotNo - 1] = 1;
          JOptionPane.showMessageDialog(this, "confirmed booking");
          login_panel.setVisible(false);
          side_panel1.setVisible(false);
          Aboutus_panel.setVisible(false);
          reg_panel.setVisible(false);
          side_panel2.setVisible(true);

          welcome_panel.setVisible(false);
          show_book.setVisible(true);

          slot_panel.setVisible(false);
          book_panel.setVisible(false);

          book_parking_panel.setVisible(false);
          date_textfield.setText("");
          time_combobox.setSelectedIndex(0);
          carNo_textfield.setText("");

//             adding data to table
          String tableData[] = {slotCar_textfield.getText(), name, slotDate_textfield.getText(), slotTime_textfield.getText(), slotNo_textfield.getText(), price_textfield.getText()};

          DefaultTableModel table1 = (DefaultTableModel) book_table.getModel();
          table1.addRow(tableData);

          slotNo_textfield.setText("");
          price_textfield.setText("");

          slot1_button.setBackground(Color.white);
          slot2_button.setBackground(Color.white);
          slot3_button.setBackground(Color.white);
          slot4_button.setBackground(Color.white);
          slot5_button.setBackground(Color.white);
          slot6_button.setBackground(Color.white);
          slot7_button.setBackground(Color.white);
          slot8_button.setBackground(Color.white);
          slot9_button.setBackground(Color.white);
        } else {
//                  if the slot is already booked.
          JOptionPane.showMessageDialog(this, "Unavailable Slot");
          slotNo_textfield.setText("");
          price_textfield.setText("");
        }

      } else {
        JOptionPane.showMessageDialog(this, "Select a available slot");
      }
//      to clesr the selection.
      slot_buttongroup.clearSelection();


    }//GEN-LAST:event_confirm_slotActionPerformed

    private void slot_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot_backActionPerformed
//      Code for back button on the select slot panel.
      login_panel.setVisible(false);
      side_panel1.setVisible(false);
      Aboutus_panel.setVisible(false);
      reg_panel.setVisible(false);
      side_panel2.setVisible(true);
      welcome_panel.setVisible(false);
      show_book.setVisible(false);
      slot_panel.setVisible(false);
      book_panel.setVisible(true);
      book_parking_panel.setVisible(true);
    }//GEN-LAST:event_slot_backActionPerformed

//    Codes for slot buttons 

    private void slot5_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot5_buttonActionPerformed
      slotNo_textfield.setText("A5");
      price_textfield.setText("50");
      slotNo = 5;
      if (flag[timeSlotIndex - 1][slotNo - 1] == 1) {
        //slot5_button.setBackground(Color.red);
        slotNo_textfield.setText("");
        price_textfield.setText("");
      }
    }//GEN-LAST:event_slot5_buttonActionPerformed

    private void slot1_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot1_buttonActionPerformed
      slotNo_textfield.setText("A1");
      price_textfield.setText("100");
      slotNo = 1;
      if (flag[timeSlotIndex - 1][slotNo - 1] == 1) {
//            slot1_button.setBackground(Color.red);
        slotNo_textfield.setText("");
        price_textfield.setText("");
      }
    }//GEN-LAST:event_slot1_buttonActionPerformed

    private void slot2_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot2_buttonActionPerformed
      slotNo_textfield.setText("A2");
      price_textfield.setText("50");
      slotNo = 2;

      if (flag[timeSlotIndex - 1][slotNo - 1] == 1) {
//            slot2_button.setBackground(Color.red);
        slotNo_textfield.setText("");
        price_textfield.setText("");
      }
    }//GEN-LAST:event_slot2_buttonActionPerformed

    private void slot3_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot3_buttonActionPerformed
      slotNo_textfield.setText("A3");
      price_textfield.setText("150");
      slotNo = 3;

      if (flag[timeSlotIndex - 1][slotNo - 1] == 1) {
//            slot3_button.setBackground(Color.red);
        slotNo_textfield.setText("");
        price_textfield.setText("");
      }
    }//GEN-LAST:event_slot3_buttonActionPerformed

    private void slot4_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot4_buttonActionPerformed
      slotNo_textfield.setText("A4");
      price_textfield.setText("100");
      slotNo = 4;

      if (flag[timeSlotIndex - 1][slotNo - 1] == 1) {
//            slot4_button.setBackground(Color.red);
        slotNo_textfield.setText("");
        price_textfield.setText("");
      }
    }//GEN-LAST:event_slot4_buttonActionPerformed

    private void slot6_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot6_buttonActionPerformed
      slotNo_textfield.setText("A6");
      price_textfield.setText("150");
      slotNo = 6;

      if (flag[timeSlotIndex - 1][slotNo - 1] == 1) {
//            slot6_button.setBackground(Color.red);
        slotNo_textfield.setText("");
        price_textfield.setText("");
      }
    }//GEN-LAST:event_slot6_buttonActionPerformed

    private void slot7_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot7_buttonActionPerformed
      slotNo_textfield.setText("A7");
      price_textfield.setText("100");
      slotNo = 7;

      if (flag[timeSlotIndex - 1][slotNo - 1] == 1) {
//            slot7_button.setBackground(Color.red);
        slotNo_textfield.setText("");
        price_textfield.setText("");
      }
    }//GEN-LAST:event_slot7_buttonActionPerformed

    private void slot8_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot8_buttonActionPerformed
      slotNo_textfield.setText("A8");
      price_textfield.setText("50");
      slotNo = 8;

      if (flag[timeSlotIndex - 1][slotNo - 1] == 1) {
//            slot8_button.setBackground(Color.red);
        slotNo_textfield.setText("");
        price_textfield.setText("");
      }
    }//GEN-LAST:event_slot8_buttonActionPerformed

    private void slot9_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_slot9_buttonActionPerformed
      slotNo_textfield.setText("A9");
      price_textfield.setText("150");
      slotNo = 9;

      if (flag[timeSlotIndex - 1][slotNo - 1] == 1) {
//            slot9_button.setBackground(Color.red);
        slotNo_textfield.setText("");
        price_textfield.setText("");
      }
    }//GEN-LAST:event_slot9_buttonActionPerformed

    private void cancel_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_buttonActionPerformed
      slotNo_textfield.setText("");
      price_textfield.setText("");
      slotNo = 0;
    }//GEN-LAST:event_cancel_buttonActionPerformed

    private void price_textfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_price_textfieldActionPerformed
      // TODO add your handling code here:
    }//GEN-LAST:event_price_textfieldActionPerformed

    private void slot_panelFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_slot_panelFocusGained

    }//GEN-LAST:event_slot_panelFocusGained

  private void rates_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rates_btnActionPerformed
    login_panel.setVisible(false);
    side_panel1.setVisible(false);
    Aboutus_panel.setVisible(false);
    reg_panel.setVisible(false);
    side_panel2.setVisible(true);
    welcome_panel.setVisible(false);
    show_book.setVisible(false);
    book_panel.setVisible(false);
    slot_panel.setVisible(false);
    book_parking_panel.setVisible(false);
    rates_panel.setVisible(true);
  }//GEN-LAST:event_rates_btnActionPerformed

  private void rates_backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rates_backActionPerformed
    login_panel.setVisible(false);
    side_panel1.setVisible(false);
    Aboutus_panel.setVisible(false);
    reg_panel.setVisible(false);
    side_panel2.setVisible(true);
    welcome_panel.setVisible(true);
    show_book.setVisible(false);
    book_panel.setVisible(false);
    slot_panel.setVisible(false);
    book_parking_panel.setVisible(false);
    rates_panel.setVisible(false);
  }//GEN-LAST:event_rates_backActionPerformed

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
      java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (InstantiationException ex) {
      java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (IllegalAccessException ex) {
      java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
      java.util.logging.Logger.getLogger(main_frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
    }
    //</editor-fold>

    /* Create and display the form */
    java.awt.EventQueue.invokeLater(new Runnable() {
      @Override
      public void run() {
        new main_frame().setVisible(true);
      }
    });
  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel Aboutus_panel;
  private javax.swing.JButton Back_aboutus;
  private javax.swing.JOptionPane JOptionPane;
  private javax.swing.JButton about_us;
  private javax.swing.JTextField address_textfield;
  private javax.swing.JButton book_back;
  private javax.swing.JPanel book_panel;
  private javax.swing.JButton book_park;
  private javax.swing.JPanel book_parking_panel;
  private javax.swing.JTable book_table;
  private javax.swing.JToggleButton cancel_button;
  private javax.swing.JTextField carNo_textfield;
  private javax.swing.JButton confirm_btn;
  private javax.swing.JButton confirm_slot;
  private javax.swing.JTextField date_textfield;
  private javax.swing.JLabel email;
  private javax.swing.JTextField email_textfield;
  private javax.swing.JButton exit;
  private javax.swing.JButton home;
  private javax.swing.JButton home1;
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
  private javax.swing.JPanel jPanel6;
  private javax.swing.JPanel jPanel7;
  private javax.swing.JPanel jPanel8;
  private javax.swing.JPanel jPanel9;
  private javax.swing.JScrollPane jScrollPane1;
  private javax.swing.JScrollPane jScrollPane2;
  private javax.swing.JScrollPane jScrollPane3;
  private javax.swing.JTextPane jTextPane1;
  private javax.swing.JButton login;
  private javax.swing.JPanel login_panel;
  private javax.swing.JTextField login_phone_textfield;
  private javax.swing.JPasswordField login_pwd_textfield;
  private javax.swing.JButton logout;
  private javax.swing.JTextField name_textfield;
  private javax.swing.JTextField phone_textfield;
  private javax.swing.JTextField price_textfield;
  private javax.swing.JLabel pwd1;
  private javax.swing.JButton rates_back;
  private javax.swing.JButton rates_btn;
  private javax.swing.JPanel rates_panel;
  private javax.swing.JTable rates_table;
  private javax.swing.JButton reg_back_btn;
  private javax.swing.JPanel reg_form_panel;
  private javax.swing.JPanel reg_panel;
  private javax.swing.JPasswordField reg_pwd;
  private javax.swing.JButton register;
  private javax.swing.JPanel show_book;
  private javax.swing.JButton show_book_back;
  private javax.swing.JPanel side_panel1;
  private javax.swing.JPanel side_panel2;
  private javax.swing.JPanel side_panel_main;
  private javax.swing.JToggleButton slot1_button;
  private javax.swing.JToggleButton slot2_button;
  private javax.swing.JToggleButton slot3_button;
  private javax.swing.JToggleButton slot4_button;
  private javax.swing.JToggleButton slot5_button;
  private javax.swing.JToggleButton slot6_button;
  private javax.swing.JToggleButton slot7_button;
  private javax.swing.JToggleButton slot8_button;
  private javax.swing.JToggleButton slot9_button;
  private javax.swing.JTextField slotCar_textfield;
  private javax.swing.JTextField slotDate_textfield;
  private javax.swing.JTextField slotNo_textfield;
  private javax.swing.JTextField slotTime_textfield;
  private javax.swing.JButton slot_back;
  private javax.swing.ButtonGroup slot_buttongroup;
  private javax.swing.JPanel slot_panel;
  private javax.swing.JButton slot_select;
  private javax.swing.JPanel slot_select_panel;
  private javax.swing.JComboBox<String> time_combobox;
  private javax.swing.JButton view_book;
  private javax.swing.JLabel welcome_label;
  private javax.swing.JPanel welcome_panel;
  // End of variables declaration//GEN-END:variables
}
