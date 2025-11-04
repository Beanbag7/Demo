package gui;

import javax.swing.*;

public class JFrameDemo1 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("登录窗口");
        jFrame.setSize(400, 300);
        jFrame.setVisible(true);
        jFrame.setLocationRelativeTo(null);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JButton jButton = new JButton("登录");
        jFrame.add(jButton);
        jButton.setBounds(100, 100, 100, 50);
    }
}
