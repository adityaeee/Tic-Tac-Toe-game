
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS A409F
 */
public class TIC_TAC_TOE_GAME extends javax.swing.JFrame {
    
    private String startGame = "X";
    private int xCount = 0;
    private int oCount = 0;
    private int draw = 0;

    /**
     * Creates new form TIC_TAC_TOE_GAME
     */
    
    public TIC_TAC_TOE_GAME() {
        initComponents();
    }
    
    private void gameScore(){
        
        playerxxx.setText(String.valueOf(xCount));
        playerooo.setText(String.valueOf(oCount));
    }

    
    
    private void choose_a_player(){        
        
        if(startGame.equalsIgnoreCase("X")){
            startGame = "O";
            txtturn.setText("Player O turn");
        }else{
            startGame = "X";
            txtturn.setText("Player X turn");
        }
    }


    private void Draw(){
        
        draw++;
        if(draw == 9){
            
            txtbtn1.setBackground(Color.YELLOW);
            txtbtn2.setBackground(Color.YELLOW);
            txtbtn3.setBackground(Color.YELLOW);

            txtbtn4.setBackground(Color.YELLOW);
            txtbtn5.setBackground(Color.YELLOW);
            txtbtn6.setBackground(Color.YELLOW);

            txtbtn7.setBackground(Color.YELLOW);
            txtbtn8.setBackground(Color.YELLOW);
            txtbtn9.setBackground(Color.YELLOW);
            
            JOptionPane.showMessageDialog(this, "DRAWWWW!!!", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            draw = 0;
        }
    }
    
    
    private void WinningGame(){
        
        String b1 = txtbtn1.getText();
        String b2 = txtbtn2.getText();
        String b3 = txtbtn3.getText();
        
        String b4 = txtbtn4.getText();
        String b5 = txtbtn5.getText();
        String b6 = txtbtn6.getText();
        
        String b7 = txtbtn7.getText();
        String b8 = txtbtn8.getText();
        String b9 = txtbtn9.getText();
        
        
        //PLAYER X CODING 
        //HORIZONTAL              
        if(b1 == ("X") && b2 == ("X") && b3 == ("X")){

            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            draw = 0;
            gameScore(); 
        }
        
        if(b4 == ("X") && b5 == ("X") && b6 == ("X")){
            
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            draw = 0;
            gameScore();
            
        }
        
        if(b7 == ("X") && b8 == ("X") && b9 == ("X")){
            
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            draw = 0;
            gameScore();
            
        }
        
        //VERTIKAL
        if(b1 == ("X") && b4 == ("X") && b7 == ("X")){
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            draw = 0;
            gameScore();
            
        }
        
        if(b2 == ("X") && b5 == ("X") && b8 == ("X")){

            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            draw = 0;
            gameScore();
            
        }
        
        if(b3 == ("X") && b6 == ("X") && b9 == ("X")){
            
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            draw = 0;
            gameScore();
            
        }
        
        //DIAGONAL
        if(b1 == ("X") && b5 == ("X") && b9 == ("X")){
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
             JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            draw = 0;
            gameScore();
            
        }
        
        if(b3 == ("X") && b5 == ("X") && b7 == ("X")){

            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player X WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            xCount ++;
            draw = 0;
            gameScore();
        }
        

        //PLAYER O WIN
        //HORIZONTAL              
        if(b1 == ("O") && b2 == ("O") && b3 == ("O")){

            txtbtn1.setBackground(Color.ORANGE);
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn3.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe",JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            draw = 0;
            gameScore(); 
            
        }
        
        if(b4 == ("O") && b5 == ("O") && b6 == ("O")){
            
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            draw = 0;
            gameScore();
            
        }
        
        if(b7 == ("O") && b8 == ("O") && b9 == ("O")){
            
            txtbtn7.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            draw = 0;
            gameScore();
        }
            
        //VERTIKAL
        if(b1 == ("O") && b4 == ("O") && b7 == ("O")){
            
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn4.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            draw = 0;
            gameScore();
            
        }
        
        if(b2 == ("O") && b5 == ("O") && b8 == ("O")){
            
            txtbtn2.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn8.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            draw = 0;
            gameScore();
            
        }
        
        if(b3 == ("O") && b6 == ("O") && b9 == ("O")){
            
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn6.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            draw = 0;
            gameScore(); 
        }
        
        //DIAGONAL
        if(b1 == ("O") && b5 == ("O") && b9 == ("O")){
          
            txtbtn1.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn9.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            draw = 0;
            gameScore();
        }
        
        if(b3 == ("O") && b5 == ("O") && b7 == ("O")){
            
            txtbtn3.setBackground(Color.ORANGE);
            txtbtn5.setBackground(Color.ORANGE);
            txtbtn7.setBackground(Color.ORANGE);
            
            JOptionPane.showMessageDialog(this, "Player O WIN", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
            oCount ++;
            draw = 0;
            gameScore();
            }
        
        }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtbtn3 = new javax.swing.JButton();
        txtbtn1 = new javax.swing.JButton();
        txtbtn2 = new javax.swing.JButton();
        txtbtn6 = new javax.swing.JButton();
        txtbtn4 = new javax.swing.JButton();
        txtbtn5 = new javax.swing.JButton();
        txtexit = new javax.swing.JButton();
        txtbtn7 = new javax.swing.JButton();
        txtbtn8 = new javax.swing.JButton();
        txtbtn9 = new javax.swing.JButton();
        txtreset = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        playerx = new javax.swing.JLabel();
        playero = new javax.swing.JLabel();
        playerooo = new javax.swing.JLabel();
        playerxxx = new javax.swing.JLabel();
        txtturn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("TIC TAC TOE");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TIC TAC TOE GAME");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(253, 253, 253))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        txtbtn3.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn3ActionPerformed(evt);
            }
        });

        txtbtn1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn1ActionPerformed(evt);
            }
        });

        txtbtn2.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn2ActionPerformed(evt);
            }
        });

        txtbtn6.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn6ActionPerformed(evt);
            }
        });

        txtbtn4.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn4ActionPerformed(evt);
            }
        });

        txtbtn5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn5ActionPerformed(evt);
            }
        });

        txtexit.setBackground(new java.awt.Color(255, 51, 51));
        txtexit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtexit.setText("EXIT");
        txtexit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtexitActionPerformed(evt);
            }
        });

        txtbtn7.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn7ActionPerformed(evt);
            }
        });

        txtbtn8.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn8ActionPerformed(evt);
            }
        });

        txtbtn9.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        txtbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbtn9ActionPerformed(evt);
            }
        });

        txtreset.setBackground(new java.awt.Color(153, 255, 153));
        txtreset.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtreset.setText("RESET");
        txtreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtresetActionPerformed(evt);
            }
        });

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(java.awt.Color.lightGray, java.awt.Color.darkGray));

        playerx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerx.setText("Player X : ");

        playero.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playero.setText("Player O : ");

        playerooo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerooo.setForeground(new java.awt.Color(0, 51, 255));
        playerooo.setText("00000000000");

        playerxxx.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        playerxxx.setForeground(new java.awt.Color(0, 0, 255));
        playerxxx.setText("00000000000");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playero)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(playerx)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playerx, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerxxx, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(playero, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(playerooo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        txtturn.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtturn.setText("Player X turn");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addComponent(txtturn)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(txtturn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtbtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtbtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtexit, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtreset, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtexitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtexitActionPerformed
        // TODO add your handling code here:
        JFrame frame = new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(frame, "Confirmasi jika anda ingin keluar"
        ,"TIC TAC TOE", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_txtexitActionPerformed

    private void txtbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn1ActionPerformed
        // TODO add your handling code here:
        
        txtbtn1.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txtbtn1.setForeground(Color.red);
        }else{
            txtbtn1.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        WinningGame();
        Draw();
    }//GEN-LAST:event_txtbtn1ActionPerformed

    private void txtbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn2ActionPerformed
        // TODO add your handling code here:
        
        txtbtn2.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txtbtn2.setForeground(Color.red);
        }else{
            txtbtn2.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        WinningGame();
        Draw();
    }//GEN-LAST:event_txtbtn2ActionPerformed

    private void txtbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn3ActionPerformed
        // TODO add your handling code here:
        
        txtbtn3.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txtbtn3.setForeground(Color.red);
        }else{
            txtbtn3.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        WinningGame();
        Draw();
    }//GEN-LAST:event_txtbtn3ActionPerformed

    private void txtbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn4ActionPerformed
        // TODO add your handling code here:
        
        txtbtn4.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txtbtn4.setForeground(Color.red);
        }else{
            txtbtn4.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        WinningGame();
        Draw();
    }//GEN-LAST:event_txtbtn4ActionPerformed

    private void txtbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn5ActionPerformed
        // TODO add your handling code here:
        
        txtbtn5.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txtbtn5.setForeground(Color.red);
        }else{
            txtbtn5.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        WinningGame();
        Draw();
    }//GEN-LAST:event_txtbtn5ActionPerformed

    private void txtbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn6ActionPerformed
        // TODO add your handling code here:
        
        txtbtn6.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txtbtn6.setForeground(Color.red);
        }else{
            txtbtn6.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        WinningGame();
        Draw();
    }//GEN-LAST:event_txtbtn6ActionPerformed

    private void txtbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn7ActionPerformed
        // TODO add your handling code here:
        
        txtbtn7.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txtbtn7.setForeground(Color.red);
        }else{
            txtbtn7.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        WinningGame();
        Draw();
    }//GEN-LAST:event_txtbtn7ActionPerformed

    private void txtbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn8ActionPerformed
        // TODO add your handling code here:
        
        txtbtn8.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txtbtn8.setForeground(Color.red);
        }else{
            txtbtn8.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        WinningGame();
        Draw();
    }//GEN-LAST:event_txtbtn8ActionPerformed

    private void txtbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbtn9ActionPerformed
        // TODO add your handling code here:
        
        txtbtn9.setText(startGame);
        
        if(startGame.equalsIgnoreCase("X")){
            txtbtn9.setForeground(Color.red);
        }else{
            txtbtn9.setForeground(Color.MAGENTA);
        }
        
        choose_a_player();
        WinningGame();
        Draw();
    }//GEN-LAST:event_txtbtn9ActionPerformed

    private void txtresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtresetActionPerformed
        // TODO add your handling code here:
        
        txtbtn1.setText(null);
        txtbtn2.setText(null);
        txtbtn3.setText(null);
        
        txtbtn4.setText(null);
        txtbtn5.setText(null);
        txtbtn6.setText(null);
        
        txtbtn7.setText(null);
        txtbtn8.setText(null);
        txtbtn9.setText(null);
        
        txtbtn1.setBackground(Color.LIGHT_GRAY);
        txtbtn2.setBackground(Color.LIGHT_GRAY);
        txtbtn3.setBackground(Color.LIGHT_GRAY);
        
        txtbtn4.setBackground(Color.LIGHT_GRAY);
        txtbtn5.setBackground(Color.LIGHT_GRAY);
        txtbtn6.setBackground(Color.LIGHT_GRAY);
       
        txtbtn7.setBackground(Color.LIGHT_GRAY);
        txtbtn8.setBackground(Color.LIGHT_GRAY);
        txtbtn9.setBackground(Color.LIGHT_GRAY);
        draw = 0;
    }//GEN-LAST:event_txtresetActionPerformed

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
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TIC_TAC_TOE_GAME.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TIC_TAC_TOE_GAME().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel playero;
    private javax.swing.JLabel playerooo;
    private javax.swing.JLabel playerx;
    private javax.swing.JLabel playerxxx;
    private javax.swing.JButton txtbtn1;
    private javax.swing.JButton txtbtn2;
    private javax.swing.JButton txtbtn3;
    private javax.swing.JButton txtbtn4;
    private javax.swing.JButton txtbtn5;
    private javax.swing.JButton txtbtn6;
    private javax.swing.JButton txtbtn7;
    private javax.swing.JButton txtbtn8;
    private javax.swing.JButton txtbtn9;
    private javax.swing.JButton txtexit;
    private javax.swing.JButton txtreset;
    private javax.swing.JLabel txtturn;
    // End of variables declaration//GEN-END:variables

//    private void initComponents() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
}