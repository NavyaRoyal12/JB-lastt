package com.jbevents.backend.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "bookings")
public class Booking {

	

	    @Id
	    private String id;

	    // Event details
	    private String eventTitle;
	    private String eventDate;
	    private String eventLocation;
	    private String price;
	    private String discount;
	    private String description;

	    // Customer details from form
	    private String customerName;
	    private String customerEmail;
	    private String customerMobile;

	    // Who made the booking (logged-in user)
	    private String orderedBy;

	    private LocalDateTime createdAt = LocalDateTime.now();

	    
	    // Getters and setters
	

	public String getEventTitle() {
			return eventTitle;
		}

		public void setEventTitle(String eventTitle) {
			this.eventTitle = eventTitle;
		}

		public String getEventDate() {
			return eventDate;
		}

		public void setEventDate(String eventDate) {
			this.eventDate = eventDate;
		}

		public String getEventLocation() {
			return eventLocation;
		}

		public void setEventLocation(String eventLocation) {
			this.eventLocation = eventLocation;
		}

		public String getPrice() {
			return price;
		}

		public void setPrice(String price) {
			this.price = price;
		}

		public String getDiscount() {
			return discount;
		}

		public void setDiscount(String discount) {
			this.discount = discount;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getCustomerName() {
			return customerName;
		}

		public void setCustomerName(String customerName) {
			this.customerName = customerName;
		}

		public String getCustomerEmail() {
			return customerEmail;
		}

		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}

		public String getCustomerMobile() {
			return customerMobile;
		}

		public void setCustomerMobile(String customerMobile) {
			this.customerMobile = customerMobile;
		}

		public String getOrderedBy() {
			return orderedBy;
		}

		public void setOrderedBy(String orderedBy) {
			this.orderedBy = orderedBy;
		}

		public LocalDateTime getCreatedAt() {
			return createdAt;
		}

		public void setCreatedAt(LocalDateTime createdAt) {
			this.createdAt = createdAt;
		}

	public Booking() {}

    public Booking(String title, String date, String location, String price, String discount, String description) {
        
        this.price = price;
        this.discount = discount;
        this.description = description;
        this.createdAt = LocalDateTime.now();
    }

    // getters & setters (generate or use Lombok @Data)
    // ... (include all standard getters and setters)
    
    // example getter/setter for id:
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    // add other getters/setters here
}
