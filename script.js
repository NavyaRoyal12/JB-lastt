// ====== EVENTS DATA ======
const events = [
  { title: "Diwali Night Festival", date: "Oct 26, 2025", location: "Delhi Central Park", category: "Festival", description: "Celebrate Diwali with lights, sweets, and fireworks.", image: "https://images.unsplash.com/photo-1604328698692-f76ea9498e76", price: "₹1,000", discount: "12%" },
  { title: "Royal Wedding Celebration", date: "Dec 5, 2025", location: "Jaipur Palace Grounds", category: "Wedding", description: "A grand royal wedding celebration.", image: "https://images.unsplash.com/photo-1520854221256-17451cc331bf", price: "₹3,000", discount: "8%" },
  { title: "Startup Innovation Summit", date: "Nov 15, 2025", location: "Bangalore Convention Center", category: "Corporate", description: "Connect with innovators and investors.", image: "https://images.unsplash.com/photo-1531058020387-3be344556be6", price: "₹1,800", discount: "15%" },
  { title: "Global Food Carnival", date: "Oct 30, 2025", location: "Hyderabad Exhibition Ground", category: "Food", description: "Taste the world’s best cuisines.", image: "https://images.unsplash.com/photo-1504754524776-8f4f37790ca0", price: "₹1,200", discount: "20%" },
  { title: "Traditional Haldi Ceremony", date: "Nov 10, 2025", location: "Chennai Banquet Hall", category: "Wedding", description: "A colorful Haldi event filled with laughter and joy.", image: "https://images.unsplash.com/photo-1615634260167-1cce0f7f0b64", price: "₹1,500", discount: "10%" },
  { title: "Christmas Eve Gala", date: "Dec 24, 2025", location: "Bangalore City Square", category: "Festival", description: "Celebrate Christmas with music, lights, and joy.", image: "https://images.unsplash.com/photo-1512917774080-9991f1c4c750", price: "₹1,800", discount: "15%" },
  { title: "Creative Minds Art Expo", date: "Nov 25, 2025", location: "Mumbai Art Gallery", category: "Cultural", description: "Discover breathtaking artworks by Indian artists.", image: "https://images.unsplash.com/photo-1529333166437-7750a6dd5a70", price: "₹900", discount: "5%" }
];

const eventList = document.getElementById("event-list");
const searchInput = document.getElementById("searchInput");
const categoryFilter = document.getElementById("categoryFilter");

function displayEvents(filterText = "", category = "all") {
  if (!eventList) return;
  eventList.innerHTML = "";

  const filtered = events.filter(ev => {
    const matchesText = ev.title.toLowerCase().includes(filterText.toLowerCase()) || ev.location.toLowerCase().includes(filterText.toLowerCase());
    const matchesCategory = category === "all" || ev.category === category;
    return matchesText && matchesCategory;
  });

  if (filtered.length === 0) {
    eventList.innerHTML = "<p>No events found.</p>";
    return;
  }

  filtered.forEach((ev, index) => {
    const card = document.createElement("div");
    card.classList.add("event-card");
    card.innerHTML = `
      <img src="${ev.image}" alt="${ev.title}">
      <div class="event-details">
        <h3>${ev.title}</h3>
        <p>${ev.description}</p>
        <p><strong>Date:</strong> ${ev.date}</p>
        <p><strong>Location:</strong> ${ev.location}</p>
        <a href="#" class="btn small-btn" data-index="${index}">View Details</a>
      </div>
    `;
    eventList.appendChild(card);
  });

  document.querySelectorAll(".small-btn").forEach(btn => {
    btn.addEventListener("click", e => {
      e.preventDefault();
      const index = e.target.dataset.index;
      localStorage.setItem("selectedEvent", JSON.stringify(events[index]));
      window.location.href = "event-details.html";
    });
  });
}

if (eventList) {
  displayEvents();

  searchInput.addEventListener("input", e => displayEvents(e.target.value, categoryFilter.value));
  categoryFilter.addEventListener("change", e => displayEvents(searchInput.value, e.target.value));
}
