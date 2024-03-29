
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainUI {
    public JFrame view;

    public JButton btnManageProduct = new JButton("Manage Products");
    public JButton btnManageCustomer = new JButton("Manage Customer");
    public JButton btnManagePurchase = new JButton("Manage Purchase");

    public JButton btnAddProduct = new JButton("Add New Product");
    public JButton btnAddCustomer = new JButton("Add New Customer");
    public JButton btnAddPurchase = new JButton("Add New Purchase");



    public MainUI() {
        this.view = new JFrame();

        view.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        view.setTitle("Store Management System");
        view.setSize(1000, 600);
        view.getContentPane().setLayout(new BoxLayout(view.getContentPane(), BoxLayout.PAGE_AXIS));

        JLabel title = new JLabel("Store Management System");

        title.setFont (title.getFont ().deriveFont (24.0f));
        view.getContentPane().add(title);

        JPanel panelButtons = new JPanel(new FlowLayout());
        panelButtons.add(btnManageProduct);
        panelButtons.add(btnManageCustomer);
        panelButtons.add(btnManagePurchase);

        panelButtons.add(btnAddProduct);
        panelButtons.add(btnAddCustomer);
        panelButtons.add(btnAddPurchase);

        view.getContentPane().add(panelButtons);

        btnManageProduct.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ManageProductUI ui = new ManageProductUI();
                ui.run();
            }
        });

        btnManageCustomer.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManageCustomerUI ui = new ManageCustomerUI();
                ui.run();
            }
        });

        btnManagePurchase.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ManagePurchaseUI ui = new ManagePurchaseUI();
                ui.run();
            }
        });

        btnAddProduct.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AddProductUI ap = new AddProductUI();
                ap.run();
            }
        });

        btnAddCustomer.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AddCustomerUI ap = new AddCustomerUI();
                ap.run();
            }
        });

        btnAddPurchase.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                AddPurchaseUI ap = new AddPurchaseUI();
                ap.run();
            }
        });



    }
}
