/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;
import Business.Product;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
/**
 *
 * @author India
 */
public class ViewPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewPanel
     */
    private Product product;
    public ViewPanel(Product product) {
        initComponents();
        displayProduct(product);
    }
    private void displayProduct(Product product)
    {
        String productImage = product.getImagePath();
        
        
        String iconPath = productImage;
        Image image=Toolkit.getDefaultToolkit().getImage(productImage);
           System.out.println("imageLabel"+image);

        Image dimg = image.getScaledInstance(100, 100,
        Image.SCALE_SMOOTH);
        //System.out.println("img=>"+img);
        ImageIcon img=new ImageIcon(dimg);
        imageLabel.setIcon(img);
        
        String productFirstName = product.getFirstName();
        firstNameTextBox.setText(productFirstName);
        firstNameTextBox.setEditable(false);
        
        String productLastName = product.getLastName();
        lastNameTextField.setText(productLastName);
        lastNameTextField.setEditable(false);
        
        String productPhoneNumber = product.getPhoneNumber();
        phoneNumberTextField.setText(productPhoneNumber);
        phoneNumberTextField.setEditable(false);
        
        String productSsn = product.getSsn();
        ssnTextField.setText(productSsn);
        ssnTextField.setEditable(false);
        
        String productDateOfBirth = product.getDateOfBirth();
        dobTextField.setText(productDateOfBirth);
        dobTextField.setEditable(false);
        
        String productAge = product.getAge();
        ageTextField.setText(productAge);
        ageTextField.setEditable(false);
        
        String productBloodType = product.getBloodType();
        bloodTypeTextField.setText(productBloodType);
        bloodTypeTextField.setEditable(false);
        
        String productHeight = product.getHeight();
        heightTextField.setText(productHeight);
        heightTextField.setEditable(false);
        
        String productWeight = product.getWeight();
        weightTextField.setText(productWeight);
        weightTextField.setEditable(false);
        
        String productStreet = product.getStreet();
        streetTextField.setText(productStreet);
        streetTextField.setEditable(false);
        
        String productCity = product.getCity();
        cityTextField.setText(productCity);
        cityTextField.setEditable(false);
        
        String productState = product.getState();
        stateTextField.setText(productState);
        stateTextField.setEditable(false);
        
        String productZipcode = product.getZipcode();
        zipcodeTextField.setText(productZipcode);
        zipcodeTextField.setEditable(false);
        
        String productBankName1 = product.getBankName1();
        bankName1TextField.setText(productBankName1);
        bankName1TextField.setEditable(false);
        
        String productBankType1 = product.getBankType1();
        bankType1TextField.setText(productBankType1);
        bankType1TextField.setEditable(false);
        
        String productBalance1 = product.getBalance1();
        balance1TextField.setText(productBalance1);
        balance1TextField.setEditable(false);
        
        String productAccount1 = product.getAccount1();
        account1TextField.setText(productAccount1);
        account1TextField.setEditable(false);
        
        String productRouting1 = product.getRouting1();
        routing1TextField.setText(productRouting1);
        routing1TextField.setEditable(false);
        
        String productBankName2 = product.getBankName2();
        bankName2TextField.setText(productBankName2);
        bankName2TextField.setEditable(false);
        
        String productBankType2 = product.getBankType2();
        bankType2TextField.setText(productBankType2);
        bankType2TextField.setEditable(false);
        
        String productBalance2 = product.getBalance2();
        balance2TextField.setText(productBalance2);
        balance2TextField.setEditable(false);
        
        String productAccount2 = product.getAccount2();
        account2TextField.setText(productAccount2);
        account2TextField.setEditable(false);
        
        String productRouting2 = product.getRouting2();
        routing2TextField.setText(productRouting2);
        routing2TextField.setEditable(false);
        
        String productLicense = product.getDriversLicense();
        licenseTextField.setText(productLicense);
        licenseTextField.setEditable(false);
        
        String productIssueDate = product.getIssuedDate();
        issueDateTextField.setText(productIssueDate);
        issueDateTextField.setEditable(false);
        
        String productExpiryDate = product.getExpiryDate();
        expiryDateTextField.setText(productExpiryDate);
        expiryDateTextField.setEditable(false);
        
        String productMedical = product.getMedicalRecord();
        medicalTextField.setText(productMedical);
        medicalTextField.setEditable(false);
        
        String productAllergy1 = product.getAllergy1();
        allergy1TextField.setText(productAllergy1);
        allergy1TextField.setEditable(false);
        
        String productAllergy2 = product.getAllergy2();
        allergy2TextField.setText(productAllergy2);
        allergy2TextField.setEditable(false);
        
        String productAllergy3 = product.getAllergy3();
        allergy3TextField.setText(productAllergy3);
        allergy3TextField.setEditable(false);
        
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        firstNameTextBox = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lastNameTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phoneNumberTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        dobTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel9 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        streetTextField = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        zipcodeTextField = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        jLabel15 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel16 = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        weightTextField = new javax.swing.JTextField();
        ssnTextField = new javax.swing.JTextField();
        ageTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        stateTextField = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        bankName1TextField = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        balance1TextField = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        account1TextField = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        routing1TextField = new javax.swing.JTextField();
        jSeparator7 = new javax.swing.JSeparator();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        account2TextField = new javax.swing.JTextField();
        bankName2TextField = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        routing2TextField = new javax.swing.JTextField();
        jLabel28 = new javax.swing.JLabel();
        balance2TextField = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        allergy1TextField = new javax.swing.JTextField();
        jLabel32 = new javax.swing.JLabel();
        allergy2TextField = new javax.swing.JTextField();
        jLabel33 = new javax.swing.JLabel();
        allergy3TextField = new javax.swing.JTextField();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jLabel34 = new javax.swing.JLabel();
        licenseTextField = new javax.swing.JTextField();
        jLabel35 = new javax.swing.JLabel();
        issueDateTextField = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        expiryDateTextField = new javax.swing.JTextField();
        jLabel37 = new javax.swing.JLabel();
        bloodTypeTextField = new javax.swing.JTextField();
        jSeparator13 = new javax.swing.JSeparator();
        jLabel38 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jLabel39 = new javax.swing.JLabel();
        medicalTextField = new javax.swing.JTextField();
        bankType1TextField = new javax.swing.JTextField();
        bankType2TextField = new javax.swing.JTextField();
        imageLabel = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 204, 204));

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("View your Personal Profile");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jLabel2.setText("First Name:");

        firstNameTextBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstNameTextBoxActionPerformed(evt);
            }
        });

        jLabel3.setText("Last Name:");

        lastNameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastNameTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Phone Number:");

        phoneNumberTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneNumberTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setText("SSN:");

        jLabel6.setText("Date of Birth (MM/DD/YYYY):");

        dobTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dobTextFieldActionPerformed(evt);
            }
        });

        jLabel7.setText("Age:");

        jLabel8.setText("I. General Information");

        jLabel9.setText("II. Personal Information");

        jLabel11.setText("Street:");

        streetTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                streetTextFieldActionPerformed(evt);
            }
        });

        jLabel12.setText("City:");

        jLabel13.setText("State:");

        jLabel14.setText("Zipcode:");

        zipcodeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zipcodeTextFieldActionPerformed(evt);
            }
        });

        jLabel15.setText("III. Bank Account Information");

        jLabel16.setText("Height:");

        heightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextFieldActionPerformed(evt);
            }
        });

        jLabel17.setText("Weight:");

        weightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                weightTextFieldActionPerformed(evt);
            }
        });

        ssnTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ssnTextFieldActionPerformed(evt);
            }
        });

        ageTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTextFieldActionPerformed(evt);
            }
        });

        cityTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityTextFieldActionPerformed(evt);
            }
        });

        stateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stateTextFieldActionPerformed(evt);
            }
        });

        jLabel18.setText("Bank Name:");

        bankName1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankName1TextFieldActionPerformed(evt);
            }
        });

        jLabel19.setText("Type(Saving/Checking):");

        jLabel20.setText("Balance:");

        balance1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance1TextFieldActionPerformed(evt);
            }
        });

        jLabel21.setText("Account # :");

        account1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account1TextFieldActionPerformed(evt);
            }
        });

        jLabel22.setText("Routing # :");

        routing1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routing1TextFieldActionPerformed(evt);
            }
        });

        jLabel24.setText("Bank Name:");

        jLabel25.setText("Account # :");

        account2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                account2TextFieldActionPerformed(evt);
            }
        });

        bankName2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankName2TextFieldActionPerformed(evt);
            }
        });

        jLabel26.setText("Type(Saving/Checking):");

        jLabel27.setText("Routing # :");

        routing2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                routing2TextFieldActionPerformed(evt);
            }
        });

        jLabel28.setText("Balance:");

        balance2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                balance2TextFieldActionPerformed(evt);
            }
        });

        jLabel23.setText("IV. Driver License Information");

        jLabel29.setText("V.Medical Information");

        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel31.setText("Allergy1:");

        allergy1TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        allergy1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergy1TextFieldActionPerformed(evt);
            }
        });

        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setText("Allergy2:");

        allergy2TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        allergy2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergy2TextFieldActionPerformed(evt);
            }
        });

        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel33.setText("Allergy3:");

        allergy3TextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        allergy3TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                allergy3TextFieldActionPerformed(evt);
            }
        });

        jLabel34.setText("License # :");

        licenseTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                licenseTextFieldActionPerformed(evt);
            }
        });

        jLabel35.setText("Issued Date: ");

        issueDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issueDateTextFieldActionPerformed(evt);
            }
        });

        jLabel36.setText("Expiry Date");

        expiryDateTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expiryDateTextFieldActionPerformed(evt);
            }
        });

        jLabel37.setText("Blood Type:");

        bloodTypeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bloodTypeTextFieldActionPerformed(evt);
            }
        });

        jLabel38.setText("Driver License:");

        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel39.setText("Medical #:");
        jLabel39.setToolTipText("");

        medicalTextField.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        medicalTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicalTextFieldActionPerformed(evt);
            }
        });

        bankType1TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankType1TextFieldActionPerformed(evt);
            }
        });

        bankType2TextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bankType2TextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addComponent(jSeparator2)
            .addComponent(jSeparator3)
            .addComponent(jSeparator4)
            .addComponent(jSeparator6)
            .addComponent(jSeparator5)
            .addComponent(jSeparator7, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator8)
            .addComponent(jSeparator12)
            .addComponent(jSeparator13)
            .addComponent(jSeparator14, javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jSeparator11, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(10, 10, 10)
                                .addComponent(firstNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addGap(10, 10, 10)
                                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel13)
                                    .addGap(10, 10, 10)
                                    .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(20, 20, 20)
                                    .addComponent(jLabel14)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(zipcodeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(streetTextField)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21)
                                .addGap(10, 10, 10)
                                .addComponent(account1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel24)
                                .addGap(10, 10, 10)
                                .addComponent(bankName2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel27)
                                        .addGap(10, 10, 10)
                                        .addComponent(routing2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel26)
                                        .addGap(10, 10, 10)
                                        .addComponent(bankType2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(20, 20, 20)
                                        .addComponent(jLabel28)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(balance2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel25)
                                .addGap(10, 10, 10)
                                .addComponent(account2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel23)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel37)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel6)
                                .addGap(10, 10, 10)
                                .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel7)
                                .addGap(10, 10, 10)
                                .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel39)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(medicalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 631, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel31)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(allergy1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel32)
                                .addGap(18, 18, 18)
                                .addComponent(allergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel33)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(allergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel34)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel35)
                                .addGap(10, 10, 10)
                                .addComponent(issueDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel36)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(expiryDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel38)
                                .addGap(18, 18, 18)
                                .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel18)
                        .addGap(10, 10, 10)
                        .addComponent(bankName1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addGap(10, 10, 10)
                                .addComponent(routing1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addGap(10, 10, 10)
                                .addComponent(bankType1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(20, 20, 20)
                                .addComponent(jLabel20)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(balance1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel8)
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(firstNameTextBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(lastNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(phoneNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(dobTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(ssnTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ageTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17)
                    .addComponent(weightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel37)
                    .addComponent(bloodTypeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel9)
                .addGap(3, 3, 3)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(streetTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(jLabel14)
                        .addComponent(zipcodeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(stateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(3, 3, 3)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel15)
                .addGap(3, 3, 3)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(bankName1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(balance1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankType1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(account1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22)
                    .addComponent(routing1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24)
                    .addComponent(bankName2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel26)
                    .addComponent(jLabel28)
                    .addComponent(balance2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bankType2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25)
                    .addComponent(account2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel27)
                    .addComponent(routing2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel23)
                .addGap(3, 3, 3)
                .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel35)
                        .addComponent(issueDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel34)
                        .addComponent(jLabel36)
                        .addComponent(expiryDateTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(licenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38)
                    .addComponent(imageLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(8, 8, 8)
                .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(jLabel29)
                .addGap(3, 3, 3)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel39)
                    .addComponent(medicalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel31)
                    .addComponent(jLabel33)
                    .addComponent(allergy3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allergy2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(allergy1TextField)
                    .addComponent(jLabel32))
                .addGap(3, 3, 3)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bankName1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankName1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankName1TextFieldActionPerformed

    private void balance2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balance2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balance2TextFieldActionPerformed

    private void bankType2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankType2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankType2TextFieldActionPerformed

    private void account2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account2TextFieldActionPerformed

    private void bankName2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankName2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankName2TextFieldActionPerformed

    private void bloodTypeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bloodTypeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bloodTypeTextFieldActionPerformed

    private void stateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stateTextFieldActionPerformed

    private void allergy2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergy2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergy2TextFieldActionPerformed

    private void streetTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_streetTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_streetTextFieldActionPerformed

    private void ageTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTextFieldActionPerformed

    private void ssnTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ssnTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ssnTextFieldActionPerformed

    private void expiryDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expiryDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_expiryDateTextFieldActionPerformed

    private void medicalTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicalTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_medicalTextFieldActionPerformed

    private void allergy1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergy1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergy1TextFieldActionPerformed

    private void lastNameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastNameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastNameTextFieldActionPerformed

    private void weightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_weightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_weightTextFieldActionPerformed

    private void balance1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_balance1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_balance1TextFieldActionPerformed

    private void cityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityTextFieldActionPerformed

    private void account1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_account1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_account1TextFieldActionPerformed

    private void licenseTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_licenseTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_licenseTextFieldActionPerformed

    private void issueDateTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issueDateTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issueDateTextFieldActionPerformed

    private void zipcodeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zipcodeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_zipcodeTextFieldActionPerformed

    private void routing1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routing1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routing1TextFieldActionPerformed

    private void firstNameTextBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstNameTextBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstNameTextBoxActionPerformed

    private void phoneNumberTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneNumberTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneNumberTextFieldActionPerformed

    private void bankType1TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bankType1TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bankType1TextFieldActionPerformed

    private void allergy3TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_allergy3TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_allergy3TextFieldActionPerformed

    private void heightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_heightTextFieldActionPerformed

    private void dobTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dobTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dobTextFieldActionPerformed

    private void routing2TextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_routing2TextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_routing2TextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField account1TextField;
    private javax.swing.JTextField account2TextField;
    private javax.swing.JTextField ageTextField;
    private javax.swing.JTextField allergy1TextField;
    private javax.swing.JTextField allergy2TextField;
    private javax.swing.JTextField allergy3TextField;
    private javax.swing.JTextField balance1TextField;
    private javax.swing.JTextField balance2TextField;
    private javax.swing.JTextField bankName1TextField;
    private javax.swing.JTextField bankName2TextField;
    private javax.swing.JTextField bankType1TextField;
    private javax.swing.JTextField bankType2TextField;
    private javax.swing.JTextField bloodTypeTextField;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JTextField dobTextField;
    private javax.swing.JTextField expiryDateTextField;
    private javax.swing.JTextField firstNameTextBox;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel imageLabel;
    private javax.swing.JTextField issueDateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField licenseTextField;
    private javax.swing.JTextField medicalTextField;
    private javax.swing.JTextField phoneNumberTextField;
    private javax.swing.JTextField routing1TextField;
    private javax.swing.JTextField routing2TextField;
    private javax.swing.JTextField ssnTextField;
    private javax.swing.JTextField stateTextField;
    private javax.swing.JTextField streetTextField;
    private javax.swing.JTextField weightTextField;
    private javax.swing.JTextField zipcodeTextField;
    // End of variables declaration//GEN-END:variables

    private JLabel image(Icon icon) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
