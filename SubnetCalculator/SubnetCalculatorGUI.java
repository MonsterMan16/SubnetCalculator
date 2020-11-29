package SubnetCalculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SubnetCalculatorGUI {
    //Layouts
    private static BorderLayout guiLayout;
    // GUI
    private static JFrame guiWindow;
    // UI
    private static JPanel southJPanel;
    private static JPanel westJPanel;
    private static JPanel eastPanel;
    private static JPanel northJPanel;
    // UI Components (NORTH PANEL)
    private static JTable subnetHistoryTable;
    private static JScrollPane jTableScrollPane;
    // UI Components (WEST PANEL)
    private static JLabel networkClassJLabel;

//    private String[][] testData = { {"101","Amit","670000"},
//                                    {"102","Jai","780000"},
//                                    {"101","Sachin","700000"}};
//    private String column[] = {"ID","NAME","SALARY"};
    public SubnetCalculatorGUI() {
        createGUI();
    }

    private static void createGUI() {
        //Creating a JFrame
        guiWindow = new JFrame("Subnet Calculator");
        //Setting the JFrame Layout
        guiLayout = new BorderLayout();
        guiWindow.setLayout(guiLayout);
        //Setting the JFrame Size and Default Close Operation
        guiWindow.setSize(600,400);
        guiWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Create UI For GUI
        createUI();
    }

    private static void createUI() {
        createNorthPanel();
        createWestPanel();
        createEastPanel();
        createSouthPanel();
    }

    private static void createNorthPanel() {
        southJPanel = new JPanel();
        subnetHistoryTable = new JTable();
        jTableScrollPane = new JScrollPane(subnetHistoryTable);
        jTableScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jTableScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        Border southJPanelBorder = BorderFactory.createTitledBorder("Subnet History");
        southJPanel.add(jTableScrollPane);
        southJPanel.setBorder(southJPanelBorder);
        guiWindow.getContentPane().add(southJPanel,guiLayout.NORTH);
    }

    private static void createWestPanel() {

    }

    private static void createEastPanel() {

    }

    private static void createSouthPanel() {

    }
}
