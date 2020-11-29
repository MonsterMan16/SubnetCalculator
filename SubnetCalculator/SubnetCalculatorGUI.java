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


    private static String[][] testData = {{"29/11/2020 21:51","192.168.1.254","255.255.255.0"},
                                    {"29/11/2020 21:51","192.168.1.253","255.255.0.0"},
                                    {"29/11/2020 21:51","192.168.1.252","255.0.0.0"},
                                    {"29/11/2020 21:51","192.168.1.252","255.0.0.0"},
                                    {"29/11/2020 21:51","192.168.1.252","255.0.0.0"}};
    private static String column[] = {"Date & Time","IP ADDRESS","SUBNET MASK"};
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
        northJPanel = new JPanel();
        subnetHistoryTable = new JTable(testData, column);
        jTableScrollPane = new JScrollPane(subnetHistoryTable);
        subnetHistoryTable.setFillsViewportHeight(true);
        jTableScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jTableScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        Border northJPanelBorder = BorderFactory.createTitledBorder("Subnet History");
        jTableScrollPane.setPreferredSize(new Dimension(500, 100));

        northJPanel.add(jTableScrollPane);
        northJPanel.setBorder(northJPanelBorder);
        guiWindow.getContentPane().add(northJPanel,guiBorderLayout.NORTH);
    }

    private static void createWestPanel() {
        westJPanel = new JPanel();
        GridLayout subnetGridLayout = new GridLayout(10, 1, 0, 5);
        westJPanel.setLayout(subnetGridLayout);
        Border westJPanelBorder = BorderFactory.createTitledBorder("Subnet Information");
        westJPanel.setBorder(westJPanelBorder);
        JLabel networkClassJLabel = new JLabel("Network Class");
        westJPanel.add(networkClassJLabel);
        GridLayout subnetClassPanelGrid = new GridLayout(1, 3, 0, 5);
        JPanel subnetClassPanel = new JPanel();
        subnetClassPanel.setLayout(subnetClassPanelGrid);
        JRadioButton classA = new JRadioButton("A");
        JRadioButton classB = new JRadioButton("B");
        JRadioButton classC = new JRadioButton("C");
        classC.setSelected(true);
        ButtonGroup group = new ButtonGroup();
        group.add(classA);
        group.add(classB);
        group.add(classC);
        subnetClassPanel.add(classA);
        subnetClassPanel.add(classB);
        subnetClassPanel.add(classC);
        westJPanel.add(subnetClassPanel);
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
        JLabel subnetBitsJLabel = new JLabel("Subnet Bits");
        westJPanel.add(subnetBitsJLabel);
        String subnetBits[] = {"24","16","8"};
        JComboBox subnetBitComboBox = new JComboBox(subnetBits);
        subnetComboBox.setSelectedIndex(2);
        subnetBitComboBox.setMaximumSize(subnetBitComboBox.getPreferredSize());
        westJPanel.add(subnetBitComboBox);
        westJPanel.setAlignmentX(Component.RIGHT_ALIGNMENT);
        guiWindow.getContentPane().add(westJPanel,guiBorderLayout.WEST);
    }

    private static void createEastPanel() {

    }

    private static void createSouthPanel() {

    }
}
