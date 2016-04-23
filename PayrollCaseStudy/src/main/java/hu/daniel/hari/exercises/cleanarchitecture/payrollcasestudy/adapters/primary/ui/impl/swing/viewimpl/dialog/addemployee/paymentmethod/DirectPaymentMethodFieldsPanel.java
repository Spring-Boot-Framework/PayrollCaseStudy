package hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.ui.impl.swing.viewimpl.dialog.addemployee.paymentmethod;

import javax.swing.JTextField;

import hu.daniel.hari.exercises.cleanarchitecture.payrollcasestudy.adapters.primary.ui.views_and_controllers.dialog.addemployee.AddEmployeeView.EmployeeViewModel.DirectPaymentMethod;

public class DirectPaymentMethodFieldsPanel extends PaymentMethodFieldsPanel<DirectPaymentMethod> {
	private JTextField tfAccountNumber = new JTextField();

	public DirectPaymentMethodFieldsPanel() {
		initFields();
	}
	
	protected void initFields() {
		addField("Account number", tfAccountNumber);
	}
	
	@Override
	public DirectPaymentMethod getModel() {
		return new DirectPaymentMethod(tfAccountNumber.getText());
	}

}
