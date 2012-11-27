package j2r.agendaonline.frontend.portal.dto;

public class CarouselItemDescription extends CarouselItem {

	private static final long serialVersionUID = 1692132837497140846L;

	private String description;

	public CarouselItemDescription() {
		super();
	}

	public CarouselItemDescription(String imagePath, String headLine,
			String description, CarouselItemType type) {
		super(imagePath, headLine, type);
		this.description = description;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
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
		CarouselItemDescription other = (CarouselItemDescription) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CarouselItemDescription [description=" + description + "]";
	}

}
