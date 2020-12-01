package SubnetCalculator;

import Networking.IP;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class SubnetCalculatorGUI {
    //Layouts
    private static BorderLayout guiBorderLayout = new BorderLayout();
    // GUI
    private static JFrame guiWindow;
    // UI
    private static JPanel subnetHistoryPanel;
    private static JPanel networkProperies;
    private static JPanel networkProperiesLPanel;
    private static JPanel networkProperiesRPanel;
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
        initialiseUI();
        guiWindow.pack();
    }


    private static void initialiseUI() {
        //Creating a JFrame
        guiWindow = new JFrame("Subnet Calculator");
        //Setting the JFrame Layout
        GridLayout guiGridLayout = new GridLayout(3, 1);
        guiWindow.setLayout(guiGridLayout);
        //Setting the JFrame Size and Default Close Operation
        guiWindow.setSize(600,400);
        guiWindow.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // Create UI For GUI
        initialiseGUI();
        guiWindow.setVisible(true);
    }

    private static void initialiseGUI() {
        subnetHistoryPanelGUI();
        networkProperiesGUI();
    }

    private static void subnetHistoryPanelGUI() {

        subnetHistoryTable = new JTable(testData, column);
        jTableScrollPane = new JScrollPane(subnetHistoryTable);
        jTableScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        jTableScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
//        subnetHistoryTable.setFillsViewportHeight(true);
        Border subnetHistoryPanelBorder = BorderFactory.createTitledBorder("Subnet History");
        jTableScrollPane.setBorder(subnetHistoryPanelBorder);
        guiWindow.getContentPane().add(jTableScrollPane);
    }


    private static void networkProperiesGUI() {
        networkProperies = new JPanel();
        GridLayout guiGridLayout = new GridLayout(1, 2, 5, 0);
        networkProperies.setLayout(guiGridLayout);
        networkProperiesLPanelGUI();
        networkProperiesRPanelGUI();
        guiWindow.getContentPane().add(networkProperies);
    }

    private static void networkProperiesLPanelGUI() {
        networkProperiesLPanel = new JPanel();
        GridLayout gridLayout = new GridLayout(10, 1);
        networkProperiesLPanel.setLayout(gridLayout);
        Border westJPanelBorder = BorderFactory.createTitledBorder("TO BE NAMED");
        networkProperiesLPanel.setBorder(westJPanelBorder);
        JLabel networkClassJLabel = new JLabel("Network Class");
        networkProperiesLPanel.add(networkClassJLabel);
        JPanel subnetClassPanel = new JPanel();
        GridLayout subnetClassPanelGrid = new GridLayout(1, 3);
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
        networkProperiesLPanel.add(subnetClassPanel);
        JLabel ipAddressLabel = new JLabel("IP Address");
        networkProperiesLPanel.add(ipAddressLabel);
        JTextField ipAddressTextField = new JTextField(15);
        ipAddressTextField.setMaximumSize(ipAddressTextField.getPreferredSize());
        networkProperiesLPanel.add(ipAddressTextField);
        JLabel subnetLabel = new JLabel("Subnet Mask");
        networkProperiesLPanel.add(subnetLabel);
        String classlessSubnets[] = {"255.0.0.0","255.255.0.0","255.255.255.0"};
        JComboBox subnetComboBox = new JComboBox(classlessSubnets);
        subnetComboBox.setSelectedIndex(2);
        subnetComboBox.setMaximumSize(subnetComboBox.getPreferredSize());
        networkProperiesLPanel.add(subnetComboBox);
        JLabel subnetBitsJLabel = new JLabel("Subnet Bits");
        networkProperiesLPanel.add(subnetBitsJLabel);
        String subnetBits[] = {"24","16","8"};
        JComboBox subnetBitComboBox = new JComboBox(subnetBits);
        subnetComboBox.setSelectedIndex(2);
        subnetBitComboBox.setMaximumSize(subnetBitComboBox.getPreferredSize());
        networkProperiesLPanel.add(subnetBitComboBox);
        networkProperiesLPanel.setMaximumSize(networkProperiesLPanel.getPreferredSize());
        networkProperies.add(networkProperiesLPanel);
    }

    private static void networkProperiesRPanelGUI() {
        GridLayout gridLayout = new GridLayout(10, 1);
        networkProperiesRPanel = new JPanel();
        networkProperiesRPanel.setLayout(gridLayout);
        Border westJPanelBorder = BorderFactory.createTitledBorder("TO BE NAMED");
        networkProperiesRPanel.setBorder(westJPanelBorder);
        JLabel octetRangeLabel = new JLabel("First Octet Range");
        networkProperiesRPanel.add(octetRangeLabel);
        JTextField octetRangeTextField = new JTextField();
        octetRangeTextField.setEditable(false);
        networkProperiesRPanel.add(octetRangeTextField);

        JLabel hexIPAddressLabel = new JLabel("Hex IP Address");
        networkProperiesRPanel.add(hexIPAddressLabel);
        JTextField hexIPAddressTextField = new JTextField();
        hexIPAddressTextField.setEditable(false);
        networkProperiesRPanel.add(hexIPAddressTextField);

        JLabel wildCardMaskLabel = new JLabel("Wildcard Mask");
        networkProperiesRPanel.add(wildCardMaskLabel);
        JTextField wildCardMaskTextField = new JTextField();
        wildCardMaskTextField.setEditable(false);
        networkProperiesRPanel.add(wildCardMaskTextField);

        JLabel maskBits = new JLabel("Mask Bits");
        networkProperiesRPanel.add(maskBits);
        JTextField maskBitsTextField = new JTextField();
        maskBitsTextField.setEditable(false);
        networkProperiesRPanel.add(maskBitsTextField);

        JLabel hostPerSubnetLabel = new JLabel("Hosts per Subnet");
        networkProperiesRPanel.add(hostPerSubnetLabel);
        JTextField hostsPerSubnetTextField = new JTextField();
        hostsPerSubnetTextField.setEditable(false);
        networkProperiesRPanel.add(hostsPerSubnetTextField);

        networkProperies.add(networkProperiesRPanel);
    }

}
