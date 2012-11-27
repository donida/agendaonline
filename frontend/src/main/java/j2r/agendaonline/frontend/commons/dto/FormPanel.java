package j2r.agendaonline.frontend.commons.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class FormPanel implements Serializable {

	private static final long serialVersionUID = 8093322811383504119L;

	private List<FormField> fields = new ArrayList<FormField>();

	private FormLayout layout;

	public FormPanel() {
		super();
	}

	public FormPanel(List<FormField> fields, FormLayout layout) {
		super();
		this.fields = fields;
		this.layout = layout;
	}

	public List<FormField> getFields() {
		return fields;
	}

	public void setFields(List<FormField> fields) {
		this.fields = fields;
	}

	public FormLayout getLayout() {
		return layout;
	}

	public void setLayout(FormLayout layout) {
		this.layout = layout;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fields == null) ? 0 : fields.hashCode());
		result = prime * result + ((layout == null) ? 0 : layout.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FormPanel other = (FormPanel) obj;
		if (fields == null) {
			if (other.fields != null)
				return false;
		} else if (!fields.equals(other.fields))
			return false;
		if (layout != other.layout)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FormPanel [fields=" + fields + ", layout=" + layout + "]";
	}

}
