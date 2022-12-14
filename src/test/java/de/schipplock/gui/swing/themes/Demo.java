/*
 * Copyright 2022 Andreas Schipplock
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package de.schipplock.gui.swing.themes;

import javax.swing.*;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.metal.MetalLookAndFeel;
import java.awt.*;

public class Demo extends JFrame {

    public Demo() {
        setupFrame();
    }

    private void centerFrame() {
        GraphicsDevice screen = MouseInfo.getPointerInfo().getDevice();
        Rectangle r = screen.getDefaultConfiguration().getBounds();
        int x = (r.width - this.getWidth()) / 2 + r.x;
        int y = (r.height - this.getHeight()) / 2 + r.y;
        this.setLocation(x, y);
    }

    private void setupFrame() {
        this.setPreferredSize(new Dimension(300, 230));
        this.setMinimumSize(new Dimension(300, 230));
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        centerFrame();

        try {
            MetalLookAndFeel.setCurrentTheme(new DefaultMetalTheme());
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException e) {
            throw new RuntimeException(e);
        }
        setTitle("Metal Steel Demo");

        DefaultMetalTheme[] themes = new DefaultMetalTheme[]{
                new SteelTheme(),
                new OceanTheme(),
                new BlindedTheme(),
                new MedicTheme()
        };

        JComboBox<DefaultMetalTheme> themesComboBox = new JComboBox<>(themes);
        themesComboBox.setSelectedItem(themes[0]);
        themesComboBox.setBounds(5, 5, 275, themesComboBox.getPreferredSize().height);
        themesComboBox.addActionListener(e -> {
            DefaultMetalTheme theme = themesComboBox.getItemAt(themesComboBox.getSelectedIndex());
            MetalLookAndFeel.setCurrentTheme(theme);
            try {
                UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
                SwingUtilities.updateComponentTreeUI(this);
                this.pack();
            } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                     InstantiationException ex) {
                throw new RuntimeException(ex);
            }
            setTitle(theme.getName());
        });

        JButton button = new JButton("Button");
        button.setBounds(5, 10 + themesComboBox.getHeight(), 275, button.getPreferredSize().height);

        JTextField textField = new JTextField(10);
        textField.setSize(275, button.getHeight());
        textField.setBounds(5, 40 + button.getHeight(), 275, textField.getHeight());
        textField.setText("ein JTextField");

        String[] columns = {"Column1", "Column2"};
        Object[][] data = { {"ja", "nein"}, {"nein", "ja"}, {"vielleicht", "nein"}, {"ja", "vielleicht"}, {"ja", "ja"}, {"lm", "aa"} };
        JTable table = new JTable(data, columns);
        table.setFillsViewportHeight(true);

        JScrollPane scrollPane = new JScrollPane(table);
        scrollPane.setBounds(5, 70 + textField.getHeight(), 275, 90);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        panel.add(themesComboBox);
        panel.add(button);
        panel.add(textField);
        panel.add(scrollPane);

        this.getContentPane().add(panel);
    }

    public static void createAndShowGui() {
        JFrame frame = new Demo();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(Demo::createAndShowGui);
    }
}
