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

public class UpdateItemScreen extends javax.swing.JFrame {
    public UpdateItemScreen() {
        initComponents();
        DisplayInventory();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator2 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        addGameScreen = new javax.swing.JButton();
        showInventoryTable = new javax.swing.JButton();
        updateInventoryScreen = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel6 = new javax.swing.JPanel();
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
        addDeveloper = new javax.swing.JTextField();
        addGenre = new javax.swing.JTextField();
        addDate = new javax.swing.JTextField();
        addPlatform = new javax.swing.JTextField();
        addPrice = new javax.swing.JTextField();
        addStocks = new javax.swing.JTextField();
        addTitle = new javax.swing.JTextField();
        clearButton = new javax.swing.JButton();
        UpdateSelected = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        deleteItem = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("UPDATE AN ITEM");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(222, 242, 242));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Monospaced", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MANAGE GAME INVENTORY");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-5, 6, 1160, 60));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 70));

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
        updateInventoryScreen.setBorder(null);
        updateInventoryScreen.setContentAreaFilled(false);
        updateInventoryScreen.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        updateInventoryScreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateInventoryScreenActionPerformed(evt);
            }
        });
        jPanel3.add(updateInventoryScreen, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 30, 220, 50));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 30, 880, 10));

        jPanel6.setBackground(new java.awt.Color(222, 242, 242));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1160, 30));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 1150, 80));

        inventoryTable.setFont(new java.awt.Font("Microsoft Yi Baiti", 1, 14)); // NOI18N
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
        inventoryTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                inventoryTableMouseClicked(evt);
            }
        });
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

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 210, 690, 370));

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("SEARCH: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 160, 100, 40));

        searchBar.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        searchBar.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        searchBar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchBarKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                searchBarKeyTyped(evt);
            }
        });
        jPanel1.add(searchBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, 560, 40));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("DEVELOPER: ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 140, 40));

        jLabel5.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("GENRE: ");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 140, 40));

        jLabel6.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("RELEASED DATE: ");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 140, 40));

        jLabel7.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("PLATFORM: ");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 140, 40));

        jLabel8.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("PRICE: ");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 140, 40));

        jLabel9.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("STOCKS: ");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 140, 40));

        addDeveloper.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addDeveloper.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel4.add(addDeveloper, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 250, 40));

        addGenre.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addGenre.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel4.add(addGenre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, 250, 40));

        addDate.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addDate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel4.add(addDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 210, 250, 40));

        addPlatform.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addPlatform.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel4.add(addPlatform, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 260, 250, 40));

        addPrice.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addPrice.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel4.add(addPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 310, 250, 40));

        addStocks.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addStocks.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel4.add(addStocks, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 250, 40));

        addTitle.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        addTitle.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        jPanel4.add(addTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 250, 40));

        clearButton.setBackground(new java.awt.Color(153, 51, 0));
        clearButton.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        clearButton.setForeground(new java.awt.Color(255, 255, 255));
        clearButton.setText("CANCEL");
        clearButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearButton.setEnabled(false);
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });
        jPanel4.add(clearButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 90, 40));

        UpdateSelected.setBackground(new java.awt.Color(0, 102, 51));
        UpdateSelected.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        UpdateSelected.setForeground(new java.awt.Color(255, 255, 255));
        UpdateSelected.setText("UPDATE GAME");
        UpdateSelected.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateSelected.setEnabled(false);
        UpdateSelected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateSelectedActionPerformed(evt);
            }
        });
        jPanel4.add(UpdateSelected, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 410, 150, 40));

        jPanel5.setBackground(new java.awt.Color(0, 0, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setText("MAKE AN UPDATE");
        jPanel5.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 50));

        jPanel4.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 430, 50));

        jLabel11.setFont(new java.awt.Font("Monospaced", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel11.setText("TITLE: ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 140, 40));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 430, 470));

        deleteItem.setBackground(new java.awt.Color(153, 51, 0));
        deleteItem.setFont(new java.awt.Font("Monospaced", 1, 14)); // NOI18N
        deleteItem.setForeground(new java.awt.Color(255, 255, 255));
        deleteItem.setText("DELETE SELECTED ITEM");
        deleteItem.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        deleteItem.setEnabled(false);
        deleteItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteItemActionPerformed(evt);
            }
        });
        jPanel1.add(deleteItem, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 590, 690, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void addGameScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addGameScreenActionPerformed
        new AddItemScreen().setVisible(true);
        dispose();
    }//GEN-LAST:event_addGameScreenActionPerformed

    private void showInventoryTableActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showInventoryTableActionPerformed
        new DisplayInventory().setVisible(true);
        dispose();
    }//GEN-LAST:event_showInventoryTableActionPerformed

    private void updateInventoryScreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateInventoryScreenActionPerformed
        int selectedRow = inventoryTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a game to update.");
            return;
        }

        try {
            // Show confirmation dialog before sending the request
            int answer = JOptionPane.showConfirmDialog(null, "Confirm changes?", "Update Game", JOptionPane.YES_NO_OPTION);
            if (answer != JOptionPane.YES_OPTION) {
                return;
            }

            // Get the ID of the selected row
            String gameId = inventoryTable.getValueAt(selectedRow, 0).toString();

            // Prepare JSON Object with updated data
            JSONObject json = new JSONObject();
            json.put("title", addTitle.getText());
            json.put("developer", addDeveloper.getText());
            json.put("genre", addGenre.getText());
            json.put("releaseDate", addDate.getText());
            json.put("platform", addPlatform.getText());
            json.put("price", Integer.parseInt(addPrice.getText()));
            json.put("stocks", Integer.parseInt(addStocks.getText()));

            // Send PUT request with the URI and establish connection with the API
            String apiUrl = "http://localhost:8080/games/update/" + gameId;
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("PUT");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setDoOutput(true);

            // Write JSON payload to the request body
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Check if the response from the server is successful
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_NO_CONTENT) {
                JOptionPane.showMessageDialog(null, "Game updated successfully!");

                // Update the table row with new values
                String[] updatedValues = {
                    addTitle.getText(),
                    addDeveloper.getText(),
                    addGenre.getText(),
                    addDate.getText(),
                    addPlatform.getText(),
                    addPrice.getText(),
                    addStocks.getText()
                };

                for (int i = 1; i < updatedValues.length + 1; i++) {
                    inventoryTable.setValueAt(updatedValues[i - 1], selectedRow, i);
                }

                // Refresh the table or any dependent UI
                DisplayInventory();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update the game. Response Code: " + responseCode);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
    }//GEN-LAST:event_updateInventoryScreenActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        clearInput();
    }//GEN-LAST:event_clearButtonActionPerformed

    private void UpdateSelectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateSelectedActionPerformed
        int selectedRow = inventoryTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a game to update.");
            return;
        }

        try {
            // Show confirmation dialog before sending the request
            int answer = JOptionPane.showConfirmDialog(null, "Confirm changes?", "Update Game", JOptionPane.YES_NO_OPTION);
            if (answer != JOptionPane.YES_OPTION) {
                return;
            }

            // Get the ID of the selected row
            String gameId = inventoryTable.getValueAt(selectedRow, 0).toString();

            // Prepare JSON Object with updated data
            JSONObject json = new JSONObject();
            json.put("title", addTitle.getText());
            json.put("developer", addDeveloper.getText());
            json.put("genre", addGenre.getText());
            json.put("releaseDate", addDate.getText());
            json.put("platform", addPlatform.getText());
            json.put("price", Integer.parseInt(addPrice.getText()));
            json.put("stocks", Integer.parseInt(addStocks.getText()));

            // Send PUT request with the URI and establish connection with the API
            String apiUrl = "http://localhost:8080/games/update/" + gameId;
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("PUT");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");
            connection.setDoOutput(true);

            // Write JSON payload to the request body
            try (OutputStream os = connection.getOutputStream()) {
                byte[] input = json.toString().getBytes("utf-8");
                os.write(input, 0, input.length);
            }

            // Check if the response from the server is successful
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_NO_CONTENT) {
                JOptionPane.showMessageDialog(null, "Game updated successfully!");

                // Update the table row with new values
                String[] updatedValues = {
                    addTitle.getText(),
                    addDeveloper.getText(),
                    addGenre.getText(),
                    addDate.getText(),
                    addPlatform.getText(),
                    addPrice.getText(),
                    addStocks.getText()
                };

                for (int i = 1; i < updatedValues.length + 1; i++) {
                    inventoryTable.setValueAt(updatedValues[i - 1], selectedRow, i);
                }

                // Refresh the table or any dependent UI
                DisplayInventory();
            } else {
                JOptionPane.showMessageDialog(null, "Failed to update the game. Response Code: " + responseCode);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
        }
        clearInput();
    }//GEN-LAST:event_UpdateSelectedActionPerformed

    private void deleteItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteItemActionPerformed
        int selectedRow = inventoryTable.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(null, "Please select a game to delete.");
            return;
        }

        // Get the ID of the selected row
        String gameId = inventoryTable.getValueAt(selectedRow, 0).toString();

        // Confirm deletion
        int answer = JOptionPane.showConfirmDialog(null, "Delete selected item?", "Confirm Delete", JOptionPane.YES_NO_OPTION);
        if (answer != JOptionPane.YES_OPTION) {
            return; // Exit if the user cancels
        }

        try {
            // Prepare the DELETE request USING THE ID OF SELECTED ROW IN THE TABLE
            String apiUrl = "http://localhost:8080/games/delete/" + gameId;
            HttpURLConnection connection = (HttpURLConnection) new URL(apiUrl).openConnection();
            connection.setRequestMethod("DELETE");
            connection.setRequestProperty("Content-Type", "application/json; utf-8");

            // Send DELETE request with the URI AND ESTABLISH CONNECT WITH THE API
            int responseCode = connection.getResponseCode();
            connection.disconnect();

            // Handle the response
            if (responseCode == HttpURLConnection.HTTP_OK || responseCode == HttpURLConnection.HTTP_NO_CONTENT) {
                JOptionPane.showMessageDialog(null, "Game deleted successfully!");
                DisplayInventory();
                clearInput();// Refresh the inventory table
            } else {
                JOptionPane.showMessageDialog(null, "Failed to delete the game. Response Code: " + responseCode);
            }
            DisplayInventory();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_deleteItemActionPerformed

    private void inventoryTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_inventoryTableMouseClicked
       // FETCH THE DATA OF SELECTED ROW IN THE TABLE
        if (inventoryTable.getSelectedRow() != -1) {
            // Display fields with data from the selected row
            int selectedRow = inventoryTable.getSelectedRow();
            addTitle.setText(inventoryTable.getValueAt(selectedRow, 1).toString());
            addDeveloper.setText(inventoryTable.getValueAt(selectedRow, 2).toString());
            addGenre.setText(inventoryTable.getValueAt(selectedRow, 3).toString());
            addDate.setText(inventoryTable.getValueAt(selectedRow, 4).toString());
            addPlatform.setText(inventoryTable.getValueAt(selectedRow, 5).toString());
            addPrice.setText(inventoryTable.getValueAt(selectedRow, 6).toString());
            addStocks.setText(inventoryTable.getValueAt(selectedRow, 7).toString());
            
            UpdateSelected.setEnabled(true);
            deleteItem.setEnabled(true);
            clearButton.setEnabled(true);
        }

    }//GEN-LAST:event_inventoryTableMouseClicked

    private void searchBarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchBarKeyReleased
        
    }//GEN-LAST:event_searchBarKeyReleased

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
                    // Fetch data from the API
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

                        tableModel.addRow(new Object[]{id,title, developer, genre, releaseDate, platform, price, stocks});
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Error fetching data: " + ex.getMessage());
                }
    }
    
        //CLEAR INPUT FIELDS
        public void clearInput() {
            addTitle.setText("");
            addDeveloper.setText("");
            addGenre.setText("");
            addDate.setText("");
            addPlatform.setText("");
            addPrice.setText("");
            addStocks.setText("");
            deleteItem.setEnabled(false);
            UpdateSelected.setEnabled(false);
            clearButton.setEnabled(false);
        }
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(UpdateItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateItemScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateItemScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton UpdateSelected;
    private javax.swing.JTextField addDate;
    private javax.swing.JTextField addDeveloper;
    private javax.swing.JButton addGameScreen;
    private javax.swing.JTextField addGenre;
    private javax.swing.JTextField addPlatform;
    private javax.swing.JTextField addPrice;
    private javax.swing.JTextField addStocks;
    private javax.swing.JTextField addTitle;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton deleteItem;
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
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField searchBar;
    private javax.swing.JButton showInventoryTable;
    private javax.swing.JButton updateInventoryScreen;
    // End of variables declaration//GEN-END:variables
}
