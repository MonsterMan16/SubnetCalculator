package SubnetCalculator;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SubnetCalculatorGUI {
    //Layouts
    private static BorderLayout guiBorderLayout = new BorderLayout();
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
        guiWindow.setLayout(guiBorderLayout);
        //Setting the JFrame Size and Default Close Operation
        guiWindow.setSize(600,400);
        guiWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Create UI For GUI
        createUI();
        guiWindow.setVisible(true);
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
        jTableScrollPane.setMaximumSize(new Dimension(600, 100));
        jTableScrollPane.setPreferredSize(new Dimension(0, 50));
        southJPanel.add(jTableScrollPane);
        southJPanel.setBorder(southJPanelBorder);
        guiWindow.getContentPane().add(southJPanel,guiBorderLayout.NORTH);
    }

    private static void createWestPanel() {
        westJPanel = new JPanel();
        westJPanel.setLayout(new BoxLayout(westJPanel, BoxLayout.Y_AXIS));
        JLabel networkClassJLabel = new JLabel("Network Class");
        Border westJPanelBorder = BorderFactory.createTitledBorder("Subnet Information");
        westJPanel.setBorder(westJPanelBorder);
        westJPanel.add(networkClassJLabel);
        JRadioButton classA = new JRadioButton("A");
        JRadioButton classB = new JRadioButton("B");
        JRadioButton classC = new JRadioButton("C");
        classC.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(classA);
        group.add(classB);
        group.add(classC);
        westJPanel.add(classA);
        westJPanel.add(classB);
        westJPanel.add(classC);
        JLabel ipAddressLabel = new JLabel("IP Address");
        westJPanel.add(ipAddressLabel);
        JTextField ipAddressTextField = new JTextField(15);
        ipAddressTextField.setMaximumSize(ipAddressTextField.getPreferredSize());
        westJPanel.add(ipAddressTextField);
        JLabel subnetLabel = new JLabel("Subnet Mask");
        westJPanel.add(subnetLabel);
        String classlessSubnets[] = {"255.0.0.0","255.255.0.0","255.255.255.0"};
        JComboBox subnetComboBox = new JComboBox(classlessSubnets);
        subnetComboBox.setSelectedIndex(2);
        subnetComboBox.setMaximumSize(subnetComboBox.getPreferredSize());
        westJPanel.add(subnetComboBox);
        String subnetBits[] = {"24","16","8"};
        JComboBox subnetBitComboBox = new JComboBox(subnetBits);
        subnetComboBox.setSelectedIndex(2);
        subnetBitComboBox.setMaximumSize(subnetBitComboBox.getPreferredSize());
        westJPanel.add(subnetBitComboBox);
        guiWindow.getContentPane().add(westJPanel,guiBorderLayout.WEST);
    }

    private static void createEastPanel() {

    }

    private static void createSouthPanel() {

    }
}
