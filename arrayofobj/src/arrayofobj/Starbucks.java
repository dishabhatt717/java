package arrayofobj;

public class Starbucks {
	
	int capacity;
	String location;  
	
	class Coffee {
		 private float price;
		 private String name;
	
		 
		 public Coffee() {

			}

			public Coffee(String name, float price) {
				this.name = name;
				this.price = price;
			}
			public String getName() {
				return name;
				
			}
			public void setName(String name) {
				this.name = name;
	}
			public float getPrice() {
				return price;
			}

			public void setPrice(float price) {
				this.price = price;
			}

			public void printCoffee() {
				System.out.println("Name=" + name);
				System.out.println("Price=" + price);
			}

		}

		public Starbucks() {

		}

		public Starbucks(String location, int capacity) {
			this.location = location;
			this.capacity = capacity;
		}

		public String getLocation() {
			return location;
		}

		public void setLocation(String location) {
			this.location = location;
		}

		public int getCapacity() {
			return capacity;
		}

		public void setCapacity(int capacity) {
			this.capacity = capacity;
		}

		public void printStarbucks() {
			System.out.println("Location=" + location);
			System.out.println("Capacity=" + capacity);
			}

	}


