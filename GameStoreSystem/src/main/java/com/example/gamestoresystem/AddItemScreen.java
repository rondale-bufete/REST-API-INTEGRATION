package com.example.gamestoresystem;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.json.JSONArray;
import org.json.JSONObject;


public class AddItemScreen extends javax.swing.JFrame {
    public AddItemScreen() {
        initComponents();
        DisplayInventory();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        addGameScreen = new javax.swing.JButton();
        showInventoryTable = new javax.swing.JButton();
        updateInventoryScreen = new javax.swing.JButton();
        jPanel6 = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        searchBar = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        addDeveloper = new javax.swing.JTextField();
        addGenre = new javax.swing.JTextField();
        addDate = new javax.swing.JTextField();
        addPlatform = new javax.swing.JTextField();
        addPrice = new javax.swing.JTextField();
        addStocks = new javax.swing.JTextField();
        addTitle = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        addNewGame = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD GAMES");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(222, 242, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(222, 242, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addGameScreen.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        addGameScreen.setText("ADD TO INVENTORY");
        addGameScreen.setBorder(null);
        addGameScreen.setContentAreaFilled(false);
        addGameScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addGameScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGameScreenActionPerformed(evt);
            }
        });
        jPanel3.add(addGameScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 220, 50));

        showInventoryTable.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        showInventoryTable.setText("SHOW INVENTORY");
        showInventoryTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        showInventoryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        showInventoryTable.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showInventoryTableActionPerformed(evt);
            }
        });
        jPanel3.add(showInventoryTable, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 30, 220, 50));

        updateInventoryScreen.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        updateInventoryScreen.setText("UPDATE INVENTORY");
        updateInventoryScreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updateInventoryScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        updateInventoryScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInventoryScreenActionPerformed(evt);
            }
        });
        jPanel3.add(updateInventoryScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 220, 50));

        jPanel6.setBackground(new java.awt.Color(222, 242, 242));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, 30));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 880, 10));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1150, 80));

        inventoryTable.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 14)); // NOI18N
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "TITLE", "GENRE", "RELEASE DATE", "PRICE", "STOCKS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        inventoryTable.setRowHeight(30);
        jScrollPane1.setViewportView(inventoryTable);
        if (inventoryTable.getColumnModel().getColumnCount() > 0) {
            inventoryTable.getColumnModel().getColumn(0).setResizable(false);
            inventoryTable.getColumnModel().getColumn(1).setResizable(false);
            inventoryTable.getColumnModel().getColumn(2).setResizable(false);
            inventoryTable.getColumnModel().getColumn(3).setResizable(false);
            inventoryTable.getColumnModel().getColumn(4).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 210, 540, 420));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("SEARCH: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 160, 100, 40));

        searchBar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                searchBarKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchBarKeyTyped(evt);
            }
        });
        jPanel1.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 160, 440, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DEVELOPER: ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 140, 40));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("GENRE: ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 140, 40));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("RELEASED DATE: ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 140, 40));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PLATFORM: ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 140, 40));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("PRICE: ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 140, 40));

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("STOCKS: ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 140, 40));

        jLabel10.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("TITLE: ");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 140, 40));

        addDeveloper.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPanel4.add(addDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 110, 350, 40));

        addGenre.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPanel4.add(addGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 350, 40));

        addDate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                addDateFocusGained(evt);
            }
        });
        jPanel4.add(addDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, 350, 40));

        addPlatform.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPanel4.add(addPlatform, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 260, 350, 40));

        addPrice.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPanel4.add(addPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 350, 40));

        addStocks.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPanel4.add(addStocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 350, 40));

        addTitle.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jPanel4.add(addTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 350, 40));

        clearButton.setBackground(new java.awt.Color(153, 51, 0));
        clearButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("CLEAR");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel4.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 150, 40));

        addNewGame.setBackground(new java.awt.Color(0, 102, 51));
        addNewGame.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addNewGame.setForeground(new java.awt.Color(255, 255, 255));
        addNewGame.setText("ADD GAME");
        addNewGame.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addNewGameActionPerformed(evt);
            }
        });
        jPanel4.add(addNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 410, 170, 40));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("ADD NEW GAME");
        jPanel5.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 50));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 570, 470));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE GAME INVENTORY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 6, 1160, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void showInventoryTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInventoryTableActionPerformed
        new DisplayInventory().setVisible(true);
        dispose();
    }//GEN-LAST:event_showInventoryTableActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearInput();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void addNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addNewGameActionPerformed
        try {
            // PREPARE JSON OBJECT FROM THE FIELD INPUT FOR POSTING
            JSONObject json = new JSONObject();
            json.put("title", addTitle.getText());
            json.put("developer", addDeveloper.getText());
            json.put("genre", addGenre.getText());
            json.put("releaseDate", addDate.getText());
            json.put("platform", addPlatform.getText());
            json.put("price", Integer.parseInt(addPrice.getText()));
            json.put("stocks", Integer.parseInt(addStocks.getText()));

            // Send POST request with the URI AND ESTABLISH CONNECT WITH THE API
            String apiUrl = "http://localhost:8080/games/add";
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setDoOutput(true);
            
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }
            
            //CHECK IF URI RESPONSE IS GOOD, THEN PROCEED
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_CREATED) {
                JOptionPane.showMessageDialog(null, "Game added successfully!");
                DisplayInventory();
                // Optionally clear fields after successful addition
                clearButton.doClick();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to add game. Response Code: " + responseCode);
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_addNewGameActionPerformed

    private void addGameScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGameScreenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addGameScreenActionPerformed

    private void updateInventoryScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInventoryScreenActionPerformed
        new UpdateItemScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_updateInventoryScreenActionPerformed

    //SEARCH BAR FUNCTION
    private void searchBarKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyTyped
        String query = searchBar.getText().trim().toLowerCase();
                if (query.isEmpty()) {
                    DisplayInventory();
                    return;
                }
                //INITIALIZE TABLE CULUMNS
                String[] columnNames = {"ID", "Title", "Developer", "Genre", "Release Date", "Platform", "Price", "Stocks"};
                DefaultTableModel filteredModel = new DefaultTableModel(columnNames, 0);

                // Filter through rows
                for (int i = 0; i < inventoryTable.getRowCount(); i++) {
                    String id = inventoryTable.getValueAt(i, 0).toString();
                    String title = inventoryTable.getValueAt(i, 1).toString().toLowerCase();
                    String genre = inventoryTable.getValueAt(i, 3).toString().toLowerCase();
                    String releaseDate = inventoryTable.getValueAt(i, 4).toString();
                    String platform = inventoryTable.getValueAt(i, 5).toString().toLowerCase();
                    
                    //CHECK IF SEARCH BAR INPUT EXIST IN THE TABLE
                    if (id.contains(query) || title.contains(query) || genre.contains(query) || releaseDate.contains(query) || platform.contains(query)) {
                        filteredModel.addRow(new Object[]{
                                inventoryTable.getValueAt(i, 0),
                                inventoryTable.getValueAt(i, 1),
                                inventoryTable.getValueAt(i, 2),
                                inventoryTable.getValueAt(i, 3),
                                inventoryTable.getValueAt(i, 4),
                                inventoryTable.getValueAt(i, 5),                                                                            
                                inventoryTable.getValueAt(i, 6),
                                inventoryTable.getValueAt(i, 7)
                        });
                    }
                }

                if (filteredModel.getRowCount() > 0) {
                    inventoryTable.setModel(filteredModel);
                }
    }//GEN-LAST:event_searchBarKeyTyped

    private void addDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_addDateFocusGained

    }//GEN-LAST:event_addDateFocusGained

    private void searchBarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBarKeyPressed
    
    //FETCH AND DISPLAY TABLE FROM THE DATABSE USING HTTP REQUEST THROUGH API
    public void DisplayInventory() {
        DefaultTableModel tableModel =  (DefaultTableModel)inventoryTable.getModel();
        try {
            // Fetch data from the API
            String apiUrl = "http://localhost:8080/games/get/all";
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");

            // Read the URI response
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder response = new StringBuilder();

            String line;
            while ((line = reader.readLine()) != null) {
                response.append(line);
            }

            reader.close();

            // Handle and parse JSON Array & convert it to String
            JSONArray games = new JSONArray(response.toString());

            tableModel.setRowCount(0);

            // FILL THE TABLE WITH THE DATA THAT WERE FETCHED USING THE API
            for (int i = 0; i < games.length(); i++) {
                JSONObject game = games.getJSONObject(i);
                String title = game.getString("title");
                String genre = game.getString("genre");
                String date = game.getString("releaseDate");
                int price = game.getInt("price");
                int stocks = game.getInt("stocks");
                //configure table row display
                tableModel.addRow(new Object[]{title, genre, date, price, stocks });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage());
        }

    }
    //CLEAR FORMS
    public void clearInput() {
        addTitle.setText("");
        addDeveloper.setText("");
        addGenre.setText("");
        addDate.setText("");
        addPlatform.setText("");
        addPrice.setText("");
        addStocks.setText("");
    }
  
  
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
            java.util.logging.Logger.getLogger(AddItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddItemScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField addDate;
    private javax.swing.JTextField addDeveloper;
    private javax.swing.JButton addGameScreen;
    private javax.swing.JTextField addGenre;
    private javax.swing.JButton addNewGame;
    private javax.swing.JTextField addPlatform;
    private javax.swing.JTextField addPrice;
    private javax.swing.JTextField addStocks;
    private javax.swing.JTextField addTitle;
    private javax.swing.JButton clearButton;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton showInventoryTable;
    private javax.swing.JButton updateInventoryScreen;
    // End of variables declaration//GEN-END:variables
}
