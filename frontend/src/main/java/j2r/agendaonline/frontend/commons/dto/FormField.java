package j2r.agendaonline.frontend.commons.dto;

import java.io.Serializable;

public class FormField implements Serializable {

	private static final long serialVersionUID = -1836985333151842560L;

	private String label;
	private Integer minSize;
	private Integer maxSize;
	private Integer width;
	private Boolean required;

	public FormField() {
		super();
	}

	public FormField(String label, Integer minSize, Integer maxSize,
			Integer width, Boolean required) {
		super();
		this.label = label;
		this.minSize = minSize;
		this.maxSize = maxSize;
		this.width = width;
		this.required = required;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Integer getMinSize() {
		return minSize;
	}

	public void setMinSize(Integer minSize) {
		this.minSize = minSize;
	}

	public Integer getMaxSize() {
		return maxSize;
	}

	public void setMaxSize(Integer maxSize) {
		this.maxSize = maxSize;
	}

	public Integer getWidth() {
		return width;
	}

	public void setWidth(Integer width) {
		this.width = width;
	}

	public Boolean getRequired() {
		return required;
	}

	public void setRequired(Boolean required) {
		this.required = required;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((maxSize == null) ? 0 : maxSize.hashCode());
		result = prime * result + ((minSize == null) ? 0 : minSize.hashCode());
		result = prime * result
				+ ((required == null) ? 0 : required.hashCode());
		result = prime * result + ((width == null) ? 0 : width.hashCode());
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
		FormField other = (FormField) obj;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (maxSize == null) {
			if (other.maxSize != null)
				return false;
		} else if (!maxSize.equals(other.maxSize))
			return false;
		if (minSize == null) {
			if (other.minSize != null)
				return false;
		} else if (!minSize.equals(other.minSize))
			return false;
		if (required == null) {
			if (other.required != null)
				return false;
		} else if (!required.equals(other.required))
			return false;
		if (width == null) {
			if (other.width != null)
				return false;
		} else if (!width.equals(other.width))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "FormField [label=" + label + ", minSize=" + minSize
				+ ", maxSize=" + maxSize + ", width=" + width + ", required="
				+ required + "]";
	}

}
