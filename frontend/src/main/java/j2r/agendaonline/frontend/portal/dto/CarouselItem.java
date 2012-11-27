package j2r.agendaonline.frontend.portal.dto;

import java.io.Serializable;

public class CarouselItem implements Serializable {

	private static final long serialVersionUID = 2878684033331561071L;

	private String imagePath;
	private String headLine;
	private CarouselItemType type;

	public CarouselItem() {
		super();
	}

	public CarouselItem(String imagePath, String headLine, CarouselItemType type) {
		super();
		this.imagePath = imagePath;
		this.headLine = headLine;
		this.type = type;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getHeadLine() {
		return headLine;
	}

	public void setHeadLine(String headLine) {
		this.headLine = headLine;
	}

	public CarouselItemType getType() {
		return type;
	}

	public void setType(CarouselItemType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "CarouselItem [imagePath=" + imagePath + ", headLine="
				+ headLine + ", type=" + type + "]";
	}

}
