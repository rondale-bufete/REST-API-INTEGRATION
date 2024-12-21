package com.example.gamestoresystem;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class DisplayInventory extends javax.swing.JFrame {

    public DisplayInventory() {
        initComponents();
        DisplayInventory();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        addGameScreen = new javax.swing.JButton();
        showInventoryTable = new javax.swing.JButton();
        updateInventoryScreen = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
        searchBar = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("STORE INVENTORY");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(222, 242, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        inventoryTable.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 16)); // NOI18N
        inventoryTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "TITLE", "DEVELOPER", "GENRE", "RELEASE DATE", "PLATFORM", "PRICE", "STOCKS"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
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
            inventoryTable.getColumnModel().getColumn(5).setResizable(false);
            inventoryTable.getColumnModel().getColumn(6).setResizable(false);
            inventoryTable.getColumnModel().getColumn(7).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 1130, 400));

        jPanel3.setBackground(new java.awt.Color(222, 242, 242));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        addGameScreen.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        addGameScreen.setText("ADD TO INVENTORY");
        addGameScreen.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        addGameScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        addGameScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addGameScreenActionPerformed(evt);
            }
        });
        jPanel3.add(addGameScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 30, 220, 50));

        showInventoryTable.setBackground(new java.awt.Color(222, 242, 242));
        showInventoryTable.setFont(new java.awt.Font("Monospaced", 1, 16)); // NOI18N
        showInventoryTable.setText("SHOW INVENTORY");
        showInventoryTable.setBorder(null);
        showInventoryTable.setContentAreaFilled(false);
        showInventoryTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 880, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 50, -1, 30));
        jPanel3.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, -1, 40));

        jPanel6.setBackground(new java.awt.Color(222, 242, 242));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1150, 80));

        searchBar.setFont(new java.awt.Font("Monospaced", 1, 12)); // NOI18N
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchBarKeyTyped(evt);
            }
        });
        jPanel1.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 170, 570, 40));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("SEARCH: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 170, 100, 40));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("STORE INVENTORY");
        jPanel5.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 410, 50));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 420, 50));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE GAME INVENTORY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 6, 1160, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addGameScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGameScreenActionPerformed
        new AddItemScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_addGameScreenActionPerformed

    private void showInventoryTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInventoryTableActionPerformed
        
    }//GEN-LAST:event_showInventoryTableActionPerformed

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
    
    //FETCH AND DISPLAY TABLE FROM THE DATABSE USING HTTP REQUEST THROUGH API
    public void DisplayInventory() {
        DefaultTableModel tableModel =  (DefaultTableModel)inventoryTable.getModel();
        try {
            // Send GET request with the URI AND ESTABLISH CONNECT WITH THE API
            String apiUrl = "http://localhost:8080/games/get/all";
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("GET");

            // Read the response
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
                    int id = game.getInt("id");
                    String title = game.getString("title");
                    String developer = game.getString("developer");
                    String genre = game.getString("genre");
                    String releaseDate = game.getString("releaseDate");
                    String platform = game.getString("platform");
                    int price = game.getInt("price");
                    int stocks = game.getInt("stocks");

                    tableModel.addRow(new Object[]{id, title, developer, genre, releaseDate, platform, price, stocks});
                }
                
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
        }
    }
    
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DisplayInventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addGameScreen;
    private javax.swing.JTable inventoryTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton showInventoryTable;
    private javax.swing.JButton updateInventoryScreen;
    // End of variables declaration//GEN-END:variables
}
