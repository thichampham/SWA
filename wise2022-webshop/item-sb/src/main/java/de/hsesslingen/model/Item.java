package de.hsesslingen.model;

import javax.persistence.*;

@Entity
@Table(name = "item")
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;

	@Column(name = "title")
	private String title;

	@Column(name = "description")
	private String description;

	@Column(name = "price")
	private Double price;

	@Column(name = "availability")
	private Long availability;

	public Item() {

	}

	public Item(String title, String description, Double price, Long availability) {
		this.title = title;
		this.description = description;
		this.price = price;
		this.availability = availability;
	}

	public long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getAvailability() {
		return availability;
	}

	public void setAvailability(Long availability) {
		this.availability = availability;
	}

	@Override
	public String toString() {
		return "Tutorial [id=" + id + ", title=" + title + ", desc=" + description + ", price=" + price + ", availability=" + availability + "]";
	}

}
