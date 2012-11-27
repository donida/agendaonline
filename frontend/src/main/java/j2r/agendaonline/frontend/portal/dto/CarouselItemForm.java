package j2r.agendaonline.frontend.portal.dto;

import j2r.agendaonline.frontend.commons.dto.FormPanel;

public class CarouselItemForm extends CarouselItem {

	private static final long serialVersionUID = -733651305317551727L;

	private FormPanel formPanel;

	public CarouselItemForm() {
		super();
	}

	public CarouselItemForm(String imagePath, String headLine,
			FormPanel formPanel, CarouselItemType type) {
		super(imagePath, headLine, type);
		this.formPanel = formPanel;
	}

	public FormPanel getFormPanel() {
		return formPanel;
	}

	public void setFormPanel(FormPanel formPanel) {
		this.formPanel = formPanel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((formPanel == null) ? 0 : formPanel.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		CarouselItemForm other = (CarouselItemForm) obj;
		if (formPanel == null) {
			if (other.formPanel != null)
				return false;
		} else if (!formPanel.equals(other.formPanel))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CarouselItemForm [formPanel=" + formPanel + "]";
	}

}
