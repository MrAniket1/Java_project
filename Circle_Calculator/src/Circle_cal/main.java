package Circle_cal;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class main extends JFrame {
    private JTextField txtRadius;
    private JTextField txtDiameter;
    private JTextField txtCircumference;
    private JTextField txtArea;
    private JButton CALCULATEButton;
    private JButton CLEARButton;
    private JPanel MainPanel;

    public main() {
        CALCULATEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                try {
                    String r = txtRadius.getText();
                    String d = txtDiameter.getText();
                    String c = txtCircumference.getText();
                    String a = txtArea.getText();

                    if (r.equals("")) {
                        r = "0";
                    }
                    if (d.equals("")) {
                        d = "0";
                    }
                    if (c.equals("")) {
                        c = "0";
                    }
                    if (a.equals("")) {
                        a = "0";
                    }

                    double R, D, C, A, area, diameter, radius, circumference;

                    R = Double.valueOf(r);
                    D = Double.valueOf(d);
                    C = Double.valueOf(c);
                    A = Double.valueOf(a);

                    if (R > 0) {
                        radius = R;
                        diameter = R + R;
                        circumference = 2 * Math.PI * R;
                        area = Math.PI * R * R;

                        txtArea.setText(Double.toString(area));
                        txtRadius.setText(Double.toString(radius));
                        txtDiameter.setText(Double.toString(diameter));
                        txtCircumference.setText(Double.toString(circumference));

                    } else if (D > 0) {
                        radius = D / 2;
                        diameter = D;
                        circumference = 2 * Math.PI * radius;
                        area = Math.PI * radius * radius;

                        txtArea.setText(Double.toString(area));
                        txtRadius.setText(Double.toString(radius));
                        txtDiameter.setText(Double.toString(diameter));
                        txtCircumference.setText(Double.toString(circumference));

                    } else if (C > 0) {
                        radius = C / (2 * Math.PI);
                        diameter = radius + radius;
                        circumference = C;
                        area = Math.PI * radius * radius;

                        txtArea.setText(Double.toString(area));
                        txtRadius.setText(Double.toString(radius));
                        txtDiameter.setText(Double.toString(diameter));
                        txtCircumference.setText(Double.toString(circumference));

                    } else if (A > 0) {
                        radius = Math.sqrt(A / Math.PI);
                        diameter = radius + radius;
                        circumference = 2 * Math.PI * radius;
                        area = A;

                        txtArea.setText(Double.toString(area));
                        txtRadius.setText(Double.toString(radius));
                        txtDiameter.setText(Double.toString(diameter));
                        txtCircumference.setText(Double.toString(circumference));
                    } else {
                        JOptionPane.showMessageDialog(null, "(0 Zero) Can Not Form Circle");
                    }

                    JOptionPane.showMessageDialog(null, "Done");

                } catch (NumberFormatException nex){
                    JOptionPane.showMessageDialog(null, "Please Enter Valid Numbers");
                }

                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex);
                }


            }
        });
    }

    public static void main(String[] args) {

        main frame = new main();
        frame.setVisible(true);
        frame.setContentPane(frame.MainPanel);

//        uncomment below code if you dont want your panel to make resizable
//        frame.setResizable(false);
        frame.pack();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

    }
}
