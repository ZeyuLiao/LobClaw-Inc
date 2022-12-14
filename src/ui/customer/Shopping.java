/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.customer;

import dao.GoodsDao;
import dao.InventoryDao;
import dao.StoreDao;
import static java.lang.Boolean.FALSE;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import model.Goods;
import model.Inventory;
import model.Store;
import model.Cart;

/**
 *
 * @author Ruolin
 */
public class Shopping extends javax.swing.JPanel {

    /**
     * Creates new form HomePage
     */
    int customerId;
    StoreDao sDao;
    InventoryDao iDao;
    GoodsDao gDao;
    Store store;
    Goods goods;
    Inventory buying;
    Cart cart;
    public Shopping(int customerId) {
        initComponents();
        this.customerId = customerId;
        this.sDao = new StoreDao();
        this.iDao = new InventoryDao();
        this.gDao = new GoodsDao();
        this.store = new Store();
        this.goods = new Goods();
        this.buying = new Inventory();
        this.cart = new Cart();
        try {
            showTableStore();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    private Object[] addTableRowStore(Object[] row,Store s){
        row[0] = s.getStoreName();

        return row;
    }
    private void showTableStore() throws Exception{
        DefaultTableModel model = (DefaultTableModel)jTableStore.getModel();
        model.setRowCount(0);
        
        ArrayList<Store> sList = sDao.getAllStore();
        for(Store s:sList){
            Object[] row = new Object[5];
            addTableRowStore(row,s);
            model.addRow(row);      
        }
    }
    
    private Object[] addTableRowGoods (Object[] row,Inventory inventory) throws Exception{
        row[0] = gDao.getGoodsById(inventory.getGoodsId()).getGoodsName();
        row[1] = inventory.getSellingPrice();

        return row;
    }
    private void showTableGoods(int storeId) throws Exception{
        DefaultTableModel model = (DefaultTableModel)jTableGoods.getModel();
        model.setRowCount(0);
        
        ArrayList<Inventory> ilist = iDao.getInventoryByStoreId(storeId);
        for(Inventory i:ilist){
            Object[] row = new Object[5];
            addTableRowGoods(row,i);
            model.addRow(row);      
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

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableStore = new javax.swing.JTable();
        jButtonChooseStore = new javax.swing.JButton();
        jButtonAddToCart = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableGoods = new javax.swing.JTable();
        jButtonChooseGoods = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabelStoreName = new javax.swing.JLabel();
        jLabelStock = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelGoodsName = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelPrice = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableCart = new javax.swing.JTable();

        setPreferredSize(new java.awt.Dimension(968, 429));

        jTableStore.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null},
                {null},
                {null},
                {null}
            },
            new String [] {
                "Store"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTableStore);

        jButtonChooseStore.setText("Choose Store");
        jButtonChooseStore.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseStoreActionPerformed(evt);
            }
        });

        jButtonAddToCart.setFont(new java.awt.Font("Segoe UI Variable", 1, 14)); // NOI18N
        jButtonAddToCart.setText("Add to Cart");
        jButtonAddToCart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddToCartActionPerformed(evt);
            }
        });

        jTableGoods.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Goods Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jTableGoods);

        jButtonChooseGoods.setText("Choose Goods");
        jButtonChooseGoods.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChooseGoodsActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Name:");

        jLabelStoreName.setFont(new java.awt.Font("Segoe UI", 2, 24)); // NOI18N

        jLabelStock.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setText("Quantity in stock:");

        jLabelGoodsName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setText("Price:");

        jLabelPrice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel4.setText("Quantity you want:");

        jTableCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Goods Name", "Price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(jTableCart);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChooseStore))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonChooseGoods))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelStock, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButtonAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(126, 126, 126))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(27, 27, 27)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabelGoodsName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 408, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jLabelStoreName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelGoodsName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelStock, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(19, 19, 19)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addComponent(jButtonAddToCart, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonChooseStore)
                    .addComponent(jButtonChooseGoods))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChooseStoreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseStoreActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jTableStore.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this,"Please select a store");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)jTableStore.getModel();
        //int storeId = Integer.parseInt(model.getValueAt(selectedIndex,0).toString());
        String storeName = model.getValueAt(selectedIndex,0).toString();
        try {
            this.store = sDao.getStoreByName(storeName);
            showTableGoods(store.getStoreId());
 
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButtonChooseStoreActionPerformed

    private void jButtonAddToCartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddToCartActionPerformed
        // TODO add your handling code here:
        int buyQuantity = Integer.parseInt(jSpinner1.getValue().toString());
        if(buyQuantity==0){
            JOptionPane.showMessageDialog(this," Quanitity can't be zero");
            return;
        }
        if(buyQuantity>Integer.parseInt(jLabelStock.getText().toString())){
            JOptionPane.showMessageDialog(this," Quanitity can't surpass the stock");
            return;
        }
        buying.setGoodsId(goods.getGoodsId());
        buying.setQuantity(buyQuantity);
        buying.setStoreId(store.getStoreId());
        buying.setSellingPrice(Integer.parseInt(jLabelPrice.getText().toString()));
        cart.cartList.get(store.getStoreId()).add(buying);
        JOptionPane.showMessageDialog(this,"Successfully.");
        jLabelGoodsName.setText("");
        jLabelStoreName.setText("");
        jLabelPrice.setText("");
        jLabelStock.setText("");
        
    }//GEN-LAST:event_jButtonAddToCartActionPerformed

    private void jButtonChooseGoodsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChooseGoodsActionPerformed
        // TODO add your handling code here:
        int selectedIndex = jTableGoods.getSelectedRow();
        if(selectedIndex < 0){
            JOptionPane.showMessageDialog(this,"Please select a goods");
            return;
        }
        DefaultTableModel model = (DefaultTableModel)jTableGoods.getModel();
        //int storeId = Integer.parseInt(model.getValueAt(selectedIndex,0).toString());
        String goodsName = model.getValueAt(selectedIndex,0).toString();
        try {
            this.goods = gDao.getGoodsByName(goodsName);
            Inventory i = iDao.getInventoryByStoreIdAndGoodsId(store.getStoreId(), goods.getGoodsId());
            jLabelGoodsName.setText(goodsName);
            jLabelStoreName.setText(store.getStoreName());
            jLabelPrice.setText(i.getSellingPrice()+"");
            jLabelStock.setText(i.getQuantity()+"");
            
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        
        
        
        
    }//GEN-LAST:event_jButtonChooseGoodsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddToCart;
    private javax.swing.JButton jButtonChooseGoods;
    private javax.swing.JButton jButtonChooseStore;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelGoodsName;
    private javax.swing.JLabel jLabelPrice;
    private javax.swing.JLabel jLabelStock;
    private javax.swing.JLabel jLabelStoreName;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTable jTableCart;
    private javax.swing.JTable jTableGoods;
    private javax.swing.JTable jTableStore;
    // End of variables declaration//GEN-END:variables
}
