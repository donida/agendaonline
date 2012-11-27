package j2r.agendaonline.frontend.commons.dto;

public class FormFieldText extends FormField {

	private static final long serialVersionUID = 316452895374502084L;

	private String value;

	public FormFieldText() {
		super();
	}

	public FormFieldText(String label, Integer minSize, Integer maxSize,
			Integer width, Boolean required, String value) {
		super(label, minSize, maxSize, width, required);
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		FormFieldText other = (FormFieldText) obj;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FormFieldText [value=" + value + "]";
	}

}
