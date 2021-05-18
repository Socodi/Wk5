import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppWindow {
    private JLabel lblMessage;
    private JLabel lblName;
    private JPanel pnlMain;
    private JTextField txtName;
    private JButton btnReset;
    private JButton btnSubmit;

    public AppWindow() {
        btnReset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Console output for debugging
                System.out.println("------------------");
                System.out.println("btnReset clicked at " + e.getWhen());
                // End

                // Action
                lblMessage.setText("Pending...");
                txtName.setText("");
            }
        });
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Console output for debugging
                System.out.println("------------------");
                System.out.println("btnSubmit clicked");
                System.out.println("txtName value: " + txtName.getText());
                // End

                // Action
                lblMessage.setText("Hello " + txtName.getText());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("AppWindow");
        frame.setContentPane(new AppWindow().pnlMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(400,400);
        frame.setVisible(true);

        // Primitive Variable example
//        String[] names = {"Jamie", "Abi", "Charlie"};
//        System.out.println(names[1]);
//
//        String abi = names[1];
//        System.out.println(abi);
//
//        abi = "Joseph";
//
//        System.out.println(names[1]);
//        System.out.println(abi);
        // End



    }
}